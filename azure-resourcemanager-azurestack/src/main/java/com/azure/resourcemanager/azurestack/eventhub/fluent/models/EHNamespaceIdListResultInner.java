// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.eventhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.eventhub.models.EHNamespaceIdContainer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List Namespace IDs operation. */
@Fluent
public final class EHNamespaceIdListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceIdListResultInner.class);

    /*
     * Result of the List Namespace IDs operation
     */
    @JsonProperty(value = "value")
    private List<EHNamespaceIdContainer> value;

    /**
     * Get the value property: Result of the List Namespace IDs operation.
     *
     * @return the value value.
     */
    public List<EHNamespaceIdContainer> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Namespace IDs operation.
     *
     * @param value the value value to set.
     * @return the EHNamespaceIdListResultInner object itself.
     */
    public EHNamespaceIdListResultInner withValue(List<EHNamespaceIdContainer> value) {
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
