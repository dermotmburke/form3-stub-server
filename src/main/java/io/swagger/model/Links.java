package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Links
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Links   {
  @JsonProperty("first")
  private String first = null;

  @JsonProperty("last")
  private String last = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("prev")
  private String prev = null;

  @JsonProperty("self")
  private String self = null;

  public Links first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Link to the first resource in the list
   * @return first
  **/
  @ApiModelProperty(example = "https://api.test.form3.tech/v1/api_name/resource_type", value = "Link to the first resource in the list")


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Links last(String last) {
    this.last = last;
    return this;
  }

  /**
   * Link to the last resource in the list
   * @return last
  **/
  @ApiModelProperty(example = "https://api.test.form3.tech/v1/api_name/resource_type", value = "Link to the last resource in the list")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public Links next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to the next resource in the list
   * @return next
  **/
  @ApiModelProperty(example = "https://api.test.form3.tech/v1/api_name/resource_type", value = "Link to the next resource in the list")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public Links prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Link to the previous resource in the list
   * @return prev
  **/
  @ApiModelProperty(example = "https://api.test.form3.tech/v1/api_name/resource_type", value = "Link to the previous resource in the list")


  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public Links self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to this resource type
   * @return self
  **/
  @ApiModelProperty(example = "https://api.test.form3.tech/v1/api_name/resource_type", required = true, value = "Link to this resource type")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.first, links.first) &&
        Objects.equals(this.last, links.last) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.self, links.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, prev, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

