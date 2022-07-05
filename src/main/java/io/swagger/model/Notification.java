package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Notification   {
  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("data_record_type")
  private String dataRecordType = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("organisation_id")
  private UUID organisationId = null;

  @JsonProperty("record_type")
  private String recordType = null;

  @JsonProperty("version")
  private Integer version = null;

  public Notification data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * The full resource itself (as you would see from a GET request)
   * @return data
  **/
  @ApiModelProperty(value = "The full resource itself (as you would see from a GET request)")


  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Notification dataRecordType(String dataRecordType) {
    this.dataRecordType = dataRecordType;
    return this;
  }

  /**
   * Internal representation of the record type. Field values are subject to frequent change, evaluation of this field is discouraged.
   * @return dataRecordType
  **/
  @ApiModelProperty(example = "PaymentAdmission", value = "Internal representation of the record type. Field values are subject to frequent change, evaluation of this field is discouraged.")

@Pattern(regexp="^[A-Za-z]*$") 
  public String getDataRecordType() {
    return dataRecordType;
  }

  public void setDataRecordType(String dataRecordType) {
    this.dataRecordType = dataRecordType;
  }

  public Notification eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of event
   * @return eventType
  **/
  @ApiModelProperty(example = "created", value = "The type of event")

@Pattern(regexp="^[a-z]*$") 
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Notification id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique resource ID
   * @return id
  **/
  @ApiModelProperty(example = "e1fa2883-940a-44d5-88af-e1a62123c67a", value = "Unique resource ID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Notification organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * Unique ID of the organisation this resource is created by
   * @return organisationId
  **/
  @ApiModelProperty(example = "ee2fb143-6dfe-4787-b183-ca8ddd4164d2", value = "Unique ID of the organisation this resource is created by")

  @Valid

  public UUID getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  public Notification recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * The type of resource contained in `data`
   * @return recordType
  **/
  @ApiModelProperty(example = "payment_admissions", value = "The type of resource contained in `data`")

@Pattern(regexp="^[A-Za-z]*$") 
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public Notification version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version number
   * minimum: 0
   * @return version
  **/
  @ApiModelProperty(example = "0", value = "Version number")

@Min(0)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.data, notification.data) &&
        Objects.equals(this.dataRecordType, notification.dataRecordType) &&
        Objects.equals(this.eventType, notification.eventType) &&
        Objects.equals(this.id, notification.id) &&
        Objects.equals(this.organisationId, notification.organisationId) &&
        Objects.equals(this.recordType, notification.recordType) &&
        Objects.equals(this.version, notification.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, dataRecordType, eventType, id, organisationId, recordType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataRecordType: ").append(toIndentedString(dataRecordType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

