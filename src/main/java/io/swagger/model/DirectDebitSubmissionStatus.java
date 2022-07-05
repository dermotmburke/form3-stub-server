package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitSubmissionStatus
 */
public enum DirectDebitSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  SUBMITTED("submitted"),
  
  PENDING("pending"),
  
  VALIDATION_PENDING("validation_pending"),
  
  VALIDATION_PASSED("validation_passed"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery");

  private String value;

  DirectDebitSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitSubmissionStatus fromValue(String text) {
    for (DirectDebitSubmissionStatus b : DirectDebitSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

