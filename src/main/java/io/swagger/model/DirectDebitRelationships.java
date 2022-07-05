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
 * DirectDebitRelationships
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class DirectDebitRelationships   {
  @JsonProperty("direct_debit_admission")
  private Object directDebitAdmission = null;

  @JsonProperty("direct_debit_decision")
  private Object directDebitDecision = null;

  @JsonProperty("direct_debit_recall")
  private Object directDebitRecall = null;

  @JsonProperty("direct_debit_return")
  private Object directDebitReturn = null;

  @JsonProperty("direct_debit_reversal")
  private Object directDebitReversal = null;

  @JsonProperty("direct_debit_submission")
  private Object directDebitSubmission = null;

  @JsonProperty("mandate")
  private Object mandate = null;

  public DirectDebitRelationships directDebitAdmission(Object directDebitAdmission) {
    this.directDebitAdmission = directDebitAdmission;
    return this;
  }

  /**
   * Get directDebitAdmission
   * @return directDebitAdmission
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebitAdmission() {
    return directDebitAdmission;
  }

  public void setDirectDebitAdmission(Object directDebitAdmission) {
    this.directDebitAdmission = directDebitAdmission;
  }

  public DirectDebitRelationships directDebitDecision(Object directDebitDecision) {
    this.directDebitDecision = directDebitDecision;
    return this;
  }

  /**
   * Get directDebitDecision
   * @return directDebitDecision
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebitDecision() {
    return directDebitDecision;
  }

  public void setDirectDebitDecision(Object directDebitDecision) {
    this.directDebitDecision = directDebitDecision;
  }

  public DirectDebitRelationships directDebitRecall(Object directDebitRecall) {
    this.directDebitRecall = directDebitRecall;
    return this;
  }

  /**
   * Get directDebitRecall
   * @return directDebitRecall
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebitRecall() {
    return directDebitRecall;
  }

  public void setDirectDebitRecall(Object directDebitRecall) {
    this.directDebitRecall = directDebitRecall;
  }

  public DirectDebitRelationships directDebitReturn(Object directDebitReturn) {
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

  public DirectDebitRelationships directDebitReversal(Object directDebitReversal) {
    this.directDebitReversal = directDebitReversal;
    return this;
  }

  /**
   * Get directDebitReversal
   * @return directDebitReversal
  **/
  @ApiModelProperty(value = "")


  public Object getDirectDebitReversal() {
    return directDebitReversal;
  }

  public void setDirectDebitReversal(Object directDebitReversal) {
    this.directDebitReversal = directDebitReversal;
  }

  public DirectDebitRelationships directDebitSubmission(Object directDebitSubmission) {
    this.directDebitSubmission = directDebitSubmission;
    return this;
  }

  /**
   * The submission resource related to the direct debit
   * @return directDebitSubmission
  **/
  @ApiModelProperty(value = "The submission resource related to the direct debit")


  public Object getDirectDebitSubmission() {
    return directDebitSubmission;
  }

  public void setDirectDebitSubmission(Object directDebitSubmission) {
    this.directDebitSubmission = directDebitSubmission;
  }

  public DirectDebitRelationships mandate(Object mandate) {
    this.mandate = mandate;
    return this;
  }

  /**
   * Get mandate
   * @return mandate
  **/
  @ApiModelProperty(value = "")


  public Object getMandate() {
    return mandate;
  }

  public void setMandate(Object mandate) {
    this.mandate = mandate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitRelationships directDebitRelationships = (DirectDebitRelationships) o;
    return Objects.equals(this.directDebitAdmission, directDebitRelationships.directDebitAdmission) &&
        Objects.equals(this.directDebitDecision, directDebitRelationships.directDebitDecision) &&
        Objects.equals(this.directDebitRecall, directDebitRelationships.directDebitRecall) &&
        Objects.equals(this.directDebitReturn, directDebitRelationships.directDebitReturn) &&
        Objects.equals(this.directDebitReversal, directDebitRelationships.directDebitReversal) &&
        Objects.equals(this.directDebitSubmission, directDebitRelationships.directDebitSubmission) &&
        Objects.equals(this.mandate, directDebitRelationships.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitAdmission, directDebitDecision, directDebitRecall, directDebitReturn, directDebitReversal, directDebitSubmission, mandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitRelationships {\n");
    
    sb.append("    directDebitAdmission: ").append(toIndentedString(directDebitAdmission)).append("\n");
    sb.append("    directDebitDecision: ").append(toIndentedString(directDebitDecision)).append("\n");
    sb.append("    directDebitRecall: ").append(toIndentedString(directDebitRecall)).append("\n");
    sb.append("    directDebitReturn: ").append(toIndentedString(directDebitReturn)).append("\n");
    sb.append("    directDebitReversal: ").append(toIndentedString(directDebitReversal)).append("\n");
    sb.append("    directDebitSubmission: ").append(toIndentedString(directDebitSubmission)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

