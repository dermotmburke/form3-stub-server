package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountNumberCode;
import io.swagger.model.AgentRole;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Agent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class Agent   {
  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("account_number_code")
  private AccountNumberCode accountNumberCode = null;

  @JsonProperty("address")
  @Valid
  private List<String> address = null;

  @JsonProperty("identification")
  private Object identification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private AgentRole role = null;

  public Agent accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number of the financial institution. Can be BBAN or IBAN.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "BBAN", value = "Account number of the financial institution. Can be BBAN or IBAN.")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Agent accountNumberCode(AccountNumberCode accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
    return this;
  }

  /**
   * Get accountNumberCode
   * @return accountNumberCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountNumberCode getAccountNumberCode() {
    return accountNumberCode;
  }

  public void setAccountNumberCode(AccountNumberCode accountNumberCode) {
    this.accountNumberCode = accountNumberCode;
  }

  public Agent address(List<String> address) {
    this.address = address;
    return this;
  }

  public Agent addAddressItem(String addressItem) {
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
  @ApiModelProperty(example = "[\"1 Clarence Mew, Horsforth, Leeds UK 4EP\"]", value = "")


  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public Agent identification(Object identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")


  public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public Agent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which the financial institution is known
   * @return name
  **/
  @ApiModelProperty(example = "Llloyds Bank", value = "Name by which the financial institution is known")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Agent role(AgentRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgentRole getRole() {
    return role;
  }

  public void setRole(AgentRole role) {
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
    Agent agent = (Agent) o;
    return Objects.equals(this.accountNumber, agent.accountNumber) &&
        Objects.equals(this.accountNumberCode, agent.accountNumberCode) &&
        Objects.equals(this.address, agent.address) &&
        Objects.equals(this.identification, agent.identification) &&
        Objects.equals(this.name, agent.name) &&
        Objects.equals(this.role, agent.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountNumberCode, address, identification, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberCode: ").append(toIndentedString(accountNumberCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

