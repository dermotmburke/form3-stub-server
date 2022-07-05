package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DisputedTransaction;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClaimAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ClaimAttributes   {
  @JsonProperty("beneficiary_party")
  private Object beneficiaryParty = null;

  @JsonProperty("clearing_id")
  private String clearingId = null;

  @JsonProperty("contact_name")
  private String contactName = null;

  @JsonProperty("debtor_party")
  private Object debtorParty = null;

  @JsonProperty("disputed_transactions")
  @Valid
  private List<DisputedTransaction> disputedTransactions = new ArrayList<DisputedTransaction>();

  @JsonProperty("number_of_claims")
  private Integer numberOfClaims = null;

  @JsonProperty("original_instruction")
  private Object originalInstruction = null;

  @JsonProperty("payment_scheme")
  private String paymentScheme = null;

  @JsonProperty("processing_date")
  private LocalDate processingDate = null;

  @JsonProperty("reason_code")
  private String reasonCode = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("request_date")
  private LocalDate requestDate = null;

  public ClaimAttributes beneficiaryParty(Object beneficiaryParty) {
    this.beneficiaryParty = beneficiaryParty;
    return this;
  }

  /**
   * Get beneficiaryParty
   * @return beneficiaryParty
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getBeneficiaryParty() {
    return beneficiaryParty;
  }

  public void setBeneficiaryParty(Object beneficiaryParty) {
    this.beneficiaryParty = beneficiaryParty;
  }

  public ClaimAttributes clearingId(String clearingId) {
    this.clearingId = clearingId;
    return this;
  }

  /**
   * Get clearingId
   * @return clearingId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[0-9]{6}$") 
  public String getClearingId() {
    return clearingId;
  }

  public void setClearingId(String clearingId) {
    this.clearingId = clearingId;
  }

  public ClaimAttributes contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(value = "")


  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public ClaimAttributes debtorParty(Object debtorParty) {
    this.debtorParty = debtorParty;
    return this;
  }

  /**
   * Get debtorParty
   * @return debtorParty
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getDebtorParty() {
    return debtorParty;
  }

  public void setDebtorParty(Object debtorParty) {
    this.debtorParty = debtorParty;
  }

  public ClaimAttributes disputedTransactions(List<DisputedTransaction> disputedTransactions) {
    this.disputedTransactions = disputedTransactions;
    return this;
  }

  public ClaimAttributes addDisputedTransactionsItem(DisputedTransaction disputedTransactionsItem) {
    this.disputedTransactions.add(disputedTransactionsItem);
    return this;
  }

  /**
   * Get disputedTransactions
   * @return disputedTransactions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<DisputedTransaction> getDisputedTransactions() {
    return disputedTransactions;
  }

  public void setDisputedTransactions(List<DisputedTransaction> disputedTransactions) {
    this.disputedTransactions = disputedTransactions;
  }

  public ClaimAttributes numberOfClaims(Integer numberOfClaims) {
    this.numberOfClaims = numberOfClaims;
    return this;
  }

  /**
   * Get numberOfClaims
   * @return numberOfClaims
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumberOfClaims() {
    return numberOfClaims;
  }

  public void setNumberOfClaims(Integer numberOfClaims) {
    this.numberOfClaims = numberOfClaims;
  }

  public ClaimAttributes originalInstruction(Object originalInstruction) {
    this.originalInstruction = originalInstruction;
    return this;
  }

  /**
   * Get originalInstruction
   * @return originalInstruction
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getOriginalInstruction() {
    return originalInstruction;
  }

  public void setOriginalInstruction(Object originalInstruction) {
    this.originalInstruction = originalInstruction;
  }

  public ClaimAttributes paymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
    return this;
  }

  /**
   * Get paymentScheme
   * @return paymentScheme
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPaymentScheme() {
    return paymentScheme;
  }

  public void setPaymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
  }

  public ClaimAttributes processingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
    return this;
  }

  /**
   * Get processingDate
   * @return processingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getProcessingDate() {
    return processingDate;
  }

  public void setProcessingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
  }

  public ClaimAttributes reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[1-9]$") 
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ClaimAttributes reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public ClaimAttributes requestDate(LocalDate requestDate) {
    this.requestDate = requestDate;
    return this;
  }

  /**
   * Get requestDate
   * @return requestDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(LocalDate requestDate) {
    this.requestDate = requestDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimAttributes claimAttributes = (ClaimAttributes) o;
    return Objects.equals(this.beneficiaryParty, claimAttributes.beneficiaryParty) &&
        Objects.equals(this.clearingId, claimAttributes.clearingId) &&
        Objects.equals(this.contactName, claimAttributes.contactName) &&
        Objects.equals(this.debtorParty, claimAttributes.debtorParty) &&
        Objects.equals(this.disputedTransactions, claimAttributes.disputedTransactions) &&
        Objects.equals(this.numberOfClaims, claimAttributes.numberOfClaims) &&
        Objects.equals(this.originalInstruction, claimAttributes.originalInstruction) &&
        Objects.equals(this.paymentScheme, claimAttributes.paymentScheme) &&
        Objects.equals(this.processingDate, claimAttributes.processingDate) &&
        Objects.equals(this.reasonCode, claimAttributes.reasonCode) &&
        Objects.equals(this.reference, claimAttributes.reference) &&
        Objects.equals(this.requestDate, claimAttributes.requestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryParty, clearingId, contactName, debtorParty, disputedTransactions, numberOfClaims, originalInstruction, paymentScheme, processingDate, reasonCode, reference, requestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimAttributes {\n");
    
    sb.append("    beneficiaryParty: ").append(toIndentedString(beneficiaryParty)).append("\n");
    sb.append("    clearingId: ").append(toIndentedString(clearingId)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    debtorParty: ").append(toIndentedString(debtorParty)).append("\n");
    sb.append("    disputedTransactions: ").append(toIndentedString(disputedTransactions)).append("\n");
    sb.append("    numberOfClaims: ").append(toIndentedString(numberOfClaims)).append("\n");
    sb.append("    originalInstruction: ").append(toIndentedString(originalInstruction)).append("\n");
    sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
    sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
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

