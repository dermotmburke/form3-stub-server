package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class QueryAttributes   {
  @JsonProperty("auto_handled")
  private Boolean autoHandled = null;

  @JsonProperty("message_id")
  private String messageId = null;

  @JsonProperty("processing_date")
  private LocalDate processingDate = null;

  /**
   * Gets or Sets queryType
   */
  public enum QueryTypeEnum {
    CLAIM_NON_RECEIPT("claim_non_receipt"),
    
    MODIFY_PAYMENT("modify_payment"),
    
    STATUS_REQUEST("status_request");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QueryTypeEnum fromValue(String text) {
      for (QueryTypeEnum b : QueryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("query_type")
  private QueryTypeEnum queryType = null;

  @JsonProperty("scheme_transaction_id")
  private String schemeTransactionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    CLOSED("closed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("unstructured_message")
  private String unstructuredMessage = null;

  public QueryAttributes autoHandled(Boolean autoHandled) {
    this.autoHandled = autoHandled;
    return this;
  }

  /**
   * Get autoHandled
   * @return autoHandled
  **/
  @ApiModelProperty(value = "")


  public Boolean isAutoHandled() {
    return autoHandled;
  }

  public void setAutoHandled(Boolean autoHandled) {
    this.autoHandled = autoHandled;
  }

  public QueryAttributes messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(value = "")


  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public QueryAttributes processingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
    return this;
  }

  /**
   * Get processingDate
   * @return processingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getProcessingDate() {
    return processingDate;
  }

  public void setProcessingDate(LocalDate processingDate) {
    this.processingDate = processingDate;
  }

  public QueryAttributes queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }

  /**
   * Get queryType
   * @return queryType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public QueryTypeEnum getQueryType() {
    return queryType;
  }

  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }

  public QueryAttributes schemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
    return this;
  }

  /**
   * Get schemeTransactionId
   * @return schemeTransactionId
  **/
  @ApiModelProperty(value = "")


  public String getSchemeTransactionId() {
    return schemeTransactionId;
  }

  public void setSchemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
  }

  public QueryAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public QueryAttributes unstructuredMessage(String unstructuredMessage) {
    this.unstructuredMessage = unstructuredMessage;
    return this;
  }

  /**
   * Get unstructuredMessage
   * @return unstructuredMessage
  **/
  @ApiModelProperty(value = "")


  public String getUnstructuredMessage() {
    return unstructuredMessage;
  }

  public void setUnstructuredMessage(String unstructuredMessage) {
    this.unstructuredMessage = unstructuredMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAttributes queryAttributes = (QueryAttributes) o;
    return Objects.equals(this.autoHandled, queryAttributes.autoHandled) &&
        Objects.equals(this.messageId, queryAttributes.messageId) &&
        Objects.equals(this.processingDate, queryAttributes.processingDate) &&
        Objects.equals(this.queryType, queryAttributes.queryType) &&
        Objects.equals(this.schemeTransactionId, queryAttributes.schemeTransactionId) &&
        Objects.equals(this.status, queryAttributes.status) &&
        Objects.equals(this.unstructuredMessage, queryAttributes.unstructuredMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoHandled, messageId, processingDate, queryType, schemeTransactionId, status, unstructuredMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAttributes {\n");
    
    sb.append("    autoHandled: ").append(toIndentedString(autoHandled)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    processingDate: ").append(toIndentedString(processingDate)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    schemeTransactionId: ").append(toIndentedString(schemeTransactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unstructuredMessage: ").append(toIndentedString(unstructuredMessage)).append("\n");
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

