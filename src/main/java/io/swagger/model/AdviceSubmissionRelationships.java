package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipAdvices;
import io.swagger.model.RelationshipPayments;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdviceSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AdviceSubmissionRelationships   {
  @JsonProperty("advice")
  private RelationshipAdvices advice = null;

  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  public AdviceSubmissionRelationships advice(RelationshipAdvices advice) {
    this.advice = advice;
    return this;
  }

  /**
   * Get advice
   * @return advice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipAdvices getAdvice() {
    return advice;
  }

  public void setAdvice(RelationshipAdvices advice) {
    this.advice = advice;
  }

  public AdviceSubmissionRelationships payment(RelationshipPayments payment) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdviceSubmissionRelationships adviceSubmissionRelationships = (AdviceSubmissionRelationships) o;
    return Objects.equals(this.advice, adviceSubmissionRelationships.advice) &&
        Objects.equals(this.payment, adviceSubmissionRelationships.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advice, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdviceSubmissionRelationships {\n");
    
    sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

