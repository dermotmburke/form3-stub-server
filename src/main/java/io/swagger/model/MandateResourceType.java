package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MandateResourceType
 */
public enum MandateResourceType {
  
  MANDATES("mandates"),
  
  MANDATE_ADMISSIONS("mandate_admissions"),
  
  MANDATE_RETURNS("mandate_returns"),
  
  MANDATE_RETURN_SUBMISSIONS("mandate_return_submissions"),
  
  MANDATE_RETURN_SUBMISSION_VALIDATIONS("mandate_return_submission_validations"),
  
  MANDATE_SUBMISSIONS("mandate_submissions"),
  
  MANDATE_SUBMISSION_VALIDATIONS("mandate_submission_validations"),
  
  MANDATE_AUTOMATIC_RETURNS("mandate_automatic_returns"),
  
  MANDATE_MANAGEMENTS("mandate_managements"),
  
  MANDATE_SUBMISSIONS_WITH_FINAL_STATE("mandate_submissions_with_final_state");

  private String value;

  MandateResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MandateResourceType fromValue(String text) {
    for (MandateResourceType b : MandateResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

