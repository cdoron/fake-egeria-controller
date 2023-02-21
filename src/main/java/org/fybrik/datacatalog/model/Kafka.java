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
 * Connection information for accessing a kafka topic
 */

@Schema(name = "kafka", description = "Connection information for accessing a kafka topic")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Kafka  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("bootstrap_servers")
  private String bootstrapServers;

  @JsonProperty("key_deserializer")
  private String keyDeserializer;

  @JsonProperty("sasl_mechanism")
  private String saslMechanism = "SCRAM-SHA-512";

  @JsonProperty("schema_registry")
  private String schemaRegistry;

  @JsonProperty("security_protocol")
  private String securityProtocol = "SASL_SSL";

  @JsonProperty("ssl_truststore")
  private String sslTruststore;

  @JsonProperty("topic_name")
  private String topicName;

  @JsonProperty("value_deserializer")
  private String valueDeserializer;

  public Kafka bootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
    return this;
  }

  /**
   * A comma-separated list of host/port pairs to use for establishing the initial connection to the Kafka cluster
   * @return bootstrapServers
  */
  @NotNull 
  @Schema(name = "bootstrap_servers", description = "A comma-separated list of host/port pairs to use for establishing the initial connection to the Kafka cluster", required = true)
  public String getBootstrapServers() {
    return bootstrapServers;
  }

  public void setBootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
  }

  public Kafka keyDeserializer(String keyDeserializer) {
    this.keyDeserializer = keyDeserializer;
    return this;
  }

  /**
   * Deserializer to be used for the keys of the topic
   * @return keyDeserializer
  */
  
  @Schema(name = "key_deserializer", description = "Deserializer to be used for the keys of the topic", required = false)
  public String getKeyDeserializer() {
    return keyDeserializer;
  }

  public void setKeyDeserializer(String keyDeserializer) {
    this.keyDeserializer = keyDeserializer;
  }

  public Kafka saslMechanism(String saslMechanism) {
    this.saslMechanism = saslMechanism;
    return this;
  }

  /**
   * SASL Mechanism to be used (e.g. PLAIN or SCRAM-SHA-512)
   * @return saslMechanism
  */
  
  @Schema(name = "sasl_mechanism", description = "SASL Mechanism to be used (e.g. PLAIN or SCRAM-SHA-512)", required = false)
  public String getSaslMechanism() {
    return saslMechanism;
  }

  public void setSaslMechanism(String saslMechanism) {
    this.saslMechanism = saslMechanism;
  }

  public Kafka schemaRegistry(String schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
    return this;
  }

  /**
   * Host/port to connect the schema registry server
   * @return schemaRegistry
  */
  
  @Schema(name = "schema_registry", description = "Host/port to connect the schema registry server", required = false)
  public String getSchemaRegistry() {
    return schemaRegistry;
  }

  public void setSchemaRegistry(String schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
  }

  public Kafka securityProtocol(String securityProtocol) {
    this.securityProtocol = securityProtocol;
    return this;
  }

  /**
   * Kafka security protocol one of (PLAINTEXT, SASL_PLAINTEXT, SASL_SSL, SSL)
   * @return securityProtocol
  */
  
  @Schema(name = "security_protocol", description = "Kafka security protocol one of (PLAINTEXT, SASL_PLAINTEXT, SASL_SSL, SSL)", required = false)
  public String getSecurityProtocol() {
    return securityProtocol;
  }

  public void setSecurityProtocol(String securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public Kafka sslTruststore(String sslTruststore) {
    this.sslTruststore = sslTruststore;
    return this;
  }

  /**
   * A truststore or certificate encoded as base64. The format can be JKS or PKCS12.
   * @return sslTruststore
  */
  
  @Schema(name = "ssl_truststore", description = "A truststore or certificate encoded as base64. The format can be JKS or PKCS12.", required = false)
  public String getSslTruststore() {
    return sslTruststore;
  }

  public void setSslTruststore(String sslTruststore) {
    this.sslTruststore = sslTruststore;
  }

  public Kafka topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Name of the Kafka topic
   * @return topicName
  */
  @NotNull 
  @Schema(name = "topic_name", description = "Name of the Kafka topic", required = true)
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public Kafka valueDeserializer(String valueDeserializer) {
    this.valueDeserializer = valueDeserializer;
    return this;
  }

  /**
   * Deserializer to be used for the values of the topic
   * @return valueDeserializer
  */
  
  @Schema(name = "value_deserializer", description = "Deserializer to be used for the values of the topic", required = false)
  public String getValueDeserializer() {
    return valueDeserializer;
  }

  public void setValueDeserializer(String valueDeserializer) {
    this.valueDeserializer = valueDeserializer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kafka kafka = (Kafka) o;
    return Objects.equals(this.bootstrapServers, kafka.bootstrapServers) &&
        Objects.equals(this.keyDeserializer, kafka.keyDeserializer) &&
        Objects.equals(this.saslMechanism, kafka.saslMechanism) &&
        Objects.equals(this.schemaRegistry, kafka.schemaRegistry) &&
        Objects.equals(this.securityProtocol, kafka.securityProtocol) &&
        Objects.equals(this.sslTruststore, kafka.sslTruststore) &&
        Objects.equals(this.topicName, kafka.topicName) &&
        Objects.equals(this.valueDeserializer, kafka.valueDeserializer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapServers, keyDeserializer, saslMechanism, schemaRegistry, securityProtocol, sslTruststore, topicName, valueDeserializer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kafka {\n");
    sb.append("    bootstrapServers: ").append(toIndentedString(bootstrapServers)).append("\n");
    sb.append("    keyDeserializer: ").append(toIndentedString(keyDeserializer)).append("\n");
    sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
    sb.append("    schemaRegistry: ").append(toIndentedString(schemaRegistry)).append("\n");
    sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
    sb.append("    sslTruststore: ").append(toIndentedString(sslTruststore)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    valueDeserializer: ").append(toIndentedString(valueDeserializer)).append("\n");
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

