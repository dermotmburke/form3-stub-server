package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * status of the task
 */
public enum PaymentAdmissionTaskStatus {
  
  COMPLETED("completed"),
  
  FAILED("failed"),
  
  PENDING("pending");

  private String value;

  PaymentAdmissionTaskStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentAdmissionTaskStatus fromValue(String text) {
    for (PaymentAdmissionTaskStatus b : PaymentAdmissionTaskStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

