package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ThinRelationship;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReportRelationships   {
  @JsonProperty("report_admission")
  private Object reportAdmission = null;

  @JsonProperty("transaction_file")
  private ThinRelationship transactionFile = null;

  public ReportRelationships reportAdmission(Object reportAdmission) {
    this.reportAdmission = reportAdmission;
    return this;
  }

  /**
   * Get reportAdmission
   * @return reportAdmission
  **/
  @ApiModelProperty(value = "")


  public Object getReportAdmission() {
    return reportAdmission;
  }

  public void setReportAdmission(Object reportAdmission) {
    this.reportAdmission = reportAdmission;
  }

  public ReportRelationships transactionFile(ThinRelationship transactionFile) {
    this.transactionFile = transactionFile;
    return this;
  }

  /**
   * Get transactionFile
   * @return transactionFile
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ThinRelationship getTransactionFile() {
    return transactionFile;
  }

  public void setTransactionFile(ThinRelationship transactionFile) {
    this.transactionFile = transactionFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRelationships reportRelationships = (ReportRelationships) o;
    return Objects.equals(this.reportAdmission, reportRelationships.reportAdmission) &&
        Objects.equals(this.transactionFile, reportRelationships.transactionFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportAdmission, transactionFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRelationships {\n");
    
    sb.append("    reportAdmission: ").append(toIndentedString(reportAdmission)).append("\n");
    sb.append("    transactionFile: ").append(toIndentedString(transactionFile)).append("\n");
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

