// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkUsageName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Usage details for subnet. */
@Immutable
public final class VirtualNetworkUsageInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkUsageInner.class);

    /*
     * Indicates number of IPs used from the Subnet.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double currentValue;

    /*
     * Subnet identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Indicates the size of the subnet.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /*
     * The name containing common and localized value for usage.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkUsageName name;

    /*
     * Usage units. Returns 'Count'
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Get the currentValue property: Indicates number of IPs used from the Subnet.
     *
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Get the id property: Subnet identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the limit property: Indicates the size of the subnet.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get the name property: The name containing common and localized value for usage.
     *
     * @return the name value.
     */
    public VirtualNetworkUsageName name() {
        return this.name;
    }

    /**
     * Get the unit property: Usage units. Returns 'Count'.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}