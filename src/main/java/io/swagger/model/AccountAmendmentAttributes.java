package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrganisationIdentification;
import io.swagger.model.PrivateIdentification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAmendmentAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAmendmentAttributes   {
  @JsonProperty("modify_reason")
  private String modifyReason = null;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("organisation_identification")
  private OrganisationIdentification organisationIdentification = null;

  @JsonProperty("private_identification")
  private PrivateIdentification privateIdentification = null;

  public AccountAmendmentAttributes modifyReason(String modifyReason) {
    this.modifyReason = modifyReason;
    return this;
  }

  /**
   * Reason for modification.
   * @return modifyReason
  **/
  @ApiModelProperty(example = "Customer changed address.", value = "Reason for modification.")

@Size(min=1) 
  public String getModifyReason() {
    return modifyReason;
  }

  public void setModifyReason(String modifyReason) {
    this.modifyReason = modifyReason;
  }

  public AccountAmendmentAttributes name(List<String> name) {
    this.name = name;
    return this;
  }

  public AccountAmendmentAttributes addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Name of the account holder, up to four lines possible.
   * @return name
  **/
  @ApiModelProperty(example = "[\"Mr\",\"John\",\"Doe\"]", value = "Name of the account holder, up to four lines possible.")

@Size(max=4) 
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public AccountAmendmentAttributes organisationIdentification(OrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
    return this;
  }

  /**
   * Get organisationIdentification
   * @return organisationIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrganisationIdentification getOrganisationIdentification() {
    return organisationIdentification;
  }

  public void setOrganisationIdentification(OrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
  }

  public AccountAmendmentAttributes privateIdentification(PrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
    return this;
  }

  /**
   * Get privateIdentification
   * @return privateIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivateIdentification getPrivateIdentification() {
    return privateIdentification;
  }

  public void setPrivateIdentification(PrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAmendmentAttributes accountAmendmentAttributes = (AccountAmendmentAttributes) o;
    return Objects.equals(this.modifyReason, accountAmendmentAttributes.modifyReason) &&
        Objects.equals(this.name, accountAmendmentAttributes.name) &&
        Objects.equals(this.organisationIdentification, accountAmendmentAttributes.organisationIdentification) &&
        Objects.equals(this.privateIdentification, accountAmendmentAttributes.privateIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyReason, name, organisationIdentification, privateIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAmendmentAttributes {\n");
    
    sb.append("    modifyReason: ").append(toIndentedString(modifyReason)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organisationIdentification: ").append(toIndentedString(organisationIdentification)).append("\n");
    sb.append("    privateIdentification: ").append(toIndentedString(privateIdentification)).append("\n");
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

