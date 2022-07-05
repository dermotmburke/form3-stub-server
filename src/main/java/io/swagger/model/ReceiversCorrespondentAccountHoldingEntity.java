package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BankIdCode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReceiversCorrespondentAccountHoldingEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReceiversCorrespondentAccountHoldingEntity   {
  @JsonProperty("bank_address")
  @Valid
  private List<String> bankAddress = null;

  @JsonProperty("bank_id")
  private String bankId = null;

  @JsonProperty("bank_id_code")
  private BankIdCode bankIdCode = null;

  @JsonProperty("bank_name")
  private String bankName = null;

  @JsonProperty("bank_party_id")
  private String bankPartyId = null;

  public ReceiversCorrespondentAccountHoldingEntity bankAddress(List<String> bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

  public ReceiversCorrespondentAccountHoldingEntity addBankAddressItem(String bankAddressItem) {
    if (this.bankAddress == null) {
      this.bankAddress = new ArrayList<String>();
    }
    this.bankAddress.add(bankAddressItem);
    return this;
  }

  /**
   * Receiver's correspondent's address
   * @return bankAddress
  **/
  @ApiModelProperty(example = "[\"Liverpool Customer Service Centre\",\"Stevenson Way\",\"Wavertree\",\"L13 1NW\"]", value = "Receiver's correspondent's address")


  public List<String> getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(List<String> bankAddress) {
    this.bankAddress = bankAddress;
  }

  public ReceiversCorrespondentAccountHoldingEntity bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * SWIFT BIC for receiver's correspondent
   * @return bankId
  **/
  @ApiModelProperty(example = "333333", value = "SWIFT BIC for receiver's correspondent")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public ReceiversCorrespondentAccountHoldingEntity bankIdCode(BankIdCode bankIdCode) {
    this.bankIdCode = bankIdCode;
    return this;
  }

  /**
   * Get bankIdCode
   * @return bankIdCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankIdCode getBankIdCode() {
    return bankIdCode;
  }

  public void setBankIdCode(BankIdCode bankIdCode) {
    this.bankIdCode = bankIdCode;
  }

  public ReceiversCorrespondentAccountHoldingEntity bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Receiver's correspondent's name
   * @return bankName
  **/
  @ApiModelProperty(example = "XYZ BANK PLC", value = "Receiver's correspondent's name")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public ReceiversCorrespondentAccountHoldingEntity bankPartyId(String bankPartyId) {
    this.bankPartyId = bankPartyId;
    return this;
  }

  /**
   * Receiver's correspondent party identifier
   * @return bankPartyId
  **/
  @ApiModelProperty(example = "//AT12345", value = "Receiver's correspondent party identifier")


  public String getBankPartyId() {
    return bankPartyId;
  }

  public void setBankPartyId(String bankPartyId) {
    this.bankPartyId = bankPartyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiversCorrespondentAccountHoldingEntity receiversCorrespondentAccountHoldingEntity = (ReceiversCorrespondentAccountHoldingEntity) o;
    return Objects.equals(this.bankAddress, receiversCorrespondentAccountHoldingEntity.bankAddress) &&
        Objects.equals(this.bankId, receiversCorrespondentAccountHoldingEntity.bankId) &&
        Objects.equals(this.bankIdCode, receiversCorrespondentAccountHoldingEntity.bankIdCode) &&
        Objects.equals(this.bankName, receiversCorrespondentAccountHoldingEntity.bankName) &&
        Objects.equals(this.bankPartyId, receiversCorrespondentAccountHoldingEntity.bankPartyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAddress, bankId, bankIdCode, bankName, bankPartyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiversCorrespondentAccountHoldingEntity {\n");
    
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankIdCode: ").append(toIndentedString(bankIdCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankPartyId: ").append(toIndentedString(bankPartyId)).append("\n");
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

