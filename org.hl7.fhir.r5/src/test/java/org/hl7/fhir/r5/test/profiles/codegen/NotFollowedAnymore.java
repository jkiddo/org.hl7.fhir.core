package org.hl7.fhir.r5.test.profiles.codegen;

import java.util.List;
import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Date;


import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.profilemodel.PEBuilder;
import org.hl7.fhir.r5.profilemodel.PEInstance;
import org.hl7.fhir.r5.profilemodel.PEBuilder.PEElementPropertiesPolicy;
import org.hl7.fhir.r5.profilemodel.gen.PEGeneratedBase;
import org.hl7.fhir.r5.profilemodel.gen.Min;
import org.hl7.fhir.r5.profilemodel.gen.Max;
import org.hl7.fhir.r5.profilemodel.gen.Label;
import org.hl7.fhir.r5.profilemodel.gen.Doco;
import org.hl7.fhir.r5.profilemodel.gen.BindingStrength;
import org.hl7.fhir.r5.profilemodel.gen.ValueSet;
import org.hl7.fhir.r5.profilemodel.gen.MustSupport;
import org.hl7.fhir.r5.profilemodel.gen.Definition;


// Generated by the HAPI Java Profile Generator, 5/11/24, 6:00 pm

/**
 * Extension for the date where a condition lost focus in a specific clinical 
 * context
 *
 */
public class NotFollowedAnymore extends PEGeneratedBase {

  public static final String CANONICAL_URL = "http://hl7.dk/fhir/core/StructureDefinition/NotFollowedAnymore|3.2.0";


  /**
   * Parameter-less constructor.
   *
   */
  public NotFollowedAnymore() {
  }

  /**
   * Used when loading other models 
   *
   */
  public static NotFollowedAnymore fromSource(PEInstance source) {
    NotFollowedAnymore theThing = new NotFollowedAnymore();
    theThing.workerContext = source.getContext();
    theThing.load(source);
    return theThing;
  }

  public void load(PEInstance src) {
    clear();

  }

  public void save(PEInstance tgt, boolean nulls) {

  }



  public void clear() {

  }

}
