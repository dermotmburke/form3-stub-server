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
 * MandateRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class MandateRelationships   {
  @JsonProperty("mandate_admission")
  private Object mandateAdmission = null;

  @JsonProperty("mandate_return")
  private Object mandateReturn = null;

  @JsonProperty("mandate_submission")
  private Object mandateSubmission = null;

  @JsonProperty("most_recent_collection")
  private Object mostRecentCollection = null;

  public MandateRelationships mandateAdmission(Object mandateAdmission) {
    this.mandateAdmission = mandateAdmission;
    return this;
  }

  /**
   * Get mandateAdmission
   * @return mandateAdmission
  **/
  @ApiModelProperty(value = "")


  public Object getMandateAdmission() {
    return mandateAdmission;
  }

  public void setMandateAdmission(Object mandateAdmission) {
    this.mandateAdmission = mandateAdmission;
  }

  public MandateRelationships mandateReturn(Object mandateReturn) {
    this.mandateReturn = mandateReturn;
    return this;
  }

  /**
   * Get mandateReturn
   * @return mandateReturn
  **/
  @ApiModelProperty(value = "")


  public Object getMandateReturn() {
    return mandateReturn;
  }

  public void setMandateReturn(Object mandateReturn) {
    this.mandateReturn = mandateReturn;
  }

  public MandateRelationships mandateSubmission(Object mandateSubmission) {
    this.mandateSubmission = mandateSubmission;
    return this;
  }

  /**
   * Get mandateSubmission
   * @return mandateSubmission
  **/
  @ApiModelProperty(value = "")


  public Object getMandateSubmission() {
    return mandateSubmission;
  }

  public void setMandateSubmission(Object mandateSubmission) {
    this.mandateSubmission = mandateSubmission;
  }

  public MandateRelationships mostRecentCollection(Object mostRecentCollection) {
    this.mostRecentCollection = mostRecentCollection;
    return this;
  }

  /**
   * Get mostRecentCollection
   * @return mostRecentCollection
  **/
  @ApiModelProperty(value = "")


  public Object getMostRecentCollection() {
    return mostRecentCollection;
  }

  public void setMostRecentCollection(Object mostRecentCollection) {
    this.mostRecentCollection = mostRecentCollection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateRelationships mandateRelationships = (MandateRelationships) o;
    return Objects.equals(this.mandateAdmission, mandateRelationships.mandateAdmission) &&
        Objects.equals(this.mandateReturn, mandateRelationships.mandateReturn) &&
        Objects.equals(this.mandateSubmission, mandateRelationships.mandateSubmission) &&
        Objects.equals(this.mostRecentCollection, mandateRelationships.mostRecentCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateAdmission, mandateReturn, mandateSubmission, mostRecentCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateRelationships {\n");
    
    sb.append("    mandateAdmission: ").append(toIndentedString(mandateAdmission)).append("\n");
    sb.append("    mandateReturn: ").append(toIndentedString(mandateReturn)).append("\n");
    sb.append("    mandateSubmission: ").append(toIndentedString(mandateSubmission)).append("\n");
    sb.append("    mostRecentCollection: ").append(toIndentedString(mostRecentCollection)).append("\n");
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

