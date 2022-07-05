package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * All accepted payments will receive the matching qualifier code
 */
public enum AcceptanceQualifier {
  
  SOME_OTHER_TIME("some_other_time"),
  
  SAME_DAY("same_day"),
  
  NEXT_CALENDAR_DAY("next_calendar_day"),
  
  NEXT_WORKING_DAY("next_working_day"),
  
  AFTER_NEXT_WORKING_DAY("after_next_working_day"),
  
  NONE("none");

  private String value;

  AcceptanceQualifier(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AcceptanceQualifier fromValue(String text) {
    for (AcceptanceQualifier b : AcceptanceQualifier.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

