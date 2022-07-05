package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipsPayment;
import io.swagger.model.RelationshipsPaymentRecall;
import io.swagger.model.RelationshipsQuery;
import io.swagger.model.RelationshipsQueryResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseAdmissionRelationships   {
  @JsonProperty("payment")
  private RelationshipsPayment payment = null;

  @JsonProperty("query")
  private RelationshipsQuery query = null;

  @JsonProperty("query_response")
  private RelationshipsQueryResponse queryResponse = null;

  @JsonProperty("recall")
  private RelationshipsPaymentRecall recall = null;

  public QueryResponseAdmissionRelationships payment(RelationshipsPayment payment) {
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

  public QueryResponseAdmissionRelationships query(RelationshipsQuery query) {
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

  public QueryResponseAdmissionRelationships queryResponse(RelationshipsQueryResponse queryResponse) {
    this.queryResponse = queryResponse;
    return this;
  }

  /**
   * Get queryResponse
   * @return queryResponse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsQueryResponse getQueryResponse() {
    return queryResponse;
  }

  public void setQueryResponse(RelationshipsQueryResponse queryResponse) {
    this.queryResponse = queryResponse;
  }

  public QueryResponseAdmissionRelationships recall(RelationshipsPaymentRecall recall) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseAdmissionRelationships queryResponseAdmissionRelationships = (QueryResponseAdmissionRelationships) o;
    return Objects.equals(this.payment, queryResponseAdmissionRelationships.payment) &&
        Objects.equals(this.query, queryResponseAdmissionRelationships.query) &&
        Objects.equals(this.queryResponse, queryResponseAdmissionRelationships.queryResponse) &&
        Objects.equals(this.recall, queryResponseAdmissionRelationships.recall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, query, queryResponse, recall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseAdmissionRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryResponse: ").append(toIndentedString(queryResponse)).append("\n");
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

