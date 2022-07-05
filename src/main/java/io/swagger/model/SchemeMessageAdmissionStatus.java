package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SchemeMessageAdmissionStatus
 */
public enum SchemeMessageAdmissionStatus {
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  FAILED("failed");

  private String value;

  SchemeMessageAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SchemeMessageAdmissionStatus fromValue(String text) {
    for (SchemeMessageAdmissionStatus b : SchemeMessageAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

