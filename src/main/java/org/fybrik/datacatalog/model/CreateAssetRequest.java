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
 * CreateAssetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateAssetRequest  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("credentials")
  private String credentials;

  @JsonProperty("destinationAssetID")
  private String destinationAssetID;

  @JsonProperty("destinationCatalogID")
  private String destinationCatalogID;

  @JsonProperty("details")
  private ResourceDetails details;

  @JsonProperty("resourceMetadata")
  private ResourceMetadata resourceMetadata;

  public CreateAssetRequest credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * The vault plugin path where the destination data credentials will be stored as kubernetes secrets
   * @return credentials
  */
  
  @Schema(name = "credentials", description = "The vault plugin path where the destination data credentials will be stored as kubernetes secrets", required = false)
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public CreateAssetRequest destinationAssetID(String destinationAssetID) {
    this.destinationAssetID = destinationAssetID;
    return this;
  }

  /**
   * Asset ID to be used for the created asset
   * @return destinationAssetID
  */
  
  @Schema(name = "destinationAssetID", description = "Asset ID to be used for the created asset", required = false)
  public String getDestinationAssetID() {
    return destinationAssetID;
  }

  public void setDestinationAssetID(String destinationAssetID) {
    this.destinationAssetID = destinationAssetID;
  }

  public CreateAssetRequest destinationCatalogID(String destinationCatalogID) {
    this.destinationCatalogID = destinationCatalogID;
    return this;
  }

  /**
   * The destination catalog id in which the new asset will be created based on the information provided in ResourceMetadata and ResourceDetails field
   * @return destinationCatalogID
  */
  @NotNull 
  @Schema(name = "destinationCatalogID", description = "The destination catalog id in which the new asset will be created based on the information provided in ResourceMetadata and ResourceDetails field", required = true)
  public String getDestinationCatalogID() {
    return destinationCatalogID;
  }

  public void setDestinationCatalogID(String destinationCatalogID) {
    this.destinationCatalogID = destinationCatalogID;
  }

  public CreateAssetRequest details(ResourceDetails details) {
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

  public CreateAssetRequest resourceMetadata(ResourceMetadata resourceMetadata) {
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
    CreateAssetRequest createAssetRequest = (CreateAssetRequest) o;
    return Objects.equals(this.credentials, createAssetRequest.credentials) &&
        Objects.equals(this.destinationAssetID, createAssetRequest.destinationAssetID) &&
        Objects.equals(this.destinationCatalogID, createAssetRequest.destinationCatalogID) &&
        Objects.equals(this.details, createAssetRequest.details) &&
        Objects.equals(this.resourceMetadata, createAssetRequest.resourceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, destinationAssetID, destinationCatalogID, details, resourceMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetRequest {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    destinationAssetID: ").append(toIndentedString(destinationAssetID)).append("\n");
    sb.append("    destinationCatalogID: ").append(toIndentedString(destinationCatalogID)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

