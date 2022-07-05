package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryResponseSubmissionAttributes;
import io.swagger.model.QueryResponseSubmissionResourceType;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewQueryResponseSubmission
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class NewQueryResponseSubmission   {
  @JsonProperty("attributes")
  private QueryResponseSubmissionAttributes attributes = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("type")
  private QueryResponseSubmissionResourceType type = null;

  public NewQueryResponseSubmission attributes(QueryResponseSubmissionAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryResponseSubmissionAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(QueryResponseSubmissionAttributes attributes) {
    this.attributes = attributes;
  }

  public NewQueryResponseSubmission id(UUID id) {
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

  public NewQueryResponseSubmission organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public NewQueryResponseSubmission type(QueryResponseSubmissionResourceType type) {
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

  public QueryResponseSubmissionResourceType getType() {
    return type;
  }

  public void setType(QueryResponseSubmissionResourceType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewQueryResponseSubmission newQueryResponseSubmission = (NewQueryResponseSubmission) o;
    return Objects.equals(this.attributes, newQueryResponseSubmission.attributes) &&
        Objects.equals(this.id, newQueryResponseSubmission.id) &&
        Objects.equals(this.organisationId, newQueryResponseSubmission.organisationId) &&
        Objects.equals(this.type, newQueryResponseSubmission.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, organisationId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewQueryResponseSubmission {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

