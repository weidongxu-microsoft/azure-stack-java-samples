// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.eventhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties to configure capture description for eventhub. */
@Fluent
public final class CaptureDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CaptureDescription.class);

    /*
     * A value that indicates whether capture description is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Enumerates the possible values for the encoding format of capture
     * description. Note: 'AvroDeflate' will be deprecated in New API Version
     */
    @JsonProperty(value = "encoding")
    private EncodingCaptureDescription encoding;

    /*
     * The time window allows you to set the frequency with which the capture
     * to Azure Blobs will happen, value should between 60 to 900 seconds
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /*
     * The size window defines the amount of data built up in your Event Hub
     * before an capture operation, value should be between 10485760 to
     * 524288000 bytes
     */
    @JsonProperty(value = "sizeLimitInBytes")
    private Integer sizeLimitInBytes;

    /*
     * Properties of Destination where capture will be stored. (Storage
     * Account, Blob Names)
     */
    @JsonProperty(value = "destination")
    private Destination destination;

    /*
     * A value that indicates whether to Skip Empty Archives
     */
    @JsonProperty(value = "skipEmptyArchives")
    private Boolean skipEmptyArchives;

    /**
     * Get the enabled property: A value that indicates whether capture description is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: A value that indicates whether capture description is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the encoding property: Enumerates the possible values for the encoding format of capture description. Note:
     * 'AvroDeflate' will be deprecated in New API Version.
     *
     * @return the encoding value.
     */
    public EncodingCaptureDescription encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Enumerates the possible values for the encoding format of capture description. Note:
     * 'AvroDeflate' will be deprecated in New API Version.
     *
     * @param encoding the encoding value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withEncoding(EncodingCaptureDescription encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The time window allows you to set the frequency with which the capture to
     * Azure Blobs will happen, value should between 60 to 900 seconds.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The time window allows you to set the frequency with which the capture to
     * Azure Blobs will happen, value should between 60 to 900 seconds.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the sizeLimitInBytes property: The size window defines the amount of data built up in your Event Hub before
     * an capture operation, value should be between 10485760 to 524288000 bytes.
     *
     * @return the sizeLimitInBytes value.
     */
    public Integer sizeLimitInBytes() {
        return this.sizeLimitInBytes;
    }

    /**
     * Set the sizeLimitInBytes property: The size window defines the amount of data built up in your Event Hub before
     * an capture operation, value should be between 10485760 to 524288000 bytes.
     *
     * @param sizeLimitInBytes the sizeLimitInBytes value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withSizeLimitInBytes(Integer sizeLimitInBytes) {
        this.sizeLimitInBytes = sizeLimitInBytes;
        return this;
    }

    /**
     * Get the destination property: Properties of Destination where capture will be stored. (Storage Account, Blob
     * Names).
     *
     * @return the destination value.
     */
    public Destination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Properties of Destination where capture will be stored. (Storage Account, Blob
     * Names).
     *
     * @param destination the destination value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the skipEmptyArchives property: A value that indicates whether to Skip Empty Archives.
     *
     * @return the skipEmptyArchives value.
     */
    public Boolean skipEmptyArchives() {
        return this.skipEmptyArchives;
    }

    /**
     * Set the skipEmptyArchives property: A value that indicates whether to Skip Empty Archives.
     *
     * @param skipEmptyArchives the skipEmptyArchives value to set.
     * @return the CaptureDescription object itself.
     */
    public CaptureDescription withSkipEmptyArchives(Boolean skipEmptyArchives) {
        this.skipEmptyArchives = skipEmptyArchives;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (destination() != null) {
            destination().validate();
        }
    }
}
