package io.swagger.api;

import io.swagger.model.MetricsQueryResponse;
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
public class MetricsApiController implements MetricsApi {

    private static final Logger log = LoggerFactory.getLogger(MetricsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MetricsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<MetricsQueryResponse> metricsPrometheusApiV1QueryGet(@NotNull @ApiParam(value = "Query to Execute", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "RFC3339 or unix_timestamp") @Valid @RequestParam(value = "time", required = false) String time,@ApiParam(value = "See https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations") @Valid @RequestParam(value = "timeout", required = false) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MetricsQueryResponse>(objectMapper.readValue("{\"empty\": false}", MetricsQueryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MetricsQueryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MetricsQueryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MetricsQueryResponse> metricsPrometheusApiV1QueryPost(@ApiParam(value = "Query to Execute", required=true) @RequestParam(value="query", required=true)  String query,@ApiParam(value = "RFC3339 or unix_timestamp") @RequestParam(value="time", required=false)  String time,@ApiParam(value = "See https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations") @RequestParam(value="timeout", required=false)  String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MetricsQueryResponse>(objectMapper.readValue("{\"empty\": false}", MetricsQueryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MetricsQueryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MetricsQueryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MetricsQueryResponse> metricsPrometheusApiV1QueryRangeGet(@NotNull @ApiParam(value = "Query to Execute", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "RFC3339 or unix_timestamp") @Valid @RequestParam(value = "time", required = false) String time,@ApiParam(value = "See https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations") @Valid @RequestParam(value = "timeout", required = false) String timeout,@ApiParam(value = "RFC3339 or unix_timestamp") @Valid @RequestParam(value = "start", required = false) String start,@ApiParam(value = "RFC3339 or unix_timestamp") @Valid @RequestParam(value = "end", required = false) String end,@ApiParam(value = "duration or float") @Valid @RequestParam(value = "step", required = false) String step) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MetricsQueryResponse>(objectMapper.readValue("{\"empty\": false}", MetricsQueryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MetricsQueryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MetricsQueryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MetricsQueryResponse> metricsPrometheusApiV1QueryRangePost(@ApiParam(value = "Query to Execute", required=true) @RequestParam(value="query", required=true)  String query,@ApiParam(value = "RFC3339 or unix_timestamp") @RequestParam(value="time", required=false)  String time,@ApiParam(value = "See https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations") @RequestParam(value="timeout", required=false)  String timeout,@ApiParam(value = "RFC3339 or unix_timestamp") @RequestParam(value="start", required=false)  String start,@ApiParam(value = "RFC3339 or unix_timestamp") @RequestParam(value="end", required=false)  String end,@ApiParam(value = "duration or float") @RequestParam(value="step", required=false)  String step) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MetricsQueryResponse>(objectMapper.readValue("{\"empty\": false}", MetricsQueryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MetricsQueryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MetricsQueryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> metricsPrometheusFederateGet(@NotNull @ApiParam(value = "See https://prometheus.io/docs/prometheus/latest/querying/basics/#instant-vector-selectors", required = true) @Valid @RequestParam(value = "match[]", required = true) List<String> match) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
