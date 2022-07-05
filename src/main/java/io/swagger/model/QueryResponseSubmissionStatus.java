package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryResponseSubmissionStatus
 */
public enum QueryResponseSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  VALIDATION_PENDING("validation_pending"),
  
  VALIDATION_FAILED("validation_failed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  SUBMITTED("submitted"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  LIMIT_CHECK_PENDING("limit_check_pending"),
  
  LIMIT_CHECK_PASSED("limit_check_passed"),
  
  LIMIT_CHECK_FAILED("limit_check_failed");

  private String value;

  QueryResponseSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryResponseSubmissionStatus fromValue(String text) {
    for (QueryResponseSubmissionStatus b : QueryResponseSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

