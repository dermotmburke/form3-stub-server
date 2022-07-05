package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MandateFrequency
 */
public enum MandateFrequency {
  
  DAILY("daily"),
  
  WEEKLY("weekly"),
  
  FORTNIGHTLY("fortnightly"),
  
  MONTHLY("monthly"),
  
  BIMONTHLY("bimonthly"),
  
  QUARTERLY("quarterly"),
  
  YEARLY("yearly");

  private String value;

  MandateFrequency(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MandateFrequency fromValue(String text) {
    for (MandateFrequency b : MandateFrequency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

