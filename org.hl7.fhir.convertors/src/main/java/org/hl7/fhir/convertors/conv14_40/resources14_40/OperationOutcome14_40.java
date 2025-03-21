package org.hl7.fhir.convertors.conv14_40.resources14_40;

import org.hl7.fhir.convertors.context.ConversionContext14_40;
import org.hl7.fhir.convertors.conv14_40.datatypes14_40.Expression14_40;
import org.hl7.fhir.convertors.conv14_40.datatypes14_40.complextypes14_40.CodeableConcept14_40;
import org.hl7.fhir.convertors.conv14_40.datatypes14_40.primitivetypes14_40.String14_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Enumeration;
import org.hl7.fhir.r4.model.OperationOutcome;

public class OperationOutcome14_40 {

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity> convertIssueSeverity(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<OperationOutcome.IssueSeverity> tgt = new Enumeration<>(new OperationOutcome.IssueSeverityEnumFactory());
      ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case FATAL:
                  tgt.setValue(OperationOutcome.IssueSeverity.FATAL);
                  break;
              case ERROR:
                  tgt.setValue(OperationOutcome.IssueSeverity.ERROR);
                  break;
              case WARNING:
                  tgt.setValue(OperationOutcome.IssueSeverity.WARNING);
                  break;
              case INFORMATION:
                  tgt.setValue(OperationOutcome.IssueSeverity.INFORMATION);
                  break;
              default:
                  tgt.setValue(OperationOutcome.IssueSeverity.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity> convertIssueSeverity(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity> tgt = new org.hl7.fhir.dstu2016may.model.Enumeration<>(new org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverityEnumFactory());
      ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case FATAL:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.FATAL);
                  break;
              case ERROR:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.ERROR);
                  break;
              case WARNING:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.WARNING);
                  break;
              case INFORMATION:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.INFORMATION);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueSeverity.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.OperationOutcome.IssueType> convertIssueType(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<OperationOutcome.IssueType> tgt = new Enumeration<>(new OperationOutcome.IssueTypeEnumFactory());
      ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case INVALID:
                  tgt.setValue(OperationOutcome.IssueType.INVALID);
                  break;
              case STRUCTURE:
                  tgt.setValue(OperationOutcome.IssueType.STRUCTURE);
                  break;
              case REQUIRED:
                  tgt.setValue(OperationOutcome.IssueType.REQUIRED);
                  break;
              case VALUE:
                  tgt.setValue(OperationOutcome.IssueType.VALUE);
                  break;
              case INVARIANT:
                  tgt.setValue(OperationOutcome.IssueType.INVARIANT);
                  break;
              case SECURITY:
                  tgt.setValue(OperationOutcome.IssueType.SECURITY);
                  break;
              case LOGIN:
                  tgt.setValue(OperationOutcome.IssueType.LOGIN);
                  break;
              case UNKNOWN:
                  tgt.setValue(OperationOutcome.IssueType.UNKNOWN);
                  break;
              case EXPIRED:
                  tgt.setValue(OperationOutcome.IssueType.EXPIRED);
                  break;
              case FORBIDDEN:
                  tgt.setValue(OperationOutcome.IssueType.FORBIDDEN);
                  break;
              case SUPPRESSED:
                  tgt.setValue(OperationOutcome.IssueType.SUPPRESSED);
                  break;
              case PROCESSING:
                  tgt.setValue(OperationOutcome.IssueType.PROCESSING);
                  break;
              case NOTSUPPORTED:
                  tgt.setValue(OperationOutcome.IssueType.NOTSUPPORTED);
                  break;
              case DUPLICATE:
                  tgt.setValue(OperationOutcome.IssueType.DUPLICATE);
                  break;
              case NOTFOUND:
                  tgt.setValue(OperationOutcome.IssueType.NOTFOUND);
                  break;
              case TOOLONG:
                  tgt.setValue(OperationOutcome.IssueType.TOOLONG);
                  break;
              case CODEINVALID:
                  tgt.setValue(OperationOutcome.IssueType.CODEINVALID);
                  break;
              case EXTENSION:
                  tgt.setValue(OperationOutcome.IssueType.EXTENSION);
                  break;
              case TOOCOSTLY:
                  tgt.setValue(OperationOutcome.IssueType.TOOCOSTLY);
                  break;
              case BUSINESSRULE:
                  tgt.setValue(OperationOutcome.IssueType.BUSINESSRULE);
                  break;
              case CONFLICT:
                  tgt.setValue(OperationOutcome.IssueType.CONFLICT);
                  break;
              case INCOMPLETE:
                  tgt.setValue(OperationOutcome.IssueType.INCOMPLETE);
                  break;
              case TRANSIENT:
                  tgt.setValue(OperationOutcome.IssueType.TRANSIENT);
                  break;
              case LOCKERROR:
                  tgt.setValue(OperationOutcome.IssueType.LOCKERROR);
                  break;
              case NOSTORE:
                  tgt.setValue(OperationOutcome.IssueType.NOSTORE);
                  break;
              case EXCEPTION:
                  tgt.setValue(OperationOutcome.IssueType.EXCEPTION);
                  break;
              case TIMEOUT:
                  tgt.setValue(OperationOutcome.IssueType.TIMEOUT);
                  break;
              case THROTTLED:
                  tgt.setValue(OperationOutcome.IssueType.THROTTLED);
                  break;
              case INFORMATIONAL:
                  tgt.setValue(OperationOutcome.IssueType.INFORMATIONAL);
                  break;
              default:
                  tgt.setValue(OperationOutcome.IssueType.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType> convertIssueType(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.OperationOutcome.IssueType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType> tgt = new org.hl7.fhir.dstu2016may.model.Enumeration<>(new org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueTypeEnumFactory());
      ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case INVALID:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INVALID);
                  break;
              case STRUCTURE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.STRUCTURE);
                  break;
              case REQUIRED:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.REQUIRED);
                  break;
              case VALUE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.VALUE);
                  break;
              case INVARIANT:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INVARIANT);
                  break;
              case SECURITY:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.SECURITY);
                  break;
              case LOGIN:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.LOGIN);
                  break;
              case UNKNOWN:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.UNKNOWN);
                  break;
              case EXPIRED:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXPIRED);
                  break;
              case FORBIDDEN:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.FORBIDDEN);
                  break;
              case SUPPRESSED:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.SUPPRESSED);
                  break;
              case PROCESSING:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.PROCESSING);
                  break;
              case NOTSUPPORTED:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOTSUPPORTED);
                  break;
              case DUPLICATE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.DUPLICATE);
                  break;
              case NOTFOUND:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOTFOUND);
                  break;
              case TOOLONG:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TOOLONG);
                  break;
              case CODEINVALID:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.CODEINVALID);
                  break;
              case EXTENSION:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXTENSION);
                  break;
              case TOOCOSTLY:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TOOCOSTLY);
                  break;
              case BUSINESSRULE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.BUSINESSRULE);
                  break;
              case CONFLICT:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.CONFLICT);
                  break;
              case INCOMPLETE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INCOMPLETE);
                  break;
              case TRANSIENT:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TRANSIENT);
                  break;
              case LOCKERROR:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.LOCKERROR);
                  break;
              case NOSTORE:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NOSTORE);
                  break;
              case EXCEPTION:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.EXCEPTION);
                  break;
              case TIMEOUT:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.TIMEOUT);
                  break;
              case THROTTLED:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.THROTTLED);
                  break;
              case INFORMATIONAL:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.INFORMATIONAL);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.dstu2016may.model.OperationOutcome.IssueType.NULL);
                  break;
          }
      }
      return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.r4.model.OperationOutcome src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationOutcome tgt = new org.hl7.fhir.dstu2016may.model.OperationOutcome();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.OperationOutcome convertOperationOutcome(org.hl7.fhir.dstu2016may.model.OperationOutcome src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4.model.OperationOutcome tgt = new org.hl7.fhir.r4.model.OperationOutcome();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent t : src.getIssue())
      tgt.addIssue(convertOperationOutcomeIssueComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyBackboneElement(src,tgt);
    if (src.hasSeverity())
      tgt.setSeverityElement(convertIssueSeverity(src.getSeverityElement()));
    if (src.hasCode())
      tgt.setCodeElement(convertIssueType(src.getCodeElement()));
    if (src.hasDetails())
      tgt.setDetails(CodeableConcept14_40.convertCodeableConcept(src.getDetails()));
    if (src.hasDiagnostics())
      tgt.setDiagnosticsElement(String14_40.convertString(src.getDiagnosticsElement()));
    for (org.hl7.fhir.r4.model.StringType t : src.getLocation()) tgt.addLocation(t.getValue());
    for (org.hl7.fhir.r4.model.StringType t : src.getExpression())
      tgt.addExpression(Expression14_40.convertTo2016MayExpression(t.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent convertOperationOutcomeIssueComponent(org.hl7.fhir.dstu2016may.model.OperationOutcome.OperationOutcomeIssueComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent tgt = new org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent();
    ConversionContext14_40.INSTANCE.getVersionConvertor_14_40().copyBackboneElement(src,tgt);
    if (src.hasSeverity())
      tgt.setSeverityElement(convertIssueSeverity(src.getSeverityElement()));
    if (src.hasCode())
      tgt.setCodeElement(convertIssueType(src.getCodeElement()));
    if (src.hasDetails())
      tgt.setDetails(CodeableConcept14_40.convertCodeableConcept(src.getDetails()));
    if (src.hasDiagnostics())
      tgt.setDiagnosticsElement(String14_40.convertString(src.getDiagnosticsElement()));
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getLocation()) tgt.addLocation(t.getValue());
    for (org.hl7.fhir.dstu2016may.model.StringType t : src.getExpression())
      tgt.addExpression(Expression14_40.convertToR4Expression(t.getValue()));
    return tgt;
  }
}