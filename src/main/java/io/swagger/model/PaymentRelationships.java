package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class PaymentRelationships   {
  @JsonProperty("beneficiary")
  private Object beneficiary = null;

  @JsonProperty("beneficiary_account")
  private Object beneficiaryAccount = null;

  @JsonProperty("debtor")
  private Object debtor = null;

  @JsonProperty("debtor_account")
  private Object debtorAccount = null;

  @JsonProperty("fx_deal")
  private Object fxDeal = null;

  @JsonProperty("payment_admission")
  private Object paymentAdmission = null;

  @JsonProperty("payment_advice")
  private Object paymentAdvice = null;

  @JsonProperty("payment_recall")
  private Object paymentRecall = null;

  @JsonProperty("payment_return")
  private Object paymentReturn = null;

  @JsonProperty("payment_reversal")
  private Object paymentReversal = null;

  @JsonProperty("payment_submission")
  private Object paymentSubmission = null;

  public PaymentRelationships beneficiary(Object beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  **/
  @ApiModelProperty(value = "")


  public Object getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(Object beneficiary) {
    this.beneficiary = beneficiary;
  }

  public PaymentRelationships beneficiaryAccount(Object beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
    return this;
  }

  /**
   * Get beneficiaryAccount
   * @return beneficiaryAccount
  **/
  @ApiModelProperty(value = "")


  public Object getBeneficiaryAccount() {
    return beneficiaryAccount;
  }

  public void setBeneficiaryAccount(Object beneficiaryAccount) {
    this.beneficiaryAccount = beneficiaryAccount;
  }

  public PaymentRelationships debtor(Object debtor) {
    this.debtor = debtor;
    return this;
  }

  /**
   * Get debtor
   * @return debtor
  **/
  @ApiModelProperty(value = "")


  public Object getDebtor() {
    return debtor;
  }

  public void setDebtor(Object debtor) {
    this.debtor = debtor;
  }

  public PaymentRelationships debtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")


  public Object getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PaymentRelationships fxDeal(Object fxDeal) {
    this.fxDeal = fxDeal;
    return this;
  }

  /**
   * Get fxDeal
   * @return fxDeal
  **/
  @ApiModelProperty(value = "")


  public Object getFxDeal() {
    return fxDeal;
  }

  public void setFxDeal(Object fxDeal) {
    this.fxDeal = fxDeal;
  }

  public PaymentRelationships paymentAdmission(Object paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
    return this;
  }

  /**
   * Get paymentAdmission
   * @return paymentAdmission
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentAdmission() {
    return paymentAdmission;
  }

  public void setPaymentAdmission(Object paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
  }

  public PaymentRelationships paymentAdvice(Object paymentAdvice) {
    this.paymentAdvice = paymentAdvice;
    return this;
  }

  /**
   * Get paymentAdvice
   * @return paymentAdvice
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentAdvice() {
    return paymentAdvice;
  }

  public void setPaymentAdvice(Object paymentAdvice) {
    this.paymentAdvice = paymentAdvice;
  }

  public PaymentRelationships paymentRecall(Object paymentRecall) {
    this.paymentRecall = paymentRecall;
    return this;
  }

  /**
   * Get paymentRecall
   * @return paymentRecall
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentRecall() {
    return paymentRecall;
  }

  public void setPaymentRecall(Object paymentRecall) {
    this.paymentRecall = paymentRecall;
  }

  public PaymentRelationships paymentReturn(Object paymentReturn) {
    this.paymentReturn = paymentReturn;
    return this;
  }

  /**
   * Get paymentReturn
   * @return paymentReturn
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentReturn() {
    return paymentReturn;
  }

  public void setPaymentReturn(Object paymentReturn) {
    this.paymentReturn = paymentReturn;
  }

  public PaymentRelationships paymentReversal(Object paymentReversal) {
    this.paymentReversal = paymentReversal;
    return this;
  }

  /**
   * Get paymentReversal
   * @return paymentReversal
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentReversal() {
    return paymentReversal;
  }

  public void setPaymentReversal(Object paymentReversal) {
    this.paymentReversal = paymentReversal;
  }

  public PaymentRelationships paymentSubmission(Object paymentSubmission) {
    this.paymentSubmission = paymentSubmission;
    return this;
  }

  /**
   * Get paymentSubmission
   * @return paymentSubmission
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentSubmission() {
    return paymentSubmission;
  }

  public void setPaymentSubmission(Object paymentSubmission) {
    this.paymentSubmission = paymentSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRelationships paymentRelationships = (PaymentRelationships) o;
    return Objects.equals(this.beneficiary, paymentRelationships.beneficiary) &&
        Objects.equals(this.beneficiaryAccount, paymentRelationships.beneficiaryAccount) &&
        Objects.equals(this.debtor, paymentRelationships.debtor) &&
        Objects.equals(this.debtorAccount, paymentRelationships.debtorAccount) &&
        Objects.equals(this.fxDeal, paymentRelationships.fxDeal) &&
        Objects.equals(this.paymentAdmission, paymentRelationships.paymentAdmission) &&
        Objects.equals(this.paymentAdvice, paymentRelationships.paymentAdvice) &&
        Objects.equals(this.paymentRecall, paymentRelationships.paymentRecall) &&
        Objects.equals(this.paymentReturn, paymentRelationships.paymentReturn) &&
        Objects.equals(this.paymentReversal, paymentRelationships.paymentReversal) &&
        Objects.equals(this.paymentSubmission, paymentRelationships.paymentSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary, beneficiaryAccount, debtor, debtorAccount, fxDeal, paymentAdmission, paymentAdvice, paymentRecall, paymentReturn, paymentReversal, paymentSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRelationships {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
    sb.append("    beneficiaryAccount: ").append(toIndentedString(beneficiaryAccount)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    fxDeal: ").append(toIndentedString(fxDeal)).append("\n");
    sb.append("    paymentAdmission: ").append(toIndentedString(paymentAdmission)).append("\n");
    sb.append("    paymentAdvice: ").append(toIndentedString(paymentAdvice)).append("\n");
    sb.append("    paymentRecall: ").append(toIndentedString(paymentRecall)).append("\n");
    sb.append("    paymentReturn: ").append(toIndentedString(paymentReturn)).append("\n");
    sb.append("    paymentReversal: ").append(toIndentedString(paymentReversal)).append("\n");
    sb.append("    paymentSubmission: ").append(toIndentedString(paymentSubmission)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

