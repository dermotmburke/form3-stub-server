package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MandateAdmissionStatusReason
 */
public enum MandateAdmissionStatusReason {
  
  ACCEPTED("accepted"),
  
  INVALID_BENEFICIARY_DETAILS("invalid_beneficiary_details"),
  
  BANKID_NOT_PROVISIONED("bankid_not_provisioned"),
  
  UNKNOWN_ACCOUNTNUMBER("unknown_accountnumber"),
  
  MANDATE_CANCELLED("mandate_cancelled"),
  
  MANDATE_EXPIRED("mandate_expired"),
  
  MANDATE_FAILED("mandate_failed"),
  
  UNKNOWN_INSTRUCTION("unknown_instruction"),
  
  PAYER_REFERENCE_NOT_UNIQUE("payer_reference_not_unique"),
  
  INVALID_REFERENCE("invalid_reference"),
  
  NOT_ELIGIBLE_FOR_REINSTATEMENT_BY_ORIGINATOR("not_eligible_for_reinstatement_by_originator");

  private String value;

  MandateAdmissionStatusReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MandateAdmissionStatusReason fromValue(String text) {
    for (MandateAdmissionStatusReason b : MandateAdmissionStatusReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

