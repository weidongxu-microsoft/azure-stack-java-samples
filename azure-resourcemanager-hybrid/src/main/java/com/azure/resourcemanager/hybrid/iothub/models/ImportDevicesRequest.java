// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Use to provide parameters when requesting an import of all devices in the hub. */
@Fluent
public final class ImportDevicesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportDevicesRequest.class);

    /*
     * The input blob container URI.
     */
    @JsonProperty(value = "inputBlobContainerUri", required = true)
    private String inputBlobContainerUri;

    /*
     * The output blob container URI.
     */
    @JsonProperty(value = "outputBlobContainerUri", required = true)
    private String outputBlobContainerUri;

    /**
     * Get the inputBlobContainerUri property: The input blob container URI.
     *
     * @return the inputBlobContainerUri value.
     */
    public String inputBlobContainerUri() {
        return this.inputBlobContainerUri;
    }

    /**
     * Set the inputBlobContainerUri property: The input blob container URI.
     *
     * @param inputBlobContainerUri the inputBlobContainerUri value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withInputBlobContainerUri(String inputBlobContainerUri) {
        this.inputBlobContainerUri = inputBlobContainerUri;
        return this;
    }

    /**
     * Get the outputBlobContainerUri property: The output blob container URI.
     *
     * @return the outputBlobContainerUri value.
     */
    public String outputBlobContainerUri() {
        return this.outputBlobContainerUri;
    }

    /**
     * Set the outputBlobContainerUri property: The output blob container URI.
     *
     * @param outputBlobContainerUri the outputBlobContainerUri value to set.
     * @return the ImportDevicesRequest object itself.
     */
    public ImportDevicesRequest withOutputBlobContainerUri(String outputBlobContainerUri) {
        this.outputBlobContainerUri = outputBlobContainerUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputBlobContainerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property inputBlobContainerUri in model ImportDevicesRequest"));
        }
        if (outputBlobContainerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property outputBlobContainerUri in model ImportDevicesRequest"));
        }
    }
}
