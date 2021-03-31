// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Describes the parameter of customer managed disk encryption set resource id that can be specified for disk.
 * &lt;br&gt;&lt;br&gt; NOTE: The disk encryption set resource id can only be specified for managed disk. Please refer
 * https://aka.ms/mdssewithcmkoverview for more details.
 */
@Immutable
public final class DiskEncryptionSetParameters extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskEncryptionSetParameters.class);

    /** {@inheritDoc} */
    @Override
    public DiskEncryptionSetParameters withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}