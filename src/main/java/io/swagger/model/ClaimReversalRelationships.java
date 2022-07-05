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
 * ClaimReversalRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ClaimReversalRelationships   {
  @JsonProperty("claim")
  private Object claim = null;

  @JsonProperty("claim_reversal_submission")
  private Object claimReversalSubmission = null;

  public ClaimReversalRelationships claim(Object claim) {
    this.claim = claim;
    return this;
  }

  /**
   * Get claim
   * @return claim
  **/
  @ApiModelProperty(value = "")


  public Object getClaim() {
    return claim;
  }

  public void setClaim(Object claim) {
    this.claim = claim;
  }

  public ClaimReversalRelationships claimReversalSubmission(Object claimReversalSubmission) {
    this.claimReversalSubmission = claimReversalSubmission;
    return this;
  }

  /**
   * Get claimReversalSubmission
   * @return claimReversalSubmission
  **/
  @ApiModelProperty(value = "")


  public Object getClaimReversalSubmission() {
    return claimReversalSubmission;
  }

  public void setClaimReversalSubmission(Object claimReversalSubmission) {
    this.claimReversalSubmission = claimReversalSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimReversalRelationships claimReversalRelationships = (ClaimReversalRelationships) o;
    return Objects.equals(this.claim, claimReversalRelationships.claim) &&
        Objects.equals(this.claimReversalSubmission, claimReversalRelationships.claimReversalSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claim, claimReversalSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimReversalRelationships {\n");
    
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
    sb.append("    claimReversalSubmission: ").append(toIndentedString(claimReversalSubmission)).append("\n");
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

