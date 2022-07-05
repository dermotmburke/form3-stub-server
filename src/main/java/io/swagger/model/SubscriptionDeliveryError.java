package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionDeliveryErrorType;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionDeliveryError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SubscriptionDeliveryError   {
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
  private SubscriptionDeliveryErrorType type = null;

  @JsonProperty("version")
  private Integer version = null;

  public SubscriptionDeliveryError attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public SubscriptionDeliveryError createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public SubscriptionDeliveryError id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SubscriptionDeliveryError modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public SubscriptionDeliveryError organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public SubscriptionDeliveryError relationships(Object relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Object getRelationships() {
    return relationships;
  }

  public void setRelationships(Object relationships) {
    this.relationships = relationships;
  }

  public SubscriptionDeliveryError type(SubscriptionDeliveryErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public SubscriptionDeliveryErrorType getType() {
    return type;
  }

  public void setType(SubscriptionDeliveryErrorType type) {
    this.type = type;
  }

  public SubscriptionDeliveryError version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(readOnly = true, value = "")

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
    SubscriptionDeliveryError subscriptionDeliveryError = (SubscriptionDeliveryError) o;
    return Objects.equals(this.attributes, subscriptionDeliveryError.attributes) &&
        Objects.equals(this.createdOn, subscriptionDeliveryError.createdOn) &&
        Objects.equals(this.id, subscriptionDeliveryError.id) &&
        Objects.equals(this.modifiedOn, subscriptionDeliveryError.modifiedOn) &&
        Objects.equals(this.organisationId, subscriptionDeliveryError.organisationId) &&
        Objects.equals(this.relationships, subscriptionDeliveryError.relationships) &&
        Objects.equals(this.type, subscriptionDeliveryError.type) &&
        Objects.equals(this.version, subscriptionDeliveryError.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdOn, id, modifiedOn, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDeliveryError {\n");
    
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

