// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of resource providers. */
@Fluent
public final class ProviderListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderListResult.class);

    /*
     * An array of resource providers.
     */
    @JsonProperty(value = "value")
    private List<ProviderInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of resource providers.
     *
     * @return the value value.
     */
    public List<ProviderInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of resource providers.
     *
     * @param value the value value to set.
     * @return the ProviderListResult object itself.
     */
    public ProviderListResult withValue(List<ProviderInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
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