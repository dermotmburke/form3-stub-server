package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Answer to the recall request. Can either be `accepted` or `rejected`.
 */
public enum RecallDecisionAnswer {
  
  ACCEPTED("accepted"),
  
  REJECTED("rejected");

  private String value;

  RecallDecisionAnswer(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecallDecisionAnswer fromValue(String text) {
    for (RecallDecisionAnswer b : RecallDecisionAnswer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

