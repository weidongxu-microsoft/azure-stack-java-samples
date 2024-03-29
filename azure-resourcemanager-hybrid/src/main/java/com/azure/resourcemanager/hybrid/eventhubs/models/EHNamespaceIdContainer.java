// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The full ARM ID of an Event Hubs Namespace. */
@Fluent
public final class EHNamespaceIdContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceIdContainer.class);

    /*
     * id parameter
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: id parameter.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: id parameter.
     *
     * @param id the id value to set.
     * @return the EHNamespaceIdContainer object itself.
     */
    public EHNamespaceIdContainer withId(String id) {
        this.id = id;
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
