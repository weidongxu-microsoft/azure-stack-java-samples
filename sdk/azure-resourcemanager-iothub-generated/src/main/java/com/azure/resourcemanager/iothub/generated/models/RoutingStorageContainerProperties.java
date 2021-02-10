// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties related to a storage container endpoint. */
@Fluent
public final class RoutingStorageContainerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingStorageContainerProperties.class);

    /*
     * Id of the storage container endpoint
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The connection string of the storage account.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The url of the storage endpoint. It must include the protocol https://
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /*
     * Method used to authenticate against the storage endpoint
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The subscription identifier of the storage account.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The name of the resource group of the storage account.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /*
     * The name of storage container in the storage account.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * File name format for the blob. Default format is
     * {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are
     * mandatory but can be reordered.
     */
    @JsonProperty(value = "fileNameFormat")
    private String fileNameFormat;

    /*
     * Time interval at which blobs are written to storage. Value should be
     * between 60 and 720 seconds. Default value is 300 seconds.
     */
    @JsonProperty(value = "batchFrequencyInSeconds")
    private Integer batchFrequencyInSeconds;

    /*
     * Maximum number of bytes for each blob written to storage. Value should
     * be between 10485760(10MB) and 524288000(500MB). Default value is
     * 314572800(300MB).
     */
    @JsonProperty(value = "maxChunkSizeInBytes")
    private Integer maxChunkSizeInBytes;

    /*
     * Encoding that is used to serialize messages to blobs. Supported values
     * are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'.
     */
    @JsonProperty(value = "encoding")
    private RoutingStorageContainerPropertiesEncoding encoding;

    /**
     * Get the id property: Id of the storage container endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the storage container endpoint.
     *
     * @param id the id value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the connectionString property: The connection string of the storage account.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of the storage account.
     *
     * @param connectionString the connectionString value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the endpointUri property: The url of the storage endpoint. It must include the protocol https://.
     *
     * @return the endpointUri value.
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: The url of the storage endpoint. It must include the protocol https://.
     *
     * @param endpointUri the endpointUri value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get the authenticationType property: Method used to authenticate against the storage endpoint.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Method used to authenticate against the storage endpoint.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @param name the name value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription identifier of the storage account.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier of the storage account.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The name of the resource group of the storage account.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The name of the resource group of the storage account.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the containerName property: The name of storage container in the storage account.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The name of storage container in the storage account.
     *
     * @param containerName the containerName value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the fileNameFormat property: File name format for the blob. Default format is
     * {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     *
     * @return the fileNameFormat value.
     */
    public String fileNameFormat() {
        return this.fileNameFormat;
    }

    /**
     * Set the fileNameFormat property: File name format for the blob. Default format is
     * {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     *
     * @param fileNameFormat the fileNameFormat value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withFileNameFormat(String fileNameFormat) {
        this.fileNameFormat = fileNameFormat;
        return this;
    }

    /**
     * Get the batchFrequencyInSeconds property: Time interval at which blobs are written to storage. Value should be
     * between 60 and 720 seconds. Default value is 300 seconds.
     *
     * @return the batchFrequencyInSeconds value.
     */
    public Integer batchFrequencyInSeconds() {
        return this.batchFrequencyInSeconds;
    }

    /**
     * Set the batchFrequencyInSeconds property: Time interval at which blobs are written to storage. Value should be
     * between 60 and 720 seconds. Default value is 300 seconds.
     *
     * @param batchFrequencyInSeconds the batchFrequencyInSeconds value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withBatchFrequencyInSeconds(Integer batchFrequencyInSeconds) {
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        return this;
    }

    /**
     * Get the maxChunkSizeInBytes property: Maximum number of bytes for each blob written to storage. Value should be
     * between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     *
     * @return the maxChunkSizeInBytes value.
     */
    public Integer maxChunkSizeInBytes() {
        return this.maxChunkSizeInBytes;
    }

    /**
     * Set the maxChunkSizeInBytes property: Maximum number of bytes for each blob written to storage. Value should be
     * between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     *
     * @param maxChunkSizeInBytes the maxChunkSizeInBytes value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withMaxChunkSizeInBytes(Integer maxChunkSizeInBytes) {
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        return this;
    }

    /**
     * Get the encoding property: Encoding that is used to serialize messages to blobs. Supported values are 'avro',
     * 'avrodeflate', and 'JSON'. Default value is 'avro'.
     *
     * @return the encoding value.
     */
    public RoutingStorageContainerPropertiesEncoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Encoding that is used to serialize messages to blobs. Supported values are 'avro',
     * 'avrodeflate', and 'JSON'. Default value is 'avro'.
     *
     * @param encoding the encoding value to set.
     * @return the RoutingStorageContainerProperties object itself.
     */
    public RoutingStorageContainerProperties withEncoding(RoutingStorageContainerPropertiesEncoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model RoutingStorageContainerProperties"));
        }
        if (containerName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property containerName in model RoutingStorageContainerProperties"));
        }
    }
}