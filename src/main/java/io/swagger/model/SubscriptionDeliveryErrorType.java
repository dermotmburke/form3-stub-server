package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SubscriptionDeliveryErrorType
 */
public enum SubscriptionDeliveryErrorType {
  
  SUBSCRIPTION_DELIVERY_ERRORS("subscription_delivery_errors");

  private String value;

  SubscriptionDeliveryErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubscriptionDeliveryErrorType fromValue(String text) {
    for (SubscriptionDeliveryErrorType b : SubscriptionDeliveryErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

