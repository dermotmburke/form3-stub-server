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
 * ClaimSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ClaimSubmissionRelationships   {
  @JsonProperty("claim")
  private Object claim = null;

  public ClaimSubmissionRelationships claim(Object claim) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimSubmissionRelationships claimSubmissionRelationships = (ClaimSubmissionRelationships) o;
    return Objects.equals(this.claim, claimSubmissionRelationships.claim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimSubmissionRelationships {\n");
    
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
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

