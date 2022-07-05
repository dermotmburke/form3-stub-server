package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status](http://draft-api-docs.form3.tech/api.html#enumerations-payment-submission-status) of the submission
 */
public enum ReturnSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  LIMIT_CHECK_PENDING("limit_check_pending"),
  
  LIMIT_CHECK_FAILED("limit_check_failed"),
  
  LIMIT_CHECK_PASSED("limit_check_passed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  SUBMITTED("submitted"),
  
  VALIDATION_PENDING("validation_pending"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery");

  private String value;

  ReturnSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnSubmissionStatus fromValue(String text) {
    for (ReturnSubmissionStatus b : ReturnSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

