package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies the details on how the settlement of the transaction between the instructing agent and the instructed agent is completed
 */
@ApiModel(description = "Specifies the details on how the settlement of the transaction between the instructing agent and the instructed agent is completed")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Settlement   {
  @JsonProperty("account_number")
  private String accountNumber = null;

  /**
   * Identification code of the account number. Required when account_number is provided, not used otherwise. Supported values: IBAN, BBAN
   */
  public enum AccountNumberCodeEnum {
    IBAN("IBAN"),
    
    BBAN("BBAN");

    private String value;

    AccountNumberCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountNumberCodeEnum fromValue(String text) {
      for (AccountNumberCodeEnum b : AccountNumberCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("account_number_code")
  private AccountNumberCodeEnum accountNumberCode = null;

  /**
   * Method used to settle the payment instruction. Acceptable Values for SEPA: CLRG. Acceptable Values for SWIFT: INDA (settled by Instructed Agent), INGA (Settled by Instructing Agent), COVE (Cover Payment)
   */
  public enum MethodEnum {
    CLRG("CLRG"),
    
    COVE("COVE"),
    
    INGA("INGA"),
    
    INDA("INDA");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("method")
  private MethodEnum method = null;

  public Settlement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Specific purpose account used to post the debit/credit entries as result of the transaction
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Specific purpose account used to post the debit/credit entries as result of the transaction")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Settlement accountNumberCode(AccountNumberCodeEnum accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
    return this;
  }

  /**
   * Identification code of the account number. Required when account_number is provided, not used otherwise. Supported values: IBAN, BBAN
   * @return accountNumberCode
  **/
  @ApiModelProperty(value = "Identification code of the account number. Required when account_number is provided, not used otherwise. Supported values: IBAN, BBAN")


  public AccountNumberCodeEnum getAccountNumberCode() {
    return accountNumberCode;
  }

  public void setAccountNumberCode(AccountNumberCodeEnum accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
  }

  public Settlement method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Method used to settle the payment instruction. Acceptable Values for SEPA: CLRG. Acceptable Values for SWIFT: INDA (settled by Instructed Agent), INGA (Settled by Instructing Agent), COVE (Cover Payment)
   * @return method
  **/
  @ApiModelProperty(example = "CLRG", value = "Method used to settle the payment instruction. Acceptable Values for SEPA: CLRG. Acceptable Values for SWIFT: INDA (settled by Instructed Agent), INGA (Settled by Instructing Agent), COVE (Cover Payment)")


  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return Objects.equals(this.accountNumber, settlement.accountNumber) &&
        Objects.equals(this.accountNumberCode, settlement.accountNumberCode) &&
        Objects.equals(this.method, settlement.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountNumberCode, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberCode: ").append(toIndentedString(accountNumberCode)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

