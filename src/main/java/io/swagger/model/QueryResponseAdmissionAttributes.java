package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryResponseAdmissionStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseAdmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseAdmissionAttributes   {
  @JsonProperty("status")
  private QueryResponseAdmissionStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  public QueryResponseAdmissionAttributes status(QueryResponseAdmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public QueryResponseAdmissionStatus getStatus() {
    return status;
  }

  public void setStatus(QueryResponseAdmissionStatus status) {
    this.status = status;
  }

  public QueryResponseAdmissionAttributes statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Get statusReason
   * @return statusReason
  **/
  @ApiModelProperty(value = "")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseAdmissionAttributes queryResponseAdmissionAttributes = (QueryResponseAdmissionAttributes) o;
    return Objects.equals(this.status, queryResponseAdmissionAttributes.status) &&
        Objects.equals(this.statusReason, queryResponseAdmissionAttributes.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseAdmissionAttributes {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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

