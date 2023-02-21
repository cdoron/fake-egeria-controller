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
 * Connection information for accessing data in-memory using API of the Fybrik Arrow Flight server
 */

@Schema(name = "fybrik-arrow-flight", description = "Connection information for accessing data in-memory using API of the Fybrik Arrow Flight server")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FybrikArrowFlight  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("hostname")
  private String hostname;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("scheme")
  private String scheme;

  public FybrikArrowFlight hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Server host
   * @return hostname
  */
  @NotNull 
  @Schema(name = "hostname", description = "Server host", required = true)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public FybrikArrowFlight port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Server port
   * @return port
  */
  @NotNull 
  @Schema(name = "port", description = "Server port", required = true)
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public FybrikArrowFlight scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Scheme (grpc, http, https)
   * @return scheme
  */
  @NotNull 
  @Schema(name = "scheme", description = "Scheme (grpc, http, https)", required = true)
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FybrikArrowFlight fybrikArrowFlight = (FybrikArrowFlight) o;
    return Objects.equals(this.hostname, fybrikArrowFlight.hostname) &&
        Objects.equals(this.port, fybrikArrowFlight.port) &&
        Objects.equals(this.scheme, fybrikArrowFlight.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, port, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FybrikArrowFlight {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

