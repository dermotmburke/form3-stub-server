package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentAdmissionResourceType;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelationshipsPaymentAdmissionProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RelationshipsPaymentAdmissionProperties   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private PaymentAdmissionResourceType type = null;

  public RelationshipsPaymentAdmissionProperties id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The payment admission associated with this query
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The payment admission associated with this query")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RelationshipsPaymentAdmissionProperties type(PaymentAdmissionResourceType type) {
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

  public PaymentAdmissionResourceType getType() {
    return type;
  }

  public void setType(PaymentAdmissionResourceType type) {
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
    RelationshipsPaymentAdmissionProperties relationshipsPaymentAdmissionProperties = (RelationshipsPaymentAdmissionProperties) o;
    return Objects.equals(this.id, relationshipsPaymentAdmissionProperties.id) &&
        Objects.equals(this.type, relationshipsPaymentAdmissionProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipsPaymentAdmissionProperties {\n");
    
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

