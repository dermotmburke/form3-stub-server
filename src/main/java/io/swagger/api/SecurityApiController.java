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
public class SecurityApiController implements SecurityApi {

    private static final Logger log = LoggerFactory.getLogger(SecurityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SecurityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RoleDetailsListResponse> securityRolesGet(@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", RoleDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RoleCreationResponse> securityRolesPost(@ApiParam(value = ""  )  @Valid @RequestBody RoleCreation roleCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleCreationResponse>(objectMapper.readValue("{\"empty\": false}", RoleCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityRolesRoleIdAcesAceIdDelete(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = "Ace Id",required=true) @PathVariable("ace_id") UUID aceId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AceDetailsResponse> securityRolesRoleIdAcesAceIdGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = "Ace Id",required=true) @PathVariable("ace_id") UUID aceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AceDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AceDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AceDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AceDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AceDetailsListResponse> securityRolesRoleIdAcesGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AceDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", AceDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AceDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AceDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AceCreationResponse> securityRolesRoleIdAcesPost(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@ApiParam(value = ""  )  @Valid @RequestBody AceCreation acECreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AceCreationResponse>(objectMapper.readValue("{\"empty\": false}", AceCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AceCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AceCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityRolesRoleIdDelete(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RoleDetailsResponse> securityRolesRoleIdGet(@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleDetailsResponse>(objectMapper.readValue("{\"empty\": false}", RoleDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserDetailsListResponse> securityUsersGet(@Min(0)@ApiParam(value = "Which page to select") @Valid @RequestParam(value = "page[number]", required = false) Integer pageNumber,@Min(0) @Max(1000) @ApiParam(value = "Number of items to select") @Valid @RequestParam(value = "page[size]", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", UserDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserCreationResponse> securityUsersPost(@ApiParam(value = ""  )  @Valid @RequestBody UserCreation userCreationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserCreationResponse>(objectMapper.readValue("{\"empty\": false}", UserCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AceDetailsListResponse> securityUsersUserIdAcesGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Record type") @Valid @RequestParam(value = "filter[record_type]", required = false) String filterRecordType,@ApiParam(value = "Access action") @Valid @RequestParam(value = "filter[action]", required = false) String filterAction) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AceDetailsListResponse>(objectMapper.readValue("{\"empty\": false}", AceDetailsListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AceDetailsListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AceDetailsListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityUsersUserIdCredentialsClientIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "client id",required=true) @PathVariable("client_id") String clientId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserCredentialListResponse> securityUsersUserIdCredentialsGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserCredentialListResponse>(objectMapper.readValue("{\"empty\": false}", UserCredentialListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserCredentialListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserCredentialListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CredentialCreationResponse> securityUsersUserIdCredentialsPost(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CredentialCreationResponse>(objectMapper.readValue("{\"empty\": false}", CredentialCreationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CredentialCreationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CredentialCreationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityUsersUserIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@NotNull @Min(0)@ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "version", required = true) Integer version) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserDetailsResponse> securityUsersUserIdGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDetailsResponse>(objectMapper.readValue("{\"empty\": false}", UserDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserDetailsResponse> securityUsersUserIdPatch(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = ""  )  @Valid @RequestBody UserCreation userUpdateRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDetailsResponse>(objectMapper.readValue("{\"empty\": false}", UserDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserRoleListResponse> securityUsersUserIdRolesGet(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserRoleListResponse>(objectMapper.readValue("{\"empty\": false}", UserRoleListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserRoleListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserRoleListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityUsersUserIdRolesRoleIdDelete(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> securityUsersUserIdRolesRoleIdPost(@ApiParam(value = "User Id",required=true) @PathVariable("user_id") UUID userId,@ApiParam(value = "Role Id",required=true) @PathVariable("role_id") UUID roleId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
