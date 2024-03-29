// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.resources.models;

import com.azure.resourcemanager.hybrid.resources.fluent.models.TagValueInner;

/** An immutable client-side representation of TagValue. */
public interface TagValue {
    /**
     * Gets the id property: The tag value ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the tagValue property: The tag value.
     *
     * @return the tagValue value.
     */
    String tagValue();

    /**
     * Gets the count property: The tag value count.
     *
     * @return the count value.
     */
    TagCount count();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.resources.fluent.models.TagValueInner object.
     *
     * @return the inner object.
     */
    TagValueInner innerModel();
}
