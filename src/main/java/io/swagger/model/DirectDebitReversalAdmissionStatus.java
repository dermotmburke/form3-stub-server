package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitReversalAdmissionStatus
 */
public enum DirectDebitReversalAdmissionStatus {
  
  CONFIRMED("confirmed"),
  
  FAILED("failed");

  private String value;

  DirectDebitReversalAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitReversalAdmissionStatus fromValue(String text) {
    for (DirectDebitReversalAdmissionStatus b : DirectDebitReversalAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

