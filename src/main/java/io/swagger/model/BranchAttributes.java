package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AcceptanceQualifier;
import io.swagger.model.BranchValidationType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class BranchAttributes   {
  @JsonProperty("acceptance_qualifier")
  private AcceptanceQualifier acceptanceQualifier = null;

  @JsonProperty("bank_id")
  private String bankId = null;

  @JsonProperty("bank_id_code")
  private String bankIdCode = null;

  @JsonProperty("reference_mask")
  private String referenceMask = null;

  @JsonProperty("validation_type")
  private BranchValidationType validationType = null;

  public BranchAttributes acceptanceQualifier(AcceptanceQualifier acceptanceQualifier) {
    this.acceptanceQualifier = acceptanceQualifier;
    return this;
  }

  /**
   * Get acceptanceQualifier
   * @return acceptanceQualifier
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AcceptanceQualifier getAcceptanceQualifier() {
    return acceptanceQualifier;
  }

  public void setAcceptanceQualifier(AcceptanceQualifier acceptanceQualifier) {
    this.acceptanceQualifier = acceptanceQualifier;
  }

  public BranchAttributes bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Local country bank identifier. In the UK this is the sort code.
   * @return bankId
  **/
  @ApiModelProperty(example = "400300", required = true, value = "Local country bank identifier. In the UK this is the sort code.")
  @NotNull

@Pattern(regexp="^[A-Z0-9]{1,11}$") 
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public BranchAttributes bankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
    return this;
  }

  /**
   * ISO 20022 code used to identify the type of bank ID being used
   * @return bankIdCode
  **/
  @ApiModelProperty(example = "GBDSC", required = true, value = "ISO 20022 code used to identify the type of bank ID being used")
  @NotNull

@Pattern(regexp="^[A-Z]{0,16}$") 
  public String getBankIdCode() {
    return bankIdCode;
  }

  public void setBankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
  }

  public BranchAttributes referenceMask(String referenceMask) {
    this.referenceMask = referenceMask;
    return this;
  }

  /**
   * if present – has effect of making secondary reference in payment mandatory
   * @return referenceMask
  **/
  @ApiModelProperty(example = "4929############", value = "if present – has effect of making secondary reference in payment mandatory")


  public String getReferenceMask() {
    return referenceMask;
  }

  public void setReferenceMask(String referenceMask) {
    this.referenceMask = referenceMask;
  }

  public BranchAttributes validationType(BranchValidationType validationType) {
    this.validationType = validationType;
    return this;
  }

  /**
   * Get validationType
   * @return validationType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BranchValidationType getValidationType() {
    return validationType;
  }

  public void setValidationType(BranchValidationType validationType) {
    this.validationType = validationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchAttributes branchAttributes = (BranchAttributes) o;
    return Objects.equals(this.acceptanceQualifier, branchAttributes.acceptanceQualifier) &&
        Objects.equals(this.bankId, branchAttributes.bankId) &&
        Objects.equals(this.bankIdCode, branchAttributes.bankIdCode) &&
        Objects.equals(this.referenceMask, branchAttributes.referenceMask) &&
        Objects.equals(this.validationType, branchAttributes.validationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceQualifier, bankId, bankIdCode, referenceMask, validationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchAttributes {\n");
    
    sb.append("    acceptanceQualifier: ").append(toIndentedString(acceptanceQualifier)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankIdCode: ").append(toIndentedString(bankIdCode)).append("\n");
    sb.append("    referenceMask: ").append(toIndentedString(referenceMask)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
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

