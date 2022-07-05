package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status of the reversal submission](http://draft-api-docs.form3.tech/api.html#enumerations-reversal-submission-status)
 */
public enum ReversalSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  VALIDATION_PASSED("validation_passed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  SUBMITTED("submitted"),
  
  VALIDATION_PENDING("validation_pending");

  private String value;

  ReversalSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReversalSubmissionStatus fromValue(String text) {
    for (ReversalSubmissionStatus b : ReversalSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

