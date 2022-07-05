package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrganisationIdentification;
import io.swagger.model.PrivateIdentification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountRequestAttributes   {
  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("bank_id")
  private String bankId = null;

  @JsonProperty("bank_id_code")
  private String bankIdCode = null;

  @JsonProperty("base_currency")
  private String baseCurrency = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("organisation_identification")
  private OrganisationIdentification organisationIdentification = null;

  @JsonProperty("private_identification")
  private PrivateIdentification privateIdentification = null;

  public AccountRequestAttributes accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number of the account. A unique number will automatically be generated if not provided.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678", value = "Account number of the account. A unique number will automatically be generated if not provided.")

@Pattern(regexp="^[0-9]+$") 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountRequestAttributes bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Local country bank identifier. In the UK this is the sort code.
   * @return bankId
  **/
  @ApiModelProperty(example = "123456", value = "Local country bank identifier. In the UK this is the sort code.")

@Pattern(regexp="^[A-Z0-9]+$") 
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public AccountRequestAttributes bankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
    return this;
  }

  /**
   * ISO 20022 code used to identify the type of bank ID being used
   * @return bankIdCode
  **/
  @ApiModelProperty(example = "GBDSC", value = "ISO 20022 code used to identify the type of bank ID being used")

@Size(min=1) 
  public String getBankIdCode() {
    return bankIdCode;
  }

  public void setBankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
  }

  public AccountRequestAttributes baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * ISO 4217 code used to identify the base currency of the account
   * @return baseCurrency
  **/
  @ApiModelProperty(example = "GBP", required = true, value = "ISO 4217 code used to identify the base currency of the account")
  @NotNull

@Pattern(regexp="^[A-Z]{3}$") 
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public AccountRequestAttributes bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * SWIFT BIC in either 8 or 11 character format
   * @return bic
  **/
  @ApiModelProperty(example = "ABCDEF23", required = true, value = "SWIFT BIC in either 8 or 11 character format")
  @NotNull

@Pattern(regexp="^[A-Z]{6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3})?$") 
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountRequestAttributes country(String country) {
    this.country = country;
    return this;
  }

  /**
   * ISO 3166-1 code used to identify the domicile of the account
   * @return country
  **/
  @ApiModelProperty(example = "GB", required = true, value = "ISO 3166-1 code used to identify the domicile of the account")
  @NotNull

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountRequestAttributes customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * A free-format reference that can be used to link this account to an external system
   * @return customerId
  **/
  @ApiModelProperty(example = "12345", value = "A free-format reference that can be used to link this account to an external system")

@Pattern(regexp="^[a-zA-Z0-9-$@., ]{0,256}$") 
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public AccountRequestAttributes iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN of the account. Will be calculated from other fields if not supplied.
   * @return iban
  **/
  @ApiModelProperty(example = "GB01AB12345612345678", value = "IBAN of the account. Will be calculated from other fields if not supplied.")

@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z0-9]{0,64}$") 
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountRequestAttributes name(List<String> name) {
    this.name = name;
    return this;
  }

  public AccountRequestAttributes addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Account holder names (for example title, first name, last name). Used for Confirmation of Payee matching.
   * @return name
  **/
  @ApiModelProperty(example = "[\"Mr\",\"John\",\"Doe\"]", value = "Account holder names (for example title, first name, last name). Used for Confirmation of Payee matching.")

@Size(max=4) 
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public AccountRequestAttributes organisationIdentification(OrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
    return this;
  }

  /**
   * Get organisationIdentification
   * @return organisationIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrganisationIdentification getOrganisationIdentification() {
    return organisationIdentification;
  }

  public void setOrganisationIdentification(OrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
  }

  public AccountRequestAttributes privateIdentification(PrivateIdentification privateIdentification) {
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
    AccountRequestAttributes accountRequestAttributes = (AccountRequestAttributes) o;
    return Objects.equals(this.accountNumber, accountRequestAttributes.accountNumber) &&
        Objects.equals(this.bankId, accountRequestAttributes.bankId) &&
        Objects.equals(this.bankIdCode, accountRequestAttributes.bankIdCode) &&
        Objects.equals(this.baseCurrency, accountRequestAttributes.baseCurrency) &&
        Objects.equals(this.bic, accountRequestAttributes.bic) &&
        Objects.equals(this.country, accountRequestAttributes.country) &&
        Objects.equals(this.customerId, accountRequestAttributes.customerId) &&
        Objects.equals(this.iban, accountRequestAttributes.iban) &&
        Objects.equals(this.name, accountRequestAttributes.name) &&
        Objects.equals(this.organisationIdentification, accountRequestAttributes.organisationIdentification) &&
        Objects.equals(this.privateIdentification, accountRequestAttributes.privateIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankId, bankIdCode, baseCurrency, bic, country, customerId, iban, name, organisationIdentification, privateIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestAttributes {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankIdCode: ").append(toIndentedString(bankIdCode)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organisationIdentification: ").append(toIndentedString(organisationIdentification)).append("\n");
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

