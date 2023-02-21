package org.fybrik.datacatalog.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceColumn represents a column in a tabular resource
 */

@Schema(name = "ResourceColumn", description = "ResourceColumn represents a column in a tabular resource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ResourceColumn  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tags")
  @Valid
  private Map<String, Object> tags = null;

  public ResourceColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the column
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the column", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceColumn tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public ResourceColumn putTagsItem(String key, Object tagsItem) {
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
    ResourceColumn resourceColumn = (ResourceColumn) o;
    return Objects.equals(this.name, resourceColumn.name) &&
        Objects.equals(this.tags, resourceColumn.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceColumn {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

