package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QuerySubmissionResourceType
 */
public enum QuerySubmissionResourceType {
  
  QUERY_SUBMISSIONS("query_submissions");

  private String value;

  QuerySubmissionResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuerySubmissionResourceType fromValue(String text) {
    for (QuerySubmissionResourceType b : QuerySubmissionResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

