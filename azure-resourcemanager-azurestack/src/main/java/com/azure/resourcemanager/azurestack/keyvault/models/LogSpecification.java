// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log specification of operation. */
@Fluent
public final class LogSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogSpecification.class);

    /*
     * Name of log specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of log specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Blob duration of specification.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the name property: Name of log specification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of log specification.
     *
     * @param name the name value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of log specification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of log specification.
     *
     * @param displayName the displayName value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: Blob duration of specification.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Blob duration of specification.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
