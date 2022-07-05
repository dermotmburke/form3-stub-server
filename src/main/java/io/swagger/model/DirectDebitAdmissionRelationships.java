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
 * DirectDebitAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitAdmissionRelationships   {
  @JsonProperty("direct_debit")
  private Object directDebit = null;

  public DirectDebitAdmissionRelationships directDebit(Object directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(Object directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitAdmissionRelationships directDebitAdmissionRelationships = (DirectDebitAdmissionRelationships) o;
    return Objects.equals(this.directDebit, directDebitAdmissionRelationships.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitAdmissionRelationships {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

