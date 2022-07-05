package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipLinks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountRelationships   {
  @JsonProperty("account_events")
  private RelationshipLinks accountEvents = null;

  @JsonProperty("master_account")
  private RelationshipLinks masterAccount = null;

  public AccountRelationships accountEvents(RelationshipLinks accountEvents) {
    this.accountEvents = accountEvents;
    return this;
  }

  /**
   * Events related to the lifecycle of this account
   * @return accountEvents
  **/
  @ApiModelProperty(value = "Events related to the lifecycle of this account")

  @Valid

  public RelationshipLinks getAccountEvents() {
    return accountEvents;
  }

  public void setAccountEvents(RelationshipLinks accountEvents) {
    this.accountEvents = accountEvents;
  }

  public AccountRelationships masterAccount(RelationshipLinks masterAccount) {
    this.masterAccount = masterAccount;
    return this;
  }

  /**
   * ID of the master account related to this account
   * @return masterAccount
  **/
  @ApiModelProperty(value = "ID of the master account related to this account")

  @Valid

  public RelationshipLinks getMasterAccount() {
    return masterAccount;
  }

  public void setMasterAccount(RelationshipLinks masterAccount) {
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
    AccountRelationships accountRelationships = (AccountRelationships) o;
    return Objects.equals(this.accountEvents, accountRelationships.accountEvents) &&
        Objects.equals(this.masterAccount, accountRelationships.masterAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountEvents, masterAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRelationships {\n");
    
    sb.append("    accountEvents: ").append(toIndentedString(accountEvents)).append("\n");
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

