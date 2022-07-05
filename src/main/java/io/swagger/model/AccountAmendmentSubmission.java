package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountAmendmentSubmissionAttributes;
import io.swagger.model.AccountAmendmentSubmissionRelationships;
import io.swagger.model.ResourceType;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAmendmentSubmission
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendmentSubmission   {
  @JsonProperty("attributes")
  private AccountAmendmentSubmissionAttributes attributes = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("modified_on")
  private OffsetDateTime modifiedOn = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("relationships")
  private AccountAmendmentSubmissionRelationships relationships = null;

  @JsonProperty("type")
  private ResourceType type = null;

  @JsonProperty("version")
  private Integer version = null;

  public AccountAmendmentSubmission attributes(AccountAmendmentSubmissionAttributes attributes) {
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

  public AccountAmendmentSubmissionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AccountAmendmentSubmissionAttributes attributes) {
    this.attributes = attributes;
  }

  public AccountAmendmentSubmission createdOn(OffsetDateTime createdOn) {
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

  public AccountAmendmentSubmission id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AccountAmendmentSubmission modifiedOn(OffsetDateTime modifiedOn) {
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

  public AccountAmendmentSubmission organisationId(UUID organisationId) {
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

  public AccountAmendmentSubmission relationships(AccountAmendmentSubmissionRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountAmendmentSubmissionRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(AccountAmendmentSubmissionRelationships relationships) {
    this.relationships = relationships;
  }

  public AccountAmendmentSubmission type(ResourceType type) {
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

  public AccountAmendmentSubmission version(Integer version) {
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
    AccountAmendmentSubmission accountAmendmentSubmission = (AccountAmendmentSubmission) o;
    return Objects.equals(this.attributes, accountAmendmentSubmission.attributes) &&
        Objects.equals(this.createdOn, accountAmendmentSubmission.createdOn) &&
        Objects.equals(this.id, accountAmendmentSubmission.id) &&
        Objects.equals(this.modifiedOn, accountAmendmentSubmission.modifiedOn) &&
        Objects.equals(this.organisationId, accountAmendmentSubmission.organisationId) &&
        Objects.equals(this.relationships, accountAmendmentSubmission.relationships) &&
        Objects.equals(this.type, accountAmendmentSubmission.type) &&
        Objects.equals(this.version, accountAmendmentSubmission.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdOn, id, modifiedOn, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendmentSubmission {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

