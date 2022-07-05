package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RoleAttributes;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Role
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Role   {
  @JsonProperty("attributes")
  private RoleAttributes attributes = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("version")
  private Integer version = null;

  public Role attributes(RoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RoleAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RoleAttributes attributes) {
    this.attributes = attributes;
  }

  public Role id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique resource ID
   * @return id
  **/
  @ApiModelProperty(example = "7826c3cb-d6fd-41d0-b187-dc23ba928772", value = "Unique resource ID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Role organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Unique ID of the organisation this resource is created by
   * @return organisationId
  **/
  @ApiModelProperty(example = "ee2fb143-6dfe-4787-b183-ca8ddd4164d2", value = "Unique ID of the organisation this resource is created by")

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public Role type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Name of the resource type
   * @return type
  **/
  @ApiModelProperty(example = "role", value = "Name of the resource type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Role version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version number
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(example = "0", value = "Version number")

@Min(0)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.attributes, role.attributes) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.organisationId, role.organisationId) &&
        Objects.equals(this.type, role.type) &&
        Objects.equals(this.version, role.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, organisationId, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

