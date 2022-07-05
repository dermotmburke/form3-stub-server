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
 * SchemeMessageAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SchemeMessageAdmissionRelationships   {
  @JsonProperty("scheme_message")
  private Object schemeMessage = null;

  public SchemeMessageAdmissionRelationships schemeMessage(Object schemeMessage) {
    this.schemeMessage = schemeMessage;
    return this;
  }

  /**
   * Get schemeMessage
   * @return schemeMessage
  **/
  @ApiModelProperty(value = "")


  public Object getSchemeMessage() {
    return schemeMessage;
  }

  public void setSchemeMessage(Object schemeMessage) {
    this.schemeMessage = schemeMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemeMessageAdmissionRelationships schemeMessageAdmissionRelationships = (SchemeMessageAdmissionRelationships) o;
    return Objects.equals(this.schemeMessage, schemeMessageAdmissionRelationships.schemeMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemeMessageAdmissionRelationships {\n");
    
    sb.append("    schemeMessage: ").append(toIndentedString(schemeMessage)).append("\n");
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

