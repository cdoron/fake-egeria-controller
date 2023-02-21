package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.fybrik.datacatalog.model.Connection;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceDetails includes asset connection details
 */

@Schema(name = "ResourceDetails", description = "ResourceDetails includes asset connection details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ResourceDetails  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("connection")
  private Connection connection;

  @JsonProperty("dataFormat")
  private String dataFormat;

  public ResourceDetails connection(Connection connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  */
  @NotNull @Valid 
  @Schema(name = "connection", required = true)
  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  public ResourceDetails dataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  /**
   * Format in which the data is being read/written by the workload
   * @return dataFormat
  */
  
  @Schema(name = "dataFormat", description = "Format in which the data is being read/written by the workload", required = false)
  public String getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetails resourceDetails = (ResourceDetails) o;
    return Objects.equals(this.connection, resourceDetails.connection) &&
        Objects.equals(this.dataFormat, resourceDetails.dataFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, dataFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetails {\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
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

