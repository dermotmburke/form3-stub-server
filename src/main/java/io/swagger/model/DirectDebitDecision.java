package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitDecision
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitDecision   {
  @JsonProperty("attributes")
  private Object attributes = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("modified_on")
  private OffsetDateTime modifiedOn = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("relationships")
  private Object relationships = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("version")
  private Integer version = null;

  public DirectDebitDecision attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public DirectDebitDecision createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public DirectDebitDecision id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique resource ID
   * @return id
  **/
  @ApiModelProperty(example = "67a1b31c-0743-429a-b664-ae63925e142f", required = true, value = "Unique resource ID")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DirectDebitDecision modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public DirectDebitDecision organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Unique ID of the organisation this resource is created by
   * @return organisationId
  **/
  @ApiModelProperty(example = "763e3cbb-da91-46fd-a0f8-169038a8324e", required = true, value = "Unique ID of the organisation this resource is created by")
  @NotNull

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public DirectDebitDecision relationships(Object relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")


  public Object getRelationships() {
    return relationships;
  }

  public void setRelationships(Object relationships) {
    this.relationships = relationships;
  }

  public DirectDebitDecision type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Name of the resource type
   * @return type
  **/
  @ApiModelProperty(example = "direct_debit_decisions", value = "Name of the resource type")

@Pattern(regexp="^[A-Za-z_]*$") 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DirectDebitDecision version(Integer version) {
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
    DirectDebitDecision directDebitDecision = (DirectDebitDecision) o;
    return Objects.equals(this.attributes, directDebitDecision.attributes) &&
        Objects.equals(this.createdOn, directDebitDecision.createdOn) &&
        Objects.equals(this.id, directDebitDecision.id) &&
        Objects.equals(this.modifiedOn, directDebitDecision.modifiedOn) &&
        Objects.equals(this.organisationId, directDebitDecision.organisationId) &&
        Objects.equals(this.relationships, directDebitDecision.relationships) &&
        Objects.equals(this.type, directDebitDecision.type) &&
        Objects.equals(this.version, directDebitDecision.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdOn, id, modifiedOn, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitDecision {\n");
    
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

