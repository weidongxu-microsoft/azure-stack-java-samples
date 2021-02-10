// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The instance view of a dedicated host that includes the name of the dedicated host. It is used for the response to
 * the instance view of a dedicated host group.
 */
@Immutable
public final class DedicatedHostInstanceViewWithName extends DedicatedHostInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostInstanceViewWithName.class);

    /*
     * The name of the dedicated host.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the name property: The name of the dedicated host.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedHostInstanceViewWithName withAvailableCapacity(DedicatedHostAvailableCapacity availableCapacity) {
        super.withAvailableCapacity(availableCapacity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedHostInstanceViewWithName withStatuses(List<InstanceViewStatus> statuses) {
        super.withStatuses(statuses);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}