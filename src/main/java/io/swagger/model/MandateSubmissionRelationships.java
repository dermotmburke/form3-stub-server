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
 * MandateSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class MandateSubmissionRelationships   {
  @JsonProperty("mandate")
  private Object mandate = null;

  public MandateSubmissionRelationships mandate(Object mandate) {
    this.mandate = mandate;
    return this;
  }

  /**
   * Get mandate
   * @return mandate
  **/
  @ApiModelProperty(value = "")


  public Object getMandate() {
    return mandate;
  }

  public void setMandate(Object mandate) {
    this.mandate = mandate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateSubmissionRelationships mandateSubmissionRelationships = (MandateSubmissionRelationships) o;
    return Objects.equals(this.mandate, mandateSubmissionRelationships.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateSubmissionRelationships {\n");
    
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

