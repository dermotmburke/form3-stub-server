package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrganisationIdentificationActor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrganisationIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class OrganisationIdentification   {
  @JsonProperty("actors")
  @Valid
  private List<OrganisationIdentificationActor> actors = null;

  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("tax_residency")
  private String taxResidency = null;

  public OrganisationIdentification actors(List<OrganisationIdentificationActor> actors) {
    this.actors = actors;
    return this;
  }

  public OrganisationIdentification addActorsItem(OrganisationIdentificationActor actorsItem) {
    if (this.actors == null) {
      this.actors = new ArrayList<OrganisationIdentificationActor>();
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

  public List<OrganisationIdentificationActor> getActors() {
    return actors;
  }

  public void setActors(List<OrganisationIdentificationActor> actors) {
    this.actors = actors;
  }

  public OrganisationIdentification address(List<String> address) {
    this.address = address;
    return this;
  }

  public OrganisationIdentification addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * The street name and house number of the postal address of the account holding organisation.
   * @return address
  **/
  @ApiModelProperty(example = "[\"Up and down street\",\"London, United Kingdom\"]", value = "The street name and house number of the postal address of the account holding organisation.")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public OrganisationIdentification city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city where address of the account holding organisation is located.
   * @return city
  **/
  @ApiModelProperty(example = "London", value = "The city where address of the account holding organisation is located.")

@Size(min=1,max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrganisationIdentification country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country where address of the account holding organisation is located. Must be ISO 3166-1 code.
   * @return country
  **/
  @ApiModelProperty(example = "GB", value = "The country where address of the account holding organisation is located. Must be ISO 3166-1 code.")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrganisationIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * The registration number used to identify the account holding organisation.
   * @return identification
  **/
  @ApiModelProperty(value = "The registration number used to identify the account holding organisation.")

@Size(min=1,max=140) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OrganisationIdentification taxResidency(String taxResidency) {
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
    OrganisationIdentification organisationIdentification = (OrganisationIdentification) o;
    return Objects.equals(this.actors, organisationIdentification.actors) &&
        Objects.equals(this.address, organisationIdentification.address) &&
        Objects.equals(this.city, organisationIdentification.city) &&
        Objects.equals(this.country, organisationIdentification.country) &&
        Objects.equals(this.identification, organisationIdentification.identification) &&
        Objects.equals(this.taxResidency, organisationIdentification.taxResidency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actors, address, city, country, identification, taxResidency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationIdentification {\n");
    
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

