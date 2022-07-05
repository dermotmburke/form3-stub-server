package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ClaimResourceType
 */
public enum ClaimResourceType {
  
  CLAIMS("claims"),
  
  CLAIM_SUBMISSIONS("claim_submissions"),
  
  CLAIM_SUBMISSION_VALIDATIONS("claim_submission_validations"),
  
  CLAIM_REVERSALS("claim_reversals"),
  
  CLAIM_REVERSAL_SUBMISSIONS("claim_reversal_submissions"),
  
  CLAIM_REVERSAL_SUBMISSION_VALIDATIONS("claim_reversal_submission_validations");

  private String value;

  ClaimResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ClaimResourceType fromValue(String text) {
    for (ClaimResourceType b : ClaimResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

