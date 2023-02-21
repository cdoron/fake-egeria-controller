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
 * UpdateAssetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateAssetRequest  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("assetID")
  private String assetID;

  @JsonProperty("columns")
  @Valid
  private List<ResourceColumn> columns = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("tags")
  @Valid
  private Map<String, Object> tags = null;

  public UpdateAssetRequest assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

  /**
   * Asset ID of the registered asset to be queried in the catalog, or a name of the new asset to be created and registered by Fybrik
   * @return assetID
  */
  @NotNull 
  @Schema(name = "assetID", description = "Asset ID of the registered asset to be queried in the catalog, or a name of the new asset to be created and registered by Fybrik", required = true)
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public UpdateAssetRequest columns(List<ResourceColumn> columns) {
    this.columns = columns;
    return this;
  }

  public UpdateAssetRequest addColumnsItem(ResourceColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * New columns associated with the asset
   * @return columns
  */
  @Valid 
  @Schema(name = "columns", description = "New columns associated with the asset", required = false)
  public List<ResourceColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ResourceColumn> columns) {
    this.columns = columns;
  }

  public UpdateAssetRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * New name of the resource
   * @return name
  */
  
  @Schema(name = "name", description = "New name of the resource", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateAssetRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * New owner of the resource
   * @return owner
  */
  
  @Schema(name = "owner", description = "New owner of the resource", required = false)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public UpdateAssetRequest tags(Map<String, Object> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateAssetRequest putTagsItem(String key, Object tagsItem) {
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
    UpdateAssetRequest updateAssetRequest = (UpdateAssetRequest) o;
    return Objects.equals(this.assetID, updateAssetRequest.assetID) &&
        Objects.equals(this.columns, updateAssetRequest.columns) &&
        Objects.equals(this.name, updateAssetRequest.name) &&
        Objects.equals(this.owner, updateAssetRequest.owner) &&
        Objects.equals(this.tags, updateAssetRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID, columns, name, owner, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetRequest {\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

