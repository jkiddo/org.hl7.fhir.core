package org.hl7.fhir.convertors.conv30_50.resources30_50;

import org.hl7.fhir.convertors.VersionConvertorConstants;
import org.hl7.fhir.convertors.context.ConversionContext30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.ContactDetail30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.Extension30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.Reference30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.UsageContext30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.complextypes30_50.CodeableConcept30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.complextypes30_50.Coding30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.complextypes30_50.Identifier30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.complextypes30_50.Period30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.Boolean30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.Date30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.DateTime30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.Integer30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.MarkDown30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.String30_50;
import org.hl7.fhir.convertors.conv30_50.datatypes30_50.primitivetypes30_50.Uri30_50;
import org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.CodeType;
import org.hl7.fhir.r5.model.Enumeration;
import org.hl7.fhir.r5.model.Questionnaire;
import org.hl7.fhir.r5.model.Questionnaire.QuestionnaireAnswerConstraint;

public class Questionnaire30_50 {

  public static org.hl7.fhir.r5.model.Questionnaire convertQuestionnaire(org.hl7.fhir.dstu3.model.Questionnaire src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Questionnaire tgt = new org.hl7.fhir.r5.model.Questionnaire();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyDomainResource(src, tgt);
    if (src.hasUrl())
      tgt.setUrlElement(Uri30_50.convertUri(src.getUrlElement()));
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_50.convertIdentifier(t));
    if (src.hasVersion())
      tgt.setVersionElement(String30_50.convertString(src.getVersionElement()));
    if (src.hasName())
      tgt.setNameElement(String30_50.convertString(src.getNameElement()));
    if (src.hasTitle())
      tgt.setTitleElement(String30_50.convertString(src.getTitleElement()));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations30_50.convertPublicationStatus(src.getStatusElement()));
    if (src.hasExperimental())
      tgt.setExperimentalElement(Boolean30_50.convertBoolean(src.getExperimentalElement()));
    if (src.hasDate())
      tgt.setDateElement(DateTime30_50.convertDateTime(src.getDateElement()));
    if (src.hasPublisher())
      tgt.setPublisherElement(String30_50.convertString(src.getPublisherElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(MarkDown30_50.convertMarkdown(src.getDescriptionElement()));
    if (src.hasPurpose())
      tgt.setPurposeElement(MarkDown30_50.convertMarkdown(src.getPurposeElement()));
    if (src.hasApprovalDate())
      tgt.setApprovalDateElement(Date30_50.convertDate(src.getApprovalDateElement()));
    if (src.hasLastReviewDate())
      tgt.setLastReviewDateElement(Date30_50.convertDate(src.getLastReviewDateElement()));
    if (src.hasEffectivePeriod())
      tgt.setEffectivePeriod(Period30_50.convertPeriod(src.getEffectivePeriod()));
    for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext())
      tgt.addUseContext(UsageContext30_50.convertUsageContext(t));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction())
      tgt.addJurisdiction(CodeableConcept30_50.convertCodeableConcept(t));
    for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact())
      tgt.addContact(ContactDetail30_50.convertContactDetail(t));
    if (src.hasCopyright())
      tgt.setCopyrightElement(MarkDown30_50.convertMarkdown(src.getCopyrightElement()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode()) tgt.addCode(Coding30_50.convertCoding(t));
    for (org.hl7.fhir.dstu3.model.CodeType t : src.getSubjectType()) tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire convertQuestionnaire(org.hl7.fhir.r5.model.Questionnaire src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire tgt = new org.hl7.fhir.dstu3.model.Questionnaire();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyDomainResource(src, tgt);
    if (src.hasUrl())
      tgt.setUrlElement(Uri30_50.convertUri(src.getUrlElement()));
    for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_50.convertIdentifier(t));
    if (src.hasVersion())
      tgt.setVersionElement(String30_50.convertString(src.getVersionElement()));
    if (src.hasName())
      tgt.setNameElement(String30_50.convertString(src.getNameElement()));
    if (src.hasTitle())
      tgt.setTitleElement(String30_50.convertString(src.getTitleElement()));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations30_50.convertPublicationStatus(src.getStatusElement()));
    if (src.hasExperimental())
      tgt.setExperimentalElement(Boolean30_50.convertBoolean(src.getExperimentalElement()));
    if (src.hasDate())
      tgt.setDateElement(DateTime30_50.convertDateTime(src.getDateElement()));
    if (src.hasPublisher())
      tgt.setPublisherElement(String30_50.convertString(src.getPublisherElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(MarkDown30_50.convertMarkdown(src.getDescriptionElement()));
    if (src.hasPurpose())
      tgt.setPurposeElement(MarkDown30_50.convertMarkdown(src.getPurposeElement()));
    if (src.hasApprovalDate())
      tgt.setApprovalDateElement(Date30_50.convertDate(src.getApprovalDateElement()));
    if (src.hasLastReviewDate())
      tgt.setLastReviewDateElement(Date30_50.convertDate(src.getLastReviewDateElement()));
    if (src.hasEffectivePeriod())
      tgt.setEffectivePeriod(Period30_50.convertPeriod(src.getEffectivePeriod()));
    for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext())
      tgt.addUseContext(UsageContext30_50.convertUsageContext(t));
    for (org.hl7.fhir.r5.model.CodeableConcept t : src.getJurisdiction())
      tgt.addJurisdiction(CodeableConcept30_50.convertCodeableConcept(t));
    for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact())
      tgt.addContact(ContactDetail30_50.convertContactDetail(t));
    if (src.hasCopyright())
      tgt.setCopyrightElement(MarkDown30_50.convertMarkdown(src.getCopyrightElement()));
    for (org.hl7.fhir.r5.model.Coding t : src.getCode()) tgt.addCode(Coding30_50.convertCoding(t));
    for (org.hl7.fhir.r5.model.CodeType t : src.getSubjectType()) tgt.addSubjectType(t.getValue());
    for (org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasLinkId())
      tgt.setLinkIdElement(String30_50.convertString(src.getLinkIdElement()));
    if (src.hasDefinition())
      tgt.setDefinitionElement(Uri30_50.convertUri(src.getDefinitionElement()));
    for (org.hl7.fhir.r5.model.Coding t : src.getCode()) tgt.addCode(Coding30_50.convertCoding(t));
    if (src.hasPrefix())
      tgt.setPrefixElement(String30_50.convertString(src.getPrefixElement()));
    if (src.hasText())
      tgt.setTextElement(String30_50.convertString(src.getTextElement()));
    if (src.hasType())
      tgt.setTypeElement(convertQuestionnaireItemType(src.getTypeElement(), src.getAnswerConstraint()));
    for (org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    if (src.hasRequired())
      tgt.setRequiredElement(Boolean30_50.convertBoolean(src.getRequiredElement()));
    if (src.hasRepeats())
      tgt.setRepeatsElement(Boolean30_50.convertBoolean(src.getRepeatsElement()));
    if (src.hasReadOnly())
      tgt.setReadOnlyElement(Boolean30_50.convertBoolean(src.getReadOnlyElement()));
    if (src.hasMaxLength())
      tgt.setMaxLengthElement(Integer30_50.convertInteger(src.getMaxLengthElement()));
    if (src.hasAnswerValueSet())
      tgt.setOptions(Reference30_50.convertCanonicalToReference(src.getAnswerValueSetElement()));
    for (org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemAnswerOptionComponent t : src.getAnswerOption())
      tgt.addOption(convertQuestionnaireItemOptionComponent(t));
    if (src.hasInitial())
      tgt.setInitial(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getInitialFirstRep().getValue()));
    for (org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent convertQuestionnaireItemComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent tgt = new org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasLinkId())
      tgt.setLinkIdElement(String30_50.convertString(src.getLinkIdElement()));
    if (src.hasDefinition())
      tgt.setDefinitionElement(Uri30_50.convertUri(src.getDefinitionElement()));
    for (org.hl7.fhir.dstu3.model.Coding t : src.getCode()) tgt.addCode(Coding30_50.convertCoding(t));
    if (src.hasPrefix())
      tgt.setPrefixElement(String30_50.convertString(src.getPrefixElement()));
    if (src.hasText())
      tgt.setTextElement(String30_50.convertStringToMarkdown(src.getTextElement()));
    if (src.hasType()) {
      tgt.setTypeElement(convertQuestionnaireItemType(src.getTypeElement()));
      if (src.getType() == QuestionnaireItemType.CHOICE) {
        tgt.setAnswerConstraint(QuestionnaireAnswerConstraint.OPTIONSONLY);
      } else if (src.getType() == QuestionnaireItemType.OPENCHOICE) {
        tgt.setAnswerConstraint(QuestionnaireAnswerConstraint.OPTIONSORSTRING);
      }
    }
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent t : src.getEnableWhen())
      tgt.addEnableWhen(convertQuestionnaireItemEnableWhenComponent(t));
    tgt.setEnableBehavior(Questionnaire.EnableWhenBehavior.ANY);
    if (src.hasRequired())
      tgt.setRequiredElement(Boolean30_50.convertBoolean(src.getRequiredElement()));
    if (src.hasRepeats())
      tgt.setRepeatsElement(Boolean30_50.convertBoolean(src.getRepeatsElement()));
    if (src.hasReadOnly())
      tgt.setReadOnlyElement(Boolean30_50.convertBoolean(src.getReadOnlyElement()));
    if (src.hasMaxLength())
      tgt.setMaxLengthElement(Integer30_50.convertInteger(src.getMaxLengthElement()));
    if (src.hasOptions())
      tgt.setAnswerValueSetElement(Reference30_50.convertReferenceToCanonical(src.getOptions()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent t : src.getOption())
      tgt.addAnswerOption(convertQuestionnaireItemOptionComponent(t));
    if (src.hasInitial())
      tgt.addInitial().setValue(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getInitial()));
    for (org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemComponent t : src.getItem())
      tgt.addItem(convertQuestionnaireItemComponent(t));
    for (org.hl7.fhir.dstu3.model.Extension t : src.getModifierExtension()) {
      tgt.addModifierExtension(Extension30_50.convertExtension(t));
    }
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasQuestion())
      tgt.setQuestionElement(String30_50.convertString(src.getQuestionElement()));
    if (src.hasOperator() && src.getOperator() == org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemOperator.EXISTS)
      tgt.setHasAnswer(src.getAnswerBooleanType().getValue());
    else if (src.hasAnswer())
      tgt.setAnswer(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getAnswer()));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemEnableWhenComponent convertQuestionnaireItemEnableWhenComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemEnableWhenComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemEnableWhenComponent tgt = new org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasQuestion())
      tgt.setQuestionElement(String30_50.convertString(src.getQuestionElement()));
    if (src.hasHasAnswer()) {
      tgt.setOperator(org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemOperator.EXISTS);
      if (src.hasHasAnswerElement())
        tgt.setAnswer(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getHasAnswerElement()));
    } else if (src.hasAnswer()) {
      tgt.setOperator(org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemOperator.EQUAL);
      if (src.hasAnswer())
        tgt.setAnswer(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getAnswer()));
    }
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemAnswerOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemAnswerOptionComponent tgt = new org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemAnswerOptionComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasValue())
      tgt.setValue(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getValue()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent convertQuestionnaireItemOptionComponent(org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemAnswerOptionComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent tgt = new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemOptionComponent();
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyBackboneElement(src,tgt);
    if (src.hasValue())
      tgt.setValue(ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().convertType(src.getValue()));
    return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType> convertQuestionnaireItemType(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemType> src, QuestionnaireAnswerConstraint constraint) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemTypeEnumFactory());
    ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyElement(src, tgt, VersionConvertorConstants.EXT_QUESTIONNAIRE_ITEM_TYPE_ORIGINAL);
    if (src.hasExtension(VersionConvertorConstants.EXT_QUESTIONNAIRE_ITEM_TYPE_ORIGINAL)) {
      tgt.setValueAsString(src.getExtensionString(VersionConvertorConstants.EXT_QUESTIONNAIRE_ITEM_TYPE_ORIGINAL));
    } else {
        if (src.getValue() == null) {
            tgt.setValue(null);
        } else {
            switch (src.getValue()) {
                case GROUP:
                    tgt.setValue(QuestionnaireItemType.GROUP);
                    break;
                case DISPLAY:
                    tgt.setValue(QuestionnaireItemType.DISPLAY);
                    break;
                case BOOLEAN:
                    tgt.setValue(QuestionnaireItemType.BOOLEAN);
                    break;
                case DECIMAL:
                    tgt.setValue(QuestionnaireItemType.DECIMAL);
                    break;
                case INTEGER:
                    tgt.setValue(QuestionnaireItemType.INTEGER);
                    break;
                case DATE:
                    tgt.setValue(QuestionnaireItemType.DATE);
                    break;
                case DATETIME:
                    tgt.setValue(QuestionnaireItemType.DATETIME);
                    break;
                case TIME:
                    tgt.setValue(QuestionnaireItemType.TIME);
                    break;
                case STRING:
                    tgt.setValue(QuestionnaireItemType.STRING);
                    break;
                case TEXT:
                    tgt.setValue(QuestionnaireItemType.TEXT);
                    break;
                case URL:
                    tgt.setValue(QuestionnaireItemType.URL);
                    break;
                case CODING:
                    if (constraint == QuestionnaireAnswerConstraint.OPTIONSORSTRING)
                        tgt.setValue(QuestionnaireItemType.OPENCHOICE);
                    else
                        tgt.setValue(QuestionnaireItemType.CHOICE);
                    break;
                case ATTACHMENT:
                    tgt.setValue(QuestionnaireItemType.ATTACHMENT);
                    break;
                case REFERENCE:
                    tgt.setValue(QuestionnaireItemType.REFERENCE);
                    break;
                case QUANTITY:
                    tgt.setValue(QuestionnaireItemType.QUANTITY);
                    break;
                default:
                    tgt.setValue(QuestionnaireItemType.NULL);
                    break;
            }
        }
    }
    return tgt;
  }

  static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Questionnaire.QuestionnaireItemType> convertQuestionnaireItemType(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Questionnaire.QuestionnaireItemType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Questionnaire.QuestionnaireItemType> tgt = new Enumeration<>(new Questionnaire.QuestionnaireItemTypeEnumFactory());
      ConversionContext30_50.INSTANCE.getVersionConvertor_30_50().copyElement(src, tgt);
      tgt.addExtension(VersionConvertorConstants.EXT_QUESTIONNAIRE_ITEM_TYPE_ORIGINAL, new CodeType(src.getValueAsString()));
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case GROUP:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.GROUP);
                  break;
              case DISPLAY:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.DISPLAY);
                  break;
              case BOOLEAN:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.BOOLEAN);
                  break;
              case DECIMAL:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.DECIMAL);
                  break;
              case INTEGER:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.INTEGER);
                  break;
              case DATE:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.DATE);
                  break;
              case DATETIME:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.DATETIME);
                  break;
              case TIME:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.TIME);
                  break;
              case STRING:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.STRING);
                  break;
              case TEXT:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.TEXT);
                  break;
              case URL:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.URL);
                  break;
              case CHOICE:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.CODING);
                  break;
              case OPENCHOICE:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.CODING);
                  break;
              case ATTACHMENT:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.ATTACHMENT);
                  break;
              case REFERENCE:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.REFERENCE);
                  break;
              case QUANTITY:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.QUANTITY);
                  break;
              default:
                  tgt.setValue(Questionnaire.QuestionnaireItemType.NULL);
                  break;
          }
      }
      return tgt;
  }
}