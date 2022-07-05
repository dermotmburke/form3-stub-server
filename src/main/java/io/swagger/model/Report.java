package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReportAttributes;
import io.swagger.model.ReportRelationships;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Report
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Report   {
  @JsonProperty("attributes")
  private ReportAttributes attributes = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("modified_on")
  private OffsetDateTime modifiedOn = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("relationships")
  private ReportRelationships relationships = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    REPORTS("reports");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("version")
  private Integer version = null;

  public Report attributes(ReportAttributes attributes) {
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

  public ReportAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ReportAttributes attributes) {
    this.attributes = attributes;
  }

  public Report createdOn(OffsetDateTime createdOn) {
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

  public Report id(UUID id) {
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

  public Report modifiedOn(OffsetDateTime modifiedOn) {
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

  public Report organisationId(UUID organisationId) {
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

  public Report relationships(ReportRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReportRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ReportRelationships relationships) {
    this.relationships = relationships;
  }

  public Report type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Report version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(value = "")

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
    Report report = (Report) o;
    return Objects.equals(this.attributes, report.attributes) &&
        Objects.equals(this.createdOn, report.createdOn) &&
        Objects.equals(this.id, report.id) &&
        Objects.equals(this.modifiedOn, report.modifiedOn) &&
        Objects.equals(this.organisationId, report.organisationId) &&
        Objects.equals(this.relationships, report.relationships) &&
        Objects.equals(this.type, report.type) &&
        Objects.equals(this.version, report.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createdOn, id, modifiedOn, organisationId, relationships, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
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

