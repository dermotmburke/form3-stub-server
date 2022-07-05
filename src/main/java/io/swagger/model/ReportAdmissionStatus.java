package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ReportAdmissionStatus
 */
public enum ReportAdmissionStatus {
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  CONFIRMED("confirmed"),
  
  FAILED("failed");

  private String value;

  ReportAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReportAdmissionStatus fromValue(String text) {
    for (ReportAdmissionStatus b : ReportAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

