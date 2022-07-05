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
 * PrivateIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class PrivateIdentification   {
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

  public PrivateIdentification address(List<String> address) {
    this.address = address;
    return this;
  }

  public PrivateIdentification addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * The street name and house number of the postal address of the account holder.
   * @return address
  **/
  @ApiModelProperty(example = "[\"Up and down street\",\"London, United Kingdom\"]", value = "The street name and house number of the postal address of the account holder.")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public PrivateIdentification birthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  /**
   * The birth country of the account holder. Must be ISO 3166-1 code.
   * @return birthCountry
  **/
  @ApiModelProperty(example = "GB", value = "The birth country of the account holder. Must be ISO 3166-1 code.")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public PrivateIdentification birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * The birth date of the account holder.
   * @return birthDate
  **/
  @ApiModelProperty(example = "2017-07-23", value = "The birth date of the account holder.")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public PrivateIdentification city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city where the postal address of the account holder is located.
   * @return city
  **/
  @ApiModelProperty(example = "London", value = "The city where the postal address of the account holder is located.")

@Size(min=1,max=35) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PrivateIdentification country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country where the postal address of the account holder is located. Must be ISO 3166-1 code.
   * @return country
  **/
  @ApiModelProperty(example = "GB", value = "The country where the postal address of the account holder is located. Must be ISO 3166-1 code.")

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PrivateIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Private Identification of an debtor/beneficiary or ultimate debtor/beneficiary
   * @return identification
  **/
  @ApiModelProperty(example = "AB12345", value = "Private Identification of an debtor/beneficiary or ultimate debtor/beneficiary")

@Size(min=1,max=140) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PrivateIdentification identificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
    return this;
  }

  /**
   * Issuer of the `identification`
   * @return identificationIssuer
  **/
  @ApiModelProperty(example = "HM Passport Office", value = "Issuer of the `identification`")


  public String getIdentificationIssuer() {
    return identificationIssuer;
  }

  public void setIdentificationIssuer(String identificationIssuer) {
    this.identificationIssuer = identificationIssuer;
  }

  public PrivateIdentification identificationScheme(String identificationScheme) {
    this.identificationScheme = identificationScheme;
    return this;
  }

  /**
   * Scheme of the `identification`
   * @return identificationScheme
  **/
  @ApiModelProperty(example = "BANK", value = "Scheme of the `identification`")


  public String getIdentificationScheme() {
    return identificationScheme;
  }

  public void setIdentificationScheme(String identificationScheme) {
    this.identificationScheme = identificationScheme;
  }

  public PrivateIdentification identificationSchemeCode(String identificationSchemeCode) {
    this.identificationSchemeCode = identificationSchemeCode;
    return this;
  }

  /**
   * The code that specifies the type of `identification`
   * @return identificationSchemeCode
  **/
  @ApiModelProperty(example = "CCPT", value = "The code that specifies the type of `identification`")


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
    PrivateIdentification privateIdentification = (PrivateIdentification) o;
    return Objects.equals(this.address, privateIdentification.address) &&
        Objects.equals(this.birthCountry, privateIdentification.birthCountry) &&
        Objects.equals(this.birthDate, privateIdentification.birthDate) &&
        Objects.equals(this.city, privateIdentification.city) &&
        Objects.equals(this.country, privateIdentification.country) &&
        Objects.equals(this.identification, privateIdentification.identification) &&
        Objects.equals(this.identificationIssuer, privateIdentification.identificationIssuer) &&
        Objects.equals(this.identificationScheme, privateIdentification.identificationScheme) &&
        Objects.equals(this.identificationSchemeCode, privateIdentification.identificationSchemeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, birthCountry, birthDate, city, country, identification, identificationIssuer, identificationScheme, identificationSchemeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIdentification {\n");
    
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

