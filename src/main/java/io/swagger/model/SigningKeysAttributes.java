package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SigningKeysAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class SigningKeysAttributes   {
  @JsonProperty("certificate")
  private String certificate = null;

  @JsonProperty("expiration_datetime")
  private OffsetDateTime expirationDatetime = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  @JsonProperty("revocation_datetime")
  private OffsetDateTime revocationDatetime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING_ACTIVATION("pending_activation"),
    
    ACTIVE("active"),
    
    EXPIRED("expired"),
    
    REVOKED("revoked");

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

  public SigningKeysAttributes certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
  **/
  @ApiModelProperty(value = "")


  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public SigningKeysAttributes expirationDatetime(OffsetDateTime expirationDatetime) {
    this.expirationDatetime = expirationDatetime;
    return this;
  }

  /**
   * Get expirationDatetime
   * @return expirationDatetime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpirationDatetime() {
    return expirationDatetime;
  }

  public void setExpirationDatetime(OffsetDateTime expirationDatetime) {
    this.expirationDatetime = expirationDatetime;
  }

  public SigningKeysAttributes publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public SigningKeysAttributes revocationDatetime(OffsetDateTime revocationDatetime) {
    this.revocationDatetime = revocationDatetime;
    return this;
  }

  /**
   * Get revocationDatetime
   * @return revocationDatetime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRevocationDatetime() {
    return revocationDatetime;
  }

  public void setRevocationDatetime(OffsetDateTime revocationDatetime) {
    this.revocationDatetime = revocationDatetime;
  }

  public SigningKeysAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


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
    SigningKeysAttributes signingKeysAttributes = (SigningKeysAttributes) o;
    return Objects.equals(this.certificate, signingKeysAttributes.certificate) &&
        Objects.equals(this.expirationDatetime, signingKeysAttributes.expirationDatetime) &&
        Objects.equals(this.publicKey, signingKeysAttributes.publicKey) &&
        Objects.equals(this.revocationDatetime, signingKeysAttributes.revocationDatetime) &&
        Objects.equals(this.status, signingKeysAttributes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, expirationDatetime, publicKey, revocationDatetime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningKeysAttributes {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    expirationDatetime: ").append(toIndentedString(expirationDatetime)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    revocationDatetime: ").append(toIndentedString(revocationDatetime)).append("\n");
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

