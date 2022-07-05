package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryResponseSubmissionResourceType
 */
public enum QueryResponseSubmissionResourceType {
  
  QUERY_RESPONSE_SUBMISSIONS("query_response_submissions");

  private String value;

  QueryResponseSubmissionResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryResponseSubmissionResourceType fromValue(String text) {
    for (QueryResponseSubmissionResourceType b : QueryResponseSubmissionResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

