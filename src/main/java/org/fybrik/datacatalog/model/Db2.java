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
 * Connection information for accessing a table in a db2 database
 */

@Schema(name = "db2", description = "Connection information for accessing a table in a db2 database")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Db2  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("database")
  private String database;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("ssl")
  private Boolean ssl = false;

  @JsonProperty("table")
  private String table;

  @JsonProperty("url")
  private String url;

  public Db2 database(String database) {
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

  public Db2 port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Database port
   * @return port
  */
  @NotNull 
  @Schema(name = "port", description = "Database port", required = true)
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Db2 ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * SSL indicates whether the website is secured by an SSL certificate
   * @return ssl
  */
  
  @Schema(name = "ssl", description = "SSL indicates whether the website is secured by an SSL certificate", required = false)
  public Boolean getSsl() {
    return ssl;
  }

  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }

  public Db2 table(String table) {
    this.table = table;
    return this;
  }

  /**
   * Table name
   * @return table
  */
  @NotNull 
  @Schema(name = "table", description = "Table name", required = true)
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public Db2 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the database server
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL of the database server", required = true)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Db2 db2 = (Db2) o;
    return Objects.equals(this.database, db2.database) &&
        Objects.equals(this.port, db2.port) &&
        Objects.equals(this.ssl, db2.ssl) &&
        Objects.equals(this.table, db2.table) &&
        Objects.equals(this.url, db2.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, port, ssl, table, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Db2 {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

