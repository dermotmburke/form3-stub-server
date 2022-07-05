package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status of the admission](https://api-docs.form3.tech/api.html#enumerations-payment-status-codes-admission-status)
 */
public enum PaymentAdmissionStatus {
  
  CONFIRMED("confirmed"),
  
  FAILED("failed"),
  
  PENDING("pending");

  private String value;

  PaymentAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentAdmissionStatus fromValue(String text) {
    for (PaymentAdmissionStatus b : PaymentAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

