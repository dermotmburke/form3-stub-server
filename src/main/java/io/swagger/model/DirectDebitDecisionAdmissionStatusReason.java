package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitDecisionAdmissionStatusReason
 */
public enum DirectDebitDecisionAdmissionStatusReason {
  
  ACCEPTED("accepted"),
  
  INVALID_BENEFICIARY_DETAILS("invalid_beneficiary_details"),
  
  BANKID_NOT_PROVISIONED("bankid_not_provisioned"),
  
  UNKNOWN_ACCOUNTNUMBER("unknown_accountnumber"),
  
  PENDING_SETTLEMENT("pending_settlement");

  private String value;

  DirectDebitDecisionAdmissionStatusReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitDecisionAdmissionStatusReason fromValue(String text) {
    for (DirectDebitDecisionAdmissionStatusReason b : DirectDebitDecisionAdmissionStatusReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

