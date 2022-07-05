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
 * ClaimRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ClaimRelationships   {
  @JsonProperty("claim_reversal")
  private Object claimReversal = null;

  @JsonProperty("claim_submission")
  private Object claimSubmission = null;

  public ClaimRelationships claimReversal(Object claimReversal) {
    this.claimReversal = claimReversal;
    return this;
  }

  /**
   * Get claimReversal
   * @return claimReversal
  **/
  @ApiModelProperty(value = "")


  public Object getClaimReversal() {
    return claimReversal;
  }

  public void setClaimReversal(Object claimReversal) {
    this.claimReversal = claimReversal;
  }

  public ClaimRelationships claimSubmission(Object claimSubmission) {
    this.claimSubmission = claimSubmission;
    return this;
  }

  /**
   * Get claimSubmission
   * @return claimSubmission
  **/
  @ApiModelProperty(value = "")


  public Object getClaimSubmission() {
    return claimSubmission;
  }

  public void setClaimSubmission(Object claimSubmission) {
    this.claimSubmission = claimSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimRelationships claimRelationships = (ClaimRelationships) o;
    return Objects.equals(this.claimReversal, claimRelationships.claimReversal) &&
        Objects.equals(this.claimSubmission, claimRelationships.claimSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimReversal, claimSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimRelationships {\n");
    
    sb.append("    claimReversal: ").append(toIndentedString(claimReversal)).append("\n");
    sb.append("    claimSubmission: ").append(toIndentedString(claimSubmission)).append("\n");
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

