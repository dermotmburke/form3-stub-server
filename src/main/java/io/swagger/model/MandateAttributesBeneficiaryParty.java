package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountHoldingEntity;
import io.swagger.model.AccountNumberCode;
import io.swagger.model.PrivateIdentification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MandateAttributesBeneficiaryParty
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class MandateAttributesBeneficiaryParty   {
  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("account_number_code")
  private AccountNumberCode accountNumberCode = null;

  @JsonProperty("account_type")
  private Integer accountType = null;

  @JsonProperty("account_with")
  private AccountHoldingEntity accountWith = null;

  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("private_identification")
  private PrivateIdentification privateIdentification = null;

  public MandateAttributesBeneficiaryParty accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public MandateAttributesBeneficiaryParty accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Z0-9]{6,34}$") 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public MandateAttributesBeneficiaryParty accountNumberCode(AccountNumberCode accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
    return this;
  }

  /**
   * Get accountNumberCode
   * @return accountNumberCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountNumberCode getAccountNumberCode() {
    return accountNumberCode;
  }

  public void setAccountNumberCode(AccountNumberCode accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
  }

  public MandateAttributesBeneficiaryParty accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")


  public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public MandateAttributesBeneficiaryParty accountWith(AccountHoldingEntity accountWith) {
    this.accountWith = accountWith;
    return this;
  }

  /**
   * Get accountWith
   * @return accountWith
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountHoldingEntity getAccountWith() {
    return accountWith;
  }

  public void setAccountWith(AccountHoldingEntity accountWith) {
    this.accountWith = accountWith;
  }

  public MandateAttributesBeneficiaryParty address(List<String> address) {
    this.address = address;
    return this;
  }

  public MandateAttributesBeneficiaryParty addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public MandateAttributesBeneficiaryParty country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public MandateAttributesBeneficiaryParty privateIdentification(PrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
    return this;
  }

  /**
   * Get privateIdentification
   * @return privateIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivateIdentification getPrivateIdentification() {
    return privateIdentification;
  }

  public void setPrivateIdentification(PrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateAttributesBeneficiaryParty mandateAttributesBeneficiaryParty = (MandateAttributesBeneficiaryParty) o;
    return Objects.equals(this.accountName, mandateAttributesBeneficiaryParty.accountName) &&
        Objects.equals(this.accountNumber, mandateAttributesBeneficiaryParty.accountNumber) &&
        Objects.equals(this.accountNumberCode, mandateAttributesBeneficiaryParty.accountNumberCode) &&
        Objects.equals(this.accountType, mandateAttributesBeneficiaryParty.accountType) &&
        Objects.equals(this.accountWith, mandateAttributesBeneficiaryParty.accountWith) &&
        Objects.equals(this.address, mandateAttributesBeneficiaryParty.address) &&
        Objects.equals(this.country, mandateAttributesBeneficiaryParty.country) &&
        Objects.equals(this.privateIdentification, mandateAttributesBeneficiaryParty.privateIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, accountNumberCode, accountType, accountWith, address, country, privateIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateAttributesBeneficiaryParty {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberCode: ").append(toIndentedString(accountNumberCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountWith: ").append(toIndentedString(accountWith)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    privateIdentification: ").append(toIndentedString(privateIdentification)).append("\n");
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

