package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DirectDebit;
import io.swagger.model.DirectDebitReturn;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitWithReturn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitWithReturn   {
  @JsonProperty("direct_debit")
  private DirectDebit directDebit = null;

  @JsonProperty("direct_debit_return")
  private DirectDebitReturn directDebitReturn = null;

  public DirectDebitWithReturn directDebit(DirectDebit directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DirectDebit getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(DirectDebit directDebit) {
    this.directDebit = directDebit;
  }

  public DirectDebitWithReturn directDebitReturn(DirectDebitReturn directDebitReturn) {
    this.directDebitReturn = directDebitReturn;
    return this;
  }

  /**
   * Get directDebitReturn
   * @return directDebitReturn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DirectDebitReturn getDirectDebitReturn() {
    return directDebitReturn;
  }

  public void setDirectDebitReturn(DirectDebitReturn directDebitReturn) {
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
    DirectDebitWithReturn directDebitWithReturn = (DirectDebitWithReturn) o;
    return Objects.equals(this.directDebit, directDebitWithReturn.directDebit) &&
        Objects.equals(this.directDebitReturn, directDebitWithReturn.directDebitReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit, directDebitReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitWithReturn {\n");
    
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

