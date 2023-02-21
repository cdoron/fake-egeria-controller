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
 * CreateAssetResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateAssetResponse  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("assetID")
  private String assetID;

  public CreateAssetResponse assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

  /**
   * The ID of the created asset based on the source asset information given in CreateAssetRequest object
   * @return assetID
  */
  @NotNull 
  @Schema(name = "assetID", description = "The ID of the created asset based on the source asset information given in CreateAssetRequest object", required = true)
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetResponse createAssetResponse = (CreateAssetResponse) o;
    return Objects.equals(this.assetID, createAssetResponse.assetID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetResponse {\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
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

