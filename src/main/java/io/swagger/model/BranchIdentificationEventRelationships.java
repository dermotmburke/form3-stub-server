package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipBranch;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchIdentificationEventRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class BranchIdentificationEventRelationships   {
  @JsonProperty("branch")
  private RelationshipBranch branch = null;

  public BranchIdentificationEventRelationships branch(RelationshipBranch branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipBranch getBranch() {
    return branch;
  }

  public void setBranch(RelationshipBranch branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchIdentificationEventRelationships branchIdentificationEventRelationships = (BranchIdentificationEventRelationships) o;
    return Objects.equals(this.branch, branchIdentificationEventRelationships.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchIdentificationEventRelationships {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

