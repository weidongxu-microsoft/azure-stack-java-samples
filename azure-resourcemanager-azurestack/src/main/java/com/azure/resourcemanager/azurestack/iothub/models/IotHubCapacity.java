// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IoT Hub capacity information. */
@Immutable
public final class IotHubCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubCapacity.class);

    /*
     * The minimum number of units.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Long minimum;

    /*
     * The maximum number of units.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Long maximum;

    /*
     * The default number of units.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Long defaultProperty;

    /*
     * The type of the scaling enabled.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubScaleType scaleType;

    /**
     * Get the minimum property: The minimum number of units.
     *
     * @return the minimum value.
     */
    public Long minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The maximum number of units.
     *
     * @return the maximum value.
     */
    public Long maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultProperty property: The default number of units.
     *
     * @return the defaultProperty value.
     */
    public Long defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the scaleType property: The type of the scaling enabled.
     *
     * @return the scaleType value.
     */
    public IotHubScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}