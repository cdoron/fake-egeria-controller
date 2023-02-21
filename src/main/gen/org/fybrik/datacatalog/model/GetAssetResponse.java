package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.fybrik.datacatalog.model.ResourceDetails;
import org.fybrik.datacatalog.model.ResourceMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetAssetResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GetAssetResponse  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("credentials")
  private String credentials;

  @JsonProperty("details")
  private ResourceDetails details;

  @JsonProperty("message")
  private String message;

  @JsonProperty("resourceMetadata")
  private ResourceMetadata resourceMetadata;

  public GetAssetResponse credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Vault plugin path where the data credentials will be stored as kubernetes secrets This value is assumed to be known to the catalog connector.
   * @return credentials
  */
  @NotNull 
  @Schema(name = "credentials", description = "Vault plugin path where the data credentials will be stored as kubernetes secrets This value is assumed to be known to the catalog connector.", required = true)
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public GetAssetResponse details(ResourceDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @NotNull @Valid 
  @Schema(name = "details", required = true)
  public ResourceDetails getDetails() {
    return details;
  }

  public void setDetails(ResourceDetails details) {
    this.details = details;
  }

  public GetAssetResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Additional message to be reported to the user
   * @return message
  */
  
  @Schema(name = "message", description = "Additional message to be reported to the user", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetAssetResponse resourceMetadata(ResourceMetadata resourceMetadata) {
    this.resourceMetadata = resourceMetadata;
    return this;
  }

  /**
   * Get resourceMetadata
   * @return resourceMetadata
  */
  @NotNull @Valid 
  @Schema(name = "resourceMetadata", required = true)
  public ResourceMetadata getResourceMetadata() {
    return resourceMetadata;
  }

  public void setResourceMetadata(ResourceMetadata resourceMetadata) {
    this.resourceMetadata = resourceMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssetResponse getAssetResponse = (GetAssetResponse) o;
    return Objects.equals(this.credentials, getAssetResponse.credentials) &&
        Objects.equals(this.details, getAssetResponse.details) &&
        Objects.equals(this.message, getAssetResponse.message) &&
        Objects.equals(this.resourceMetadata, getAssetResponse.resourceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, details, message, resourceMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssetResponse {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceMetadata: ").append(toIndentedString(resourceMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

