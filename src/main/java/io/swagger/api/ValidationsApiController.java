package io.swagger.api;

import io.swagger.model.AccountNumberDetailsResponse;
import io.swagger.model.ApiError;
import io.swagger.model.SortCodeDetailsResponse;
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
public class ValidationsApiController implements ValidationsApi {

    private static final Logger log = LoggerFactory.getLogger(ValidationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ValidationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccountNumberDetailsResponse> validationsGbsdcSortcodesSortcodeAccountnumbersAccountnumberGet(@ApiParam(value = "Sort code",required=true) @PathVariable("sortcode") String sortcode,@ApiParam(value = "Account number",required=true) @PathVariable("accountnumber") String accountnumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountNumberDetailsResponse>(objectMapper.readValue("{\"empty\": false}", AccountNumberDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountNumberDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountNumberDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SortCodeDetailsResponse> validationsGbsdcSortcodesSortcodeGet(@ApiParam(value = "Sort code",required=true) @PathVariable("sortcode") String sortcode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SortCodeDetailsResponse>(objectMapper.readValue("{\"empty\": false}", SortCodeDetailsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SortCodeDetailsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SortCodeDetailsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
