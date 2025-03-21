package org.hl7.fhir.convertors.conv14_50.resources14_50;

import org.hl7.fhir.convertors.context.ConversionContext14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.complextypes14_50.Signature14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.primitivetypes14_50.Decimal14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.primitivetypes14_50.Instant14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.primitivetypes14_50.String14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.primitivetypes14_50.UnsignedInt14_50;
import org.hl7.fhir.convertors.conv14_50.datatypes14_50.primitivetypes14_50.Uri14_50;
import org.hl7.fhir.dstu2016may.model.Bundle;
import org.hl7.fhir.dstu2016may.model.Enumeration;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.Bundle.LinkRelationTypes;

public class Bundle14_50 {

  public static org.hl7.fhir.r5.model.Bundle convertBundle(org.hl7.fhir.dstu2016may.model.Bundle src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle tgt = new org.hl7.fhir.r5.model.Bundle();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyResource(src, tgt);
    if (src.hasType())
      tgt.setTypeElement(convertBundleType(src.getTypeElement()));
    if (src.hasTotal())
      tgt.setTotalElement(UnsignedInt14_50.convertUnsignedInt(src.getTotalElement()));
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    if (src.hasSignature())
      tgt.setSignature(Signature14_50.convertSignature(src.getSignature()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle convertBundle(org.hl7.fhir.r5.model.Bundle src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle tgt = new org.hl7.fhir.dstu2016may.model.Bundle();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyResource(src, tgt);
    if (src.hasType())
      tgt.setTypeElement(convertBundleType(src.getTypeElement()));
    if (src.hasTotal())
      tgt.setTotalElement(UnsignedInt14_50.convertUnsignedInt(src.getTotalElement()));
    for (org.hl7.fhir.r5.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
    for (org.hl7.fhir.r5.model.Bundle.BundleEntryComponent t : src.getEntry())
      tgt.addEntry(convertBundleEntryComponent(t));
    if (src.hasSignature())
      tgt.setSignature(Signature14_50.convertSignature(src.getSignature()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    for (org.hl7.fhir.r5.model.Bundle.BundleLinkComponent t : src.getLink()) tgt.addLink(convertBundleLinkComponent(t));
    if (src.hasFullUrl())
      tgt.setFullUrlElement(Uri14_50.convertUri(src.getFullUrlElement()));
    if (src.hasResource())
      tgt.setResource(ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().convertResource(src.getResource()));
    if (src.hasSearch())
      tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    if (src.hasRequest())
      tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    if (src.hasResponse())
      tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Bundle.BundleEntryComponent convertBundleEntryComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle.BundleEntryComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    for (org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent t : src.getLink())
      tgt.addLink(convertBundleLinkComponent(t));
    if (src.hasFullUrl())
      tgt.setFullUrlElement(Uri14_50.convertUri(src.getFullUrlElement()));
    if (src.hasResource())
      tgt.setResource(ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().convertResource(src.getResource()));
    if (src.hasSearch())
      tgt.setSearch(convertBundleEntrySearchComponent(src.getSearch()));
    if (src.hasRequest())
      tgt.setRequest(convertBundleEntryRequestComponent(src.getRequest()));
    if (src.hasResponse())
      tgt.setResponse(convertBundleEntryResponseComponent(src.getResponse()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasMethod())
      tgt.setMethodElement(convertHTTPVerb(src.getMethodElement()));
    if (src.hasUrlElement())
      tgt.setUrlElement(Uri14_50.convertUri(src.getUrlElement()));
    if (src.hasIfNoneMatch())
      tgt.setIfNoneMatchElement(String14_50.convertString(src.getIfNoneMatchElement()));
    if (src.hasIfModifiedSince())
      tgt.setIfModifiedSinceElement(Instant14_50.convertInstant(src.getIfModifiedSinceElement()));
    if (src.hasIfMatch())
      tgt.setIfMatchElement(String14_50.convertString(src.getIfMatchElement()));
    if (src.hasIfNoneExist())
      tgt.setIfNoneExistElement(String14_50.convertString(src.getIfNoneExistElement()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent convertBundleEntryRequestComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryRequestComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryRequestComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasMethod())
      tgt.setMethodElement(convertHTTPVerb(src.getMethodElement()));
    if (src.hasUrlElement())
      tgt.setUrlElement(Uri14_50.convertUri(src.getUrlElement()));
    if (src.hasIfNoneMatch())
      tgt.setIfNoneMatchElement(String14_50.convertString(src.getIfNoneMatchElement()));
    if (src.hasIfModifiedSince())
      tgt.setIfModifiedSinceElement(Instant14_50.convertInstant(src.getIfModifiedSinceElement()));
    if (src.hasIfMatch())
      tgt.setIfMatchElement(String14_50.convertString(src.getIfMatchElement()));
    if (src.hasIfNoneExist())
      tgt.setIfNoneExistElement(String14_50.convertString(src.getIfNoneExistElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasStatusElement())
      tgt.setStatusElement(String14_50.convertString(src.getStatusElement()));
    if (src.hasLocation())
      tgt.setLocationElement(Uri14_50.convertUri(src.getLocationElement()));
    if (src.hasEtag())
      tgt.setEtagElement(String14_50.convertString(src.getEtagElement()));
    if (src.hasLastModified())
      tgt.setLastModifiedElement(Instant14_50.convertInstant(src.getLastModifiedElement()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent convertBundleEntryResponseComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntryResponseComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntryResponseComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasStatusElement())
      tgt.setStatusElement(String14_50.convertString(src.getStatusElement()));
    if (src.hasLocation())
      tgt.setLocationElement(Uri14_50.convertUri(src.getLocationElement()));
    if (src.hasEtag())
      tgt.setEtagElement(String14_50.convertString(src.getEtagElement()));
    if (src.hasLastModified())
      tgt.setLastModifiedElement(Instant14_50.convertInstant(src.getLastModifiedElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasMode())
      tgt.setModeElement(convertSearchEntryMode(src.getModeElement()));
    if (src.hasScore())
      tgt.setScoreElement(Decimal14_50.convertDecimal(src.getScoreElement()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent convertBundleEntrySearchComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleEntrySearchComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleEntrySearchComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasMode())
      tgt.setModeElement(convertSearchEntryMode(src.getModeElement()));
    if (src.hasScore())
      tgt.setScoreElement(Decimal14_50.convertDecimal(src.getScoreElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.r5.model.Bundle.BundleLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasRelationElement())
      tgt.setRelation((src.getRelation().toCode()));
    if (src.hasUrlElement())
      tgt.setUrlElement(Uri14_50.convertUri(src.getUrlElement()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Bundle.BundleLinkComponent convertBundleLinkComponent(org.hl7.fhir.dstu2016may.model.Bundle.BundleLinkComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r5.model.Bundle.BundleLinkComponent tgt = new org.hl7.fhir.r5.model.Bundle.BundleLinkComponent();
    ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyBackboneElement(src,tgt);
    if (src.hasRelationElement())
      tgt.setRelation(LinkRelationTypes.fromCode(src.getRelation()));
    if (src.hasUrlElement())
      tgt.setUrlElement(Uri14_50.convertUri(src.getUrlElement()));
    return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.BundleType> convertBundleType(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.BundleType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Bundle.BundleType> tgt = new Enumeration<>(new Bundle.BundleTypeEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case DOCUMENT:
                  tgt.setValue(Bundle.BundleType.DOCUMENT);
                  break;
              case MESSAGE:
                  tgt.setValue(Bundle.BundleType.MESSAGE);
                  break;
              case TRANSACTION:
                  tgt.setValue(Bundle.BundleType.TRANSACTION);
                  break;
              case TRANSACTIONRESPONSE:
                  tgt.setValue(Bundle.BundleType.TRANSACTIONRESPONSE);
                  break;
              case BATCH:
                  tgt.setValue(Bundle.BundleType.BATCH);
                  break;
              case BATCHRESPONSE:
                  tgt.setValue(Bundle.BundleType.BATCHRESPONSE);
                  break;
              case HISTORY:
                  tgt.setValue(Bundle.BundleType.HISTORY);
                  break;
              case SEARCHSET:
                  tgt.setValue(Bundle.BundleType.SEARCHSET);
                  break;
              case COLLECTION:
                  tgt.setValue(Bundle.BundleType.COLLECTION);
                  break;
              default:
                  tgt.setValue(Bundle.BundleType.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.BundleType> convertBundleType(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.BundleType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.BundleType> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Bundle.BundleTypeEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case DOCUMENT:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.DOCUMENT);
                  break;
              case MESSAGE:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.MESSAGE);
                  break;
              case TRANSACTION:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.TRANSACTION);
                  break;
              case TRANSACTIONRESPONSE:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.TRANSACTIONRESPONSE);
                  break;
              case BATCH:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.BATCH);
                  break;
              case BATCHRESPONSE:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.BATCHRESPONSE);
                  break;
              case HISTORY:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.HISTORY);
                  break;
              case SEARCHSET:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.SEARCHSET);
                  break;
              case COLLECTION:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.COLLECTION);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.BundleType.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb> convertHTTPVerb(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.HTTPVerb> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Bundle.HTTPVerb> tgt = new Enumeration<>(new Bundle.HTTPVerbEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case GET:
                  tgt.setValue(Bundle.HTTPVerb.GET);
                  break;
              case POST:
                  tgt.setValue(Bundle.HTTPVerb.POST);
                  break;
              case PUT:
                  tgt.setValue(Bundle.HTTPVerb.PUT);
                  break;
              case DELETE:
                  tgt.setValue(Bundle.HTTPVerb.DELETE);
                  break;
              default:
                  tgt.setValue(Bundle.HTTPVerb.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.HTTPVerb> convertHTTPVerb(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.HTTPVerb> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.HTTPVerb> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Bundle.HTTPVerbEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case GET:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.HTTPVerb.GET);
                  break;
              case POST:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.HTTPVerb.POST);
                  break;
              case PUT:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.HTTPVerb.PUT);
                  break;
              case DELETE:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.HTTPVerb.DELETE);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.HTTPVerb.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode> convertSearchEntryMode(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.SearchEntryMode> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Bundle.SearchEntryMode> tgt = new Enumeration<>(new Bundle.SearchEntryModeEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case MATCH:
                  tgt.setValue(Bundle.SearchEntryMode.MATCH);
                  break;
              case INCLUDE:
                  tgt.setValue(Bundle.SearchEntryMode.INCLUDE);
                  break;
              case OUTCOME:
                  tgt.setValue(Bundle.SearchEntryMode.OUTCOME);
                  break;
              default:
                  tgt.setValue(Bundle.SearchEntryMode.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.SearchEntryMode> convertSearchEntryMode(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.Bundle.SearchEntryMode> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Bundle.SearchEntryMode> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Bundle.SearchEntryModeEnumFactory());
      ConversionContext14_50.INSTANCE.getVersionConvertor_14_50().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case MATCH:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.SearchEntryMode.MATCH);
                  break;
              case INCLUDE:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.SearchEntryMode.INCLUDE);
                  break;
              case OUTCOME:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.SearchEntryMode.OUTCOME);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.r5.model.Bundle.SearchEntryMode.NULL);
                  break;
          }
      }
      return tgt;
  }
}