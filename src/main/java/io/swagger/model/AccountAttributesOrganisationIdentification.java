package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountAttributesOrganisationIdentificationActor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAttributesOrganisationIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAttributesOrganisationIdentification   {
  @JsonProperty("actors")
  @Valid
  private List<AccountAttributesOrganisationIdentificationActor> actors = null;

  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("identification_issuer")
  private String identificationIssuer = null;

  @JsonProperty("identification_scheme")
  private String identificationScheme = null;

  @JsonProperty("identification_scheme_code")
  private String identificationSchemeCode = null;

  @JsonProperty("registration_number")
  private String registrationNumber = null;

  @JsonProperty("tax_residency")
  private String taxResidency = null;

  public AccountAttributesOrganisationIdentification actors(List<AccountAttributesOrganisationIdentificationActor> actors) {
    this.actors = actors;
    return this;
  }

  public AccountAttributesOrganisationIdentification addActorsItem(AccountAttributesOrganisationIdentificationActor actorsItem) {
    if (this.actors == null) {
      this.actors = new ArrayList<AccountAttributesOrganisationIdentificationActor>();
    }
    this.actors.add(actorsItem);
    return this;
  }

  /**
   * Get actors
   * @return actors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountAttributesOrganisationIdentificationActor> getActors() {
    return actors;
  }

  public void setActors(List<AccountAttributesOrganisationIdentificationActor> actors) {
    this.actors = actors;
  }

  public AccountAttributesOrganisationIdentification address(List<String> address) {
    this.address = address;
    return this;
  }

  public AccountAttributesOrganisationIdentification addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public AccountAttributesOrganisationIdentification city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountAttributesOrganisationIdentification country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "GB", value = "")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountAttributesOrganisationIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=140) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public AccountAttributesOrganisationIdentification identificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
    return this;
  }

  /**
   * Get identificationIssuer
   * @return identificationIssuer
  **/
  @ApiModelProperty(value = "")


  public String getIdentificationIssuer() {
    return identificationIssuer;
  }

  public void setIdentificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
  }

  public AccountAttributesOrganisationIdentification identificationScheme(String identificationScheme) {
    this.identificationScheme = identificationScheme;
    return this;
  }

  /**
   * Get identificationScheme
   * @return identificationScheme
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getIdentificationScheme() {
    return identificationScheme;
  }

  public void setIdentificationScheme(String identificationScheme) {
    this.identificationScheme = identificationScheme;
  }

  public AccountAttributesOrganisationIdentification identificationSchemeCode(String identificationSchemeCode) {
    this.identificationSchemeCode = identificationSchemeCode;
    return this;
  }

  /**
   * Get identificationSchemeCode
   * @return identificationSchemeCode
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getIdentificationSchemeCode() {
    return identificationSchemeCode;
  }

  public void setIdentificationSchemeCode(String identificationSchemeCode) {
    this.identificationSchemeCode = identificationSchemeCode;
  }

  public AccountAttributesOrganisationIdentification registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "")


  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public AccountAttributesOrganisationIdentification taxResidency(String taxResidency) {
    this.taxResidency = taxResidency;
    return this;
  }

  /**
   * ISO 3166-1 code used to identify the domicile of the account
   * @return taxResidency
  **/
  @ApiModelProperty(example = "GB", value = "ISO 3166-1 code used to identify the domicile of the account")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getTaxResidency() {
    return taxResidency;
  }

  public void setTaxResidency(String taxResidency) {
    this.taxResidency = taxResidency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAttributesOrganisationIdentification accountAttributesOrganisationIdentification = (AccountAttributesOrganisationIdentification) o;
    return Objects.equals(this.actors, accountAttributesOrganisationIdentification.actors) &&
        Objects.equals(this.address, accountAttributesOrganisationIdentification.address) &&
        Objects.equals(this.city, accountAttributesOrganisationIdentification.city) &&
        Objects.equals(this.country, accountAttributesOrganisationIdentification.country) &&
        Objects.equals(this.identification, accountAttributesOrganisationIdentification.identification) &&
        Objects.equals(this.identificationIssuer, accountAttributesOrganisationIdentification.identificationIssuer) &&
        Objects.equals(this.identificationScheme, accountAttributesOrganisationIdentification.identificationScheme) &&
        Objects.equals(this.identificationSchemeCode, accountAttributesOrganisationIdentification.identificationSchemeCode) &&
        Objects.equals(this.registrationNumber, accountAttributesOrganisationIdentification.registrationNumber) &&
        Objects.equals(this.taxResidency, accountAttributesOrganisationIdentification.taxResidency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actors, address, city, country, identification, identificationIssuer, identificationScheme, identificationSchemeCode, registrationNumber, taxResidency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAttributesOrganisationIdentification {\n");
    
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    identificationIssuer: ").append(toIndentedString(identificationIssuer)).append("\n");
    sb.append("    identificationScheme: ").append(toIndentedString(identificationScheme)).append("\n");
    sb.append("    identificationSchemeCode: ").append(toIndentedString(identificationSchemeCode)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    taxResidency: ").append(toIndentedString(taxResidency)).append("\n");
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

