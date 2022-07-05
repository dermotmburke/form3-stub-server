package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QuerySubmissionStatus
 */
public enum QuerySubmissionStatus {
  
  ACCEPTED("accepted"),
  
  VALIDATION_PENDING("validation_pending"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  SUBMITTED("submitted"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed");

  private String value;

  QuerySubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuerySubmissionStatus fromValue(String text) {
    for (QuerySubmissionStatus b : QuerySubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

