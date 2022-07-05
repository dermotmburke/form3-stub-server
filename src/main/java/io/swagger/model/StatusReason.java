package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Used to determine appropriate scheme or internal payment reject code. Account status field must be set to closed to use this functionality.
 */
public enum StatusReason {
  
  CLOSED("closed"),
  
  STOPPED("stopped"),
  
  CURRENCY("currency"),
  
  TRANSFERRED("transferred"),
  
  DECEASED("deceased"),
  
  BUSINESS_REASONS("business_reasons"),
  
  BENEFICIARY_SENSITIVITIES("beneficiary_sensitivities"),
  
  TERMS_AND_CONDITIONS("terms_and_conditions"),
  
  NONE("none");

  private String value;

  StatusReason(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusReason fromValue(String text) {
    for (StatusReason b : StatusReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

