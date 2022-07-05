package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitAdmissionStatusReason
 */
public enum DirectDebitAdmissionStatusReason {
  
  ACCEPTED("accepted"),
  
  INVALID_BENEFICIARY_DETAILS("invalid_beneficiary_details"),
  
  BANKID_NOT_PROVISIONED("bankid_not_provisioned"),
  
  UNKNOWN_ACCOUNTNUMBER("unknown_accountnumber"),
  
  PENDING_SETTLEMENT("pending_settlement"),
  
  SETTLEMENT_FAILED("settlement_failed"),
  
  DUPLICATION("duplication"),
  
  NOT_ALLOWED_AMOUNT("not_allowed_amount"),
  
  MANDATE_CANCELLED("mandate_cancelled"),
  
  NO_INSTRUCTION("no_instruction"),
  
  ACCOUNT_TRANSFERRED_TO_NEW_PSP("account_transferred_to_new_psp"),
  
  PAYING_BANK_CANCELLATION("paying_bank_cancellation"),
  
  CANCELLED_BY_PAYER("cancelled_by_payer"),
  
  PAYER_DECEASED("payer_deceased"),
  
  ACCOUNT_CLOSED("account_closed"),
  
  SCHEME_STATUS_INVALID("scheme_status_invalid");

  private String value;

  DirectDebitAdmissionStatusReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitAdmissionStatusReason fromValue(String text) {
    for (DirectDebitAdmissionStatusReason b : DirectDebitAdmissionStatusReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

