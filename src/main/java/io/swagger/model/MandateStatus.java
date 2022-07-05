package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MandateStatus
 */
public enum MandateStatus {
  
  LIVE("live"),
  
  INVALID("invalid"),
  
  EXPIRED("expired"),
  
  CANCELLED("cancelled");

  private String value;

  MandateStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MandateStatus fromValue(String text) {
    for (MandateStatus b : MandateStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

