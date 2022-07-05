package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Helps to identify the owner of the task
 */
public enum PaymentAdmissionTaskAssignee {
  
  CUSTOMER("customer"),
  
  FORM3("form3");

  private String value;

  PaymentAdmissionTaskAssignee(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentAdmissionTaskAssignee fromValue(String text) {
    for (PaymentAdmissionTaskAssignee b : PaymentAdmissionTaskAssignee.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

