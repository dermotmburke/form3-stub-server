package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status](http://draft-api-docs.form3.tech/api.html#enumerations-payment-status-codes-payment-submission-status) of the submission
 */
public enum RecallDecisionSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  LIMIT_CHECK_PENDING("limit_check_pending"),
  
  LIMIT_CHECK_FAILED("limit_check_failed"),
  
  LIMIT_CHECK_PASSED("limit_check_passed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  VALIDATION_PENDING("validation_pending"),
  
  VALIDATION_PASSED("validation_passed");

  private String value;

  RecallDecisionSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecallDecisionSubmissionStatus fromValue(String text) {
    for (RecallDecisionSubmissionStatus b : RecallDecisionSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

