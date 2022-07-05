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
 * DirectDebitReturnAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitReturnAdmissionRelationships   {
  @JsonProperty("direct_debit")
  private Object directDebit = null;

  @JsonProperty("direct_debit_return")
  private Object directDebitReturn = null;

  public DirectDebitReturnAdmissionRelationships directDebit(Object directDebit) {
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

  public DirectDebitReturnAdmissionRelationships directDebitReturn(Object directDebitReturn) {
    this.directDebitReturn = directDebitReturn;
    return this;
  }

  /**
   * Get directDebitReturn
   * @return directDebitReturn
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebitReturn() {
    return directDebitReturn;
  }

  public void setDirectDebitReturn(Object directDebitReturn) {
    this.directDebitReturn = directDebitReturn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitReturnAdmissionRelationships directDebitReturnAdmissionRelationships = (DirectDebitReturnAdmissionRelationships) o;
    return Objects.equals(this.directDebit, directDebitReturnAdmissionRelationships.directDebit) &&
        Objects.equals(this.directDebitReturn, directDebitReturnAdmissionRelationships.directDebitReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit, directDebitReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitReturnAdmissionRelationships {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
    sb.append("    directDebitReturn: ").append(toIndentedString(directDebitReturn)).append("\n");
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

