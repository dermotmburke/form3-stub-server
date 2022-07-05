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
 * AccountAmendmentSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendmentSubmissionRelationships   {
  @JsonProperty("account_amendment")
  private Object accountAmendment = null;

  public AccountAmendmentSubmissionRelationships accountAmendment(Object accountAmendment) {
    this.accountAmendment = accountAmendment;
    return this;
  }

  /**
   * Get accountAmendment
   * @return accountAmendment
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAccountAmendment() {
    return accountAmendment;
  }

  public void setAccountAmendment(Object accountAmendment) {
    this.accountAmendment = accountAmendment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAmendmentSubmissionRelationships accountAmendmentSubmissionRelationships = (AccountAmendmentSubmissionRelationships) o;
    return Objects.equals(this.accountAmendment, accountAmendmentSubmissionRelationships.accountAmendment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAmendment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendmentSubmissionRelationships {\n");
    
    sb.append("    accountAmendment: ").append(toIndentedString(accountAmendment)).append("\n");
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

