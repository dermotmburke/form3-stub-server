package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecallDecisionSubmissionStatus;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecallDecisionSubmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RecallDecisionSubmissionAttributes   {
  @JsonProperty("auto")
  private Boolean auto = false;

  @JsonProperty("status")
  private RecallDecisionSubmissionStatus status = null;

  @JsonProperty("status_reason")
  private String statusReason = null;

  @JsonProperty("submission_datetime")
  private OffsetDateTime submissionDatetime = null;

  public RecallDecisionSubmissionAttributes auto(Boolean auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Indicates if the submission was created automatically by the system (`true`) or manually (`false`).
   * @return auto
  **/
  @ApiModelProperty(value = "Indicates if the submission was created automatically by the system (`true`) or manually (`false`).")


  public Boolean isAuto() {
    return auto;
  }

  public void setAuto(Boolean auto) {
    this.auto = auto;
  }

  public RecallDecisionSubmissionAttributes status(RecallDecisionSubmissionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecallDecisionSubmissionStatus getStatus() {
    return status;
  }

  public void setStatus(RecallDecisionSubmissionStatus status) {
    this.status = status;
  }

  public RecallDecisionSubmissionAttributes statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Reason for submission failure if status is `delivery_failed`
   * @return statusReason
  **/
  @ApiModelProperty(example = "recall does not exist", value = "Reason for submission failure if status is `delivery_failed`")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public RecallDecisionSubmissionAttributes submissionDatetime(OffsetDateTime submissionDatetime) {
    this.submissionDatetime = submissionDatetime;
    return this;
  }

  /**
   * Date and time of the submission
   * @return submissionDatetime
  **/
  @ApiModelProperty(example = "2018-03-12T14:11:48.055Z", readOnly = true, value = "Date and time of the submission")

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
    RecallDecisionSubmissionAttributes recallDecisionSubmissionAttributes = (RecallDecisionSubmissionAttributes) o;
    return Objects.equals(this.auto, recallDecisionSubmissionAttributes.auto) &&
        Objects.equals(this.status, recallDecisionSubmissionAttributes.status) &&
        Objects.equals(this.statusReason, recallDecisionSubmissionAttributes.statusReason) &&
        Objects.equals(this.submissionDatetime, recallDecisionSubmissionAttributes.submissionDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auto, status, statusReason, submissionDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallDecisionSubmissionAttributes {\n");
    
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
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

