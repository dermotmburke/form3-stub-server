package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChargesInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class ChargesInformation   {
  @JsonProperty("bearer_code")
  private String bearerCode = null;

  @JsonProperty("receiver_charges_amount")
  private String receiverChargesAmount = null;

  @JsonProperty("receiver_charges_currency")
  private String receiverChargesCurrency = null;

  @JsonProperty("sender_charges")
  @Valid
  private List<Object> senderCharges = null;

  public ChargesInformation bearerCode(String bearerCode) {
    this.bearerCode = bearerCode;
    return this;
  }

  /**
   * Specifies which party/parties will bear the charges associated with the processing of the payment transaction. Can be one of the following: `DEBT`, `CRED`, `SHAR` or `SLEV`
   * @return bearerCode
  **/
  @ApiModelProperty(example = "SLEV", value = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction. Can be one of the following: `DEBT`, `CRED`, `SHAR` or `SLEV`")


  public String getBearerCode() {
    return bearerCode;
  }

  public void setBearerCode(String bearerCode) {
    this.bearerCode = bearerCode;
  }

  public ChargesInformation receiverChargesAmount(String receiverChargesAmount) {
    this.receiverChargesAmount = receiverChargesAmount;
    return this;
  }

  /**
   * Transaction charges due to the receiver of the transaction. Requires 1 to 2 decimal places. Must be > 0.
   * @return receiverChargesAmount
  **/
  @ApiModelProperty(example = "1.20", value = "Transaction charges due to the receiver of the transaction. Requires 1 to 2 decimal places. Must be > 0.")


  public String getReceiverChargesAmount() {
    return receiverChargesAmount;
  }

  public void setReceiverChargesAmount(String receiverChargesAmount) {
    this.receiverChargesAmount = receiverChargesAmount;
  }

  public ChargesInformation receiverChargesCurrency(String receiverChargesCurrency) {
    this.receiverChargesCurrency = receiverChargesCurrency;
    return this;
  }

  /**
   * Currency of `receiver_charges_amount`. Currency code as defined in [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm).
   * @return receiverChargesCurrency
  **/
  @ApiModelProperty(example = "EUR", value = "Currency of `receiver_charges_amount`. Currency code as defined in [ISO 4217](http://www.iso.org/iso/home/standards/currency_codes.htm).")


  public String getReceiverChargesCurrency() {
    return receiverChargesCurrency;
  }

  public void setReceiverChargesCurrency(String receiverChargesCurrency) {
    this.receiverChargesCurrency = receiverChargesCurrency;
  }

  public ChargesInformation senderCharges(List<Object> senderCharges) {
    this.senderCharges = senderCharges;
    return this;
  }

  public ChargesInformation addSenderChargesItem(Object senderChargesItem) {
    if (this.senderCharges == null) {
      this.senderCharges = new ArrayList<Object>();
    }
    this.senderCharges.add(senderChargesItem);
    return this;
  }

  /**
   * Get senderCharges
   * @return senderCharges
  **/
  @ApiModelProperty(value = "")


  public List<Object> getSenderCharges() {
    return senderCharges;
  }

  public void setSenderCharges(List<Object> senderCharges) {
    this.senderCharges = senderCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesInformation chargesInformation = (ChargesInformation) o;
    return Objects.equals(this.bearerCode, chargesInformation.bearerCode) &&
        Objects.equals(this.receiverChargesAmount, chargesInformation.receiverChargesAmount) &&
        Objects.equals(this.receiverChargesCurrency, chargesInformation.receiverChargesCurrency) &&
        Objects.equals(this.senderCharges, chargesInformation.senderCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerCode, receiverChargesAmount, receiverChargesCurrency, senderCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesInformation {\n");
    
    sb.append("    bearerCode: ").append(toIndentedString(bearerCode)).append("\n");
    sb.append("    receiverChargesAmount: ").append(toIndentedString(receiverChargesAmount)).append("\n");
    sb.append("    receiverChargesCurrency: ").append(toIndentedString(receiverChargesCurrency)).append("\n");
    sb.append("    senderCharges: ").append(toIndentedString(senderCharges)).append("\n");
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

