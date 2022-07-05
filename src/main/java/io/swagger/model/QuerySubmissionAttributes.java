package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QuerySubmissionStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuerySubmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QuerySubmissionAttributes   {
  @JsonProperty("status")
  private QuerySubmissionStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  public QuerySubmissionAttributes status(QuerySubmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QuerySubmissionStatus getStatus() {
    return status;
  }

  public void setStatus(QuerySubmissionStatus status) {
    this.status = status;
  }

  public QuerySubmissionAttributes statusReason(String statusReason) {
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
    QuerySubmissionAttributes querySubmissionAttributes = (QuerySubmissionAttributes) o;
    return Objects.equals(this.status, querySubmissionAttributes.status) &&
        Objects.equals(this.statusReason, querySubmissionAttributes.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySubmissionAttributes {\n");
    
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

