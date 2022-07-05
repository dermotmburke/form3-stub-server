package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ResourceType
 */
public enum ResourceType {
  
  PAYMENTS("payments"),
  
  LIMITS("limits"),
  
  SCHEME_MESSAGE_ADMISSIONS("scheme_message_admissions"),
  
  PAYMENT_ADMISSION_TASKS("payment_admission_tasks"),
  
  PAYMENT_ADVICE_SUBMISSIONS("payment_advice_submissions"),
  
  RECALL_DECISION_SUBMISSION_VALIDATIONS("recall_decision_submission_validations"),
  
  ACCOUNT_ROUTINGS("account_routings"),
  
  RETURN_REVERSAL_ADMISSIONS("return_reversal_admissions"),
  
  RECALL_REVERSALS("recall_reversals"),
  
  REVERSAL_SUBMISSION_VALIDATIONS("reversal_submission_validations"),
  
  RECALL_ADMISSIONS("recall_admissions"),
  
  RETURN_SUBMISSIONS("return_submissions"),
  
  PAYMENT_DEFAULTS("payment_defaults"),
  
  RECALL_SUBMISSION_VALIDATIONS("recall_submission_validations"),
  
  PAYMENT_ADMISSIONS("payment_admissions"),
  
  ACCOUNT_REQUEST_SUBMISSIONS("account_request_submissions"),
  
  PARTY_ACCOUNTS("party_accounts"),
  
  ACCOUNT_AMENDMENT_SUBMISSION_VALIDATIONS("account_amendment_submission_validations"),
  
  REVERSAL_ADMISSIONS("reversal_admissions"),
  
  REVERSAL_SUBMISSIONS("reversal_submissions"),
  
  ACCOUNT_REQUESTS("account_requests"),
  
  ACCOUNT_AMENDMENT_SUBMISSIONS("account_amendment_submissions"),
  
  PAYMENT_BATCHES("payment_batches"),
  
  RECALL_DECISION_ADMISSIONS("recall_decision_admissions"),
  
  BICS("bics"),
  
  POSITIONS("positions"),
  
  FX_DEALS("fx_deals"),
  
  RETURN_ADMISSIONS("return_admissions"),
  
  BRANCH_IDENTIFICATIONS("branch_identifications"),
  
  RETURNS("returns"),
  
  ACCOUNT_IDENTIFICATIONS("account_identifications"),
  
  RECALL_SUBMISSIONS("recall_submissions"),
  
  PAYMENT_ADVICES("payment_advices"),
  
  BANK_IDS("bank_ids"),
  
  ACCOUNT_REQUEST_SUBMISSION_VALIDATIONS("account_request_submission_validations"),
  
  RECALL_DECISION_SUBMISSIONS("recall_decision_submissions"),
  
  PAYMENT_AUTOMATIC_RETURNS("payment_automatic_returns"),
  
  PAYMENT_ADVICE_SUBMISSION_VALIDATIONS("payment_advice_submission_validations"),
  
  RECALLS("recalls"),
  
  REVERSALS("reversals"),
  
  ACCOUNT_AMENDMENTS("account_amendments"),
  
  PAYMENT_SUBMISSIONS("payment_submissions"),
  
  RECALL_DECISIONS("recall_decisions"),
  
  PARTIES("parties"),
  
  ACCOUNT_CONFIGURATIONS("account_configurations"),
  
  ACCOUNTS("accounts"),
  
  CONTACT_ACCOUNTS("contact_accounts"),
  
  SCHEME_MESSAGES("scheme_messages"),
  
  ACCOUNT_EVENTS("account_events"),
  
  PAYMENT_SUBMISSION_VALIDATIONS("payment_submission_validations"),
  
  RETURN_SUBMISSION_VALIDATIONS("return_submission_validations"),
  
  ACCOUNT_INDIRECTS("account_indirects"),
  
  RETURN_REVERSALS("return_reversals"),
  
  DIRECT_ACCOUNT("direct_account"),
  
  BRANCHES("branches"),
  
  CONTACTS("contacts"),
  
  RECALL_REVERSAL_ADMISSIONS("recall_reversal_admissions");

  private String value;

  ResourceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ResourceType fromValue(String text) {
    for (ResourceType b : ResourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

