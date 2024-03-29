// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;

/** Specifies information about the proximity placement group. */
@Immutable
public final class ProximityPlacementGroupUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProximityPlacementGroupUpdate.class);

    /** {@inheritDoc} */
    @Override
    public ProximityPlacementGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
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
