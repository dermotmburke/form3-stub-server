package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DirectDebitRecallAdmission;
import io.swagger.model.Links;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitRecallAdmissionDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitRecallAdmissionDetailsResponse   {
  @JsonProperty("data")
  private DirectDebitRecallAdmission data = null;

  @JsonProperty("links")
  private Links links = null;

  public DirectDebitRecallAdmissionDetailsResponse data(DirectDebitRecallAdmission data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DirectDebitRecallAdmission getData() {
    return data;
  }

  public void setData(DirectDebitRecallAdmission data) {
    this.data = data;
  }

  public DirectDebitRecallAdmissionDetailsResponse links(Links links) {
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
    DirectDebitRecallAdmissionDetailsResponse directDebitRecallAdmissionDetailsResponse = (DirectDebitRecallAdmissionDetailsResponse) o;
    return Objects.equals(this.data, directDebitRecallAdmissionDetailsResponse.data) &&
        Objects.equals(this.links, directDebitRecallAdmissionDetailsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitRecallAdmissionDetailsResponse {\n");
    
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

