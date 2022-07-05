package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status of the submission](https://api-docs.form3.tech/api.html#enumerations-payment-status-codes-submission-status)
 */
public enum PaymentSubmissionStatus {
  
  ACCEPTED("accepted"),
  
  LIMIT_CHECK_PENDING("limit_check_pending"),
  
  LIMIT_CHECK_FAILED("limit_check_failed"),
  
  LIMIT_CHECK_PASSED("limit_check_passed"),
  
  RELEASED_TO_GATEWAY("released_to_gateway"),
  
  QUEUED_FOR_DELIVERY("queued_for_delivery"),
  
  DELIVERY_CONFIRMED("delivery_confirmed"),
  
  DELIVERY_FAILED("delivery_failed"),
  
  SUBMITTED("submitted"),
  
  VALIDATION_PENDING("validation_pending");

  private String value;

  PaymentSubmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentSubmissionStatus fromValue(String text) {
    for (PaymentSubmissionStatus b : PaymentSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

