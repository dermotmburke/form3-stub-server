/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AuditEntryListResponse;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T11:48:32.556Z")

@Validated
@Api(value = "audit", description = "the audit API")
@RequestMapping(value = "/v1")
public interface AuditApi {

    @ApiOperation(value = "List audit entries for this record type", nickname = "auditEntriesRecordTypeGet", notes = "", response = AuditEntryListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Audit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Audit details", response = AuditEntryListResponse.class) })
    @RequestMapping(value = "/audit/entries/{record_type}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AuditEntryListResponse> auditEntriesRecordTypeGet(@ApiParam(value = "Record Type",required=true) @PathVariable("record_type") String recordType,@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize,@ApiParam(value = "Cursor for next page (this is a base64-encoded UUID continuation token returned from the application and should not be manually generated)") @Valid @RequestParam(value = "page[after]", required = false) String pageAfter,@ApiParam(value = "Filter by organisation id") @Valid @RequestParam(value = "filter[organisation_id]", required = false) List<UUID> filterOrganisationId,@ApiParam(value = "") @Valid @RequestParam(value = "filter[action_time_from]", required = false) OffsetDateTime filterActionTimeFrom,@ApiParam(value = "") @Valid @RequestParam(value = "filter[action_time_to]", required = false) OffsetDateTime filterActionTimeTo);


    @ApiOperation(value = "Fetch audit entry list for this record type/id", nickname = "auditEntriesRecordTypeIdGet", notes = "", response = AuditEntryListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Audit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Audit details", response = AuditEntryListResponse.class) })
    @RequestMapping(value = "/audit/entries/{record_type}/{id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AuditEntryListResponse> auditEntriesRecordTypeIdGet(@ApiParam(value = "Record Type",required=true) @PathVariable("record_type") String recordType,@ApiParam(value = "Record Id",required=true) @PathVariable("id") UUID id);

}
