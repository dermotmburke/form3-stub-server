package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountEventAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountEventAttributes   {
  @JsonProperty("account_id")
  private UUID accountId = null;

  @JsonProperty("date_time")
  private OffsetDateTime dateTime = null;

  /**
   * Contains the event description
   */
  public enum DescriptionEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    CONFIRMED("confirmed");

    private String value;

    DescriptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DescriptionEnum fromValue(String text) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("description")
  private DescriptionEnum description = null;

  @JsonProperty("reason")
  private String reason = null;

  /**
   * Contains the routing status
   */
  public enum RoutingStatusEnum {
    UNROUTABLE("unroutable"),
    
    ROUTABLE("routable"),
    
    DELETED("deleted");

    private String value;

    RoutingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoutingStatusEnum fromValue(String text) {
      for (RoutingStatusEnum b : RoutingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("routing_status")
  private RoutingStatusEnum routingStatus = null;

  /**
   * Contains the event status
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    CONFIRMED("confirmed");

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

  public AccountEventAttributes accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account this event relates to
   * @return accountId
  **/
  @ApiModelProperty(example = "cfc09fb8-bbca-40bd-a518-6e58d8a9c7f4", required = true, value = "ID of the account this event relates to")
  @NotNull

  @Valid

  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public AccountEventAttributes dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public AccountEventAttributes description(DescriptionEnum description) {
    this.description = description;
    return this;
  }

  /**
   * Contains the event description
   * @return description
  **/
  @ApiModelProperty(example = "confirmed", value = "Contains the event description")


  public DescriptionEnum getDescription() {
    return description;
  }

  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }

  public AccountEventAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Failure reason. Should only be present when description is failed
   * @return reason
  **/
  @ApiModelProperty(example = "Invalid BIC", value = "Failure reason. Should only be present when description is failed")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AccountEventAttributes routingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }

  /**
   * Contains the routing status
   * @return routingStatus
  **/
  @ApiModelProperty(example = "routable", required = true, value = "Contains the routing status")
  @NotNull


  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }

  public void setRoutingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
  }

  public AccountEventAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Contains the event status
   * @return status
  **/
  @ApiModelProperty(example = "confirmed", required = true, value = "Contains the event status")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountEventAttributes accountEventAttributes = (AccountEventAttributes) o;
    return Objects.equals(this.accountId, accountEventAttributes.accountId) &&
        Objects.equals(this.dateTime, accountEventAttributes.dateTime) &&
        Objects.equals(this.description, accountEventAttributes.description) &&
        Objects.equals(this.reason, accountEventAttributes.reason) &&
        Objects.equals(this.routingStatus, accountEventAttributes.routingStatus) &&
        Objects.equals(this.status, accountEventAttributes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateTime, description, reason, routingStatus, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEventAttributes {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

