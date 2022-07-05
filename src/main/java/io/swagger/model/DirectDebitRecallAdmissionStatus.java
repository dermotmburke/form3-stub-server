package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * [Status](http://draft-api-docs.form3.tech/api.html#enumerations-payment-admission-status) of the recall admission
 */
public enum DirectDebitRecallAdmissionStatus {
  
  CONFIRMED("confirmed"),
  
  FAILED("failed");

  private String value;

  DirectDebitRecallAdmissionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitRecallAdmissionStatus fromValue(String text) {
    for (DirectDebitRecallAdmissionStatus b : DirectDebitRecallAdmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

