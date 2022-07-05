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
 * AccountRequestSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountRequestSubmissionRelationships   {
  @JsonProperty("account")
  private Object account = null;

  @JsonProperty("account_request")
  private Object accountRequest = null;

  public AccountRequestSubmissionRelationships account(Object account) {
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

  public AccountRequestSubmissionRelationships accountRequest(Object accountRequest) {
    this.accountRequest = accountRequest;
    return this;
  }

  /**
   * Get accountRequest
   * @return accountRequest
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAccountRequest() {
    return accountRequest;
  }

  public void setAccountRequest(Object accountRequest) {
    this.accountRequest = accountRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequestSubmissionRelationships accountRequestSubmissionRelationships = (AccountRequestSubmissionRelationships) o;
    return Objects.equals(this.account, accountRequestSubmissionRelationships.account) &&
        Objects.equals(this.accountRequest, accountRequestSubmissionRelationships.accountRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestSubmissionRelationships {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountRequest: ").append(toIndentedString(accountRequest)).append("\n");
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

