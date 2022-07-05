package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipQueryResponseAdmission;
import io.swagger.model.RelationshipQueryResponseSubmission;
import io.swagger.model.RelationshipsFullQuery;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseRelationships   {
  @JsonProperty("query")
  private RelationshipsFullQuery query = null;

  @JsonProperty("query_response_admission")
  private RelationshipQueryResponseAdmission queryResponseAdmission = null;

  @JsonProperty("query_response_submission")
  private RelationshipQueryResponseSubmission queryResponseSubmission = null;

  public QueryResponseRelationships query(RelationshipsFullQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipsFullQuery getQuery() {
    return query;
  }

  public void setQuery(RelationshipsFullQuery query) {
    this.query = query;
  }

  public QueryResponseRelationships queryResponseAdmission(RelationshipQueryResponseAdmission queryResponseAdmission) {
    this.queryResponseAdmission = queryResponseAdmission;
    return this;
  }

  /**
   * Get queryResponseAdmission
   * @return queryResponseAdmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipQueryResponseAdmission getQueryResponseAdmission() {
    return queryResponseAdmission;
  }

  public void setQueryResponseAdmission(RelationshipQueryResponseAdmission queryResponseAdmission) {
    this.queryResponseAdmission = queryResponseAdmission;
  }

  public QueryResponseRelationships queryResponseSubmission(RelationshipQueryResponseSubmission queryResponseSubmission) {
    this.queryResponseSubmission = queryResponseSubmission;
    return this;
  }

  /**
   * Get queryResponseSubmission
   * @return queryResponseSubmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipQueryResponseSubmission getQueryResponseSubmission() {
    return queryResponseSubmission;
  }

  public void setQueryResponseSubmission(RelationshipQueryResponseSubmission queryResponseSubmission) {
    this.queryResponseSubmission = queryResponseSubmission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseRelationships queryResponseRelationships = (QueryResponseRelationships) o;
    return Objects.equals(this.query, queryResponseRelationships.query) &&
        Objects.equals(this.queryResponseAdmission, queryResponseRelationships.queryResponseAdmission) &&
        Objects.equals(this.queryResponseSubmission, queryResponseRelationships.queryResponseSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, queryResponseAdmission, queryResponseSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseRelationships {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryResponseAdmission: ").append(toIndentedString(queryResponseAdmission)).append("\n");
    sb.append("    queryResponseSubmission: ").append(toIndentedString(queryResponseSubmission)).append("\n");
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

