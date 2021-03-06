// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The available private link resources for an IotHub. */
@Fluent
public final class PrivateLinkResourcesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesInner.class);

    /*
     * The list of available private link resources for an IotHub
     */
    @JsonProperty(value = "value")
    private List<GroupIdInformationInner> value;

    /**
     * Get the value property: The list of available private link resources for an IotHub.
     *
     * @return the value value.
     */
    public List<GroupIdInformationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of available private link resources for an IotHub.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourcesInner object itself.
     */
    public PrivateLinkResourcesInner withValue(List<GroupIdInformationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
