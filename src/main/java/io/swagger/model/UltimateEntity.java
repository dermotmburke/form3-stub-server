package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PrivateIdentification;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UltimateEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class UltimateEntity   {
  @JsonProperty("additional_address_line")
  private String additionalAddressLine = null;

  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("birth_city")
  private String birthCity = null;

  @JsonProperty("birth_country")
  private String birthCountry = null;

  @JsonProperty("birth_date")
  private LocalDate birthDate = null;

  @JsonProperty("birth_province")
  private String birthProvince = null;

  @JsonProperty("building_number")
  private String buildingNumber = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organisation_identification")
  private String organisationIdentification = null;

  @JsonProperty("organisation_identification_code")
  private String organisationIdentificationCode = null;

  @JsonProperty("organisation_identification_issuer")
  private String organisationIdentificationIssuer = null;

  @JsonProperty("organisation_identification_scheme")
  private String organisationIdentificationScheme = null;

  @JsonProperty("post_code")
  private String postCode = null;

  @JsonProperty("private_identification")
  private PrivateIdentification privateIdentification = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("street_name")
  private String streetName = null;

  public UltimateEntity additionalAddressLine(String additionalAddressLine) {
    this.additionalAddressLine = additionalAddressLine;
    return this;
  }

  /**
   * Additional address line of the debtor/beneficiary address
   * @return additionalAddressLine
  **/
  @ApiModelProperty(value = "Additional address line of the debtor/beneficiary address")


  public String getAdditionalAddressLine() {
    return additionalAddressLine;
  }

  public void setAdditionalAddressLine(String additionalAddressLine) {
    this.additionalAddressLine = additionalAddressLine;
  }

  public UltimateEntity address(List<String> address) {
    this.address = address;
    return this;
  }

  public UltimateEntity addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Ultimate debtor/beneficiary address
   * @return address
  **/
  @ApiModelProperty(example = "[\"Liverpool Customer Service Centre\",\"Stevenson Way, Wavertree, L13 1NW\"]", value = "Ultimate debtor/beneficiary address")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public UltimateEntity birthCity(String birthCity) {
    this.birthCity = birthCity;
    return this;
  }

  /**
   * Ultimate debtor/beneficiary birth city
   * @return birthCity
  **/
  @ApiModelProperty(example = "PARIS", value = "Ultimate debtor/beneficiary birth city")


  public String getBirthCity() {
    return birthCity;
  }

  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }

  public UltimateEntity birthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  /**
   * Ultimate debtor/beneficiary birth country. ISO 3166 format country code
   * @return birthCountry
  **/
  @ApiModelProperty(example = "FR", value = "Ultimate debtor/beneficiary birth country. ISO 3166 format country code")


  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public UltimateEntity birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Ultimate debtor/beneficiary birth date. Formatted ISO 8601 format YYYY-MM-DD
   * @return birthDate
  **/
  @ApiModelProperty(example = "1973-01-31", value = "Ultimate debtor/beneficiary birth date. Formatted ISO 8601 format YYYY-MM-DD")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public UltimateEntity birthProvince(String birthProvince) {
    this.birthProvince = birthProvince;
    return this;
  }

  /**
   * Ultimate debtor/beneficiary birth province
   * @return birthProvince
  **/
  @ApiModelProperty(example = "SOUTH SIDE", value = "Ultimate debtor/beneficiary birth province")


  public String getBirthProvince() {
    return birthProvince;
  }

  public void setBirthProvince(String birthProvince) {
    this.birthProvince = birthProvince;
  }

  public UltimateEntity buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Building number of the debtor/beneficiary address
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "Building number of the debtor/beneficiary address")


  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public UltimateEntity city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City/Town of the Beneficiary address
   * @return city
  **/
  @ApiModelProperty(example = "BRUSSELS", value = "City/Town of the Beneficiary address")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UltimateEntity country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of ultimate debtor/beneficiary address. ISO 3166 format country code
   * @return country
  **/
  @ApiModelProperty(example = "GB", value = "Country of ultimate debtor/beneficiary address. ISO 3166 format country code")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UltimateEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Jane Bond", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UltimateEntity organisationIdentification(String organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
    return this;
  }

  /**
   * Organisation identification of an ultimate debtor/beneficiary, in the case that the ultimate debtor/beneficiary is an organisation and not a private person.
   * @return organisationIdentification
  **/
  @ApiModelProperty(example = "ID1234656", value = "Organisation identification of an ultimate debtor/beneficiary, in the case that the ultimate debtor/beneficiary is an organisation and not a private person.")


  public String getOrganisationIdentification() {
    return organisationIdentification;
  }

  public void setOrganisationIdentification(String organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
  }

  public UltimateEntity organisationIdentificationCode(String organisationIdentificationCode) {
    this.organisationIdentificationCode = organisationIdentificationCode;
    return this;
  }

  /**
   * The code that specifies the type of `organisation_identification`
   * @return organisationIdentificationCode
  **/
  @ApiModelProperty(example = "BIC", value = "The code that specifies the type of `organisation_identification`")


  public String getOrganisationIdentificationCode() {
    return organisationIdentificationCode;
  }

  public void setOrganisationIdentificationCode(String organisationIdentificationCode) {
    this.organisationIdentificationCode = organisationIdentificationCode;
  }

  public UltimateEntity organisationIdentificationIssuer(String organisationIdentificationIssuer) {
    this.organisationIdentificationIssuer = organisationIdentificationIssuer;
    return this;
  }

  /**
   * Issuer of the `organisation_identification`
   * @return organisationIdentificationIssuer
  **/
  @ApiModelProperty(example = "NATIONAL WESTMINSTER BANK PLC", value = "Issuer of the `organisation_identification`")


  public String getOrganisationIdentificationIssuer() {
    return organisationIdentificationIssuer;
  }

  public void setOrganisationIdentificationIssuer(String organisationIdentificationIssuer) {
    this.organisationIdentificationIssuer = organisationIdentificationIssuer;
  }

  public UltimateEntity organisationIdentificationScheme(String organisationIdentificationScheme) {
    this.organisationIdentificationScheme = organisationIdentificationScheme;
    return this;
  }

  /**
   * The code that specifies the scheme of `organisation_identification`
   * @return organisationIdentificationScheme
  **/
  @ApiModelProperty(example = "CustomerId", value = "The code that specifies the scheme of `organisation_identification`")


  public String getOrganisationIdentificationScheme() {
    return organisationIdentificationScheme;
  }

  public void setOrganisationIdentificationScheme(String organisationIdentificationScheme) {
    this.organisationIdentificationScheme = organisationIdentificationScheme;
  }

  public UltimateEntity postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Post code of the debtor/beneficiary address
   * @return postCode
  **/
  @ApiModelProperty(value = "Post code of the debtor/beneficiary address")


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public UltimateEntity privateIdentification(PrivateIdentification privateIdentification) {
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

  public UltimateEntity province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Province of the debtor/beneficiary address
   * @return province
  **/
  @ApiModelProperty(value = "Province of the debtor/beneficiary address")


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public UltimateEntity streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street name of the debtor/beneficiary address
   * @return streetName
  **/
  @ApiModelProperty(example = "Park Avenue", value = "Street name of the debtor/beneficiary address")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UltimateEntity ultimateEntity = (UltimateEntity) o;
    return Objects.equals(this.additionalAddressLine, ultimateEntity.additionalAddressLine) &&
        Objects.equals(this.address, ultimateEntity.address) &&
        Objects.equals(this.birthCity, ultimateEntity.birthCity) &&
        Objects.equals(this.birthCountry, ultimateEntity.birthCountry) &&
        Objects.equals(this.birthDate, ultimateEntity.birthDate) &&
        Objects.equals(this.birthProvince, ultimateEntity.birthProvince) &&
        Objects.equals(this.buildingNumber, ultimateEntity.buildingNumber) &&
        Objects.equals(this.city, ultimateEntity.city) &&
        Objects.equals(this.country, ultimateEntity.country) &&
        Objects.equals(this.name, ultimateEntity.name) &&
        Objects.equals(this.organisationIdentification, ultimateEntity.organisationIdentification) &&
        Objects.equals(this.organisationIdentificationCode, ultimateEntity.organisationIdentificationCode) &&
        Objects.equals(this.organisationIdentificationIssuer, ultimateEntity.organisationIdentificationIssuer) &&
        Objects.equals(this.organisationIdentificationScheme, ultimateEntity.organisationIdentificationScheme) &&
        Objects.equals(this.postCode, ultimateEntity.postCode) &&
        Objects.equals(this.privateIdentification, ultimateEntity.privateIdentification) &&
        Objects.equals(this.province, ultimateEntity.province) &&
        Objects.equals(this.streetName, ultimateEntity.streetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAddressLine, address, birthCity, birthCountry, birthDate, birthProvince, buildingNumber, city, country, name, organisationIdentification, organisationIdentificationCode, organisationIdentificationIssuer, organisationIdentificationScheme, postCode, privateIdentification, province, streetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UltimateEntity {\n");
    
    sb.append("    additionalAddressLine: ").append(toIndentedString(additionalAddressLine)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthProvince: ").append(toIndentedString(birthProvince)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organisationIdentification: ").append(toIndentedString(organisationIdentification)).append("\n");
    sb.append("    organisationIdentificationCode: ").append(toIndentedString(organisationIdentificationCode)).append("\n");
    sb.append("    organisationIdentificationIssuer: ").append(toIndentedString(organisationIdentificationIssuer)).append("\n");
    sb.append("    organisationIdentificationScheme: ").append(toIndentedString(organisationIdentificationScheme)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    privateIdentification: ").append(toIndentedString(privateIdentification)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
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

