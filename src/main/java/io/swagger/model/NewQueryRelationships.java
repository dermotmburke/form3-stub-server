package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipsPayment;
import io.swagger.model.RelationshipsPaymentAdmission;
import io.swagger.model.RelationshipsPaymentRecall;
import io.swagger.model.RelationshipsPaymentRecallSubmission;
import io.swagger.model.RelationshipsPaymentSubmission;
import io.swagger.model.RelationshipsQuery;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewQueryRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class NewQueryRelationships   {
  @JsonProperty("payment")
  private RelationshipsPayment payment = null;

  @JsonProperty("payment_admission")
  private RelationshipsPaymentAdmission paymentAdmission = null;

  @JsonProperty("payment_submission")
  private RelationshipsPaymentSubmission paymentSubmission = null;

  @JsonProperty("query")
  private RelationshipsQuery query = null;

  @JsonProperty("recall")
  private RelationshipsPaymentRecall recall = null;

  @JsonProperty("recall_submission")
  private RelationshipsPaymentRecallSubmission recallSubmission = null;

  public NewQueryRelationships payment(RelationshipsPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsPayment getPayment() {
    return payment;
  }

  public void setPayment(RelationshipsPayment payment) {
    this.payment = payment;
  }

  public NewQueryRelationships paymentAdmission(RelationshipsPaymentAdmission paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
    return this;
  }

  /**
   * Get paymentAdmission
   * @return paymentAdmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsPaymentAdmission getPaymentAdmission() {
    return paymentAdmission;
  }

  public void setPaymentAdmission(RelationshipsPaymentAdmission paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
  }

  public NewQueryRelationships paymentSubmission(RelationshipsPaymentSubmission paymentSubmission) {
    this.paymentSubmission = paymentSubmission;
    return this;
  }

  /**
   * Get paymentSubmission
   * @return paymentSubmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsPaymentSubmission getPaymentSubmission() {
    return paymentSubmission;
  }

  public void setPaymentSubmission(RelationshipsPaymentSubmission paymentSubmission) {
    this.paymentSubmission = paymentSubmission;
  }

  public NewQueryRelationships query(RelationshipsQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsQuery getQuery() {
    return query;
  }

  public void setQuery(RelationshipsQuery query) {
    this.query = query;
  }

  public NewQueryRelationships recall(RelationshipsPaymentRecall recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Get recall
   * @return recall
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsPaymentRecall getRecall() {
    return recall;
  }

  public void setRecall(RelationshipsPaymentRecall recall) {
    this.recall = recall;
  }

  public NewQueryRelationships recallSubmission(RelationshipsPaymentRecallSubmission recallSubmission) {
    this.recallSubmission = recallSubmission;
    return this;
  }

  /**
   * Get recallSubmission
   * @return recallSubmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsPaymentRecallSubmission getRecallSubmission() {
    return recallSubmission;
  }

  public void setRecallSubmission(RelationshipsPaymentRecallSubmission recallSubmission) {
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
    NewQueryRelationships newQueryRelationships = (NewQueryRelationships) o;
    return Objects.equals(this.payment, newQueryRelationships.payment) &&
        Objects.equals(this.paymentAdmission, newQueryRelationships.paymentAdmission) &&
        Objects.equals(this.paymentSubmission, newQueryRelationships.paymentSubmission) &&
        Objects.equals(this.query, newQueryRelationships.query) &&
        Objects.equals(this.recall, newQueryRelationships.recall) &&
        Objects.equals(this.recallSubmission, newQueryRelationships.recallSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentAdmission, paymentSubmission, query, recall, recallSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewQueryRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentAdmission: ").append(toIndentedString(paymentAdmission)).append("\n");
    sb.append("    paymentSubmission: ").append(toIndentedString(paymentSubmission)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
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

