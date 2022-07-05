package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipLinks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecallRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RecallRelationships   {
  @JsonProperty("payment")
  private RelationshipLinks payment = null;

  @JsonProperty("recall_admission")
  private RelationshipLinks recallAdmission = null;

  @JsonProperty("recall_decisions")
  private RelationshipLinks recallDecisions = null;

  @JsonProperty("recall_reversal")
  private RelationshipLinks recallReversal = null;

  @JsonProperty("recall_submission")
  private RelationshipLinks recallSubmission = null;

  public RecallRelationships payment(RelationshipLinks payment) {
    this.payment = payment;
    return this;
  }

  /**
   * ID of the payment resource related to the recall
   * @return payment
  **/
  @ApiModelProperty(value = "ID of the payment resource related to the recall")

  @Valid

  public RelationshipLinks getPayment() {
    return payment;
  }

  public void setPayment(RelationshipLinks payment) {
    this.payment = payment;
  }

  public RecallRelationships recallAdmission(RelationshipLinks recallAdmission) {
    this.recallAdmission = recallAdmission;
    return this;
  }

  /**
   * ID of the recall admission resource related to the recall
   * @return recallAdmission
  **/
  @ApiModelProperty(value = "ID of the recall admission resource related to the recall")

  @Valid

  public RelationshipLinks getRecallAdmission() {
    return recallAdmission;
  }

  public void setRecallAdmission(RelationshipLinks recallAdmission) {
    this.recallAdmission = recallAdmission;
  }

  public RecallRelationships recallDecisions(RelationshipLinks recallDecisions) {
    this.recallDecisions = recallDecisions;
    return this;
  }

  /**
   * ID of the recall decision resource related to the recall
   * @return recallDecisions
  **/
  @ApiModelProperty(value = "ID of the recall decision resource related to the recall")

  @Valid

  public RelationshipLinks getRecallDecisions() {
    return recallDecisions;
  }

  public void setRecallDecisions(RelationshipLinks recallDecisions) {
    this.recallDecisions = recallDecisions;
  }

  public RecallRelationships recallReversal(RelationshipLinks recallReversal) {
    this.recallReversal = recallReversal;
    return this;
  }

  /**
   * ID of the recall reversal resource related to the recall
   * @return recallReversal
  **/
  @ApiModelProperty(value = "ID of the recall reversal resource related to the recall")

  @Valid

  public RelationshipLinks getRecallReversal() {
    return recallReversal;
  }

  public void setRecallReversal(RelationshipLinks recallReversal) {
    this.recallReversal = recallReversal;
  }

  public RecallRelationships recallSubmission(RelationshipLinks recallSubmission) {
    this.recallSubmission = recallSubmission;
    return this;
  }

  /**
   * ID of the recall submission resource related to the recall
   * @return recallSubmission
  **/
  @ApiModelProperty(value = "ID of the recall submission resource related to the recall")

  @Valid

  public RelationshipLinks getRecallSubmission() {
    return recallSubmission;
  }

  public void setRecallSubmission(RelationshipLinks recallSubmission) {
    this.recallSubmission = recallSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecallRelationships recallRelationships = (RecallRelationships) o;
    return Objects.equals(this.payment, recallRelationships.payment) &&
        Objects.equals(this.recallAdmission, recallRelationships.recallAdmission) &&
        Objects.equals(this.recallDecisions, recallRelationships.recallDecisions) &&
        Objects.equals(this.recallReversal, recallRelationships.recallReversal) &&
        Objects.equals(this.recallSubmission, recallRelationships.recallSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, recallAdmission, recallDecisions, recallReversal, recallSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    recallAdmission: ").append(toIndentedString(recallAdmission)).append("\n");
    sb.append("    recallDecisions: ").append(toIndentedString(recallDecisions)).append("\n");
    sb.append("    recallReversal: ").append(toIndentedString(recallReversal)).append("\n");
    sb.append("    recallSubmission: ").append(toIndentedString(recallSubmission)).append("\n");
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

