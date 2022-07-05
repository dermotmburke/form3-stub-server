package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReportAdmissionRelationships   {
  @JsonProperty("report")
  private Object report = null;

  public ReportAdmissionRelationships report(Object report) {
    this.report = report;
    return this;
  }

  /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(value = "")


  public Object getReport() {
    return report;
  }

  public void setReport(Object report) {
    this.report = report;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAdmissionRelationships reportAdmissionRelationships = (ReportAdmissionRelationships) o;
    return Objects.equals(this.report, reportAdmissionRelationships.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAdmissionRelationships {\n");
    
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

