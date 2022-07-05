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
 * AccountAmendmentRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendmentRelationships   {
  @JsonProperty("account")
  private Object account = null;

  @JsonProperty("account_amendment_submission")
  private Object accountAmendmentSubmission = null;

  public AccountAmendmentRelationships account(Object account) {
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

  public AccountAmendmentRelationships accountAmendmentSubmission(Object accountAmendmentSubmission) {
    this.accountAmendmentSubmission = accountAmendmentSubmission;
    return this;
  }

  /**
   * Get accountAmendmentSubmission
   * @return accountAmendmentSubmission
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAccountAmendmentSubmission() {
    return accountAmendmentSubmission;
  }

  public void setAccountAmendmentSubmission(Object accountAmendmentSubmission) {
    this.accountAmendmentSubmission = accountAmendmentSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAmendmentRelationships accountAmendmentRelationships = (AccountAmendmentRelationships) o;
    return Objects.equals(this.account, accountAmendmentRelationships.account) &&
        Objects.equals(this.accountAmendmentSubmission, accountAmendmentRelationships.accountAmendmentSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountAmendmentSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendmentRelationships {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountAmendmentSubmission: ").append(toIndentedString(accountAmendmentSubmission)).append("\n");
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

