package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetAssetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GetAssetRequest  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("assetID")
  private String assetID;

  @JsonProperty("operationType")
  private String operationType;

  public GetAssetRequest assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

  /**
   * Asset ID of the registered asset to be queried in the catalog, or a name of the new asset to be created and registered by Fybrik
   * @return assetID
  */
  @NotNull 
  @Schema(name = "assetID", description = "Asset ID of the registered asset to be queried in the catalog, or a name of the new asset to be created and registered by Fybrik", required = true)
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public GetAssetRequest operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Type of operation requested for the asset
   * @return operationType
  */
  @NotNull 
  @Schema(name = "operationType", description = "Type of operation requested for the asset", required = true)
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssetRequest getAssetRequest = (GetAssetRequest) o;
    return Objects.equals(this.assetID, getAssetRequest.assetID) &&
        Objects.equals(this.operationType, getAssetRequest.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssetRequest {\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

