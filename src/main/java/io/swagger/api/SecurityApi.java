/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AceCreation;
import io.swagger.model.AceCreationResponse;
import io.swagger.model.AceDetailsListResponse;
import io.swagger.model.AceDetailsResponse;
import io.swagger.model.CredentialCreationResponse;
import io.swagger.model.RoleCreation;
import io.swagger.model.RoleCreationResponse;
import io.swagger.model.RoleDetailsListResponse;
import io.swagger.model.RoleDetailsResponse;
import java.util.UUID;
import io.swagger.model.UserCreation;
import io.swagger.model.UserCreationResponse;
import io.swagger.model.UserCredentialListResponse;
import io.swagger.model.UserDetailsListResponse;
import io.swagger.model.UserDetailsResponse;
import io.swagger.model.UserRoleListResponse;
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
@Api(value = "security", description = "the security API")
@RequestMapping(value = "/v1")
public interface SecurityApi {

    @ApiOperation(value = "List all roles", nickname = "securityRolesGet", notes = "", response = RoleDetailsListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Roles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of role details", response = RoleDetailsListResponse.class) })
    @RequestMapping(value = "/security/roles",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<RoleDetailsListResponse> securityRolesGet(@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize);


    @ApiOperation(value = "Create role", nickname = "securityRolesPost", notes = "", response = RoleCreationResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Roles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Role creation response", response = RoleCreationResponse.class) })
    @RequestMapping(value = "/security/roles",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<RoleCreationResponse> securityRolesPost(@ApiParam(value = ""  )  @Valid @RequestBody RoleCreation roleCreationRequest);


    @ApiOperation(value = "Delete Access Control Entry", nickname = "securityRolesRoleIdAcesAceIdDelete", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "ACE", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "ACE deleted OK") })
    @RequestMapping(value = "/security/roles/{role_id}/aces/{ace_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> securityRolesRoleIdAcesAceIdDelete(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = "Ace Id",required=true) @PathVariable("ace_id") UUID aceId);


    @ApiOperation(value = "Fetch Access Control Entry", nickname = "securityRolesRoleIdAcesAceIdGet", notes = "", response = AceDetailsResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "ACE", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ACE details", response = AceDetailsResponse.class) })
    @RequestMapping(value = "/security/roles/{role_id}/aces/{ace_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AceDetailsResponse> securityRolesRoleIdAcesAceIdGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = "Ace Id",required=true) @PathVariable("ace_id") UUID aceId);


    @ApiOperation(value = "List all Access Controls for role", nickname = "securityRolesRoleIdAcesGet", notes = "", response = AceDetailsListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "ACE", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of ACE details", response = AceDetailsListResponse.class) })
    @RequestMapping(value = "/security/roles/{role_id}/aces",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AceDetailsListResponse> securityRolesRoleIdAcesGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId);


    @ApiOperation(value = "Create Access Control Entry", nickname = "securityRolesRoleIdAcesPost", notes = "", response = AceCreationResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "ACE", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "ACE creation response", response = AceCreationResponse.class) })
    @RequestMapping(value = "/security/roles/{role_id}/aces",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AceCreationResponse> securityRolesRoleIdAcesPost(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = ""  )  @Valid @RequestBody AceCreation acECreationRequest);


    @ApiOperation(value = "Delete role", nickname = "securityRolesRoleIdDelete", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Roles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Role deleted") })
    @RequestMapping(value = "/security/roles/{role_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> securityRolesRoleIdDelete(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version);


    @ApiOperation(value = "Fetch role", nickname = "securityRolesRoleIdGet", notes = "", response = RoleDetailsResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Roles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Role details", response = RoleDetailsResponse.class) })
    @RequestMapping(value = "/security/roles/{role_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<RoleDetailsResponse> securityRolesRoleIdGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId);


    @ApiOperation(value = "List all users", nickname = "securityUsersGet", notes = "", response = UserDetailsListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of user details", response = UserDetailsListResponse.class) })
    @RequestMapping(value = "/security/users",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<UserDetailsListResponse> securityUsersGet(@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize);


    @ApiOperation(value = "Create user", nickname = "securityUsersPost", notes = "", response = UserCreationResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "User creation response", response = UserCreationResponse.class) })
    @RequestMapping(value = "/security/users",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<UserCreationResponse> securityUsersPost(@ApiParam(value = ""  )  @Valid @RequestBody UserCreation userCreationRequest);


    @ApiOperation(value = "Get access control list for user", nickname = "securityUsersUserIdAcesGet", notes = "", response = AceDetailsListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of access control entries for this user", response = AceDetailsListResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}/aces",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AceDetailsListResponse> securityUsersUserIdAcesGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Record type") @Valid @RequestParam(value = "filter[record_type]", required = false) String filterRecordType,@ApiParam(value = "Access action") @Valid @RequestParam(value = "filter[action]", required = false) String filterAction);


    @ApiOperation(value = "Delete credential for user", nickname = "securityUsersUserIdCredentialsClientIdDelete", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Credential deleted") })
    @RequestMapping(value = "/security/users/{user_id}/credentials/{client_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> securityUsersUserIdCredentialsClientIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "client id",required=true) @PathVariable("client_id") String clientId);


    @ApiOperation(value = "Fetch credentials for user", nickname = "securityUsersUserIdCredentialsGet", notes = "", response = UserCredentialListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of credentials for user", response = UserCredentialListResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}/credentials",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<UserCredentialListResponse> securityUsersUserIdCredentialsGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId);


    @ApiOperation(value = "Generate new credentials for a user", nickname = "securityUsersUserIdCredentialsPost", notes = "", response = CredentialCreationResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Credential creation response", response = CredentialCreationResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}/credentials",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CredentialCreationResponse> securityUsersUserIdCredentialsPost(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId);


    @ApiOperation(value = "Delete user", nickname = "securityUsersUserIdDelete", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User deleted") })
    @RequestMapping(value = "/security/users/{user_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> securityUsersUserIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version);


    @ApiOperation(value = "Fetch user", nickname = "securityUsersUserIdGet", notes = "", response = UserDetailsResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User details", response = UserDetailsResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<UserDetailsResponse> securityUsersUserIdGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId);


    @ApiOperation(value = "Edit user details", nickname = "securityUsersUserIdPatch", notes = "", response = UserDetailsResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User details", response = UserDetailsResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<UserDetailsResponse> securityUsersUserIdPatch(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = ""  )  @Valid @RequestBody UserCreation userUpdateRequest);


    @ApiOperation(value = "Get all roles for user", nickname = "securityUsersUserIdRolesGet", notes = "", response = UserRoleListResponse.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of roles for user", response = UserRoleListResponse.class) })
    @RequestMapping(value = "/security/users/{user_id}/roles",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<UserRoleListResponse> securityUsersUserIdRolesGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId);


    @ApiOperation(value = "Remove role from user", nickname = "securityUsersUserIdRolesRoleIdDelete", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User role deleted OK") })
    @RequestMapping(value = "/security/users/{user_id}/roles/{role_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> securityUsersUserIdRolesRoleIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId);


    @ApiOperation(value = "Add role to user", nickname = "securityUsersUserIdRolesRoleIdPost", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            
            })
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Role set OK") })
    @RequestMapping(value = "/security/users/{user_id}/roles/{role_id}",
        produces = { "application/vnd.api+json", "application/json" }, 
        consumes = { "application/vnd.api+json", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> securityUsersUserIdRolesRoleIdPost(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId);

}
