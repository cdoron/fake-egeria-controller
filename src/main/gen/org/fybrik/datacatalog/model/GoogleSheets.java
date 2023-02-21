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
 * Connection information for accessing data in google-sheets
 */

@Schema(name = "google-sheets", description = "Connection information for accessing data in google-sheets")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GoogleSheets  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("spreadsheet_id")
  private String spreadsheetId;

  public GoogleSheets spreadsheetId(String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  /**
   * The link to the Google spreadsheet
   * @return spreadsheetId
  */
  @NotNull 
  @Schema(name = "spreadsheet_id", description = "The link to the Google spreadsheet", required = true)
  public String getSpreadsheetId() {
    return spreadsheetId;
  }

  public void setSpreadsheetId(String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSheets googleSheets = (GoogleSheets) o;
    return Objects.equals(this.spreadsheetId, googleSheets.spreadsheetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spreadsheetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSheets {\n");
    sb.append("    spreadsheetId: ").append(toIndentedString(spreadsheetId)).append("\n");
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

