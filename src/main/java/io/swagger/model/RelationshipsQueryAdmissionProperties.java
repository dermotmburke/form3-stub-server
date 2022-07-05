package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryAdmissionResourceType;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelationshipsQueryAdmissionProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RelationshipsQueryAdmissionProperties   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private QueryAdmissionResourceType type = null;

  public RelationshipsQueryAdmissionProperties id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The query admission associated with this query
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The query admission associated with this query")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RelationshipsQueryAdmissionProperties type(QueryAdmissionResourceType type) {
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

  public QueryAdmissionResourceType getType() {
    return type;
  }

  public void setType(QueryAdmissionResourceType type) {
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
    RelationshipsQueryAdmissionProperties relationshipsQueryAdmissionProperties = (RelationshipsQueryAdmissionProperties) o;
    return Objects.equals(this.id, relationshipsQueryAdmissionProperties.id) &&
        Objects.equals(this.type, relationshipsQueryAdmissionProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipsQueryAdmissionProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

