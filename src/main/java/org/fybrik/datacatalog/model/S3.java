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
 * Connection information for S3 compatible object store
 */

@Schema(name = "s3", description = "Connection information for S3 compatible object store")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class S3  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("bucket")
  private String bucket;

  @JsonProperty("endpoint")
  private String endpoint;

  @JsonProperty("object_key")
  private String objectKey;

  @JsonProperty("region")
  private String region;

  public S3 bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * S3 bucket name
   * @return bucket
  */
  @NotNull 
  @Schema(name = "bucket", description = "S3 bucket name", required = true)
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public S3 endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * S3 endpoint URL
   * @return endpoint
  */
  @NotNull 
  @Schema(name = "endpoint", description = "S3 endpoint URL", required = true)
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public S3 objectKey(String objectKey) {
    this.objectKey = objectKey;
    return this;
  }

  /**
   * File name or a prefix (for a partitioned asset)
   * @return objectKey
  */
  @NotNull 
  @Schema(name = "object_key", description = "File name or a prefix (for a partitioned asset)", required = true)
  public String getObjectKey() {
    return objectKey;
  }

  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  public S3 region(String region) {
    this.region = region;
    return this;
  }

  /**
   * S3 region, e.g., us-south
   * @return region
  */
  
  @Schema(name = "region", description = "S3 region, e.g., us-south", required = false)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3 s3 = (S3) o;
    return Objects.equals(this.bucket, s3.bucket) &&
        Objects.equals(this.endpoint, s3.endpoint) &&
        Objects.equals(this.objectKey, s3.objectKey) &&
        Objects.equals(this.region, s3.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, endpoint, objectKey, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3 {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

