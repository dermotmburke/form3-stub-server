package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentSubmissionResourceType
 */
public enum PaymentSubmissionResourceType {
  
  PAYMENT_SUBMISSIONS("payment_submissions");

  private String value;

  PaymentSubmissionResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentSubmissionResourceType fromValue(String text) {
    for (PaymentSubmissionResourceType b : PaymentSubmissionResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

