package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountAmendmentAttributes;
import io.swagger.model.AccountAmendmentRelationships;
import io.swagger.model.AccountUpdate;
import io.swagger.model.ResourceType;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAmendment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendment   {
  @JsonProperty("attributes")
  private AccountAmendmentAttributes attributes = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("data")
  private AccountUpdate data = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("modified_on")
  private OffsetDateTime modifiedOn = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("relationships")
  private AccountAmendmentRelationships relationships = null;

  @JsonProperty("type")
  private ResourceType type = null;

  @JsonProperty("version")
  private Integer version = null;

  public AccountAmendment attributes(AccountAmendmentAttributes attributes) {
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

  public AccountAmendmentAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AccountAmendmentAttributes attributes) {
    this.attributes = attributes;
  }

  public AccountAmendment createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Date when the resource was created
   * @return createdOn
  **/
  @ApiModelProperty(example = "2020-01-01T00:00:00.000Z", readOnly = true, value = "Date when the resource was created")

  @Valid

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public AccountAmendment data(AccountUpdate data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountUpdate getData() {
    return data;
  }

  public void setData(AccountUpdate data) {
    this.data = data;
  }

  public AccountAmendment id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Account Request ID
   * @return id
  **/
  @ApiModelProperty(example = "7d31e653-741e-479d-a15d-44b90cfa146f", required = true, value = "Account Request ID")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AccountAmendment modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * Date when the resource was last modified
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "2020-01-01T00:00:00.000Z", readOnly = true, value = "Date when the resource was last modified")

  @Valid

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public AccountAmendment organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Unique ID of the organisation this resource is created by
   * @return organisationId
  **/
  @ApiModelProperty(example = "ee2fb143-6dfe-4787-b183-ca8ddd4164d2", required = true, value = "Unique ID of the organisation this resource is created by")
  @NotNull

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public AccountAmendment relationships(AccountAmendmentRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountAmendmentRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AccountAmendmentRelationships relationships) {
    this.relationships = relationships;
  }

  public AccountAmendment type(ResourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResourceType getType() {
    return type;
  }

  public void setType(ResourceType type) {
    this.type = type;
  }

  public AccountAmendment version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version Number
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(example = "0", value = "Version Number")

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
    AccountAmendment accountAmendment = (AccountAmendment) o;
    return Objects.equals(this.attributes, accountAmendment.attributes) &&
        Objects.equals(this.createdOn, accountAmendment.createdOn) &&
        Objects.equals(this.data, accountAmendment.data) &&
        Objects.equals(this.id, accountAmendment.id) &&
        Objects.equals(this.modifiedOn, accountAmendment.modifiedOn) &&
        Objects.equals(this.organisationId, accountAmendment.organisationId) &&
        Objects.equals(this.relationships, accountAmendment.relationships) &&
        Objects.equals(this.type, accountAmendment.type) &&
        Objects.equals(this.version, accountAmendment.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdOn, data, id, modifiedOn, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendment {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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

