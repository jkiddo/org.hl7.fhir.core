package org.hl7.fhir.convertors.conv30_40.resources30_40;

import org.hl7.fhir.convertors.context.ConversionContext30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.Reference30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.CodeableConcept30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Identifier30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.Instant30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.String30_40;
import org.hl7.fhir.dstu3.model.AppointmentResponse;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.exceptions.FHIRException;

public class AppointmentResponse30_40 {

  public static org.hl7.fhir.r4.model.AppointmentResponse convertAppointmentResponse(org.hl7.fhir.dstu3.model.AppointmentResponse src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.AppointmentResponse tgt = new org.hl7.fhir.r4.model.AppointmentResponse();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasAppointment())
      tgt.setAppointment(Reference30_40.convertReference(src.getAppointment()));
    if (src.hasStart())
      tgt.setStartElement(Instant30_40.convertInstant(src.getStartElement()));
    if (src.hasEnd())
      tgt.setEndElement(Instant30_40.convertInstant(src.getEndElement()));
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getParticipantType())
      tgt.addParticipantType(CodeableConcept30_40.convertCodeableConcept(t));
    if (src.hasActor())
      tgt.setActor(Reference30_40.convertReference(src.getActor()));
    if (src.hasParticipantStatus())
      tgt.setParticipantStatusElement(convertParticipantStatus(src.getParticipantStatusElement()));
    if (src.hasComment())
      tgt.setCommentElement(String30_40.convertString(src.getCommentElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.AppointmentResponse convertAppointmentResponse(org.hl7.fhir.r4.model.AppointmentResponse src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.AppointmentResponse tgt = new org.hl7.fhir.dstu3.model.AppointmentResponse();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasAppointment())
      tgt.setAppointment(Reference30_40.convertReference(src.getAppointment()));
    if (src.hasStart())
      tgt.setStartElement(Instant30_40.convertInstant(src.getStartElement()));
    if (src.hasEnd())
      tgt.setEndElement(Instant30_40.convertInstant(src.getEndElement()));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getParticipantType())
      tgt.addParticipantType(CodeableConcept30_40.convertCodeableConcept(t));
    if (src.hasActor())
      tgt.setActor(Reference30_40.convertReference(src.getActor()));
    if (src.hasParticipantStatus())
      tgt.setParticipantStatusElement(convertParticipantStatus(src.getParticipantStatusElement()));
    if (src.hasComment())
      tgt.setCommentElement(String30_40.convertString(src.getCommentElement()));
    return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.AppointmentResponse.ParticipantStatus> convertParticipantStatus(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<AppointmentResponse.ParticipantStatus> tgt = new Enumeration<>(new AppointmentResponse.ParticipantStatusEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case ACCEPTED:
                  tgt.setValue(AppointmentResponse.ParticipantStatus.ACCEPTED);
                  break;
              case DECLINED:
                  tgt.setValue(AppointmentResponse.ParticipantStatus.DECLINED);
                  break;
              case TENTATIVE:
                  tgt.setValue(AppointmentResponse.ParticipantStatus.TENTATIVE);
                  break;
              case NEEDSACTION:
                  tgt.setValue(AppointmentResponse.ParticipantStatus.NEEDSACTION);
                  break;
              default:
                  tgt.setValue(AppointmentResponse.ParticipantStatus.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus> convertParticipantStatus(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.AppointmentResponse.ParticipantStatus> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatusEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case ACCEPTED:
                  tgt.setValue(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.ACCEPTED);
                  break;
              case DECLINED:
                  tgt.setValue(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.DECLINED);
                  break;
              case TENTATIVE:
                  tgt.setValue(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.TENTATIVE);
                  break;
              case NEEDSACTION:
                  tgt.setValue(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.NEEDSACTION);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.NULL);
                  break;
          }
      }
      return tgt;
  }
}