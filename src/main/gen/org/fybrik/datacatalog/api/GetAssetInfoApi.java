/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.fybrik.datacatalog.api;

import org.fybrik.datacatalog.model.GetAssetRequest;
import org.fybrik.datacatalog.model.GetAssetResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "getAssetInfo", description = "the getAssetInfo API")
public interface GetAssetInfoApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /getAssetInfo : This REST API gets data asset information from the data catalog configured in fybrik for the data sets indicated in FybrikApplication yaml
     *
     * @param xRequestDatacatalogCred This header carries credential information related to relevant catalog from which the asset information needs to be retrieved. (required)
     * @param getAssetRequest Data Catalog Request Object. (required)
     * @return successful operation (status code 200)
     *         or Bad request - server cannot process the request due to client error (status code 400)
     */
    @Operation(
        operationId = "getAssetInfo",
        summary = "This REST API gets data asset information from the data catalog configured in fybrik for the data sets indicated in FybrikApplication yaml",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  GetAssetResponse.class))),
            @ApiResponse(responseCode = "400", description = "Bad request - server cannot process the request due to client error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/getAssetInfo",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<GetAssetResponse> getAssetInfo(
        @Parameter(name = "X-Request-Datacatalog-Cred", description = "This header carries credential information related to relevant catalog from which the asset information needs to be retrieved.", required = true, schema = @Schema(description = "")) @RequestHeader(value = "X-Request-Datacatalog-Cred", required = true) String xRequestDatacatalogCred,
        @Parameter(name = "GetAssetRequest", description = "Data Catalog Request Object.", required = true, schema = @Schema(description = "")) @Valid @RequestBody GetAssetRequest getAssetRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"resourceMetadata\" : { \"owner\" : \"owner\", \"columns\" : [ { \"name\" : \"name\", \"tags\" : { \"key\" : \"{}\" } }, { \"name\" : \"name\", \"tags\" : { \"key\" : \"{}\" } } ], \"geography\" : \"geography\", \"name\" : \"name\", \"tags\" : { \"key\" : \"{}\" } }, \"credentials\" : \"credentials\", \"details\" : { \"dataFormat\" : \"dataFormat\", \"connection\" : { \"google-sheets\" : { \"spreadsheet_id\" : \"spreadsheet_id\" }, \"s3\" : { \"bucket\" : \"bucket\", \"endpoint\" : \"endpoint\", \"object_key\" : \"object_key\", \"region\" : \"region\" }, \"db2\" : { \"database\" : \"database\", \"port\" : 0, \"ssl\" : false, \"table\" : \"table\", \"url\" : \"url\" }, \"fybrik-arrow-flight\" : { \"hostname\" : \"hostname\", \"scheme\" : \"scheme\", \"port\" : 6 }, \"kafka\" : { \"schema_registry\" : \"schema_registry\", \"key_deserializer\" : \"key_deserializer\", \"value_deserializer\" : \"value_deserializer\", \"sasl_mechanism\" : \"SCRAM-SHA-512\", \"security_protocol\" : \"SASL_SSL\", \"topic_name\" : \"topic_name\", \"bootstrap_servers\" : \"bootstrap_servers\", \"ssl_truststore\" : \"ssl_truststore\" }, \"name\" : \"name\", \"mysql\" : { \"database\" : \"database\", \"port\" : 1, \"host\" : \"host\", \"ssl\" : false, \"table\" : \"table\" }, \"https\" : { \"url\" : \"url\" }, \"postgres\" : { \"database\" : \"database\", \"port\" : 5, \"host\" : \"host\", \"ssl\" : false, \"table\" : \"table\" } } }, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
