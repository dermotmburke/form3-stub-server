package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionUpdateAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SubscriptionUpdateAttributes   {
  /**
   * Gets or Sets callbackTransport
   */
  public enum CallbackTransportEnum {
    HTTP("http"),
    
    QUEUE("queue");

    private String value;

    CallbackTransportEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CallbackTransportEnum fromValue(String text) {
      for (CallbackTransportEnum b : CallbackTransportEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("callback_transport")
  private CallbackTransportEnum callbackTransport = null;

  @JsonProperty("callback_uri")
  private String callbackUri = null;

  @JsonProperty("deactivated")
  private Boolean deactivated = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("filter")
  private String filter = null;

  @JsonProperty("record_type")
  private String recordType = null;

  @JsonProperty("user_id")
  private UUID userId = null;

  public SubscriptionUpdateAttributes callbackTransport(CallbackTransportEnum callbackTransport) {
    this.callbackTransport = callbackTransport;
    return this;
  }

  /**
   * Get callbackTransport
   * @return callbackTransport
  **/
  @ApiModelProperty(value = "")


  public CallbackTransportEnum getCallbackTransport() {
    return callbackTransport;
  }

  public void setCallbackTransport(CallbackTransportEnum callbackTransport) {
    this.callbackTransport = callbackTransport;
  }

  public SubscriptionUpdateAttributes callbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  /**
   * Get callbackUri
   * @return callbackUri
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Za-z0-9 .,@:\\&\\?=/\\-_]*$") 
  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  public SubscriptionUpdateAttributes deactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  /**
   * Get deactivated
   * @return deactivated
  **/
  @ApiModelProperty(value = "")


  public Boolean isDeactivated() {
    return deactivated;
  }

  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  public SubscriptionUpdateAttributes eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Za-z_-]*$") 
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public SubscriptionUpdateAttributes filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")


  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public SubscriptionUpdateAttributes recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Za-z_-]*$") 
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public SubscriptionUpdateAttributes userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateAttributes subscriptionUpdateAttributes = (SubscriptionUpdateAttributes) o;
    return Objects.equals(this.callbackTransport, subscriptionUpdateAttributes.callbackTransport) &&
        Objects.equals(this.callbackUri, subscriptionUpdateAttributes.callbackUri) &&
        Objects.equals(this.deactivated, subscriptionUpdateAttributes.deactivated) &&
        Objects.equals(this.eventType, subscriptionUpdateAttributes.eventType) &&
        Objects.equals(this.filter, subscriptionUpdateAttributes.filter) &&
        Objects.equals(this.recordType, subscriptionUpdateAttributes.recordType) &&
        Objects.equals(this.userId, subscriptionUpdateAttributes.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackTransport, callbackUri, deactivated, eventType, filter, recordType, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateAttributes {\n");
    
    sb.append("    callbackTransport: ").append(toIndentedString(callbackTransport)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

