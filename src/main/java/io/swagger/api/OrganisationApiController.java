package io.swagger.api;

import io.swagger.model.AccountAmendment;
import io.swagger.model.AccountAmendmentCreation;
import io.swagger.model.AccountAmendmentListResponse;
import io.swagger.model.AccountAmendmentResponse;
import io.swagger.model.AccountAmendmentSubmissionCreation;
import io.swagger.model.AccountAmendmentSubmissionResponse;
import io.swagger.model.AccountCreation;
import io.swagger.model.AccountCreationResponse;
import io.swagger.model.AccountDetailsListResponse;
import io.swagger.model.AccountDetailsResponse;
import io.swagger.model.AccountEventListResponse;
import io.swagger.model.AccountIdentificationListResponse;
import io.swagger.model.AccountIdentificationRequest;
import io.swagger.model.AccountIdentificationResponse;
import io.swagger.model.AccountRequestCreation;
import io.swagger.model.AccountRequestListResponse;
import io.swagger.model.AccountRequestResponse;
import io.swagger.model.AccountRequestSubmissionCreation;
import io.swagger.model.AccountRequestSubmissionResponse;
import io.swagger.model.ApiError;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.OrganisationCreation;
import io.swagger.model.OrganisationCreationResponse;
import io.swagger.model.OrganisationDetailsListResponse;
import io.swagger.model.OrganisationDetailsResponse;
import io.swagger.model.OrganisationUpdate;
import io.swagger.model.PositionDetailsListResponse;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")

@Controller
public class OrganisationApiController implements OrganisationApi {

