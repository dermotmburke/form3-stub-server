package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Payment admission status reason](https://api-docs.form3.tech/api.html#enumerations-payment-status-codes-payment-admission-status-reasons)
 */
public enum PaymentAdmissionStatusReason {
  
  ACCEPTED("accepted"),
  
  INVALID_BENEFICIARY_DETAILS("invalid_beneficiary_details"),
  
  BANKID_NOT_PROVISIONED("bankid_not_provisioned"),
  
  UNKNOWN_ACCOUNTNUMBER("unknown_accountnumber"),
  
  CUSTOMER_CHECK_FAILED("customer_check_failed"),
  
  SCHEME_TIMEOUT("scheme_timeout"),
  
  INCORRECT_REFERENCE_VALIDATION_TYPE("incorrect_reference_validation_type"),
  
  INCORRECT_REFERENCE_SECONDARY_IDENTIFICATION("incorrect_reference_secondary_identification"),
  
  INCORRECT_REFERENCE_REFERENCE_MASK("incorrect_reference_reference_mask"),
  
  ACCOUNT_CLOSED("account_closed"),
  
  ACCOUNT_CLOSED_BUSINESS_REASONS("account_closed_business_reasons"),
  
  ACCOUNT_CLOSED_STOPPED("account_closed_stopped"),
  
  ACCOUNT_CLOSED_CURRENCY("account_closed_currency"),
  
  ACCOUNT_CLOSED_TRANSFERRED("account_closed_transferred"),
  
  ACCOUNT_CLOSED_BENEFICIARY_DECEASED("account_closed_beneficiary_deceased"),
  
  ACCOUNT_CLOSED_BENEFICIARY_SENSITIVITIES("account_closed_beneficiary_sensitivities"),
  
  ACCOUNT_CLOSED_TERMS_AND_CONDITIONS("account_closed_terms_and_conditions");

  private String value;

  PaymentAdmissionStatusReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentAdmissionStatusReason fromValue(String text) {
    for (PaymentAdmissionStatusReason b : PaymentAdmissionStatusReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

