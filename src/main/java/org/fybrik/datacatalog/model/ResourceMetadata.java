package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.fybrik.datacatalog.model.ResourceColumn;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceMetadata defines model for resource metadata
 */

@Schema(name = "ResourceMetadata", description = "ResourceMetadata defines model for resource metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ResourceMetadata  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("columns")
  @Valid
  private List<ResourceColumn> columns = null;

  @JsonProperty("geography")
  private String geography;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("tags")
  @Valid
  private Map<String, Object> tags = null;

  public ResourceMetadata columns(List<ResourceColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ResourceMetadata addColumnsItem(ResourceColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Columns associated with the asset
   * @return columns
  */
  @Valid 
  @Schema(name = "columns", description = "Columns associated with the asset", required = false)
  public List<ResourceColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ResourceColumn> columns) {
    this.columns = columns;
  }

  public ResourceMetadata geography(String geography) {
    this.geography = geography;
    return this;
  }

  /**
   * Geography of the resource
   * @return geography
  */
  
  @Schema(name = "geography", description = "Geography of the resource", required = false)
  public String getGeography() {
    return geography;
  }

  public void setGeography(String geography) {
    this.geography = geography;
  }

  public ResourceMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the resource
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the resource", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceMetadata owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner of the resource
   * @return owner
  */
  
  @Schema(name = "owner", description = "Owner of the resource", required = false)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ResourceMetadata tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public ResourceMetadata putTagsItem(String key, Object tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Additional metadata for the asset/field
   * @return tags
  */
  
  @Schema(name = "tags", description = "Additional metadata for the asset/field", required = false)
  public Map<String, Object> getTags() {
    return tags;
  }

  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceMetadata resourceMetadata = (ResourceMetadata) o;
    return Objects.equals(this.columns, resourceMetadata.columns) &&
        Objects.equals(this.geography, resourceMetadata.geography) &&
        Objects.equals(this.name, resourceMetadata.name) &&
        Objects.equals(this.owner, resourceMetadata.owner) &&
        Objects.equals(this.tags, resourceMetadata.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, geography, name, owner, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceMetadata {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    geography: ").append(toIndentedString(geography)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

