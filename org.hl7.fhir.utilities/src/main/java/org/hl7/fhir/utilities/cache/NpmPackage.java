package org.hl7.fhir.utilities.cache;

/*-
 * #%L
 * org.hl7.fhir.utilities
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.hl7.fhir.utilities.IniFile;
import org.hl7.fhir.utilities.TextFile;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.cache.PackageCacheManager.PackageEntry;
import org.hl7.fhir.utilities.cache.PackageGenerator.PackageType;
import org.hl7.fhir.utilities.json.JsonTrackingParser;

import com.google.gson.JsonObject;

/**
   * info and loader for a package 
   * 
   * Packages may exist on disk in the cache, or purely in memory when they are loaded on the fly
   * 
   * Packages are contained in subfolders (see the package spec). The FHIR resources will be in "package"
   * 
   * @author Grahame Grieve
   *
   */
  public class NpmPackage {

    private String path;
    private List<String> folders = new ArrayList<String>();
    private Map<String, byte[]> content = new HashMap<String, byte[]>();
    private JsonObject npm;
    private IniFile cache;

    public NpmPackage(JsonObject npm, Map<String, byte[]> content, List<String> folders) {
      this.path = null;
      this.content = content;
      this.npm = npm;
      this.folders = folders;
    }
    
    public NpmPackage(String path) throws IOException {
      this.path = path;
      if (path != null) {
        for (String f : sorted(new File(path).list())) {
          if (new File(Utilities.path(path, f)).isDirectory()) {
            folders.add(f); 
          }
        }
        npm = (JsonObject) new com.google.gson.JsonParser().parse(TextFile.fileToString(Utilities.path(path, "package", "package.json")));
        cache = new IniFile(Utilities.path(path, "cache.ini"));        
      }
    }
    
    private List<String> sorted(String[] keys) {
      List<String> names = new ArrayList<String>();
      for (String s : keys)
        names.add(s);
      Collections.sort(names);
      return names;
    }

    private static final int BUFFER_SIZE = 1024;
    public static NpmPackage fromPackage(InputStream tgz) throws IOException {
      NpmPackage res = new NpmPackage(null);
      GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(tgz);
      try (TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)) {
        TarArchiveEntry entry;

        int i = 0;
        int c = 12;
        while ((entry = (TarArchiveEntry) tarIn.getNextEntry()) != null) {
          i++;
          if (entry.isDirectory()) {
            res.folders.add(entry.getName());
          } else {
            int count;
            byte data[] = new byte[BUFFER_SIZE];
            
            ByteArrayOutputStream fos = new ByteArrayOutputStream();
            try (BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER_SIZE)) {
              while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
                dest.write(data, 0, count);
              }
            }
            fos.close();
            res.content.put(entry.getName(), fos.toByteArray());
          }
        }
      }
      res.npm = JsonTrackingParser.parseJson(res.content.get("package/package.json"));
      return res;
    }


    public static NpmPackage fromZip(InputStream stream, boolean dropRootFolder) throws IOException {
      NpmPackage res = new NpmPackage(null);
      ZipInputStream zip = new ZipInputStream(stream);
      ZipEntry ze;
      while ((ze = zip.getNextEntry()) != null) {
        int size;
        byte[] buffer = new byte[2048];

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(bytes, buffer.length);

        while ((size = zip.read(buffer, 0, buffer.length)) != -1) {
          bos.write(buffer, 0, size);
        }
        bos.flush();
        bos.close();
        if (bytes.size() > 0)
          if (dropRootFolder)
            res.content.put(ze.getName().substring(ze.getName().indexOf("/")+1), bytes.toByteArray());
          else
            res.content.put(ze.getName(), bytes.toByteArray());

        zip.closeEntry();
      }
      zip.close();         
      res.npm = (JsonObject) new com.google.gson.JsonParser().parse(new String(res.content.get("package/package.json")));
      return res;
    }
   
    
    /**
     * Accessing the contents of the package - get a list of files in a subfolder of the package 
     *
     * @param folder
     * @return
     * @throws IOException 
     */
    public List<String> list(String folder) throws IOException {
      List<String> res = new ArrayList<String>();
      if (path != null) {
        File f = new File(Utilities.path(path, folder));
        if (f.exists() && f.isDirectory())
          for (String s : f.list())
            res.add(s);
      } else {
        for (String s : content.keySet()) {
          if (s.startsWith(folder+"/") && !s.substring(folder.length()+2).contains("/"))
            res.add(s.substring(folder.length()+1));
        }
      }
      return res;
    }

    public List<String> listResources(String... types) throws IOException {
      List<String> files = list("package");
      List<String> res = new ArrayList<String>();
      for (String s : files) {
        String[] n = s.split("\\-");
        if (Utilities.existsInList(n[0], types))
          res.add(s);
      }
      return res;
    }
    
    /** 
     * Copies all the files in the package folder [folder] to the nominated dest, 
     * and returns a list of all the file names copied
     *  
     * @param folder
     * @return
     * @throws IOException 
     */
    public List<String> copyTo(String folder, String dest) throws IOException {
      List<String> res = new ArrayList<String>();
      if (path != null) {
        copyToDest(Utilities.path(path, folder), Utilities.path(path, folder), dest, res);
      } else {
        for (Entry<String, byte[]> e : content.entrySet()) {
          if (e.getKey().startsWith(folder+"/")) {
            String s = e.getKey().substring(folder.length()+1);
            res.add(s);
            String dst = Utilities.path(dest, s);
            String dstDir = Utilities.getDirectoryForFile(dst);
            Utilities.createDirectory(dstDir);
            TextFile.bytesToFile(e.getValue(), dst);
          }
        }
      }
      return res;
    }
    
    private void copyToDest(String base, String folder, String dest, List<String> res) throws IOException {
      for (File f : new File(folder).listFiles()) {
        if (f.isDirectory()) {
          copyToDest(base, f.getAbsolutePath(),  Utilities.path(dest, f.getName()), res);
        } else {
          String dst = Utilities.path(dest, f.getName());
          FileUtils.copyFile(f, new File(dst), true);
          res.add(f.getAbsolutePath().substring(base.length()+1));
        }
      }
    }

    /**
     * get a stream that contains the contents of one of the files in a folder
     * 
     * @param folder
     * @param file
     * @return
     * @throws IOException
     */
    public InputStream load(String folder, String file) throws IOException {
      if (content.containsKey(folder+"/"+file))
        return new ByteArrayInputStream(content.get(folder+"/"+file));
      else {
        File f = new File(Utilities.path(path, folder, file));
        if (f.exists())
          return new FileInputStream(f);
        throw new IOException("Unable to find the file "+folder+"/"+file+" in the package "+name());
      }
    }

    /**
     * Handle to the package json file
     * 
     * @return
     */
    public JsonObject getNpm() {
      return npm;
    }
    
    /**
     * convenience method for getting the package name
     * @return
     */
    public String name() {
      return npm.get("name").getAsString();
    }

    public String canonical() {
      return npm.get("canonical").getAsString();
    }

    /**
     * convenience method for getting the package version
     * @return
     */
    public String version() {
      return npm.get("version").getAsString();
    }

    /**
     * convenience method for getting the package fhir version
     * @return
     */
    public String fhirVersion() {
      if ("hl7.fhir.core".equals(npm.get("name").getAsString()))
        return npm.get("version").getAsString();
      else
        return npm.getAsJsonObject("dependencies").get("hl7.fhir.core").getAsString();
    }

    public String description() {
      if (path != null)
        return path;
      else
        return "memory";
    }

    public boolean isType(PackageType template) {
      return template.getCode().equals(type());
    }

    public String type() {
      return npm.get("type").getAsString();
    }

    public String getPath() {
      return path;
    }

    public IniFile getCache() {
      return cache;
    }

    /**
     * only for use by the package manager itself
     * 
     * @param path
     */
    public void setPath(String path) {
      this.path = path;
    }

    public String getWebLocation() {
      if (npm.has("url"))
        return npm.get("url").getAsString();
      else
        return npm.get("canonical").getAsString();
    }

    public InputStream loadResource(String type, String id) throws IOException {
      String file = type+"-"+id+".json";
      if (content.containsKey("package/"+file))
        return new ByteArrayInputStream(content.get("package/"+file));
      else {
        File f = new File(Utilities.path(path, "package", file));
        if (f.exists())
          return new FileInputStream(f);
        else
          return null;
      }
    }


  }
