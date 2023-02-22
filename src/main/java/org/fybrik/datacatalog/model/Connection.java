package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.fybrik.datacatalog.model.Db2;
import org.fybrik.datacatalog.model.FybrikArrowFlight;
import org.fybrik.datacatalog.model.GoogleSheets;
import org.fybrik.datacatalog.model.Https;
import org.fybrik.datacatalog.model.Kafka;
import org.fybrik.datacatalog.model.Mysql;
import org.fybrik.datacatalog.model.Postgres;
import org.fybrik.datacatalog.model.S3;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of connection types supported for accessing data stores. Not all are necessarily supported by fybrik storage allocation mechanism used to store temporary/persistent datasets.
 */

@Schema(name = "Connection", description = "Details of connection types supported for accessing data stores. Not all are necessarily supported by fybrik storage allocation mechanism used to store temporary/persistent datasets.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Connection implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("db2")
  private Db2 db2;

  @JsonProperty("fybrik-arrow-flight")
  private FybrikArrowFlight fybrikArrowFlight;

  @JsonProperty("google-sheets")
  private GoogleSheets googleSheets;

  @JsonProperty("https")
  private Https https;

  @JsonProperty("kafka")
  private Kafka kafka;

  @JsonProperty("mysql")
  private Mysql mysql;

  @JsonProperty("name")
  private String name;

  @JsonProperty("postgres")
  private Postgres postgres;

  @JsonProperty("s3")
  private S3 s3;

  public Connection db2(Db2 db2) {
    this.db2 = db2;
    return this;
  }

  /**
   * Get db2
   * @return db2
  */
  @Valid 
  @Schema(name = "db2", required = false)
  public Db2 getDb2() {
    return db2;
  }

  public void setDb2(Db2 db2) {
    this.db2 = db2;
  }

  public Connection fybrikArrowFlight(FybrikArrowFlight fybrikArrowFlight) {
    this.fybrikArrowFlight = fybrikArrowFlight;
    return this;
  }

  /**
   * Get fybrikArrowFlight
   * @return fybrikArrowFlight
  */
  @Valid 
  @Schema(name = "fybrik-arrow-flight", required = false)
  public FybrikArrowFlight getFybrikArrowFlight() {
    return fybrikArrowFlight;
  }

  public void setFybrikArrowFlight(FybrikArrowFlight fybrikArrowFlight) {
    this.fybrikArrowFlight = fybrikArrowFlight;
  }

  public Connection googleSheets(GoogleSheets googleSheets) {
    this.googleSheets = googleSheets;
    return this;
  }

  /**
   * Get googleSheets
   * @return googleSheets
  */
  @Valid 
  @Schema(name = "google-sheets", required = false)
  public GoogleSheets getGoogleSheets() {
    return googleSheets;
  }

  public void setGoogleSheets(GoogleSheets googleSheets) {
    this.googleSheets = googleSheets;
  }

  public Connection https(Https https) {
    this.https = https;
    return this;
  }

  /**
   * Get https
   * @return https
  */
  @Valid 
  @Schema(name = "https", required = false)
  public Https getHttps() {
    return https;
  }

  public void setHttps(Https https) {
    this.https = https;
  }

  public Connection kafka(Kafka kafka) {
    this.kafka = kafka;
    return this;
  }

  /**
   * Get kafka
   * @return kafka
  */
  @Valid 
  @Schema(name = "kafka", required = false)
  public Kafka getKafka() {
    return kafka;
  }

  public void setKafka(Kafka kafka) {
    this.kafka = kafka;
  }

  public Connection mysql(Mysql mysql) {
    this.mysql = mysql;
    return this;
  }

  /**
   * Get mysql
   * @return mysql
  */
  @Valid 
  @Schema(name = "mysql", required = false)
  public Mysql getMysql() {
    return mysql;
  }

  public void setMysql(Mysql mysql) {
    this.mysql = mysql;
  }

  public Connection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the connection type to the data source
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the connection type to the data source", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Connection postgres(Postgres postgres) {
    this.postgres = postgres;
    return this;
  }

  /**
   * Get postgres
   * @return postgres
  */
  @Valid 
  @Schema(name = "postgres", required = false)
  public Postgres getPostgres() {
    return postgres;
  }

  public void setPostgres(Postgres postgres) {
    this.postgres = postgres;
  }

  public Connection s3(S3 s3) {
    this.s3 = s3;
    return this;
  }

  /**
   * Get s3
   * @return s3
  */
  @Valid 
  @Schema(name = "s3", required = false)
  public S3 getS3() {
    return s3;
  }

  public void setS3(S3 s3) {
    this.s3 = s3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.db2, connection.db2) &&
        Objects.equals(this.fybrikArrowFlight, connection.fybrikArrowFlight) &&
        Objects.equals(this.googleSheets, connection.googleSheets) &&
        Objects.equals(this.https, connection.https) &&
        Objects.equals(this.kafka, connection.kafka) &&
        Objects.equals(this.mysql, connection.mysql) &&
        Objects.equals(this.name, connection.name) &&
        Objects.equals(this.postgres, connection.postgres) &&
        Objects.equals(this.s3, connection.s3) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(db2, fybrikArrowFlight, googleSheets, https, kafka, mysql, name, postgres, s3, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    db2: ").append(toIndentedString(db2)).append("\n");
    sb.append("    fybrikArrowFlight: ").append(toIndentedString(fybrikArrowFlight)).append("\n");
    sb.append("    googleSheets: ").append(toIndentedString(googleSheets)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postgres: ").append(toIndentedString(postgres)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

