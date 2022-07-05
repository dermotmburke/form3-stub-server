package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DirectDebitResourceType
 */
public enum DirectDebitResourceType {
  
  DEBITS("direct_debits"),
  
  DEBIT_STATUS("direct_debit_status"),
  
  DEBIT_ADMISSIONS("direct_debit_admissions"),
  
  DEBIT_SUBMISSIONS("direct_debit_submissions"),
  
  DEBIT_SUBMISSION_VALIDATIONS("direct_debit_submission_validations"),
  
  DEBIT_REVERSALS("direct_debit_reversals"),
  
  DEBIT_REVERSAL_ADMISSIONS("direct_debit_reversal_admissions"),
  
  DEBIT_REVERSAL_SUBMISSIONS("direct_debit_reversal_submissions"),
  
  DEBIT_REVERSAL_SUBMISSION_VALIDATIONS("direct_debit_reversal_submission_validations"),
  
  DEBIT_RETURNS("direct_debit_returns"),
  
  DEBIT_RETURN_ADMISSIONS("direct_debit_return_admissions"),
  
  DEBIT_RETURN_SUBMISSIONS("direct_debit_return_submissions"),
  
  DEBIT_RETURN_SUBMISSION_VALIDATIONS("direct_debit_return_submission_validations"),
  
  DEBIT_RETURN_REVERSALS("direct_debit_return_reversals"),
  
  DEBIT_RETURN_REVERSAL_ADMISSIONS("direct_debit_return_reversal_admissions"),
  
  DEBIT_AUTOMATIC_RETURNS("direct_debit_automatic_returns"),
  
  DEBIT_RECALLS("direct_debit_recalls"),
  
  DEBIT_RECALL_ADMISSIONS("direct_debit_recall_admissions"),
  
  DEBIT_RECALL_SUBMISSIONS("direct_debit_recall_submissions"),
  
  DEBIT_RECALL_SUBMISSION_VALIDATIONS("direct_debit_recall_submission_validations"),
  
  DEBIT_DECISIONS("direct_debit_decisions"),
  
  DEBIT_DECISION_ADMISSIONS("direct_debit_decision_admissions"),
  
  DEBIT_DECISION_SUBMISSIONS("direct_debit_decision_submissions"),
  
  DEBIT_DECISION_SUBMISSION_VALIDATIONS("direct_debit_decision_submission_validations"),
  
  DEBIT_SUBMISSIONS_WITH_FINAL_STATE("direct_debit_submissions_with_final_state");

  private String value;

  DirectDebitResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DirectDebitResourceType fromValue(String text) {
    for (DirectDebitResourceType b : DirectDebitResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

