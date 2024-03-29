// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes Windows Remote Management configuration of the VM. */
@Fluent
public final class WinRMConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WinRMConfiguration.class);

    /*
     * The list of Windows Remote Management listeners
     */
    @JsonProperty(value = "listeners")
    private List<WinRMListener> listeners;

    /**
     * Get the listeners property: The list of Windows Remote Management listeners.
     *
     * @return the listeners value.
     */
    public List<WinRMListener> listeners() {
        return this.listeners;
    }

    /**
     * Set the listeners property: The list of Windows Remote Management listeners.
     *
     * @param listeners the listeners value to set.
     * @return the WinRMConfiguration object itself.
     */
    public WinRMConfiguration withListeners(List<WinRMListener> listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (listeners() != null) {
            listeners().forEach(e -> e.validate());
        }
    }
}
