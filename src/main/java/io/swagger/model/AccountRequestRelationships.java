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
 * AccountRequestRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountRequestRelationships   {
  @JsonProperty("account")
  private Object account = null;

  @JsonProperty("account_request_submission")
  private Object accountRequestSubmission = null;

  @JsonProperty("master_account")
  private Object masterAccount = null;

  public AccountRequestRelationships account(Object account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAccount() {
    return account;
  }

  public void setAccount(Object account) {
    this.account = account;
  }

  public AccountRequestRelationships accountRequestSubmission(Object accountRequestSubmission) {
    this.accountRequestSubmission = accountRequestSubmission;
    return this;
  }

  /**
   * Get accountRequestSubmission
   * @return accountRequestSubmission
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAccountRequestSubmission() {
    return accountRequestSubmission;
  }

  public void setAccountRequestSubmission(Object accountRequestSubmission) {
    this.accountRequestSubmission = accountRequestSubmission;
  }

  public AccountRequestRelationships masterAccount(Object masterAccount) {
    this.masterAccount = masterAccount;
    return this;
  }

  /**
   * Get masterAccount
   * @return masterAccount
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getMasterAccount() {
    return masterAccount;
  }

  public void setMasterAccount(Object masterAccount) {
    this.masterAccount = masterAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequestRelationships accountRequestRelationships = (AccountRequestRelationships) o;
    return Objects.equals(this.account, accountRequestRelationships.account) &&
        Objects.equals(this.accountRequestSubmission, accountRequestRelationships.accountRequestSubmission) &&
        Objects.equals(this.masterAccount, accountRequestRelationships.masterAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountRequestSubmission, masterAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestRelationships {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountRequestSubmission: ").append(toIndentedString(accountRequestSubmission)).append("\n");
    sb.append("    masterAccount: ").append(toIndentedString(masterAccount)).append("\n");
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

