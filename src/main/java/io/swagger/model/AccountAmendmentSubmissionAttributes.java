package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubmissionStatus;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAmendmentSubmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendmentSubmissionAttributes   {
  @JsonProperty("status")
  private SubmissionStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  @JsonProperty("submission_datetime")
  private OffsetDateTime submissionDatetime = null;

  public AccountAmendmentSubmissionAttributes status(SubmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionStatus getStatus() {
    return status;
  }

  public void setStatus(SubmissionStatus status) {
    this.status = status;
  }

  public AccountAmendmentSubmissionAttributes statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Description of the submission status
   * @return statusReason
  **/
  @ApiModelProperty(example = "Invalid IBAN", value = "Description of the submission status")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public AccountAmendmentSubmissionAttributes submissionDatetime(OffsetDateTime submissionDatetime) {
    this.submissionDatetime = submissionDatetime;
    return this;
  }

  /**
   * Get submissionDatetime
   * @return submissionDatetime
  **/
  @ApiModelProperty(example = "2020-10-16T09:24:42Z", readOnly = true, value = "")

  @Valid

  public OffsetDateTime getSubmissionDatetime() {
    return submissionDatetime;
  }

  public void setSubmissionDatetime(OffsetDateTime submissionDatetime) {
    this.submissionDatetime = submissionDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAmendmentSubmissionAttributes accountAmendmentSubmissionAttributes = (AccountAmendmentSubmissionAttributes) o;
    return Objects.equals(this.status, accountAmendmentSubmissionAttributes.status) &&
        Objects.equals(this.statusReason, accountAmendmentSubmissionAttributes.statusReason) &&
        Objects.equals(this.submissionDatetime, accountAmendmentSubmissionAttributes.submissionDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusReason, submissionDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendmentSubmissionAttributes {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    submissionDatetime: ").append(toIndentedString(submissionDatetime)).append("\n");
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

