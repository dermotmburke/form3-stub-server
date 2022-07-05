package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ClaimSubmissionStatus
 */
public enum ClaimSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  VALIDATION_FAILED("validation_failed"),
  
  VALIDATION_PENDING("validation_pending"),
  
  VALIDATION_PASSED("validation_passed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed");

  private String value;

  ClaimSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ClaimSubmissionStatus fromValue(String text) {
    for (ClaimSubmissionStatus b : ClaimSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

