package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PrometheusResult;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrometheusMetricData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class PrometheusMetricData   {
  @JsonProperty("result")
  private PrometheusResult result = null;

  @JsonProperty("resultType")
  private String resultType = null;

  public PrometheusMetricData result(PrometheusResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrometheusResult getResult() {
    return result;
  }

  public void setResult(PrometheusResult result) {
    this.result = result;
  }

  public PrometheusMetricData resultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Get resultType
   * @return resultType
  **/
  @ApiModelProperty(value = "")


  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrometheusMetricData prometheusMetricData = (PrometheusMetricData) o;
    return Objects.equals(this.result, prometheusMetricData.result) &&
        Objects.equals(this.resultType, prometheusMetricData.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrometheusMetricData {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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

