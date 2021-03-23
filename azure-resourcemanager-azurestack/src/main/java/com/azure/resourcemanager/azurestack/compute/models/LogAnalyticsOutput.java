// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LogAnalytics output properties. */
@Immutable
public final class LogAnalyticsOutput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogAnalyticsOutput.class);

    /*
     * Output file Uri path to blob container.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private String output;

    /**
     * Get the output property: Output file Uri path to blob container.
     *
     * @return the output value.
     */
    public String output() {
        return this.output;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}