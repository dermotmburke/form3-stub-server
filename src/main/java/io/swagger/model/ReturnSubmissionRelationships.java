package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipLinks;
import io.swagger.model.RelationshipPayments;
import io.swagger.model.RelationshipReturns;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReturnSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReturnSubmissionRelationships   {
  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  @JsonProperty("payment_return")
  private RelationshipReturns paymentReturn = null;

  @JsonProperty("validations")
  private RelationshipLinks validations = null;

  public ReturnSubmissionRelationships payment(RelationshipPayments payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipPayments getPayment() {
    return payment;
  }

  public void setPayment(RelationshipPayments payment) {
    this.payment = payment;
  }

  public ReturnSubmissionRelationships paymentReturn(RelationshipReturns paymentReturn) {
    this.paymentReturn = paymentReturn;
    return this;
  }

  /**
   * Get paymentReturn
   * @return paymentReturn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipReturns getPaymentReturn() {
    return paymentReturn;
  }

  public void setPaymentReturn(RelationshipReturns paymentReturn) {
    this.paymentReturn = paymentReturn;
  }

  public ReturnSubmissionRelationships validations(RelationshipLinks validations) {
    this.validations = validations;
    return this;
  }

  /**
   * Get validations
   * @return validations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipLinks getValidations() {
    return validations;
  }

  public void setValidations(RelationshipLinks validations) {
    this.validations = validations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnSubmissionRelationships returnSubmissionRelationships = (ReturnSubmissionRelationships) o;
    return Objects.equals(this.payment, returnSubmissionRelationships.payment) &&
        Objects.equals(this.paymentReturn, returnSubmissionRelationships.paymentReturn) &&
        Objects.equals(this.validations, returnSubmissionRelationships.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentReturn, validations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnSubmissionRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentReturn: ").append(toIndentedString(paymentReturn)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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

