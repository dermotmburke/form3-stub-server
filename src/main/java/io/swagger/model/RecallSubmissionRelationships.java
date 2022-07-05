package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipPayments;
import io.swagger.model.RelationshipRecalls;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecallSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RecallSubmissionRelationships   {
  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  @JsonProperty("recall")
  private RelationshipRecalls recall = null;

  public RecallSubmissionRelationships payment(RelationshipPayments payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipPayments getPayment() {
    return payment;
  }

  public void setPayment(RelationshipPayments payment) {
    this.payment = payment;
  }

  public RecallSubmissionRelationships recall(RelationshipRecalls recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Get recall
   * @return recall
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipRecalls getRecall() {
    return recall;
  }

  public void setRecall(RelationshipRecalls recall) {
    this.recall = recall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecallSubmissionRelationships recallSubmissionRelationships = (RecallSubmissionRelationships) o;
    return Objects.equals(this.payment, recallSubmissionRelationships.payment) &&
        Objects.equals(this.recall, recallSubmissionRelationships.recall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, recall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallSubmissionRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
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

