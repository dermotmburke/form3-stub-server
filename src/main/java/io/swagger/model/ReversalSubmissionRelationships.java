package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelationshipLinks;
import io.swagger.model.RelationshipPayments;
import io.swagger.model.RelationshipReversals;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReversalSubmissionRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ReversalSubmissionRelationships   {
  @JsonProperty("payment")
  private RelationshipPayments payment = null;

  @JsonProperty("reversal")
  private RelationshipReversals reversal = null;

  @JsonProperty("validations")
  private RelationshipLinks validations = null;

  public ReversalSubmissionRelationships payment(RelationshipPayments payment) {
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

  public ReversalSubmissionRelationships reversal(RelationshipReversals reversal) {
    this.reversal = reversal;
    return this;
  }

  /**
   * Get reversal
   * @return reversal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelationshipReversals getReversal() {
    return reversal;
  }

  public void setReversal(RelationshipReversals reversal) {
    this.reversal = reversal;
  }

  public ReversalSubmissionRelationships validations(RelationshipLinks validations) {
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
    ReversalSubmissionRelationships reversalSubmissionRelationships = (ReversalSubmissionRelationships) o;
    return Objects.equals(this.payment, reversalSubmissionRelationships.payment) &&
        Objects.equals(this.reversal, reversalSubmissionRelationships.reversal) &&
        Objects.equals(this.validations, reversalSubmissionRelationships.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, reversal, validations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReversalSubmissionRelationships {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
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

