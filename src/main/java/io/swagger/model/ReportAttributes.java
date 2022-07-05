package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReportAttributes   {
  @JsonProperty("formats")
  @Valid
  private List<String> formats = null;

  @JsonProperty("generation_time")
  private OffsetDateTime generationTime = null;

  @JsonProperty("processing_date")
  private LocalDate processingDate = null;

  @JsonProperty("report_source")
  private String reportSource = null;

  @JsonProperty("report_type")
  private String reportType = null;

  @JsonProperty("report_type_description")
  private String reportTypeDescription = null;

  public ReportAttributes formats(List<String> formats) {
    this.formats = formats;
    return this;
  }

  public ReportAttributes addFormatsItem(String formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<String>();
    }
    this.formats.add(formatsItem);
    return this;
  }

  /**
   * Get formats
   * @return formats
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public List<String> getFormats() {
    return formats;
  }

  public void setFormats(List<String> formats) {
    this.formats = formats;
  }

  public ReportAttributes generationTime(OffsetDateTime generationTime) {
    this.generationTime = generationTime;
    return this;
  }

  /**
   * Get generationTime
   * @return generationTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getGenerationTime() {
    return generationTime;
  }

  public void setGenerationTime(OffsetDateTime generationTime) {
    this.generationTime = generationTime;
  }

  public ReportAttributes processingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
    return this;
  }

  /**
   * Get processingDate
   * @return processingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getProcessingDate() {
    return processingDate;
  }

  public void setProcessingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
  }

  public ReportAttributes reportSource(String reportSource) {
    this.reportSource = reportSource;
    return this;
  }

  /**
   * Get reportSource
   * @return reportSource
  **/
  @ApiModelProperty(value = "")


  public String getReportSource() {
    return reportSource;
  }

  public void setReportSource(String reportSource) {
    this.reportSource = reportSource;
  }

  public ReportAttributes reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Type of report.
   * @return reportType
  **/
  @ApiModelProperty(value = "Type of report.")


  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public ReportAttributes reportTypeDescription(String reportTypeDescription) {
    this.reportTypeDescription = reportTypeDescription;
    return this;
  }

  /**
   * Get reportTypeDescription
   * @return reportTypeDescription
  **/
  @ApiModelProperty(value = "")


  public String getReportTypeDescription() {
    return reportTypeDescription;
  }

  public void setReportTypeDescription(String reportTypeDescription) {
    this.reportTypeDescription = reportTypeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAttributes reportAttributes = (ReportAttributes) o;
    return Objects.equals(this.formats, reportAttributes.formats) &&
        Objects.equals(this.generationTime, reportAttributes.generationTime) &&
        Objects.equals(this.processingDate, reportAttributes.processingDate) &&
        Objects.equals(this.reportSource, reportAttributes.reportSource) &&
        Objects.equals(this.reportType, reportAttributes.reportType) &&
        Objects.equals(this.reportTypeDescription, reportAttributes.reportTypeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formats, generationTime, processingDate, reportSource, reportType, reportTypeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAttributes {\n");
    
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    generationTime: ").append(toIndentedString(generationTime)).append("\n");
    sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
    sb.append("    reportSource: ").append(toIndentedString(reportSource)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportTypeDescription: ").append(toIndentedString(reportTypeDescription)).append("\n");
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

