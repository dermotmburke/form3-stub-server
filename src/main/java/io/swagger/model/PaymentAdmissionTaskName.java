package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Identifies the payment admission task to be executed
 */
public enum PaymentAdmissionTaskName {
  
  CUSTOMER_CHECK("customer_check"),
  
  ACCOUNT_CHECK("account_check"),
  
  CONFIRM_TO_SCHEME("confirm_to_scheme"),
  
  REJECT_TO_SCHEME("reject_to_scheme");

  private String value;

  PaymentAdmissionTaskName(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentAdmissionTaskName fromValue(String text) {
    for (PaymentAdmissionTaskName b : PaymentAdmissionTaskName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

