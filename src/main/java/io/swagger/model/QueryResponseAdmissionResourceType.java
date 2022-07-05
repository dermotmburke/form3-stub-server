package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryResponseAdmissionResourceType
 */
public enum QueryResponseAdmissionResourceType {
  
  QUERY_RESPONSE_ADMISSIONS("query_response_admissions");

  private String value;

  QueryResponseAdmissionResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryResponseAdmissionResourceType fromValue(String text) {
    for (QueryResponseAdmissionResourceType b : QueryResponseAdmissionResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

