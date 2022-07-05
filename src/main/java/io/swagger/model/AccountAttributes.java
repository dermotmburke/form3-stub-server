package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AcceptanceQualifier;
import io.swagger.model.AccountAttributesOrganisationIdentification;
import io.swagger.model.AccountAttributesPrivateIdentification;
import io.swagger.model.StatusReason;
import io.swagger.model.UserDefinedData;
import io.swagger.model.ValidationType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")


public class AccountAttributes   {
  @JsonProperty("acceptance_qualifier")
  private AcceptanceQualifier acceptanceQualifier = null;

  /**
   * Is the account business or personal?
   */
  public enum AccountClassificationEnum {
    PERSONAL("Personal"),
    
    BUSINESS("Business");

    private String value;

    AccountClassificationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountClassificationEnum fromValue(String text) {
      for (AccountClassificationEnum b : AccountClassificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("account_classification")
  private AccountClassificationEnum accountClassification = AccountClassificationEnum.PERSONAL;

  @JsonProperty("account_matching_opt_out")
  private Boolean accountMatchingOptOut = false;

  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("alternative_bank_account_names")
  @Valid
  private List<String> alternativeBankAccountNames = null;

  @JsonProperty("alternative_names")
  @Valid
  private List<String> alternativeNames = null;

  @JsonProperty("bank_account_name")
  private String bankAccountName = null;

  @JsonProperty("bank_id")
  private String bankId = null;

  @JsonProperty("bank_id_code")
  private String bankIdCode = null;

  @JsonProperty("base_currency")
  private String baseCurrency = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("joint_account")
  private Boolean jointAccount = false;

  @JsonProperty("name")
  @Valid
  private List<String> name = null;

  /**
   * Describes the status of the account for name matching via CoP. The value determines the code with which Form3 responds to matched CoP requests to this account.
   */
  public enum NameMatchingStatusEnum {
    SUPPORTED("supported"),
    
    SWITCHED("switched"),
    
    OPTED_OUT("opted_out"),
    
    NOT_SUPPORTED("not_supported");

    private String value;

    NameMatchingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameMatchingStatusEnum fromValue(String text) {
      for (NameMatchingStatusEnum b : NameMatchingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("name_matching_status")
  private NameMatchingStatusEnum nameMatchingStatus = NameMatchingStatusEnum.SUPPORTED;

  @JsonProperty("organisation_identification")
  private AccountAttributesOrganisationIdentification organisationIdentification = null;

  @JsonProperty("private_identification")
  private AccountAttributesPrivateIdentification privateIdentification = null;

  @JsonProperty("processing_service")
  private String processingService = null;

  @JsonProperty("reference_mask")
  private String referenceMask = null;

  @JsonProperty("secondary_identification")
  private String secondaryIdentification = null;

  /**
   * Current status of the account
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    CONFIRMED("confirmed"),
    
    CLOSED("closed");

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

  @JsonProperty("status_reason")
  private StatusReason statusReason = null;

  @JsonProperty("switched")
  private Boolean switched = false;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("user_defined_data")
  @Valid
  private List<UserDefinedData> userDefinedData = null;

  @JsonProperty("user_defined_information")
  private String userDefinedInformation = null;

  @JsonProperty("validation_type")
  private ValidationType validationType = null;

  public AccountAttributes acceptanceQualifier(AcceptanceQualifier acceptanceQualifier) {
    this.acceptanceQualifier = acceptanceQualifier;
    return this;
  }

  /**
   * Get acceptanceQualifier
   * @return acceptanceQualifier
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AcceptanceQualifier getAcceptanceQualifier() {
    return acceptanceQualifier;
  }

  public void setAcceptanceQualifier(AcceptanceQualifier acceptanceQualifier) {
    this.acceptanceQualifier = acceptanceQualifier;
  }

  public AccountAttributes accountClassification(AccountClassificationEnum accountClassification) {
    this.accountClassification = accountClassification;
    return this;
  }

  /**
   * Is the account business or personal?
   * @return accountClassification
  **/
  @ApiModelProperty(value = "Is the account business or personal?")


  public AccountClassificationEnum getAccountClassification() {
    return accountClassification;
  }

  public void setAccountClassification(AccountClassificationEnum accountClassification) {
    this.accountClassification = accountClassification;
  }

  public AccountAttributes accountMatchingOptOut(Boolean accountMatchingOptOut) {
    this.accountMatchingOptOut = accountMatchingOptOut;
    return this;
  }

  /**
   * - deprecated - Is the account opted out of account matching, e.g. CoP?
   * @return accountMatchingOptOut
  **/
  @ApiModelProperty(value = "- deprecated - Is the account opted out of account matching, e.g. CoP?")


  public Boolean isAccountMatchingOptOut() {
    return accountMatchingOptOut;
  }

  public void setAccountMatchingOptOut(Boolean accountMatchingOptOut) {
    this.accountMatchingOptOut = accountMatchingOptOut;
  }

  public AccountAttributes accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number of the account. A unique number will automatically be generated if not provided.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "41426819", value = "Account number of the account. A unique number will automatically be generated if not provided.")

@Pattern(regexp="^[A-Z0-9]{0,64}$") 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountAttributes alternativeBankAccountNames(List<String> alternativeBankAccountNames) {
    this.alternativeBankAccountNames = alternativeBankAccountNames;
    return this;
  }

  public AccountAttributes addAlternativeBankAccountNamesItem(String alternativeBankAccountNamesItem) {
    if (this.alternativeBankAccountNames == null) {
      this.alternativeBankAccountNames = new ArrayList<String>();
    }
    this.alternativeBankAccountNames.add(alternativeBankAccountNamesItem);
    return this;
  }

  /**
   * - deprecated - Alternative account names. Used for Confirmation of Payee matching.
   * @return alternativeBankAccountNames
  **/
  @ApiModelProperty(value = "- deprecated - Alternative account names. Used for Confirmation of Payee matching.")

@Size(max=3) 
  public List<String> getAlternativeBankAccountNames() {
    return alternativeBankAccountNames;
  }

  public void setAlternativeBankAccountNames(List<String> alternativeBankAccountNames) {
    this.alternativeBankAccountNames = alternativeBankAccountNames;
  }

  public AccountAttributes alternativeNames(List<String> alternativeNames) {
    this.alternativeNames = alternativeNames;
    return this;
  }

  public AccountAttributes addAlternativeNamesItem(String alternativeNamesItem) {
    if (this.alternativeNames == null) {
      this.alternativeNames = new ArrayList<String>();
    }
    this.alternativeNames.add(alternativeNamesItem);
    return this;
  }

  /**
   * Alternative names. Used for Confirmation of Payee matching.
   * @return alternativeNames
  **/
  @ApiModelProperty(value = "Alternative names. Used for Confirmation of Payee matching.")

@Size(max=3) 
  public List<String> getAlternativeNames() {
    return alternativeNames;
  }

  public void setAlternativeNames(List<String> alternativeNames) {
    this.alternativeNames = alternativeNames;
  }

  public AccountAttributes bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

  /**
   * - deprecated - Primary account name. Used for Confirmation of Payee matching. Required if confirmation_of_payee_enabled is true for the organisation.
   * @return bankAccountName
  **/
  @ApiModelProperty(value = "- deprecated - Primary account name. Used for Confirmation of Payee matching. Required if confirmation_of_payee_enabled is true for the organisation.")

@Size(min=1,max=140) 
  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  public AccountAttributes bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Local country bank identifier. In the UK this is the sort code.
   * @return bankId
  **/
  @ApiModelProperty(example = "400300", value = "Local country bank identifier. In the UK this is the sort code.")

@Pattern(regexp="^[A-Z0-9]{0,16}$") 
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public AccountAttributes bankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
    return this;
  }

  /**
   * ISO 20022 code used to identify the type of bank ID being used
   * @return bankIdCode
  **/
  @ApiModelProperty(example = "GBDSC", value = "ISO 20022 code used to identify the type of bank ID being used")

@Pattern(regexp="^[A-Z]{0,16}$") 
  public String getBankIdCode() {
    return bankIdCode;
  }

  public void setBankIdCode(String bankIdCode) {
    this.bankIdCode = bankIdCode;
  }

  public AccountAttributes baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * ISO 4217 code used to identify the base currency of the account
   * @return baseCurrency
  **/
  @ApiModelProperty(example = "GBP", value = "ISO 4217 code used to identify the base currency of the account")

@Pattern(regexp="^[A-Z]{3}$") 
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public AccountAttributes bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * SWIFT BIC in either 8 or 11 character format
   * @return bic
  **/
  @ApiModelProperty(example = "NWBKGB22", value = "SWIFT BIC in either 8 or 11 character format")

@Pattern(regexp="^([A-Z]{6}[A-Z0-9]{2}|[A-Z]{6}[A-Z0-9]{5})$") 
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountAttributes country(String country) {
    this.country = country;
    return this;
  }

  /**
   * ISO 3166-1 code used to identify the domicile of the account
   * @return country
  **/
  @ApiModelProperty(example = "GB", required = true, value = "ISO 3166-1 code used to identify the domicile of the account")
  @NotNull

@Pattern(regexp="^[A-Z]{2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountAttributes customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * A free-format reference that can be used to link this account to an external system
   * @return customerId
  **/
  @ApiModelProperty(example = "12345", value = "A free-format reference that can be used to link this account to an external system")

@Pattern(regexp="^[a-zA-Z0-9-$@., ]{0,256}$") 
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public AccountAttributes firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * - deprecated - Customer first name.
   * @return firstName
  **/
  @ApiModelProperty(value = "- deprecated - Customer first name.")

@Size(min=1,max=40) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountAttributes iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN of the account. Will be calculated from other fields if not supplied.
   * @return iban
  **/
  @ApiModelProperty(example = "GB11NWBK40030041426819", value = "IBAN of the account. Will be calculated from other fields if not supplied.")

@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z0-9]{0,64}$") 
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountAttributes jointAccount(Boolean jointAccount) {
    this.jointAccount = jointAccount;
    return this;
  }

  /**
   * Is the account joint?
   * @return jointAccount
  **/
  @ApiModelProperty(value = "Is the account joint?")


  public Boolean isJointAccount() {
    return jointAccount;
  }

  public void setJointAccount(Boolean jointAccount) {
    this.jointAccount = jointAccount;
  }

  public AccountAttributes name(List<String> name) {
    this.name = name;
    return this;
  }

  public AccountAttributes addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Account holder names (for example title, first name, last name). Used for Confirmation of Payee matching.
   * @return name
  **/
  @ApiModelProperty(value = "Account holder names (for example title, first name, last name). Used for Confirmation of Payee matching.")

@Size(max=4) 
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public AccountAttributes nameMatchingStatus(NameMatchingStatusEnum nameMatchingStatus) {
    this.nameMatchingStatus = nameMatchingStatus;
    return this;
  }

  /**
   * Describes the status of the account for name matching via CoP. The value determines the code with which Form3 responds to matched CoP requests to this account.
   * @return nameMatchingStatus
  **/
  @ApiModelProperty(value = "Describes the status of the account for name matching via CoP. The value determines the code with which Form3 responds to matched CoP requests to this account.")


  public NameMatchingStatusEnum getNameMatchingStatus() {
    return nameMatchingStatus;
  }

  public void setNameMatchingStatus(NameMatchingStatusEnum nameMatchingStatus) {
    this.nameMatchingStatus = nameMatchingStatus;
  }

  public AccountAttributes organisationIdentification(AccountAttributesOrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
    return this;
  }

  /**
   * Get organisationIdentification
   * @return organisationIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountAttributesOrganisationIdentification getOrganisationIdentification() {
    return organisationIdentification;
  }

  public void setOrganisationIdentification(AccountAttributesOrganisationIdentification organisationIdentification) {
    this.organisationIdentification = organisationIdentification;
  }

  public AccountAttributes privateIdentification(AccountAttributesPrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
    return this;
  }

  /**
   * Get privateIdentification
   * @return privateIdentification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountAttributesPrivateIdentification getPrivateIdentification() {
    return privateIdentification;
  }

  public void setPrivateIdentification(AccountAttributesPrivateIdentification privateIdentification) {
    this.privateIdentification = privateIdentification;
  }

  public AccountAttributes processingService(String processingService) {
    this.processingService = processingService;
    return this;
  }

  /**
   * - deprecated - Accounting system or service. It will be added to each payment received to an account.
   * @return processingService
  **/
  @ApiModelProperty(value = "- deprecated - Accounting system or service. It will be added to each payment received to an account.")

@Size(max=35) 
  public String getProcessingService() {
    return processingService;
  }

  public void setProcessingService(String processingService) {
    this.processingService = processingService;
  }

  public AccountAttributes referenceMask(String referenceMask) {
    this.referenceMask = referenceMask;
    return this;
  }

  /**
   * When set will apply a validation mask on the payment reference to each payment received to an account.
   * @return referenceMask
  **/
  @ApiModelProperty(example = "4929############", value = "When set will apply a validation mask on the payment reference to each payment received to an account.")

@Size(max=35) 
  public String getReferenceMask() {
    return referenceMask;
  }

  public void setReferenceMask(String referenceMask) {
    this.referenceMask = referenceMask;
  }

  public AccountAttributes secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Secondary identification, e.g. building society roll number. Used for Confirmation of Payee.
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "Secondary identification, e.g. building society roll number. Used for Confirmation of Payee.")

@Size(min=1,max=140) 
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  public AccountAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the account
   * @return status
  **/
  @ApiModelProperty(value = "Current status of the account")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountAttributes statusReason(StatusReason statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Get statusReason
   * @return statusReason
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusReason getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(StatusReason statusReason) {
    this.statusReason = statusReason;
  }

  public AccountAttributes switched(Boolean switched) {
    this.switched = switched;
    return this;
  }

  /**
   * - deprecated - Indicates whether the account has been switched using the Current Account Switch Service.
   * @return switched
  **/
  @ApiModelProperty(value = "- deprecated - Indicates whether the account has been switched using the Current Account Switch Service.")


  public Boolean isSwitched() {
    return switched;
  }

  public void setSwitched(Boolean switched) {
    this.switched = switched;
  }

  public AccountAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * - deprecated - Customer title.
   * @return title
  **/
  @ApiModelProperty(example = "Ms", value = "- deprecated - Customer title.")

@Size(min=1,max=40) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AccountAttributes userDefinedData(List<UserDefinedData> userDefinedData) {
    this.userDefinedData = userDefinedData;
    return this;
  }

  public AccountAttributes addUserDefinedDataItem(UserDefinedData userDefinedDataItem) {
    if (this.userDefinedData == null) {
      this.userDefinedData = new ArrayList<UserDefinedData>();
    }
    this.userDefinedData.add(userDefinedDataItem);
    return this;
  }

  /**
   * All purpose list of key-value pairs to store specific data for the associated account. It will be added to each payment received to an account.
   * @return userDefinedData
  **/
  @ApiModelProperty(value = "All purpose list of key-value pairs to store specific data for the associated account. It will be added to each payment received to an account.")

  @Valid
@Size(max=5) 
  public List<UserDefinedData> getUserDefinedData() {
    return userDefinedData;
  }

  public void setUserDefinedData(List<UserDefinedData> userDefinedData) {
    this.userDefinedData = userDefinedData;
  }

  public AccountAttributes userDefinedInformation(String userDefinedInformation) {
    this.userDefinedInformation = userDefinedInformation;
    return this;
  }

  /**
   * - deprecated - All purpose field to store specific data for the associated account. It will be added to each payment received to an account.
   * @return userDefinedInformation
  **/
  @ApiModelProperty(value = "- deprecated - All purpose field to store specific data for the associated account. It will be added to each payment received to an account.")

@Size(max=35) 
  public String getUserDefinedInformation() {
    return userDefinedInformation;
  }

  public void setUserDefinedInformation(String userDefinedInformation) {
    this.userDefinedInformation = userDefinedInformation;
  }

  public AccountAttributes validationType(ValidationType validationType) {
    this.validationType = validationType;
    return this;
  }

  /**
   * Get validationType
   * @return validationType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ValidationType getValidationType() {
    return validationType;
  }

  public void setValidationType(ValidationType validationType) {
    this.validationType = validationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAttributes accountAttributes = (AccountAttributes) o;
    return Objects.equals(this.acceptanceQualifier, accountAttributes.acceptanceQualifier) &&
        Objects.equals(this.accountClassification, accountAttributes.accountClassification) &&
        Objects.equals(this.accountMatchingOptOut, accountAttributes.accountMatchingOptOut) &&
        Objects.equals(this.accountNumber, accountAttributes.accountNumber) &&
        Objects.equals(this.alternativeBankAccountNames, accountAttributes.alternativeBankAccountNames) &&
        Objects.equals(this.alternativeNames, accountAttributes.alternativeNames) &&
        Objects.equals(this.bankAccountName, accountAttributes.bankAccountName) &&
        Objects.equals(this.bankId, accountAttributes.bankId) &&
        Objects.equals(this.bankIdCode, accountAttributes.bankIdCode) &&
        Objects.equals(this.baseCurrency, accountAttributes.baseCurrency) &&
        Objects.equals(this.bic, accountAttributes.bic) &&
        Objects.equals(this.country, accountAttributes.country) &&
        Objects.equals(this.customerId, accountAttributes.customerId) &&
        Objects.equals(this.firstName, accountAttributes.firstName) &&
        Objects.equals(this.iban, accountAttributes.iban) &&
        Objects.equals(this.jointAccount, accountAttributes.jointAccount) &&
        Objects.equals(this.name, accountAttributes.name) &&
        Objects.equals(this.nameMatchingStatus, accountAttributes.nameMatchingStatus) &&
        Objects.equals(this.organisationIdentification, accountAttributes.organisationIdentification) &&
        Objects.equals(this.privateIdentification, accountAttributes.privateIdentification) &&
        Objects.equals(this.processingService, accountAttributes.processingService) &&
        Objects.equals(this.referenceMask, accountAttributes.referenceMask) &&
        Objects.equals(this.secondaryIdentification, accountAttributes.secondaryIdentification) &&
        Objects.equals(this.status, accountAttributes.status) &&
        Objects.equals(this.statusReason, accountAttributes.statusReason) &&
        Objects.equals(this.switched, accountAttributes.switched) &&
        Objects.equals(this.title, accountAttributes.title) &&
        Objects.equals(this.userDefinedData, accountAttributes.userDefinedData) &&
        Objects.equals(this.userDefinedInformation, accountAttributes.userDefinedInformation) &&
        Objects.equals(this.validationType, accountAttributes.validationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceQualifier, accountClassification, accountMatchingOptOut, accountNumber, alternativeBankAccountNames, alternativeNames, bankAccountName, bankId, bankIdCode, baseCurrency, bic, country, customerId, firstName, iban, jointAccount, name, nameMatchingStatus, organisationIdentification, privateIdentification, processingService, referenceMask, secondaryIdentification, status, statusReason, switched, title, userDefinedData, userDefinedInformation, validationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAttributes {\n");
    
    sb.append("    acceptanceQualifier: ").append(toIndentedString(acceptanceQualifier)).append("\n");
    sb.append("    accountClassification: ").append(toIndentedString(accountClassification)).append("\n");
    sb.append("    accountMatchingOptOut: ").append(toIndentedString(accountMatchingOptOut)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    alternativeBankAccountNames: ").append(toIndentedString(alternativeBankAccountNames)).append("\n");
    sb.append("    alternativeNames: ").append(toIndentedString(alternativeNames)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankIdCode: ").append(toIndentedString(bankIdCode)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    jointAccount: ").append(toIndentedString(jointAccount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMatchingStatus: ").append(toIndentedString(nameMatchingStatus)).append("\n");
    sb.append("    organisationIdentification: ").append(toIndentedString(organisationIdentification)).append("\n");
    sb.append("    privateIdentification: ").append(toIndentedString(privateIdentification)).append("\n");
    sb.append("    processingService: ").append(toIndentedString(processingService)).append("\n");
    sb.append("    referenceMask: ").append(toIndentedString(referenceMask)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    switched: ").append(toIndentedString(switched)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userDefinedData: ").append(toIndentedString(userDefinedData)).append("\n");
    sb.append("    userDefinedInformation: ").append(toIndentedString(userDefinedInformation)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
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

