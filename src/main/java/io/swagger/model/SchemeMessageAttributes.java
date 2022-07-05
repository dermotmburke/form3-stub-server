package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentScheme;
import io.swagger.model.SchemeMessageEntryItem;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SchemeMessageAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SchemeMessageAttributes   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("entries")
  @Valid
  private List<SchemeMessageEntryItem> entries = new ArrayList<SchemeMessageEntryItem>();

  @JsonProperty("payment_scheme")
  private PaymentScheme paymentScheme = null;

  @JsonProperty("scheme_message_type")
  private String schemeMessageType = null;

  @JsonProperty("unique_scheme_id")
  private String uniqueSchemeId = null;

  public SchemeMessageAttributes date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public SchemeMessageAttributes entries(List<SchemeMessageEntryItem> entries) {
    this.entries = entries;
    return this;
  }

  public SchemeMessageAttributes addEntriesItem(SchemeMessageEntryItem entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<SchemeMessageEntryItem> getEntries() {
    return entries;
  }

  public void setEntries(List<SchemeMessageEntryItem> entries) {
    this.entries = entries;
  }

  public SchemeMessageAttributes paymentScheme(PaymentScheme paymentScheme) {
    this.paymentScheme = paymentScheme;
    return this;
  }

  /**
   * Get paymentScheme
   * @return paymentScheme
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentScheme getPaymentScheme() {
    return paymentScheme;
  }

  public void setPaymentScheme(PaymentScheme paymentScheme) {
    this.paymentScheme = paymentScheme;
  }

  public SchemeMessageAttributes schemeMessageType(String schemeMessageType) {
    this.schemeMessageType = schemeMessageType;
    return this;
  }

  /**
   * Get schemeMessageType
   * @return schemeMessageType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSchemeMessageType() {
    return schemeMessageType;
  }

  public void setSchemeMessageType(String schemeMessageType) {
    this.schemeMessageType = schemeMessageType;
  }

  public SchemeMessageAttributes uniqueSchemeId(String uniqueSchemeId) {
    this.uniqueSchemeId = uniqueSchemeId;
    return this;
  }

  /**
   * Get uniqueSchemeId
   * @return uniqueSchemeId
  **/
  @ApiModelProperty(value = "")


  public String getUniqueSchemeId() {
    return uniqueSchemeId;
  }

  public void setUniqueSchemeId(String uniqueSchemeId) {
    this.uniqueSchemeId = uniqueSchemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemeMessageAttributes schemeMessageAttributes = (SchemeMessageAttributes) o;
    return Objects.equals(this.date, schemeMessageAttributes.date) &&
        Objects.equals(this.entries, schemeMessageAttributes.entries) &&
        Objects.equals(this.paymentScheme, schemeMessageAttributes.paymentScheme) &&
        Objects.equals(this.schemeMessageType, schemeMessageAttributes.schemeMessageType) &&
        Objects.equals(this.uniqueSchemeId, schemeMessageAttributes.uniqueSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, entries, paymentScheme, schemeMessageType, uniqueSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemeMessageAttributes {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    paymentScheme: ").append(toIndentedString(paymentScheme)).append("\n");
    sb.append("    schemeMessageType: ").append(toIndentedString(schemeMessageType)).append("\n");
    sb.append("    uniqueSchemeId: ").append(toIndentedString(uniqueSchemeId)).append("\n");
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

