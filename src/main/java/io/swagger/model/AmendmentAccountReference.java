package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResourceType;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account Reference
 */
@ApiModel(description = "Account Reference")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AmendmentAccountReference   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private ResourceType type = null;

  @JsonProperty("version")
  private Integer version = null;

  public AmendmentAccountReference id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Account ID
   * @return id
  **/
  @ApiModelProperty(example = "a1f826ee-f0f5-4ad0-bfd1-b6869a07142c", value = "Account ID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AmendmentAccountReference type(ResourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceType getType() {
    return type;
  }

  public void setType(ResourceType type) {
    this.type = type;
  }

  public AmendmentAccountReference version(Integer version) {
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
    AmendmentAccountReference amendmentAccountReference = (AmendmentAccountReference) o;
    return Objects.equals(this.id, amendmentAccountReference.id) &&
        Objects.equals(this.type, amendmentAccountReference.type) &&
        Objects.equals(this.version, amendmentAccountReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmendmentAccountReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

