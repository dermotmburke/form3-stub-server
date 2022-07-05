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
 * RecallReversalAdmissionAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class RecallReversalAdmissionAttributes   {
  @JsonProperty("scheme_status_code")
  private String schemeStatusCode = null;

  @JsonProperty("source_gateway")
  private String sourceGateway = null;

  public RecallReversalAdmissionAttributes schemeStatusCode(String schemeStatusCode) {
    this.schemeStatusCode = schemeStatusCode;
    return this;
  }

  /**
   * Scheme-specific status code
   * @return schemeStatusCode
  **/
  @ApiModelProperty(example = "0", value = "Scheme-specific status code")


  public String getSchemeStatusCode() {
    return schemeStatusCode;
  }

  public void setSchemeStatusCode(String schemeStatusCode) {
    this.schemeStatusCode = schemeStatusCode;
  }

  public RecallReversalAdmissionAttributes sourceGateway(String sourceGateway) {
    this.sourceGateway = sourceGateway;
    return this;
  }

  /**
   * Get sourceGateway
   * @return sourceGateway
  **/
  @ApiModelProperty(value = "")


  public String getSourceGateway() {
    return sourceGateway;
  }

  public void setSourceGateway(String sourceGateway) {
    this.sourceGateway = sourceGateway;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecallReversalAdmissionAttributes recallReversalAdmissionAttributes = (RecallReversalAdmissionAttributes) o;
    return Objects.equals(this.schemeStatusCode, recallReversalAdmissionAttributes.schemeStatusCode) &&
        Objects.equals(this.sourceGateway, recallReversalAdmissionAttributes.sourceGateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeStatusCode, sourceGateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecallReversalAdmissionAttributes {\n");
    
    sb.append("    schemeStatusCode: ").append(toIndentedString(schemeStatusCode)).append("\n");
    sb.append("    sourceGateway: ").append(toIndentedString(sourceGateway)).append("\n");
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