    private static final Logger log = LoggerFactory.getLogger(OrganisationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrganisationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccountAmendmentListResponse> getAccountAmendments(@Pattern(regexp="^(first|last|\\d+)$") @ApiParam(value = "Which page to select", defaultValue = "0") @Valid @RequestParam(value = "page[number]", required = false, defaultValue="0") String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select", defaultValue = "100") @Valid @RequestParam(value = "page[size]", required = false, defaultValue="100") Integer pageSize,@ApiParam(value = "Filter by organisationID") @Valid @RequestParam(value = "filter[organisation_id]", required = false) UUID filterOrganisationId,@ApiParam(value = "Filter by account ID") @Valid @RequestParam(value = "filter[account_id]", required = false) UUID filterAccountId,@ApiParam(value = "Filter account request submission status", allowableValues = "accepted, validation_pending, validation_passed, released_to_gateway, submitted, delivery_confirmed, delivery_failed") @Valid @RequestParam(value = "filter[submission.status]", required = false) String filterSubmissionStatus,@Size(min=1) @ApiParam(value = "Filter account amendments submission by date from") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@Size(min=1) @ApiParam(value = "Filter account amendments submission by date to") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountAmendmentListResponse>(objectMapper.readValue("{\"empty\": false}", AccountAmendmentListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountAmendmentListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountAmendmentListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountAmendmentResponse> getAccountAmendmentsID(@ApiParam(value = "Account Amendment ID",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountAmendmentResponse>(objectMapper.readValue("{\"empty\": false}", AccountAmendmentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountAmendmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountAmendmentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountAmendmentSubmissionResponse> getAccountAmendmentsIDSubmissionsSubmissionID(@ApiParam(value = "Account Amendment ID",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Account Amendment Submission ID",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountAmendmentSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", AccountAmendmentSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountAmendmentSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountAmendmentSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountRequestListResponse> getAccountRequests(@Pattern(regexp="^(first|last|\\d+)$") @ApiParam(value = "Which page to select", defaultValue = "0") @Valid @RequestParam(value = "page[number]", required = false, defaultValue="0") String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select", defaultValue = "100") @Valid @RequestParam(value = "page[size]", required = false, defaultValue="100") Integer pageSize,@ApiParam(value = "Filter by organisationID") @Valid @RequestParam(value = "filter[organisation_id]", required = false) UUID filterOrganisationId,@Pattern(regexp="^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3})?$") @Size(min=1) @ApiParam(value = "Filter by BIC") @Valid @RequestParam(value = "filter[bic]", required = false) String filterBic,@Pattern(regexp="^[A-Z0-9]{0,16}$") @Size(min=1) @ApiParam(value = "Filter by BankID") @Valid @RequestParam(value = "filter[bank_id]", required = false) String filterBankId,@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z0-9]{0,64}$") @Size(min=1) @ApiParam(value = "Filter by IBAN") @Valid @RequestParam(value = "filter[iban]", required = false) String filterIban,@Pattern(regexp="^[A-Z0-9]{0,64}$") @Size(min=1) @ApiParam(value = "Filter by account number") @Valid @RequestParam(value = "filter[account_number]", required = false) String filterAccountNumber,@Pattern(regexp="^[A-Za-z]{2}$") @Size(min=2) @ApiParam(value = "Filter by country ISO 3166-1 alpha-2") @Valid @RequestParam(value = "filter[country]", required = false) String filterCountry,@ApiParam(value = "Filter account request submission status", allowableValues = "accepted, validation_pending, validation_passed, released_to_gateway, submitted, delivery_confirmed, delivery_failed") @Valid @RequestParam(value = "filter[submission.status]", required = false) String filterSubmissionStatus,@Size(min=1) @ApiParam(value = "Filter account request submission by date from") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@Size(min=1) @ApiParam(value = "Filter account request submission by date to") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountRequestListResponse>(objectMapper.readValue("{\"empty\": false}", AccountRequestListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountRequestListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountRequestListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountRequestResponse> getAccountRequestsID(@ApiParam(value = "Account Request ID",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountRequestResponse>(objectMapper.readValue("{\"empty\": false}", AccountRequestResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountRequestResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountRequestResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountRequestSubmissionResponse> getAccountRequestsIDSubmissionsSubmissionID(@ApiParam(value = "Account Request ID",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Account Request Submission ID",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountRequestSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", AccountRequestSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountRequestSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountRequestSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountIdentificationListResponse> organisationAccountsAccountIdIdentificationsGet(@ApiParam(value = "Account Id to which this identification relates to",required=true) @PathVariable("account_id") UUID accountId,@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "Filter to only include account identifications with specified secondary_identification") @Valid @RequestParam(value = "filter[secondary_identification]", required = false) List<String> filterSecondaryIdentification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountIdentificationListResponse>(objectMapper.readValue("{\"empty\": false}", AccountIdentificationListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountIdentificationListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountIdentificationListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationAccountsAccountIdIdentificationsIdentificationIdDelete(@ApiParam(value = "Account Id",required=true) @PathVariable("account_id") UUID accountId,@ApiParam(value = "Account Identification Id",required=true) @PathVariable("identification_id") UUID identificationId,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountIdentificationResponse> organisationAccountsAccountIdIdentificationsIdentificationIdGet(@ApiParam(value = "Account Id",required=true) @PathVariable("account_id") UUID accountId,@ApiParam(value = "Account Identification Id",required=true) @PathVariable("identification_id") UUID identificationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountIdentificationResponse>(objectMapper.readValue("{\"empty\": false}", AccountIdentificationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountIdentificationResponse> organisationAccountsAccountIdIdentificationsIdentificationIdPatch(@ApiParam(value = "Account Id",required=true) @PathVariable("account_id") UUID accountId,@ApiParam(value = "Account Identification Id; Must match id in the payload",required=true) @PathVariable("identification_id") UUID identificationId,@ApiParam(value = ""  )  @Valid @RequestBody AccountIdentificationRequest accountIdentificationAmendRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountIdentificationResponse>(objectMapper.readValue("{\"empty\": false}", AccountIdentificationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountIdentificationResponse> organisationAccountsAccountIdIdentificationsPost(@ApiParam(value = "Account Id to which this identification relates to",required=true) @PathVariable("account_id") UUID accountId,@ApiParam(value = ""  )  @Valid @RequestBody AccountIdentificationRequest accountIdentificationCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountIdentificationResponse>(objectMapper.readValue("{\"empty\": false}", AccountIdentificationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountIdentificationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDetailsListResponse> organisationAccountsGet(@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "Filter by type of bank id e.g. \"GBDSC\"") @Valid @RequestParam(value = "filter[bank_id_code]", required = false) List<String> filterBankIdCode,@ApiParam(value = "Filter by bank id e.g. sort code or bic") @Valid @RequestParam(value = "filter[bank_id]", required = false) List<String> filterBankId,@ApiParam(value = "Filter by account number") @Valid @RequestParam(value = "filter[account_number]", required = false) List<String> filterAccountNumber,@ApiParam(value = "Filter by country e.g. FR,GB") @Valid @RequestParam(value = "filter[country]", required = false) List<String> filterCountry,@ApiParam(value = "Filter by customer_id") @Valid @RequestParam(value = "filter[customer_id]", required = false) List<String> filterCustomerId,@ApiParam(value = "Filter by IBAN") @Valid @RequestParam(value = "filter[iban]", required = false) List<String> filterIban) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", AccountDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationAccountsIdDelete(@ApiParam(value = "Account Id",required=true) @PathVariable("id") UUID id,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountEventListResponse> organisationAccountsIdEventsGet(@ApiParam(value = "Account Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountEventListResponse>(objectMapper.readValue("{\"empty\": false}", AccountEventListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountEventListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountEventListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDetailsResponse> organisationAccountsIdGet(@ApiParam(value = "Account Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AccountDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDetailsResponse> organisationAccountsIdPatch(@ApiParam(value = "Account Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody AccountAmendment accountAmendRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AccountDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountCreationResponse> organisationAccountsPost(@ApiParam(value = ""  )  @Valid @RequestBody AccountCreation accountCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountCreationResponse>(objectMapper.readValue("{\"empty\": false}", AccountCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PositionDetailsListResponse> organisationPositionsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PositionDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", PositionDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PositionDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PositionDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganisationDetailsListResponse> organisationUnitsGet(@ApiParam(value = "Child org id") @Valid @RequestParam(value = "filter[child_organisation_id]", required = false) UUID filterChildOrganisationId,@ApiParam(value = "Organisation ids") @Valid @RequestParam(value = "filter[organisation_ids]", required = false) List<UUID> filterOrganisationIds) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganisationDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", OrganisationDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganisationDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganisationDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganisationDetailsResponse> organisationUnitsIdGet(@ApiParam(value = "Organisation Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganisationDetailsResponse>(objectMapper.readValue("{\"empty\": false}", OrganisationDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganisationDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganisationDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganisationDetailsResponse> organisationUnitsIdPatch(@ApiParam(value = "Organisation Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody OrganisationUpdate organisationUpdateRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganisationDetailsResponse>(objectMapper.readValue("{\"empty\": false}", OrganisationDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganisationDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganisationDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrganisationCreationResponse> organisationUnitsPost(@ApiParam(value = ""  )  @Valid @RequestBody OrganisationCreation organisationCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrganisationCreationResponse>(objectMapper.readValue("{\"empty\": false}", OrganisationCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrganisationCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrganisationCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountAmendmentResponse> postAccountAmendments(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AccountAmendmentCreation accountAmendmentCreationBody) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountAmendmentResponse>(objectMapper.readValue("{\"empty\": false}", AccountAmendmentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountAmendmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountAmendmentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountAmendmentSubmissionResponse> postAccountAmendmentsIDSubmissions(@ApiParam(value = "Account Amendment ID",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody AccountAmendmentSubmissionCreation accountAmendmentSubmissionRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountAmendmentSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", AccountAmendmentSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountAmendmentSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountAmendmentSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountRequestResponse> postAccountRequests(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AccountRequestCreation accountRequestCreationBody) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountRequestResponse>(objectMapper.readValue("{\"empty\": false}", AccountRequestResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountRequestResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountRequestResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountRequestSubmissionResponse> postAccountRequestsIDSubmissions(@ApiParam(value = "Account Request ID",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody AccountRequestSubmissionCreation accountRequestSubmissionRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountRequestSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", AccountRequestSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountRequestSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountRequestSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
