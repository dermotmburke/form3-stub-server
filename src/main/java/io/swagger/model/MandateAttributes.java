package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MandateAttributesBeneficiaryParty;
import io.swagger.model.MandateAttributesDebtorParty;
import io.swagger.model.MandateFrequency;
import io.swagger.model.MandateStatus;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class MandateAttributes   {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("beneficiary_party")
  private MandateAttributesBeneficiaryParty beneficiaryParty = null;

  @JsonProperty("clearing_id")
  private String clearingId = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("debtor_party")
  private MandateAttributesDebtorParty debtorParty = null;

  @JsonProperty("frequency")
  private MandateFrequency frequency = null;

  @JsonProperty("numeric_reference")
  private String numericReference = null;

  @JsonProperty("payment_scheme")
  private String paymentScheme = null;

  @JsonProperty("processing_date")
  private LocalDate processingDate = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("scheme_payment_type")
  private String schemePaymentType = null;

  @JsonProperty("scheme_processing_date")
  private LocalDate schemeProcessingDate = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("status")
  private MandateStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  @JsonProperty("unique_scheme_id")
  private String uniqueSchemeId = null;

  public MandateAttributes amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[0-9.]{0,20}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public MandateAttributes beneficiaryParty(MandateAttributesBeneficiaryParty beneficiaryParty) {
    this.beneficiaryParty = beneficiaryParty;
    return this;
  }

  /**
   * Get beneficiaryParty
   * @return beneficiaryParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MandateAttributesBeneficiaryParty getBeneficiaryParty() {
    return beneficiaryParty;
  }

  public void setBeneficiaryParty(MandateAttributesBeneficiaryParty beneficiaryParty) {
    this.beneficiaryParty = beneficiaryParty;
  }

  public MandateAttributes clearingId(String clearingId) {
    this.clearingId = clearingId;
    return this;
  }

  /**
   * Get clearingId
   * @return clearingId
  **/
  @ApiModelProperty(value = "")


  public String getClearingId() {
    return clearingId;
  }

  public void setClearingId(String clearingId) {
    this.clearingId = clearingId;
  }

  public MandateAttributes currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public MandateAttributes debtorParty(MandateAttributesDebtorParty debtorParty) {
    this.debtorParty = debtorParty;
    return this;
  }

  /**
   * Get debtorParty
   * @return debtorParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MandateAttributesDebtorParty getDebtorParty() {
    return debtorParty;
  }

  public void setDebtorParty(MandateAttributesDebtorParty debtorParty) {
    this.debtorParty = debtorParty;
  }

  public MandateAttributes frequency(MandateFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MandateFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(MandateFrequency frequency) {
    this.frequency = frequency;
  }

  public MandateAttributes numericReference(String numericReference) {
    this.numericReference = numericReference;
    return this;
  }

  /**
   * Get numericReference
   * @return numericReference
  **/
  @ApiModelProperty(value = "")


  public String getNumericReference() {
    return numericReference;
  }

  public void setNumericReference(String numericReference) {
    this.numericReference = numericReference;
  }

  public MandateAttributes paymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
    return this;
  }

  /**
   * Get paymentScheme
   * @return paymentScheme
  **/
  @ApiModelProperty(value = "")


  public String getPaymentScheme() {
    return paymentScheme;
  }

  public void setPaymentScheme(String paymentScheme) {
    this.paymentScheme = paymentScheme;
  }

  public MandateAttributes processingDate(LocalDate processingDate) {
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

  public MandateAttributes reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public MandateAttributes schemePaymentType(String schemePaymentType) {
    this.schemePaymentType = schemePaymentType;
    return this;
  }

  /**
   * Get schemePaymentType
   * @return schemePaymentType
  **/
  @ApiModelProperty(value = "")


  public String getSchemePaymentType() {
    return schemePaymentType;
  }

  public void setSchemePaymentType(String schemePaymentType) {
    this.schemePaymentType = schemePaymentType;
  }

  public MandateAttributes schemeProcessingDate(LocalDate schemeProcessingDate) {
    this.schemeProcessingDate = schemeProcessingDate;
    return this;
  }

  /**
   * Get schemeProcessingDate
   * @return schemeProcessingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getSchemeProcessingDate() {
    return schemeProcessingDate;
  }

  public void setSchemeProcessingDate(LocalDate schemeProcessingDate) {
    this.schemeProcessingDate = schemeProcessingDate;
  }

  public MandateAttributes source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MandateAttributes status(MandateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MandateStatus getStatus() {
    return status;
  }

  public void setStatus(MandateStatus status) {
    this.status = status;
  }

  public MandateAttributes statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Get statusReason
   * @return statusReason
  **/
  @ApiModelProperty(value = "")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public MandateAttributes uniqueSchemeId(String uniqueSchemeId) {
    this.uniqueSchemeId = uniqueSchemeId;
    return this;
  }

  /**
   * Get uniqueSchemeId
   * @return uniqueSchemeId
  **/
  @ApiModelProperty(value = "")


  public String getUniqueSchemeId() {
    return uniqueSchemeId;
  }

  public void setUniqueSchemeId(String uniqueSchemeId) {
    this.uniqueSchemeId = uniqueSchemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateAttributes mandateAttributes = (MandateAttributes) o;
    return Objects.equals(this.amount, mandateAttributes.amount) &&
        Objects.equals(this.beneficiaryParty, mandateAttributes.beneficiaryParty) &&
        Objects.equals(this.clearingId, mandateAttributes.clearingId) &&
        Objects.equals(this.currency, mandateAttributes.currency) &&
        Objects.equals(this.debtorParty, mandateAttributes.debtorParty) &&
        Objects.equals(this.frequency, mandateAttributes.frequency) &&
        Objects.equals(this.numericReference, mandateAttributes.numericReference) &&
        Objects.equals(this.paymentScheme, mandateAttributes.paymentScheme) &&
        Objects.equals(this.processingDate, mandateAttributes.processingDate) &&
        Objects.equals(this.reference, mandateAttributes.reference) &&
        Objects.equals(this.schemePaymentType, mandateAttributes.schemePaymentType) &&
        Objects.equals(this.schemeProcessingDate, mandateAttributes.schemeProcessingDate) &&
        Objects.equals(this.source, mandateAttributes.source) &&
        Objects.equals(this.status, mandateAttributes.status) &&
        Objects.equals(this.statusReason, mandateAttributes.statusReason) &&
        Objects.equals(this.uniqueSchemeId, mandateAttributes.uniqueSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryParty, clearingId, currency, debtorParty, frequency, numericReference, paymentScheme, processingDate, reference, schemePaymentType, schemeProcessingDate, source, status, statusReason, uniqueSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateAttributes {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryParty: ").append(toIndentedString(beneficiaryParty)).append("\n");
    sb.append("    clearingId: ").append(toIndentedString(clearingId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debtorParty: ").append(toIndentedString(debtorParty)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    numericReference: ").append(toIndentedString(numericReference)).append("\n");
    sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
    sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    schemePaymentType: ").append(toIndentedString(schemePaymentType)).append("\n");
    sb.append("    schemeProcessingDate: ").append(toIndentedString(schemeProcessingDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    uniqueSchemeId: ").append(toIndentedString(uniqueSchemeId)).append("\n");
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

