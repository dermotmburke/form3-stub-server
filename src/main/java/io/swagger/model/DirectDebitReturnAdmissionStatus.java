package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitReturnAdmissionStatus
 */
public enum DirectDebitReturnAdmissionStatus {
  
  CONFIRMED("confirmed"),
  
  PENDING("pending"),
  
  FAILED("failed");

  private String value;

  DirectDebitReturnAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitReturnAdmissionStatus fromValue(String text) {
    for (DirectDebitReturnAdmissionStatus b : DirectDebitReturnAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

