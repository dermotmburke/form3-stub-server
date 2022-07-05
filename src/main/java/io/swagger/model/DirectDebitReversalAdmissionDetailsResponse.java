package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DirectDebitReversalAdmission;
import io.swagger.model.Links;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitReversalAdmissionDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitReversalAdmissionDetailsResponse   {
  @JsonProperty("data")
  private DirectDebitReversalAdmission data = null;

  @JsonProperty("links")
  private Links links = null;

  public DirectDebitReversalAdmissionDetailsResponse data(DirectDebitReversalAdmission data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DirectDebitReversalAdmission getData() {
    return data;
  }

  public void setData(DirectDebitReversalAdmission data) {
    this.data = data;
  }

  public DirectDebitReversalAdmissionDetailsResponse links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitReversalAdmissionDetailsResponse directDebitReversalAdmissionDetailsResponse = (DirectDebitReversalAdmissionDetailsResponse) o;
    return Objects.equals(this.data, directDebitReversalAdmissionDetailsResponse.data) &&
        Objects.equals(this.links, directDebitReversalAdmissionDetailsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitReversalAdmissionDetailsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

