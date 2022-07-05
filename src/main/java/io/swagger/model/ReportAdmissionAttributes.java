package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReportAdmissionStatus;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportAdmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReportAdmissionAttributes   {
  @JsonProperty("admission_datetime")
  private OffsetDateTime admissionDatetime = null;

  @JsonProperty("scheme_status_code")
  private String schemeStatusCode = null;

  @JsonProperty("scheme_status_code_description")
  private String schemeStatusCodeDescription = null;

  @JsonProperty("status")
  private ReportAdmissionStatus status = null;

  public ReportAdmissionAttributes admissionDatetime(OffsetDateTime admissionDatetime) {
    this.admissionDatetime = admissionDatetime;
    return this;
  }

  /**
   * Get admissionDatetime
   * @return admissionDatetime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getAdmissionDatetime() {
    return admissionDatetime;
  }

  public void setAdmissionDatetime(OffsetDateTime admissionDatetime) {
    this.admissionDatetime = admissionDatetime;
  }

  public ReportAdmissionAttributes schemeStatusCode(String schemeStatusCode) {
    this.schemeStatusCode = schemeStatusCode;
    return this;
  }

  /**
   * Get schemeStatusCode
   * @return schemeStatusCode
  **/
  @ApiModelProperty(value = "")


  public String getSchemeStatusCode() {
    return schemeStatusCode;
  }

  public void setSchemeStatusCode(String schemeStatusCode) {
    this.schemeStatusCode = schemeStatusCode;
  }

  public ReportAdmissionAttributes schemeStatusCodeDescription(String schemeStatusCodeDescription) {
    this.schemeStatusCodeDescription = schemeStatusCodeDescription;
    return this;
  }

  /**
   * Get schemeStatusCodeDescription
   * @return schemeStatusCodeDescription
  **/
  @ApiModelProperty(value = "")


  public String getSchemeStatusCodeDescription() {
    return schemeStatusCodeDescription;
  }

  public void setSchemeStatusCodeDescription(String schemeStatusCodeDescription) {
    this.schemeStatusCodeDescription = schemeStatusCodeDescription;
  }

  public ReportAdmissionAttributes status(ReportAdmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReportAdmissionStatus getStatus() {
    return status;
  }

  public void setStatus(ReportAdmissionStatus status) {
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
    ReportAdmissionAttributes reportAdmissionAttributes = (ReportAdmissionAttributes) o;
    return Objects.equals(this.admissionDatetime, reportAdmissionAttributes.admissionDatetime) &&
        Objects.equals(this.schemeStatusCode, reportAdmissionAttributes.schemeStatusCode) &&
        Objects.equals(this.schemeStatusCodeDescription, reportAdmissionAttributes.schemeStatusCodeDescription) &&
        Objects.equals(this.status, reportAdmissionAttributes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admissionDatetime, schemeStatusCode, schemeStatusCodeDescription, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAdmissionAttributes {\n");
    
    sb.append("    admissionDatetime: ").append(toIndentedString(admissionDatetime)).append("\n");
    sb.append("    schemeStatusCode: ").append(toIndentedString(schemeStatusCode)).append("\n");
    sb.append("    schemeStatusCodeDescription: ").append(toIndentedString(schemeStatusCodeDescription)).append("\n");
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

