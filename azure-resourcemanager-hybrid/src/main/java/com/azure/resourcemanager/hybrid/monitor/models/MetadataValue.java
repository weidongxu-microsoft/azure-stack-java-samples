// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.models;

import com.azure.resourcemanager.hybrid.monitor.fluent.models.MetadataValueInner;

/** An immutable client-side representation of MetadataValue. */
public interface MetadataValue {
    /**
     * Gets the name property: the name of the metadata.
     *
     * @return the name value.
     */
    LocalizableString name();

    /**
     * Gets the value property: the value of the metadata.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.monitor.fluent.models.MetadataValueInner object.
     *
     * @return the inner object.
     */
    MetadataValueInner innerModel();
}