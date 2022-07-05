package io.swagger.api;

import io.swagger.model.AdviceCreation;
import io.swagger.model.AdviceCreationResponse;
import io.swagger.model.AdviceDetailsResponse;
import io.swagger.model.AdviceSubmissionCreation;
import io.swagger.model.AdviceSubmissionCreationResponse;
import io.swagger.model.AdviceSubmissionDetailsResponse;
import io.swagger.model.ApiError;
import io.swagger.model.ClaimCreation;
import io.swagger.model.ClaimDetailsListResponse;
import io.swagger.model.ClaimDetailsResponse;
import io.swagger.model.ClaimReversalCreation;
import io.swagger.model.ClaimReversalDetailsResponse;
import io.swagger.model.ClaimReversalSubmissionCreation;
import io.swagger.model.ClaimReversalSubmissionDetailsResponse;
import io.swagger.model.ClaimSubmissionCreation;
import io.swagger.model.ClaimSubmissionDetailsResponse;
import io.swagger.model.DirectDebitAdmissionDetailsResponse;
import io.swagger.model.DirectDebitCreation;
import io.swagger.model.DirectDebitCreationResponse;
import io.swagger.model.DirectDebitDecisionAdmissionCreation;
import io.swagger.model.DirectDebitDecisionAdmissionCreationResponse;
import io.swagger.model.DirectDebitDecisionAdmissionDetailsResponse;
import io.swagger.model.DirectDebitDecisionCreation;
import io.swagger.model.DirectDebitDecisionCreationResponse;
import io.swagger.model.DirectDebitDecisionDetailsResponse;
import io.swagger.model.DirectDebitDecisionSubmissionCreation;
import io.swagger.model.DirectDebitDecisionSubmissionCreationResponse;
import io.swagger.model.DirectDebitDecisionSubmissionDetailsResponse;
import io.swagger.model.DirectDebitDetailsListResponse;
import io.swagger.model.DirectDebitDetailsResponse;
import io.swagger.model.DirectDebitRecallAdmissionDetailsResponse;
import io.swagger.model.DirectDebitRecallCreation;
import io.swagger.model.DirectDebitRecallCreationResponse;
import io.swagger.model.DirectDebitRecallDetailsResponse;
import io.swagger.model.DirectDebitRecallSubmissionDetailsResponse;
import io.swagger.model.DirectDebitReturnAdmissionDetailsResponse;
import io.swagger.model.DirectDebitReturnCreation;
import io.swagger.model.DirectDebitReturnCreationResponse;
import io.swagger.model.DirectDebitReturnDetailsResponse;
import io.swagger.model.DirectDebitReturnReversalAdmissionDetailsResponse;
import io.swagger.model.DirectDebitReturnReversalDetailsResponse;
import io.swagger.model.DirectDebitReturnSubmissionCreation;
import io.swagger.model.DirectDebitReturnSubmissionCreationResponse;
import io.swagger.model.DirectDebitReturnSubmissionDetailsResponse;
import io.swagger.model.DirectDebitReversalAdmissionDetailsResponse;
import io.swagger.model.DirectDebitReversalCreation;
import io.swagger.model.DirectDebitReversalCreationResponse;
import io.swagger.model.DirectDebitReversalDetailsResponse;
import io.swagger.model.DirectDebitReversalSubmissionCreation;
import io.swagger.model.DirectDebitReversalSubmissionCreationResponse;
import io.swagger.model.DirectDebitReversalSubmissionDetailsResponse;
import io.swagger.model.DirectDebitSubmissionCreation;
import io.swagger.model.DirectDebitSubmissionCreationResponse;
import io.swagger.model.DirectDebitSubmissionDetailsResponse;
import org.threeten.bp.LocalDate;
import io.swagger.model.MandateAdmissionDetailsResponse;
import io.swagger.model.MandateAmendment;
import io.swagger.model.MandateCreation;
import io.swagger.model.MandateCreationResponse;
import io.swagger.model.MandateDetailsListResponse;
import io.swagger.model.MandateDetailsResponse;
import io.swagger.model.MandateReturnCreation;
import io.swagger.model.MandateReturnCreationResponse;
import io.swagger.model.MandateReturnDetailsResponse;
import io.swagger.model.MandateReturnSubmissionCreation;
import io.swagger.model.MandateReturnSubmissionCreationResponse;
import io.swagger.model.MandateReturnSubmissionDetailsResponse;
import io.swagger.model.MandateSubmissionCreation;
import io.swagger.model.MandateSubmissionDetailsResponse;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.PaymentAdmissionDetailsResponse;
import io.swagger.model.PaymentAdmissionTaskAmendment;
import io.swagger.model.PaymentAdmissionTaskDetailsResponse;
import io.swagger.model.PaymentAdmissionTaskListResponse;
import io.swagger.model.PaymentCreation;
import io.swagger.model.PaymentCreationResponse;
import io.swagger.model.PaymentDetailsListResponse;
import io.swagger.model.PaymentDetailsResponse;
import io.swagger.model.PaymentSubmissionCreation;
import io.swagger.model.PaymentSubmissionCreationResponse;
import io.swagger.model.PaymentSubmissionDetailsResponse;
import io.swagger.model.QueryAdmissionResponse;
import io.swagger.model.QueryCreation;
import io.swagger.model.QueryFetchResponse;
import io.swagger.model.QueryListResponse;
import io.swagger.model.QueryResponseAdmissionResponse;
import io.swagger.model.QueryResponseCreation;
import io.swagger.model.QueryResponseResponse;
import io.swagger.model.QueryResponseSubmissionCreation;
import io.swagger.model.QueryResponseSubmissionResponse;
import io.swagger.model.QuerySubmissionCreation;
import io.swagger.model.QuerySubmissionResponse;
import io.swagger.model.RecallAdmissionDetailsResponse;
import io.swagger.model.RecallCreation;
import io.swagger.model.RecallCreationResponse;
import io.swagger.model.RecallDecisionAdmissionDetailsResponse;
import io.swagger.model.RecallDecisionCreation;
import io.swagger.model.RecallDecisionCreationResponse;
import io.swagger.model.RecallDecisionDetailsResponse;
import io.swagger.model.RecallDecisionSubmissionCreation;
import io.swagger.model.RecallDecisionSubmissionCreationResponse;
import io.swagger.model.RecallDecisionSubmissionDetailsResponse;
import io.swagger.model.RecallDetailsResponse;
import io.swagger.model.RecallReversalAdmissionDetailsResponse;
import io.swagger.model.RecallReversalDetailsResponse;
import io.swagger.model.RecallSubmissionCreation;
import io.swagger.model.RecallSubmissionCreationResponse;
import io.swagger.model.RecallSubmissionDetailsResponse;
import io.swagger.model.ReturnAdmissionDetailsResponse;
import io.swagger.model.ReturnCreation;
import io.swagger.model.ReturnCreationResponse;
import io.swagger.model.ReturnDetailsResponse;
import io.swagger.model.ReturnReversalAdmissionDetailsResponse;
import io.swagger.model.ReturnReversalCreation;
import io.swagger.model.ReturnReversalCreationResponse;
import io.swagger.model.ReturnReversalDetailsResponse;
import io.swagger.model.ReturnSubmissionCreation;
import io.swagger.model.ReturnSubmissionCreationResponse;
import io.swagger.model.ReturnSubmissionDetailsResponse;
import io.swagger.model.ReversalAdmissionDetailsResponse;
import io.swagger.model.ReversalCreation;
import io.swagger.model.ReversalCreationResponse;
import io.swagger.model.ReversalDetailsResponse;
import io.swagger.model.ReversalSubmissionCreation;
import io.swagger.model.ReversalSubmissionCreationResponse;
import io.swagger.model.ReversalSubmissionDetailsResponse;
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
public class TransactionApiController implements TransactionApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ClaimDetailsListResponse> transactionClaimsGet(@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_scheme]", required = false) String filterPaymentScheme,@ApiParam(value = "") @Valid @RequestParam(value = "filter[clearing_id]", required = false) String filterClearingId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reference]", required = false) String filterReference,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reason_code]", required = false) String filterReasonCode,@ApiParam(value = "") @Valid @RequestParam(value = "filter[contact_name]", required = false) String filterContactName,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.account_number]", required = false) String filterDebtorPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.bank_id]", required = false) String filterDebtorPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.account_number]", required = false) String filterBeneficiaryPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.bank_id]", required = false) String filterBeneficiaryPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[original_instruction.reference]", required = false) String filterOriginalInstructionReference,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.status]", required = false) String filterSubmissionStatus,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reversal.status]", required = false) String filterReversalStatus,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reversal.submission_date_from]", required = false) OffsetDateTime filterReversalSubmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reversal.submission_date_to]", required = false) OffsetDateTime filterReversalSubmissionDateTo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", ClaimDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimDetailsResponse> transactionClaimsIdGet(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimReversalDetailsResponse> transactionClaimsIdReversalsPost(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody ClaimReversalCreation claimReversalCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimReversalDetailsResponse> transactionClaimsIdReversalsReversalIdGet(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Claim Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimReversalSubmissionDetailsResponse> transactionClaimsIdReversalsReversalIdSubmissionsPost(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Claim Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = ""  )  @Valid @RequestBody ClaimReversalSubmissionCreation claimReversalSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimReversalSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimReversalSubmissionDetailsResponse> transactionClaimsIdReversalsReversalIdSubmissionsSubmissionIdGet(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Claim Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Claim Reversal Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimReversalSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimReversalSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimSubmissionDetailsResponse> transactionClaimsIdSubmissionsPost(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody ClaimSubmissionCreation claimSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimSubmissionDetailsResponse> transactionClaimsIdSubmissionsSubmissionIdGet(@ApiParam(value = "Claim Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Claim Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClaimDetailsResponse> transactionClaimsPost(@ApiParam(value = ""  )  @Valid @RequestBody ClaimCreation claimCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClaimDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ClaimDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClaimDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClaimDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDetailsListResponse> transactionDirectdebitsGet(@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[created_date_from]", required = false) OffsetDateTime filterCreatedDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[created_date_to]", required = false) OffsetDateTime filterCreatedDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[modified_date_from]", required = false) OffsetDateTime filterModifiedDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[modified_date_to]", required = false) OffsetDateTime filterModifiedDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.account_number]", required = false) String filterDebtorPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.bank_id]", required = false) String filterDebtorPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.account_number]", required = false) String filterBeneficiaryPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.bank_id]", required = false) String filterBeneficiaryPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[currency]", required = false) String filterCurrency,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_scheme]", required = false) String filterPaymentScheme,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_type]", required = false) String filterPaymentType,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_from]", required = false) LocalDate filterProcessingDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_to]", required = false) LocalDate filterProcessingDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[clearing_id]", required = false) String filterClearingId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_from]", required = false) OffsetDateTime filterAdmissionAdmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_to]", required = false) OffsetDateTime filterAdmissionAdmissionDateTo,@ApiParam(value = "Filter by admission status") @Valid @RequestParam(value = "filter[admission.status]", required = false) String filterAdmissionStatus,@ApiParam(value = "Filter by admission scheme status code") @Valid @RequestParam(value = "filter[admission.scheme_status_code]", required = false) String filterAdmissionSchemeStatusCode,@ApiParam(value = "Filter by amount") @Valid @RequestParam(value = "filter[amount]", required = false) String filterAmount,@ApiParam(value = "Filter by reference") @Valid @RequestParam(value = "filter[reference]", required = false) String filterReference,@ApiParam(value = "Filter by unique scheme id") @Valid @RequestParam(value = "filter[unique_scheme_id]", required = false) String filterUniqueSchemeId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo,@ApiParam(value = "Filter by submission status") @Valid @RequestParam(value = "filter[submission.status]", required = false) String filterSubmissionStatus,@ApiParam(value = "Filter by submission scheme status code") @Valid @RequestParam(value = "filter[submission.scheme_status_code]", required = false) String filterSubmissionSchemeStatusCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitAdmissionDetailsResponse> transactionDirectdebitsIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionAdmissionDetailsResponse> transactionDirectdebitsIdDecisionsDecisionIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionAdmissionCreationResponse> transactionDirectdebitsIdDecisionsDecisionIdAdmissionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitDecisionAdmissionCreation directDebitAdmissionSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionAdmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionAdmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionAdmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionAdmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionDetailsResponse> transactionDirectdebitsIdDecisionsDecisionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision id",required=true) @PathVariable("decisionId") UUID decisionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionSubmissionCreationResponse> transactionDirectdebitsIdDecisionsDecisionIdSubmissionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitDecisionSubmissionCreation directDebitDecisionSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionSubmissionDetailsResponse> transactionDirectdebitsIdDecisionsDecisionIdSubmissionsSubmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = "Direct Debit decision submission id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDecisionCreationResponse> transactionDirectdebitsIdDecisionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitDecisionCreation directDebitDecisionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDecisionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDecisionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDecisionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDecisionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitDetailsResponse> transactionDirectdebitsIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitRecallCreationResponse> transactionDirectdebitsIdRecallsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitRecallCreation recallCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitRecallCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitRecallCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitRecallCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitRecallCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitRecallAdmissionDetailsResponse> transactionDirectdebitsIdRecallsRecallIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitRecallAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitRecallAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitRecallAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitRecallAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitRecallDetailsResponse> transactionDirectdebitsIdRecallsRecallIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitRecallDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitRecallDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitRecallDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitRecallDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitRecallSubmissionDetailsResponse> transactionDirectdebitsIdRecallsRecallIdSubmissionsSubmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Direct Debit decision submission id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitRecallSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitRecallSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitRecallSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitRecallSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnCreationResponse> transactionDirectdebitsIdReturnsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitReturnCreation returnCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnAdmissionDetailsResponse> transactionDirectdebitsIdReturnsReturnIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnDetailsResponse> transactionDirectdebitsIdReturnsReturnIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnReversalAdmissionDetailsResponse> transactionDirectdebitsIdReturnsReturnIdReversalsReversalIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnReversalAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnReversalAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnReversalAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnReversalAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnReversalDetailsResponse> transactionDirectdebitsIdReturnsReturnIdReversalsReversalIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnSubmissionCreationResponse> transactionDirectdebitsIdReturnsReturnIdSubmissionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitReturnSubmissionCreation returnSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReturnSubmissionDetailsResponse> transactionDirectdebitsIdReturnsReturnIdSubmissionsSubmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Direct Debit decision submission id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReturnSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReturnSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReturnSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReturnSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReversalCreationResponse> transactionDirectdebitsIdReversalsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitReversalCreation reversalCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReversalCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReversalCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReversalCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReversalCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReversalAdmissionDetailsResponse> transactionDirectdebitsIdReversalsReversalIdAdmissionsAdmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Direct Debit Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReversalAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReversalAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReversalAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReversalAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReversalDetailsResponse> transactionDirectdebitsIdReversalsReversalIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReversalSubmissionCreationResponse> transactionDirectdebitsIdReversalsReversalIdSubmissionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitReversalSubmissionCreation reversalSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReversalSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReversalSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReversalSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReversalSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitReversalSubmissionDetailsResponse> transactionDirectdebitsIdReversalsReversalIdSubmissionsSubmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Direct Debit decision submission id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitReversalSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitReversalSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitReversalSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitReversalSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitSubmissionCreationResponse> transactionDirectdebitsIdSubmissionsPost(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitSubmissionCreation directDebitSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitSubmissionDetailsResponse> transactionDirectdebitsIdSubmissionsSubmissionIdGet(@ApiParam(value = "Direct Debit Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Direct Debit decision submission id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirectDebitCreationResponse> transactionDirectdebitsPost(@ApiParam(value = ""  )  @Valid @RequestBody DirectDebitCreation directDebitCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirectDebitCreationResponse>(objectMapper.readValue("{\"empty\": false}", DirectDebitCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirectDebitCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirectDebitCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateDetailsListResponse> transactionMandatesGet(@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.account_number]", required = false) String filterDebtorPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.bank_id]", required = false) String filterDebtorPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.account_number]", required = false) String filterBeneficiaryPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.bank_id]", required = false) String filterBeneficiaryPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[currency]", required = false) String filterCurrency,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_scheme]", required = false) String filterPaymentScheme,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_type]", required = false) String filterPaymentType,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_from]", required = false) LocalDate filterProcessingDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_to]", required = false) LocalDate filterProcessingDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[scheme_processing_date_from]", required = false) LocalDate filterSchemeProcessingDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[scheme_processing_date_to]", required = false) LocalDate filterSchemeProcessingDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[clearing_id]", required = false) String filterClearingId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_from]", required = false) OffsetDateTime filterAdmissionAdmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_to]", required = false) OffsetDateTime filterAdmissionAdmissionDateTo,@ApiParam(value = "Filter by admission status") @Valid @RequestParam(value = "filter[admission.status]", required = false) String filterAdmissionStatus,@ApiParam(value = "Filter by admission scheme status code") @Valid @RequestParam(value = "filter[admission.scheme_status_code]", required = false) String filterAdmissionSchemeStatusCode,@ApiParam(value = "Filter by amount") @Valid @RequestParam(value = "filter[amount]", required = false) String filterAmount,@ApiParam(value = "Filter by reference") @Valid @RequestParam(value = "filter[reference]", required = false) String filterReference,@ApiParam(value = "Filter by unique scheme id") @Valid @RequestParam(value = "filter[unique_scheme_id]", required = false) String filterUniqueSchemeId,@ApiParam(value = "Include old versions of mandates") @Valid @RequestParam(value = "filter[all_versions]", required = false) Boolean filterAllVersions,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo,@ApiParam(value = "Filter by mandate status") @Valid @RequestParam(value = "filter[status]", required = false) String filterStatus,@ApiParam(value = "Filter by mandate status reason") @Valid @RequestParam(value = "filter[status_reason]", required = false) String filterStatusReason) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", MandateDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateAdmissionDetailsResponse> transactionMandatesIdAdmissionsAdmissionIdGet(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Mandate Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateDetailsResponse> transactionMandatesIdGet(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateDetailsResponse> transactionMandatesIdPatch(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody MandateAmendment mandateAmendment) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateReturnCreationResponse> transactionMandatesIdReturnsPost(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody MandateReturnCreation returnCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateReturnCreationResponse>(objectMapper.readValue("{\"empty\": false}", MandateReturnCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateReturnCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateReturnCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateReturnDetailsResponse> transactionMandatesIdReturnsReturnIdGet(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateReturnDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateReturnDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateReturnDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateReturnDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateReturnSubmissionCreationResponse> transactionMandatesIdReturnsReturnIdSubmissionsPost(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = ""  )  @Valid @RequestBody MandateReturnSubmissionCreation returnSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateReturnSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", MandateReturnSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateReturnSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateReturnSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateReturnSubmissionDetailsResponse> transactionMandatesIdReturnsReturnIdSubmissionsSubmissionIdGet(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateReturnSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateReturnSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateReturnSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateReturnSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateSubmissionDetailsResponse> transactionMandatesIdSubmissionsPost(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody MandateSubmissionCreation mandateSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateSubmissionDetailsResponse> transactionMandatesIdSubmissionsSubmissionIdGet(@ApiParam(value = "Mandate Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Mandate Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", MandateSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateCreationResponse> transactionMandatesPost(@ApiParam(value = ""  )  @Valid @RequestBody MandateCreation mandateCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MandateCreationResponse>(objectMapper.readValue("{\"empty\": false}", MandateCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentDetailsListResponse> transactionPaymentsGet(@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.account_number]", required = false) String filterDebtorPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[debtor_party.bank_id]", required = false) String filterDebtorPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.account_number]", required = false) String filterBeneficiaryPartyAccountNumber,@ApiParam(value = "") @Valid @RequestParam(value = "filter[beneficiary_party.bank_id]", required = false) String filterBeneficiaryPartyBankId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[currency]", required = false) String filterCurrency,@ApiParam(value = "") @Valid @RequestParam(value = "filter[scheme_transaction_id]", required = false) String filterSchemeTransactionId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_scheme]", required = false) String filterPaymentScheme,@ApiParam(value = "") @Valid @RequestParam(value = "filter[payment_type]", required = false) String filterPaymentType,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_from]", required = false) LocalDate filterProcessingDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[processing_date_to]", required = false) LocalDate filterProcessingDateTo,@ApiParam(value = "") @Valid @RequestParam(value = "filter[unique_scheme_id]", required = false) String filterUniqueSchemeId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[amount]", required = false) String filterAmount,@ApiParam(value = "") @Valid @RequestParam(value = "filter[reference]", required = false) String filterReference,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_from]", required = false) OffsetDateTime filterSubmissionSubmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[submission.submission_date_to]", required = false) OffsetDateTime filterSubmissionSubmissionDateTo,@ApiParam(value = "Filter by submission status") @Valid @RequestParam(value = "filter[submission.status]", required = false) String filterSubmissionStatus,@ApiParam(value = "Filter by submission scheme status code") @Valid @RequestParam(value = "filter[submission.scheme_status_code]", required = false) String filterSubmissionSchemeStatusCode,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_from]", required = false) OffsetDateTime filterAdmissionAdmissionDateFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[admission.admission_date_to]", required = false) OffsetDateTime filterAdmissionAdmissionDateTo,@ApiParam(value = "Filter by admission status") @Valid @RequestParam(value = "filter[admission.status]", required = false) String filterAdmissionStatus,@ApiParam(value = "Filter by admission scheme status code") @Valid @RequestParam(value = "filter[admission.scheme_status_code]", required = false) String filterAdmissionSchemeStatusCode,@ApiParam(value = "Filter for payments containing all of the requested relationships", allowableValues = "payment_submissions, payment_admissions, reversals, recalls, returns, payment_advices") @Valid @RequestParam(value = "filter[relationships]", required = false) List<String> filterRelationships,@ApiParam(value = "Filter for payments containing none of the requested relationships", allowableValues = "payment_submissions, payment_admissions, reversals, recalls, returns, payment_advices") @Valid @RequestParam(value = "filter[not_relationships]", required = false) List<String> filterNotRelationships) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", PaymentDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentAdmissionDetailsResponse> transactionPaymentsIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", PaymentAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentAdmissionTaskListResponse> transactionPaymentsIdAdmissionsAdmissionIdTasksGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentAdmissionTaskListResponse>(objectMapper.readValue("{\"empty\": false}", PaymentAdmissionTaskListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentAdmissionTaskListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentAdmissionTaskListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentAdmissionTaskDetailsResponse> transactionPaymentsIdAdmissionsAdmissionIdTasksTaskIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId,@ApiParam(value = "Payment Admission Task Id",required=true) @PathVariable("taskId") UUID taskId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(objectMapper.readValue("{\"empty\": false}", PaymentAdmissionTaskDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentAdmissionTaskDetailsResponse> transactionPaymentsIdAdmissionsAdmissionIdTasksTaskIdPatch(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId,@ApiParam(value = "Payment Admission Task Id",required=true) @PathVariable("taskId") UUID taskId,@ApiParam(value = ""  )  @Valid @RequestBody PaymentAdmissionTaskAmendment paymentAdmissionTaskPatchRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(objectMapper.readValue("{\"empty\": false}", PaymentAdmissionTaskDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentAdmissionTaskDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdviceDetailsResponse> transactionPaymentsIdAdvicesAdviceIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Advice Id",required=true) @PathVariable("adviceId") UUID adviceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdviceDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AdviceDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdviceDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdviceDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdviceSubmissionCreationResponse> transactionPaymentsIdAdvicesAdviceIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Advice Id",required=true) @PathVariable("adviceId") UUID adviceId,@ApiParam(value = ""  )  @Valid @RequestBody AdviceSubmissionCreation adviceSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdviceSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", AdviceSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdviceSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdviceSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdviceSubmissionDetailsResponse> transactionPaymentsIdAdvicesAdviceIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Advice Id",required=true) @PathVariable("adviceId") UUID adviceId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdviceSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AdviceSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdviceSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdviceSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdviceCreationResponse> transactionPaymentsIdAdvicesPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody AdviceCreation adviceCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdviceCreationResponse>(objectMapper.readValue("{\"empty\": false}", AdviceCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdviceCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdviceCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentDetailsResponse> transactionPaymentsIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentDetailsResponse>(objectMapper.readValue("{\"empty\": false}", PaymentDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallCreationResponse> transactionPaymentsIdRecallsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody RecallCreation recallCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallCreationResponse>(objectMapper.readValue("{\"empty\": false}", RecallCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallAdmissionDetailsResponse> transactionPaymentsIdRecallsRecallIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDecisionAdmissionDetailsResponse> transactionPaymentsIdRecallsRecallIdDecisionsDecisionIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Decision Id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDecisionAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallDecisionAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDecisionAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDecisionAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDecisionDetailsResponse> transactionPaymentsIdRecallsRecallIdDecisionsDecisionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Decision Id",required=true) @PathVariable("decisionId") UUID decisionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDecisionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallDecisionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDecisionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDecisionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDecisionSubmissionCreationResponse> transactionPaymentsIdRecallsRecallIdDecisionsDecisionIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Decision Id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = ""  )  @Valid @RequestBody RecallDecisionSubmissionCreation recallDecisionSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDecisionSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", RecallDecisionSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDecisionSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDecisionSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDecisionSubmissionDetailsResponse> transactionPaymentsIdRecallsRecallIdDecisionsDecisionIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Decision Id",required=true) @PathVariable("decisionId") UUID decisionId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDecisionSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallDecisionSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDecisionSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDecisionSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDecisionCreationResponse> transactionPaymentsIdRecallsRecallIdDecisionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = ""  )  @Valid @RequestBody RecallDecisionCreation recallDecisionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDecisionCreationResponse>(objectMapper.readValue("{\"empty\": false}", RecallDecisionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDecisionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDecisionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallDetailsResponse> transactionPaymentsIdRecallsRecallIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallReversalAdmissionDetailsResponse> transactionPaymentsIdRecallsRecallIdReversalsReversalIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallReversalAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallReversalAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallReversalAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallReversalAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallReversalDetailsResponse> transactionPaymentsIdRecallsRecallIdReversalsReversalIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallSubmissionCreationResponse> transactionPaymentsIdRecallsRecallIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = ""  )  @Valid @RequestBody RecallSubmissionCreation recallSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", RecallSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecallSubmissionDetailsResponse> transactionPaymentsIdRecallsRecallIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Recall Id",required=true) @PathVariable("recallId") UUID recallId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecallSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RecallSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecallSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecallSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnCreationResponse> transactionPaymentsIdReturnsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody ReturnCreation returnCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnCreationResponse>(objectMapper.readValue("{\"empty\": false}", ReturnCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnAdmissionDetailsResponse> transactionPaymentsIdReturnsReturnIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReturnAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnDetailsResponse> transactionPaymentsIdReturnsReturnIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReturnDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnReversalCreationResponse> transactionPaymentsIdReturnsReturnIdReversalsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = ""  )  @Valid @RequestBody ReturnReversalCreation returnReversalCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnReversalCreationResponse>(objectMapper.readValue("{\"empty\": false}", ReturnReversalCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnReversalCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnReversalCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnReversalAdmissionDetailsResponse> transactionPaymentsIdReturnsReturnIdReversalsReversalIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnReversalAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReturnReversalAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnReversalAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnReversalAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnReversalDetailsResponse> transactionPaymentsIdReturnsReturnIdReversalsReversalIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReturnReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnSubmissionCreationResponse> transactionPaymentsIdReturnsReturnIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = ""  )  @Valid @RequestBody ReturnSubmissionCreation returnSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", ReturnSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReturnSubmissionDetailsResponse> transactionPaymentsIdReturnsReturnIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Return Id",required=true) @PathVariable("returnId") UUID returnId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReturnSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReturnSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReturnSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReversalCreationResponse> transactionPaymentsIdReversalsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody ReversalCreation reversalCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReversalCreationResponse>(objectMapper.readValue("{\"empty\": false}", ReversalCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReversalCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReversalCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReversalAdmissionDetailsResponse> transactionPaymentsIdReversalsReversalIdAdmissionsAdmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReversalAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReversalAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReversalAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReversalAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReversalDetailsResponse> transactionPaymentsIdReversalsReversalIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReversalDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReversalDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReversalDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReversalDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReversalSubmissionCreationResponse> transactionPaymentsIdReversalsReversalIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = ""  )  @Valid @RequestBody ReversalSubmissionCreation reversalSubmissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReversalSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", ReversalSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReversalSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReversalSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReversalSubmissionDetailsResponse> transactionPaymentsIdReversalsReversalIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Reversal Id",required=true) @PathVariable("reversalId") UUID reversalId,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReversalSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReversalSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReversalSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReversalSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentSubmissionCreationResponse> transactionPaymentsIdSubmissionsPost(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody PaymentSubmissionCreation submissionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentSubmissionCreationResponse>(objectMapper.readValue("{\"empty\": false}", PaymentSubmissionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentSubmissionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentSubmissionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentSubmissionDetailsResponse> transactionPaymentsIdSubmissionsSubmissionIdGet(@ApiParam(value = "Payment Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Submission Id",required=true) @PathVariable("submissionId") UUID submissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentSubmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", PaymentSubmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentSubmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentSubmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentCreationResponse> transactionPaymentsPost(@ApiParam(value = ""  )  @Valid @RequestBody PaymentCreation paymentCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentCreationResponse>(objectMapper.readValue("{\"empty\": false}", PaymentCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryListResponse> transactionQueriesGet(@ApiParam(value = "The organisations to filter on") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "Find all queries for a given status", allowableValues = "pending, closed") @Valid @RequestParam(value = "filter[status]", required = false) String filterStatus,@ApiParam(value = "Find all queries for a given query type") @Valid @RequestParam(value = "filter[query_type]", required = false) String filterQueryType,@ApiParam(value = "Find all queries for given auto handled flag") @Valid @RequestParam(value = "filter[auto_handled]", required = false) Boolean filterAutoHandled,@ApiParam(value = "Find all queries from a certain value date.") @Valid @RequestParam(value = "filter[processing_date_from]", required = false) LocalDate filterProcessingDateFrom,@ApiParam(value = "Find all queries up to a certain value date.") @Valid @RequestParam(value = "filter[processing_date_to]", required = false) LocalDate filterProcessingDateTo,@ApiParam(value = "Find all queries from a certain created date.") @Valid @RequestParam(value = "filter[created_on_from]", required = false) OffsetDateTime filterCreatedOnFrom,@ApiParam(value = "Find all queries up to a certain created date.") @Valid @RequestParam(value = "filter[created_on_to]", required = false) OffsetDateTime filterCreatedOnTo,@ApiParam(value = "Find all queries with a certain payment id.") @Valid @RequestParam(value = "filter[payment.id]", required = false) UUID filterPaymentId,@ApiParam(value = "Find all queries with a certain payment admission id.") @Valid @RequestParam(value = "filter[payment_admission.id]", required = false) UUID filterPaymentAdmissionId,@ApiParam(value = "Find all queries with a certain payment submission id.") @Valid @RequestParam(value = "filter[payment_submission.id]", required = false) UUID filterPaymentSubmissionId,@ApiParam(value = "Find all queries with a certain recall id.") @Valid @RequestParam(value = "filter[recall.id]", required = false) UUID filterRecallId,@ApiParam(value = "Find all queries with a certain recall submission id.") @Valid @RequestParam(value = "filter[recall_submission.id]", required = false) UUID filterRecallSubmissionId,@ApiParam(value = "Find all queries with a certain query id.") @Valid @RequestParam(value = "filter[query.id]", required = false) UUID filterQueryId,@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryListResponse>(objectMapper.readValue("{\"empty\": false}", QueryListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryFetchResponse> transactionQueriesPost(@ApiParam(value = ""  )  @Valid @RequestBody QueryCreation creationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryFetchResponse>(objectMapper.readValue("{\"empty\": false}", QueryFetchResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryFetchResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryFetchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryAdmissionResponse> transactionQueriesQueryIdAdmissionsQueryAdmissionIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Admission ID",required=true) @PathVariable("query_admission_id") UUID queryAdmissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryAdmissionResponse>(objectMapper.readValue("{\"empty\": false}", QueryAdmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryAdmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryAdmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryFetchResponse> transactionQueriesQueryIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryFetchResponse>(objectMapper.readValue("{\"empty\": false}", QueryFetchResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryFetchResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryFetchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryResponseResponse> transactionQueriesQueryIdResponsesPost(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = ""  )  @Valid @RequestBody QueryResponseCreation creationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryResponseResponse>(objectMapper.readValue("{\"empty\": false}", QueryResponseResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryResponseResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryResponseResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryResponseAdmissionResponse> transactionQueriesQueryIdResponsesQueryResponseIdAdmissionsQueryResponseAdmissionIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Response ID",required=true) @PathVariable("query_response_id") UUID queryResponseId,@ApiParam(value = "Query Response Admission ID",required=true) @PathVariable("query_response_admission_id") UUID queryResponseAdmissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryResponseAdmissionResponse>(objectMapper.readValue("{\"empty\": false}", QueryResponseAdmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryResponseAdmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryResponseAdmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryResponseResponse> transactionQueriesQueryIdResponsesQueryResponseIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Response ID",required=true) @PathVariable("query_response_id") UUID queryResponseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryResponseResponse>(objectMapper.readValue("{\"empty\": false}", QueryResponseResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryResponseResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryResponseResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryResponseSubmissionResponse> transactionQueriesQueryIdResponsesQueryResponseIdSubmissionsPost(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Response ID",required=true) @PathVariable("query_response_id") UUID queryResponseId,@ApiParam(value = ""  )  @Valid @RequestBody QueryResponseSubmissionCreation creationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryResponseSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", QueryResponseSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryResponseSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryResponseSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QueryResponseSubmissionResponse> transactionQueriesQueryIdResponsesQueryResponseIdSubmissionsQueryResponseSubmissionIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Response ID",required=true) @PathVariable("query_response_id") UUID queryResponseId,@ApiParam(value = "Query Response Submission ID",required=true) @PathVariable("query_response_submission_id") UUID queryResponseSubmissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QueryResponseSubmissionResponse>(objectMapper.readValue("{\"empty\": false}", QueryResponseSubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QueryResponseSubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QueryResponseSubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QuerySubmissionResponse> transactionQueriesQueryIdSubmissionsPost(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = ""  )  @Valid @RequestBody QuerySubmissionCreation creationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QuerySubmissionResponse>(objectMapper.readValue("{\"empty\": false}", QuerySubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QuerySubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QuerySubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QuerySubmissionResponse> transactionQueriesQueryIdSubmissionsQuerySubmissionIdGet(@ApiParam(value = "Query ID",required=true) @PathVariable("query_id") UUID queryId,@ApiParam(value = "Query Submission ID",required=true) @PathVariable("query_submission_id") UUID querySubmissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QuerySubmissionResponse>(objectMapper.readValue("{\"empty\": false}", QuerySubmissionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QuerySubmissionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QuerySubmissionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
