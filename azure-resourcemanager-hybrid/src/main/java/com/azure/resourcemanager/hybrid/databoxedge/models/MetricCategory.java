// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricCategory. */
public final class MetricCategory extends ExpandableStringEnum<MetricCategory> {
    /** Static value Capacity for MetricCategory. */
    public static final MetricCategory CAPACITY = fromString("Capacity");

    /** Static value Transaction for MetricCategory. */
    public static final MetricCategory TRANSACTION = fromString("Transaction");

    /**
     * Creates or finds a MetricCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricCategory.
     */
    @JsonCreator
    public static MetricCategory fromString(String name) {
        return fromString(name, MetricCategory.class);
    }

    /** @return known MetricCategory values. */
    public static Collection<MetricCategory> values() {
        return values(MetricCategory.class);
    }
}