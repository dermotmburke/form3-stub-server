package io.swagger.api;

import io.swagger.model.ApiError;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.ReportAdmissionDetailsResponse;
import io.swagger.model.ReportDetailsListResponse;
import io.swagger.model.ReportDetailsResponse;
import io.swagger.model.SchemeMessageAdmissionDetailsResponse;
import io.swagger.model.SchemeMessageDetailsListResponse;
import io.swagger.model.SchemeMessageDetailsResponse;
import io.swagger.model.SubscriptionAmendment;
import io.swagger.model.SubscriptionCreation;
import io.swagger.model.SubscriptionCreationResponse;
import io.swagger.model.SubscriptionDeliveryErrorListResponse;
import io.swagger.model.SubscriptionDetailsListResponse;
import io.swagger.model.SubscriptionDetailsResponse;
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
public class NotificationApiController implements NotificationApi {

    private static final Logger log = LoggerFactory.getLogger(NotificationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotificationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ReportDetailsListResponse> notificationReportsGet(@Pattern(regexp="^(first|last|[\\d]{1,4})$") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select", defaultValue = "100") @Valid @RequestParam(value = "page[size]", required = false, defaultValue="100") Integer pageSize,@ApiParam(value = "Filter by organisation Ids") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "Filter bu ReportType") @Valid @RequestParam(value = "filter[report_type]", required = false) String filterReportType,@ApiParam(value = "Filter by Report Type Description") @Valid @RequestParam(value = "filter[report_type_description]", required = false) String filterReportTypeDescription,@ApiParam(value = "Filter by Report Source") @Valid @RequestParam(value = "filter[report_source]", required = false) String filterReportSource,@ApiParam(value = "Request reports created after specific date time") @Valid @RequestParam(value = "filter[created_on_after]", required = false) OffsetDateTime filterCreatedOnAfter,@ApiParam(value = "Request reports created after specific date time") @Valid @RequestParam(value = "filter[created_on_before]", required = false) OffsetDateTime filterCreatedOnBefore,@ApiParam(value = "Request reports modified after specific date time") @Valid @RequestParam(value = "filter[modified_on_after]", required = false) OffsetDateTime filterModifiedOnAfter,@ApiParam(value = "Request reports modified before specific date time") @Valid @RequestParam(value = "filter[modified_on_before]", required = false) OffsetDateTime filterModifiedOnBefore) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReportDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", ReportDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReportDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReportDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReportAdmissionDetailsResponse> notificationReportsIdAdmissionsAdmissionIdGet(@ApiParam(value = "Report Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Report Admission ID",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReportAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReportAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReportAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReportAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReportDetailsResponse> notificationReportsIdGet(@ApiParam(value = "Report ID",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Acceptable Format" ,required=true) @RequestHeader(value="Accept", required=true) String accept) {
        String acceptHeader = request.getHeader("Accept");
        if (accept != null && acceptHeader.contains("application/json")) {
            try {
                return new ResponseEntity<ReportDetailsResponse>(objectMapper.readValue("{\"empty\": false}", ReportDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReportDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReportDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemeMessageDetailsListResponse> notificationSchememessagesGet(@Pattern(regexp="^(first|last|[\\d]{1,4})$") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select", defaultValue = "100") @Valid @RequestParam(value = "page[size]", required = false, defaultValue="100") Integer pageSize,@ApiParam(value = "Filter by Unique SchemeId") @Valid @RequestParam(value = "filter[unique_scheme_id]", required = false) String filterUniqueSchemeId,@ApiParam(value = "Filter by Scheme Message Type") @Valid @RequestParam(value = "filter[scheme_message_type]", required = false) String filterSchemeMessageType,@ApiParam(value = "Filter by Payment Scheme") @Valid @RequestParam(value = "filter[payment_scheme]", required = false) String filterPaymentScheme,@ApiParam(value = "Filter by Admission DateTime") @Valid @RequestParam(value = "filter[admission.admission_date_from]", required = false) OffsetDateTime filterAdmissionAdmissionDateFrom,@ApiParam(value = "Filter by Admission DateTime") @Valid @RequestParam(value = "filter[admission.admission_date_to]", required = false) OffsetDateTime filterAdmissionAdmissionDateTo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemeMessageDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", SchemeMessageDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemeMessageDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemeMessageDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemeMessageAdmissionDetailsResponse> notificationSchememessagesIdAdmissionsAdmissionIdGet(@ApiParam(value = "Scheme Message Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = "Scheme Message Admission Id",required=true) @PathVariable("admissionId") UUID admissionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemeMessageAdmissionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", SchemeMessageAdmissionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemeMessageAdmissionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemeMessageAdmissionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SchemeMessageDetailsResponse> notificationSchememessagesIdGet(@ApiParam(value = "Scheme Message Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SchemeMessageDetailsResponse>(objectMapper.readValue("{\"empty\": false}", SchemeMessageDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SchemeMessageDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SchemeMessageDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionDetailsListResponse> notificationSubscriptionsGet(@Pattern(regexp="$[A-z0-9]{4}^") @DecimalMin("0")@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) String pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Filter by event type") @Valid @RequestParam(value = "filter[event_type]", required = false) List<String> filterEventType,@ApiParam(value = "Filter by record type") @Valid @RequestParam(value = "filter[record_type]", required = false) List<String> filterRecordType,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "Filter by deactivated") @Valid @RequestParam(value = "filter[deactivated]", required = false) Boolean filterDeactivated,@ApiParam(value = "Filter by callback_transport") @Valid @RequestParam(value = "filter[callback_transport]", required = false) String filterCallbackTransport,@ApiParam(value = "Filter on callback_uri containing a search term") @Valid @RequestParam(value = "filter[callback_uri_search_term]", required = false) String filterCallbackUriSearchTerm,@ApiParam(value = "Filter by existence of notification filters") @Valid @RequestParam(value = "filter[notification_filter]", required = false) Boolean filterNotificationFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", SubscriptionDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> notificationSubscriptionsIdDelete(@ApiParam(value = "Subscription Id",required=true) @PathVariable("id") UUID id,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionDeliveryErrorListResponse> notificationSubscriptionsIdErrorsGet(@ApiParam(value = "",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionDeliveryErrorListResponse>(objectMapper.readValue("{\"empty\": false}", SubscriptionDeliveryErrorListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionDeliveryErrorListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionDeliveryErrorListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionDetailsResponse> notificationSubscriptionsIdGet(@ApiParam(value = "Subscription Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", SubscriptionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionDetailsResponse> notificationSubscriptionsIdPatch(@ApiParam(value = "Subscription Id",required=true) @PathVariable("id") UUID id,@ApiParam(value = ""  )  @Valid @RequestBody SubscriptionAmendment subscriptionUpdateRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionDetailsResponse>(objectMapper.readValue("{\"empty\": false}", SubscriptionDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionCreationResponse> notificationSubscriptionsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SubscriptionCreation subscriptionCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionCreationResponse>(objectMapper.readValue("{\"empty\": false}", SubscriptionCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
