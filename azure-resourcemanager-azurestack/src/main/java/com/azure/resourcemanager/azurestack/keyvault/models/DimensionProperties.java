// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of operation: get, read, delete, etc. */
@Fluent
public final class DimensionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DimensionProperties.class);

    /*
     * Name of dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Property to specify whether the dimension should be exported for
     * shoebox.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get the name property: Name of dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of dimension.
     *
     * @param name the name value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of dimension.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of dimension.
     *
     * @param displayName the displayName value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: Property to specify whether the dimension should be exported for
     * shoebox.
     *
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: Property to specify whether the dimension should be exported for
     * shoebox.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
