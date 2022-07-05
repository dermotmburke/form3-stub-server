package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PrometheusMetric;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrometheusResultItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class PrometheusResultItem   {
  @JsonProperty("metric")
  private PrometheusMetric metric = null;

  @JsonProperty("value")
  @Valid
  private List<Object> value = null;

  public PrometheusResultItem metric(PrometheusMetric metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrometheusMetric getMetric() {
    return metric;
  }

  public void setMetric(PrometheusMetric metric) {
    this.metric = metric;
  }

  public PrometheusResultItem value(List<Object> value) {
    this.value = value;
    return this;
  }

  public PrometheusResultItem addValueItem(Object valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Object>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public List<Object> getValue() {
    return value;
  }

  public void setValue(List<Object> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrometheusResultItem prometheusResultItem = (PrometheusResultItem) o;
    return Objects.equals(this.metric, prometheusResultItem.metric) &&
        Objects.equals(this.value, prometheusResultItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrometheusResultItem {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

