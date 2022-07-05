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
 * AccountAttributesPrivateIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAttributesPrivateIdentification   {
  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("birth_country")
  private String birthCountry = null;

  @JsonProperty("birth_date")
  private LocalDate birthDate = null;

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

  public AccountAttributesPrivateIdentification address(List<String> address) {
    this.address = address;
    return this;
  }

  public AccountAttributesPrivateIdentification addAddressItem(String addressItem) {
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

  public AccountAttributesPrivateIdentification birthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  /**
   * Get birthCountry
   * @return birthCountry
  **/
  @ApiModelProperty(example = "GB", value = "")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public AccountAttributesPrivateIdentification birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Customer birth date
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-07-23", value = "Customer birth date")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public AccountAttributesPrivateIdentification city(String city) {
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

  public AccountAttributesPrivateIdentification country(String country) {
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

  public AccountAttributesPrivateIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(example = "L-123456789", value = "")

@Size(min=1,max=140) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public AccountAttributesPrivateIdentification identificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
    return this;
  }

  /**
   * Get identificationIssuer
   * @return identificationIssuer
  **/
  @ApiModelProperty(value = "")

@Size(min=1) 
  public String getIdentificationIssuer() {
    return identificationIssuer;
  }

  public void setIdentificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
  }

  public AccountAttributesPrivateIdentification identificationScheme(String identificationScheme) {
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

  public AccountAttributesPrivateIdentification identificationSchemeCode(String identificationSchemeCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAttributesPrivateIdentification accountAttributesPrivateIdentification = (AccountAttributesPrivateIdentification) o;
    return Objects.equals(this.address, accountAttributesPrivateIdentification.address) &&
        Objects.equals(this.birthCountry, accountAttributesPrivateIdentification.birthCountry) &&
        Objects.equals(this.birthDate, accountAttributesPrivateIdentification.birthDate) &&
        Objects.equals(this.city, accountAttributesPrivateIdentification.city) &&
        Objects.equals(this.country, accountAttributesPrivateIdentification.country) &&
        Objects.equals(this.identification, accountAttributesPrivateIdentification.identification) &&
        Objects.equals(this.identificationIssuer, accountAttributesPrivateIdentification.identificationIssuer) &&
        Objects.equals(this.identificationScheme, accountAttributesPrivateIdentification.identificationScheme) &&
        Objects.equals(this.identificationSchemeCode, accountAttributesPrivateIdentification.identificationSchemeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, birthCountry, birthDate, city, country, identification, identificationIssuer, identificationScheme, identificationSchemeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAttributesPrivateIdentification {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    identificationIssuer: ").append(toIndentedString(identificationIssuer)).append("\n");
    sb.append("    identificationScheme: ").append(toIndentedString(identificationScheme)).append("\n");
    sb.append("    identificationSchemeCode: ").append(toIndentedString(identificationSchemeCode)).append("\n");
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

