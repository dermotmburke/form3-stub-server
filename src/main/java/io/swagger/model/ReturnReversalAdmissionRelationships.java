package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipPayments;
import io.swagger.model.RelationshipReturnReversals;
import io.swagger.model.RelationshipReturns;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReturnReversalAdmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReturnReversalAdmissionRelationships   {
  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  @JsonProperty("payment_return")
  private RelationshipReturns paymentReturn = null;

  @JsonProperty("payment_return_reversal")
  private RelationshipReturnReversals paymentReturnReversal = null;

  public ReturnReversalAdmissionRelationships payment(RelationshipPayments payment) {
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

  public ReturnReversalAdmissionRelationships paymentReturn(RelationshipReturns paymentReturn) {
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

  public ReturnReversalAdmissionRelationships paymentReturnReversal(RelationshipReturnReversals paymentReturnReversal) {
    this.paymentReturnReversal = paymentReturnReversal;
    return this;
  }

  /**
   * Get paymentReturnReversal
   * @return paymentReturnReversal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipReturnReversals getPaymentReturnReversal() {
    return paymentReturnReversal;
  }

  public void setPaymentReturnReversal(RelationshipReturnReversals paymentReturnReversal) {
    this.paymentReturnReversal = paymentReturnReversal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnReversalAdmissionRelationships returnReversalAdmissionRelationships = (ReturnReversalAdmissionRelationships) o;
    return Objects.equals(this.payment, returnReversalAdmissionRelationships.payment) &&
        Objects.equals(this.paymentReturn, returnReversalAdmissionRelationships.paymentReturn) &&
        Objects.equals(this.paymentReturnReversal, returnReversalAdmissionRelationships.paymentReturnReversal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentReturn, paymentReturnReversal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnReversalAdmissionRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentReturn: ").append(toIndentedString(paymentReturn)).append("\n");
    sb.append("    paymentReturnReversal: ").append(toIndentedString(paymentReturnReversal)).append("\n");
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

