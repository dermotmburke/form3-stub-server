package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAttributesOrganisationIdentificationActor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAttributesOrganisationIdentificationActor   {
  @JsonProperty("birth_date")
  private LocalDate birthDate = null;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  @JsonProperty("residency")
  private String residency = null;

  @JsonProperty("role")
  private String role = null;

  public AccountAttributesOrganisationIdentificationActor birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-07-23", value = "")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public AccountAttributesOrganisationIdentificationActor name(List<String> name) {
    this.name = name;
    return this;
  }

  public AccountAttributesOrganisationIdentificationActor addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Actor names (for example title, first name, last name). Used for Confirmation of Payee matching.
   * @return name
  **/
  @ApiModelProperty(value = "Actor names (for example title, first name, last name). Used for Confirmation of Payee matching.")

@Size(max=4) 
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public AccountAttributesOrganisationIdentificationActor residency(String residency) {
    this.residency = residency;
    return this;
  }

  /**
   * ISO 3166-1 code used to identify the domicile of the actor
   * @return residency
  **/
  @ApiModelProperty(example = "GB", value = "ISO 3166-1 code used to identify the domicile of the actor")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getResidency() {
    return residency;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }

  public AccountAttributesOrganisationIdentificationActor role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAttributesOrganisationIdentificationActor accountAttributesOrganisationIdentificationActor = (AccountAttributesOrganisationIdentificationActor) o;
    return Objects.equals(this.birthDate, accountAttributesOrganisationIdentificationActor.birthDate) &&
        Objects.equals(this.name, accountAttributesOrganisationIdentificationActor.name) &&
        Objects.equals(this.residency, accountAttributesOrganisationIdentificationActor.residency) &&
        Objects.equals(this.role, accountAttributesOrganisationIdentificationActor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, name, residency, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAttributesOrganisationIdentificationActor {\n");
    
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    residency: ").append(toIndentedString(residency)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

