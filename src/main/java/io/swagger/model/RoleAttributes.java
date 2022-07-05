package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RoleAttributes   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent_role_id")
  private UUID parentRoleId = null;

  public RoleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the role
   * @return name
  **/
  @ApiModelProperty(example = "Read-only Role", value = "Name of the role")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleAttributes parentRoleId(UUID parentRoleId) {
    this.parentRoleId = parentRoleId;
    return this;
  }

  /**
   * Unique resource ID of the parent Role
   * @return parentRoleId
  **/
  @ApiModelProperty(example = "7826c3cb-d6fd-41d0-b187-dc23ba928772", value = "Unique resource ID of the parent Role")

  @Valid

  public UUID getParentRoleId() {
    return parentRoleId;
  }

  public void setParentRoleId(UUID parentRoleId) {
    this.parentRoleId = parentRoleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAttributes roleAttributes = (RoleAttributes) o;
    return Objects.equals(this.name, roleAttributes.name) &&
        Objects.equals(this.parentRoleId, roleAttributes.parentRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentRoleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
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

