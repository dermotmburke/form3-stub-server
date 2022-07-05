package io.swagger.api;

import io.swagger.model.AuditEntryListResponse;
import org.threeten.bp.OffsetDateTime;
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
public class AuditApiController implements AuditApi {

    private static final Logger log = LoggerFactory.getLogger(AuditApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuditApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AuditEntryListResponse> auditEntriesRecordTypeGet(@ApiParam(value = "Record Type",required=true) @PathVariable("record_type") String recordType,@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Cursor for next page (this is a base64-encoded UUID continuation token returned from the application and should not be manually generated)") @Valid @RequestParam(value = "page[after]", required = false) String pageAfter,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[action_time_from]", required = false) OffsetDateTime filterActionTimeFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[action_time_to]", required = false) OffsetDateTime filterActionTimeTo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditEntryListResponse>(objectMapper.readValue("{\"empty\": false}", AuditEntryListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditEntryListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditEntryListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditEntryListResponse> auditEntriesRecordTypeIdGet(@ApiParam(value = "Record Type",required=true) @PathVariable("record_type") String recordType,@ApiParam(value = "Record Id",required=true) @PathVariable("id") UUID id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditEntryListResponse>(objectMapper.readValue("{\"empty\": false}", AuditEntryListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditEntryListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditEntryListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
