// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.monitor.fluent.models.MetricDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents collection of metric definitions. */
@Fluent
public final class MetricDefinitionCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricDefinitionCollection.class);

    /*
     * the values for the metric definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricDefinitionInner> value;

    /**
     * Get the value property: the values for the metric definitions.
     *
     * @return the value value.
     */
    public List<MetricDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the metric definitions.
     *
     * @param value the value value to set.
     * @return the MetricDefinitionCollection object itself.
     */
    public MetricDefinitionCollection withValue(List<MetricDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model MetricDefinitionCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
