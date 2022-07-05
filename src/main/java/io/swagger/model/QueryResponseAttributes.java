package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QueryResponseAnswer;
import io.swagger.model.QueryResponseCharges;
import io.swagger.model.QueryResponseCompensation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryResponseAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryResponseAttributes   {
  @JsonProperty("answer")
  private QueryResponseAnswer answer = null;

  @JsonProperty("charges")
  private QueryResponseCharges charges = null;

  @JsonProperty("compensation")
  private QueryResponseCompensation compensation = null;

  @JsonProperty("compensation_amount")
  private String compensationAmount = null;

  @JsonProperty("currency")
  private String currency = null;

  public QueryResponseAttributes answer(QueryResponseAnswer answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public QueryResponseAnswer getAnswer() {
    return answer;
  }

  public void setAnswer(QueryResponseAnswer answer) {
    this.answer = answer;
  }

  public QueryResponseAttributes charges(QueryResponseCharges charges) {
    this.charges = charges;
    return this;
  }

  /**
   * Get charges
   * @return charges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryResponseCharges getCharges() {
    return charges;
  }

  public void setCharges(QueryResponseCharges charges) {
    this.charges = charges;
  }

  public QueryResponseAttributes compensation(QueryResponseCompensation compensation) {
    this.compensation = compensation;
    return this;
  }

  /**
   * Get compensation
   * @return compensation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryResponseCompensation getCompensation() {
    return compensation;
  }

  public void setCompensation(QueryResponseCompensation compensation) {
    this.compensation = compensation;
  }

  public QueryResponseAttributes compensationAmount(String compensationAmount) {
    this.compensationAmount = compensationAmount;
    return this;
  }

  /**
   * Get compensationAmount
   * @return compensationAmount
  **/
  @ApiModelProperty(value = "")


  public String getCompensationAmount() {
    return compensationAmount;
  }

  public void setCompensationAmount(String compensationAmount) {
    this.compensationAmount = compensationAmount;
  }

  public QueryResponseAttributes currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseAttributes queryResponseAttributes = (QueryResponseAttributes) o;
    return Objects.equals(this.answer, queryResponseAttributes.answer) &&
        Objects.equals(this.charges, queryResponseAttributes.charges) &&
        Objects.equals(this.compensation, queryResponseAttributes.compensation) &&
        Objects.equals(this.compensationAmount, queryResponseAttributes.compensationAmount) &&
        Objects.equals(this.currency, queryResponseAttributes.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, charges, compensation, compensationAmount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseAttributes {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    compensationAmount: ").append(toIndentedString(compensationAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

