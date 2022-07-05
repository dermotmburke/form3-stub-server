package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipsFullQueryResponse;
import io.swagger.model.RelationshipsPayment;
import io.swagger.model.RelationshipsPaymentAdmission;
import io.swagger.model.RelationshipsPaymentRecall;
import io.swagger.model.RelationshipsPaymentRecallSubmission;
import io.swagger.model.RelationshipsPaymentSubmission;
import io.swagger.model.RelationshipsQuery;
import io.swagger.model.RelationshipsQueryAdmission;
import io.swagger.model.RelationshipsQuerySubmission;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryRelationships   {
  @JsonProperty("payment")
  private RelationshipsPayment payment = null;

  @JsonProperty("payment_admission")
  private RelationshipsPaymentAdmission paymentAdmission = null;

  @JsonProperty("payment_submission")
  private RelationshipsPaymentSubmission paymentSubmission = null;

  @JsonProperty("query")
  private RelationshipsQuery query = null;

  @JsonProperty("query_admission")
  private RelationshipsQueryAdmission queryAdmission = null;

  @JsonProperty("query_response")
  private RelationshipsFullQueryResponse queryResponse = null;

  @JsonProperty("query_submission")
  private RelationshipsQuerySubmission querySubmission = null;

  @JsonProperty("recall")
  private RelationshipsPaymentRecall recall = null;

  @JsonProperty("recall_submission")
  private RelationshipsPaymentRecallSubmission recallSubmission = null;

  public QueryRelationships payment(RelationshipsPayment payment) {
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

  public QueryRelationships paymentAdmission(RelationshipsPaymentAdmission paymentAdmission) {
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

  public QueryRelationships paymentSubmission(RelationshipsPaymentSubmission paymentSubmission) {
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

  public QueryRelationships query(RelationshipsQuery query) {
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

  public QueryRelationships queryAdmission(RelationshipsQueryAdmission queryAdmission) {
    this.queryAdmission = queryAdmission;
    return this;
  }

  /**
   * Get queryAdmission
   * @return queryAdmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsQueryAdmission getQueryAdmission() {
    return queryAdmission;
  }

  public void setQueryAdmission(RelationshipsQueryAdmission queryAdmission) {
    this.queryAdmission = queryAdmission;
  }

  public QueryRelationships queryResponse(RelationshipsFullQueryResponse queryResponse) {
    this.queryResponse = queryResponse;
    return this;
  }

  /**
   * Get queryResponse
   * @return queryResponse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsFullQueryResponse getQueryResponse() {
    return queryResponse;
  }

  public void setQueryResponse(RelationshipsFullQueryResponse queryResponse) {
    this.queryResponse = queryResponse;
  }

  public QueryRelationships querySubmission(RelationshipsQuerySubmission querySubmission) {
    this.querySubmission = querySubmission;
    return this;
  }

  /**
   * Get querySubmission
   * @return querySubmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsQuerySubmission getQuerySubmission() {
    return querySubmission;
  }

  public void setQuerySubmission(RelationshipsQuerySubmission querySubmission) {
    this.querySubmission = querySubmission;
  }

  public QueryRelationships recall(RelationshipsPaymentRecall recall) {
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

  public QueryRelationships recallSubmission(RelationshipsPaymentRecallSubmission recallSubmission) {
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
    QueryRelationships queryRelationships = (QueryRelationships) o;
    return Objects.equals(this.payment, queryRelationships.payment) &&
        Objects.equals(this.paymentAdmission, queryRelationships.paymentAdmission) &&
        Objects.equals(this.paymentSubmission, queryRelationships.paymentSubmission) &&
        Objects.equals(this.query, queryRelationships.query) &&
        Objects.equals(this.queryAdmission, queryRelationships.queryAdmission) &&
        Objects.equals(this.queryResponse, queryRelationships.queryResponse) &&
        Objects.equals(this.querySubmission, queryRelationships.querySubmission) &&
        Objects.equals(this.recall, queryRelationships.recall) &&
        Objects.equals(this.recallSubmission, queryRelationships.recallSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentAdmission, paymentSubmission, query, queryAdmission, queryResponse, querySubmission, recall, recallSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentAdmission: ").append(toIndentedString(paymentAdmission)).append("\n");
    sb.append("    paymentSubmission: ").append(toIndentedString(paymentSubmission)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryAdmission: ").append(toIndentedString(queryAdmission)).append("\n");
    sb.append("    queryResponse: ").append(toIndentedString(queryResponse)).append("\n");
    sb.append("    querySubmission: ").append(toIndentedString(querySubmission)).append("\n");
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

