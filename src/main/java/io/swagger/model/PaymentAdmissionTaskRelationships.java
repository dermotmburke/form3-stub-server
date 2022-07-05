package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipPaymentAdmissionTask;
import io.swagger.model.RelationshipPaymentAdmissions;
import io.swagger.model.RelationshipPayments;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentAdmissionTaskRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class PaymentAdmissionTaskRelationships   {
  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  @JsonProperty("payment_admission")
  private RelationshipPaymentAdmissions paymentAdmission = null;

  @JsonProperty("payment_admission_task")
  private RelationshipPaymentAdmissionTask paymentAdmissionTask = null;

  public PaymentAdmissionTaskRelationships payment(RelationshipPayments payment) {
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

  public PaymentAdmissionTaskRelationships paymentAdmission(RelationshipPaymentAdmissions paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
    return this;
  }

  /**
   * Get paymentAdmission
   * @return paymentAdmission
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipPaymentAdmissions getPaymentAdmission() {
    return paymentAdmission;
  }

  public void setPaymentAdmission(RelationshipPaymentAdmissions paymentAdmission) {
    this.paymentAdmission = paymentAdmission;
  }

  public PaymentAdmissionTaskRelationships paymentAdmissionTask(RelationshipPaymentAdmissionTask paymentAdmissionTask) {
    this.paymentAdmissionTask = paymentAdmissionTask;
    return this;
  }

  /**
   * Get paymentAdmissionTask
   * @return paymentAdmissionTask
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipPaymentAdmissionTask getPaymentAdmissionTask() {
    return paymentAdmissionTask;
  }

  public void setPaymentAdmissionTask(RelationshipPaymentAdmissionTask paymentAdmissionTask) {
    this.paymentAdmissionTask = paymentAdmissionTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdmissionTaskRelationships paymentAdmissionTaskRelationships = (PaymentAdmissionTaskRelationships) o;
    return Objects.equals(this.payment, paymentAdmissionTaskRelationships.payment) &&
        Objects.equals(this.paymentAdmission, paymentAdmissionTaskRelationships.paymentAdmission) &&
        Objects.equals(this.paymentAdmissionTask, paymentAdmissionTaskRelationships.paymentAdmissionTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentAdmission, paymentAdmissionTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAdmissionTaskRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentAdmission: ").append(toIndentedString(paymentAdmission)).append("\n");
    sb.append("    paymentAdmissionTask: ").append(toIndentedString(paymentAdmissionTask)).append("\n");
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

