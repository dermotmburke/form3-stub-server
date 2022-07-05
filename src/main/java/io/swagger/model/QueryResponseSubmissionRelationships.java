package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipsFullQuery;
import io.swagger.model.RelationshipsFullQueryResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseSubmissionRelationships   {
  @JsonProperty("query")
  private RelationshipsFullQuery query = null;

  @JsonProperty("query_response")
  private RelationshipsFullQueryResponse queryResponse = null;

  public QueryResponseSubmissionRelationships query(RelationshipsFullQuery query) {
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

  public QueryResponseSubmissionRelationships queryResponse(RelationshipsFullQueryResponse queryResponse) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseSubmissionRelationships queryResponseSubmissionRelationships = (QueryResponseSubmissionRelationships) o;
    return Objects.equals(this.query, queryResponseSubmissionRelationships.query) &&
        Objects.equals(this.queryResponse, queryResponseSubmissionRelationships.queryResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, queryResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseSubmissionRelationships {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryResponse: ").append(toIndentedString(queryResponse)).append("\n");
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

