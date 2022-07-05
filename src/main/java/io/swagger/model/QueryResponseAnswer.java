package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryResponseAnswer
 */
public enum QueryResponseAnswer {
  
  ACCEPTED("accepted"),
  
  REJECTED("rejected"),
  
  ALREADY_APPLIED("already_applied"),
  
  MODIFIED_AS_REQUESTED("modified_as_requested"),
  
  TRANSACTION_NOT_RECEIVED("transaction_not_received"),
  
  TRANSACTION_REJECTED("transaction_rejected"),
  
  TRANSACTION_RETURNED("transaction_returned"),
  
  TRANSACTION_NOT_PROCESSED("transaction_not_processed"),
  
  REJECTED_REGULATORY_REASON("rejected_regulatory_reason");

  private String value;

  QueryResponseAnswer(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryResponseAnswer fromValue(String text) {
    for (QueryResponseAnswer b : QueryResponseAnswer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

