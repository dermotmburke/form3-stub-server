package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The status of the recall, can either be `pending`, `confirmed`, or `failed`.
 */
public enum RecallStatus {
  
  PENDING("pending"),
  
  CONFIRMED("confirmed"),
  
  FAILED("failed");

  private String value;

  RecallStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecallStatus fromValue(String text) {
    for (RecallStatus b : RecallStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

