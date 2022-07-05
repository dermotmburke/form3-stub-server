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
 * SendersCorrespondentAccountHoldingEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SendersCorrespondentAccountHoldingEntity   {
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

  public SendersCorrespondentAccountHoldingEntity bankAddress(List<String> bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

  public SendersCorrespondentAccountHoldingEntity addBankAddressItem(String bankAddressItem) {
    if (this.bankAddress == null) {
      this.bankAddress = new ArrayList<String>();
    }
    this.bankAddress.add(bankAddressItem);
    return this;
  }

  /**
   * Sender's correspondent's address
   * @return bankAddress
  **/
  @ApiModelProperty(example = "[\"Liverpool Customer Service Centre\",\"Stevenson Way\",\"Wavertree\",\"L13 1NW\"]", value = "Sender's correspondent's address")


  public List<String> getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(List<String> bankAddress) {
    this.bankAddress = bankAddress;
  }

  public SendersCorrespondentAccountHoldingEntity bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * SWIFT BIC for sender's correspondent
   * @return bankId
  **/
  @ApiModelProperty(example = "333333", value = "SWIFT BIC for sender's correspondent")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public SendersCorrespondentAccountHoldingEntity bankIdCode(BankIdCode bankIdCode) {
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

  public SendersCorrespondentAccountHoldingEntity bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Sender's correspondent's name
   * @return bankName
  **/
  @ApiModelProperty(example = "XYZ BANK PLC", value = "Sender's correspondent's name")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public SendersCorrespondentAccountHoldingEntity bankPartyId(String bankPartyId) {
    this.bankPartyId = bankPartyId;
    return this;
  }

  /**
   * Identifier of the financial institution which services the account
   * @return bankPartyId
  **/
  @ApiModelProperty(example = "//AT12345", value = "Identifier of the financial institution which services the account")


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
    SendersCorrespondentAccountHoldingEntity sendersCorrespondentAccountHoldingEntity = (SendersCorrespondentAccountHoldingEntity) o;
    return Objects.equals(this.bankAddress, sendersCorrespondentAccountHoldingEntity.bankAddress) &&
        Objects.equals(this.bankId, sendersCorrespondentAccountHoldingEntity.bankId) &&
        Objects.equals(this.bankIdCode, sendersCorrespondentAccountHoldingEntity.bankIdCode) &&
        Objects.equals(this.bankName, sendersCorrespondentAccountHoldingEntity.bankName) &&
        Objects.equals(this.bankPartyId, sendersCorrespondentAccountHoldingEntity.bankPartyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAddress, bankId, bankIdCode, bankName, bankPartyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendersCorrespondentAccountHoldingEntity {\n");
    
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

