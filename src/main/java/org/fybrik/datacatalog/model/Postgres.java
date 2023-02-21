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
 * Connection information for accessing a table in a postgres database
 */

@Schema(name = "postgres", description = "Connection information for accessing a table in a postgres database")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Postgres  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("database")
  private String database;

  @JsonProperty("host")
  private String host;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("ssl")
  private Boolean ssl = false;

  @JsonProperty("table")
  private String table;

  public Postgres database(String database) {
    this.database = database;
    return this;
  }

  /**
   * Database name
   * @return database
  */
  @NotNull 
  @Schema(name = "database", description = "Database name", required = true)
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public Postgres host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Server host
   * @return host
  */
  @NotNull 
  @Schema(name = "host", description = "Server host", required = true)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Postgres port(Integer port) {
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

  public Postgres ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * SSL indicates whether to encrypt data using SSL
   * @return ssl
  */
  
  @Schema(name = "ssl", description = "SSL indicates whether to encrypt data using SSL", required = false)
  public Boolean getSsl() {
    return ssl;
  }

  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }

  public Postgres table(String table) {
    this.table = table;
    return this;
  }

  /**
   * Table name
   * @return table
  */
  
  @Schema(name = "table", description = "Table name", required = false)
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postgres postgres = (Postgres) o;
    return Objects.equals(this.database, postgres.database) &&
        Objects.equals(this.host, postgres.host) &&
        Objects.equals(this.port, postgres.port) &&
        Objects.equals(this.ssl, postgres.ssl) &&
        Objects.equals(this.table, postgres.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, host, port, ssl, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postgres {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

