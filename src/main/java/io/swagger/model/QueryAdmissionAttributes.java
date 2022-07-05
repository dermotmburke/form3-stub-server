package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryAdmissionStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryAdmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryAdmissionAttributes   {
  @JsonProperty("status")
  private QueryAdmissionStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  public QueryAdmissionAttributes status(QueryAdmissionStatus status) {
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

  public QueryAdmissionStatus getStatus() {
    return status;
  }

  public void setStatus(QueryAdmissionStatus status) {
    this.status = status;
  }

  public QueryAdmissionAttributes statusReason(String statusReason) {
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
    QueryAdmissionAttributes queryAdmissionAttributes = (QueryAdmissionAttributes) o;
    return Objects.equals(this.status, queryAdmissionAttributes.status) &&
        Objects.equals(this.statusReason, queryAdmissionAttributes.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAdmissionAttributes {\n");
    
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

