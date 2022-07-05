package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountEventAttributes;
import io.swagger.model.AccountEventRelationships;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountEvent   {
  @JsonProperty("attributes")
  private AccountEventAttributes attributes = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("relationships")
  private AccountEventRelationships relationships = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("version")
  private Integer version = null;

  public AccountEvent attributes(AccountEventAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountEventAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AccountEventAttributes attributes) {
    this.attributes = attributes;
  }

  public AccountEvent id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique resource ID
   * @return id
  **/
  @ApiModelProperty(example = "6d4f9916-3af9-416e-a347-2d8df90fc4ab", required = true, value = "Unique resource ID")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AccountEvent organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Unique ID of the organisation this resource is created by
   * @return organisationId
  **/
  @ApiModelProperty(example = "cfc09fb8-bbca-40bd-a518-6e58d8a9c7f4", required = true, value = "Unique ID of the organisation this resource is created by")
  @NotNull

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public AccountEvent relationships(AccountEventRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountEventRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AccountEventRelationships relationships) {
    this.relationships = relationships;
  }

  public AccountEvent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Name of the resource type
   * @return type
  **/
  @ApiModelProperty(example = "account_events", required = true, value = "Name of the resource type")
  @NotNull

@Pattern(regexp="^[A-Za-z]*$") 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccountEvent version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    AccountEvent accountEvent = (AccountEvent) o;
    return Objects.equals(this.attributes, accountEvent.attributes) &&
        Objects.equals(this.id, accountEvent.id) &&
        Objects.equals(this.organisationId, accountEvent.organisationId) &&
        Objects.equals(this.relationships, accountEvent.relationships) &&
        Objects.equals(this.type, accountEvent.type) &&
        Objects.equals(this.version, accountEvent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEvent {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

