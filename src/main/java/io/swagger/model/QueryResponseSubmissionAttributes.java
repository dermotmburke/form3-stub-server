package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryResponseSubmissionStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseSubmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseSubmissionAttributes   {
  @JsonProperty("auto")
  private Boolean auto = null;

  @JsonProperty("status")
  private QueryResponseSubmissionStatus status = null;

  public QueryResponseSubmissionAttributes auto(Boolean auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Get auto
   * @return auto
  **/
  @ApiModelProperty(value = "")


  public Boolean isAuto() {
    return auto;
  }

  public void setAuto(Boolean auto) {
    this.auto = auto;
  }

  public QueryResponseSubmissionAttributes status(QueryResponseSubmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryResponseSubmissionStatus getStatus() {
    return status;
  }

  public void setStatus(QueryResponseSubmissionStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseSubmissionAttributes queryResponseSubmissionAttributes = (QueryResponseSubmissionAttributes) o;
    return Objects.equals(this.auto, queryResponseSubmissionAttributes.auto) &&
        Objects.equals(this.status, queryResponseSubmissionAttributes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auto, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseSubmissionAttributes {\n");
    
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

