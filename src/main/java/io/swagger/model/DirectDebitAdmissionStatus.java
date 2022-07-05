package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitAdmissionStatus
 */
public enum DirectDebitAdmissionStatus {
  
  CONFIRMED("confirmed"),
  
  FAILED("failed"),
  
  PENDING("pending");

  private String value;

  DirectDebitAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitAdmissionStatus fromValue(String text) {
    for (DirectDebitAdmissionStatus b : DirectDebitAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

