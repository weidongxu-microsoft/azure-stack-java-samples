// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.iothub.fluent.models.IotHubDescriptionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON-serialized array of IotHubDescription objects with a next link. */
@Fluent
public final class IotHubDescriptionListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubDescriptionListResult.class);

    /*
     * The array of IotHubDescription objects.
     */
    @JsonProperty(value = "value")
    private List<IotHubDescriptionInner> value;

    /*
     * The next link.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The array of IotHubDescription objects.
     *
     * @return the value value.
     */
    public List<IotHubDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of IotHubDescription objects.
     *
     * @param value the value value to set.
     * @return the IotHubDescriptionListResult object itself.
     */
    public IotHubDescriptionListResult withValue(List<IotHubDescriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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