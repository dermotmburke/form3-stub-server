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
 * QueryResponseCompensation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseCompensation   {
  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("account_number_code")
  private String accountNumberCode = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public QueryResponseCompensation accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public QueryResponseCompensation accountNumberCode(String accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
    return this;
  }

  /**
   * Get accountNumberCode
   * @return accountNumberCode
  **/
  @ApiModelProperty(value = "")


  public String getAccountNumberCode() {
    return accountNumberCode;
  }

  public void setAccountNumberCode(String accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
  }

  public QueryResponseCompensation amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public QueryResponseCompensation currency(String currency) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseCompensation queryResponseCompensation = (QueryResponseCompensation) o;
    return Objects.equals(this.accountNumber, queryResponseCompensation.accountNumber) &&
        Objects.equals(this.accountNumberCode, queryResponseCompensation.accountNumberCode) &&
        Objects.equals(this.amount, queryResponseCompensation.amount) &&
        Objects.equals(this.currency, queryResponseCompensation.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountNumberCode, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseCompensation {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberCode: ").append(toIndentedString(accountNumberCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

