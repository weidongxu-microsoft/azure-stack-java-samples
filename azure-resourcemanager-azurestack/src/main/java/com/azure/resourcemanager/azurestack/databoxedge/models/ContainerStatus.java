// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContainerStatus. */
public final class ContainerStatus extends ExpandableStringEnum<ContainerStatus> {
    /** Static value OK for ContainerStatus. */
    public static final ContainerStatus OK = fromString("OK");

    /** Static value Offline for ContainerStatus. */
    public static final ContainerStatus OFFLINE = fromString("Offline");

    /** Static value Unknown for ContainerStatus. */
    public static final ContainerStatus UNKNOWN = fromString("Unknown");

    /** Static value Updating for ContainerStatus. */
    public static final ContainerStatus UPDATING = fromString("Updating");

    /** Static value NeedsAttention for ContainerStatus. */
    public static final ContainerStatus NEEDS_ATTENTION = fromString("NeedsAttention");

    /**
     * Creates or finds a ContainerStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerStatus.
     */
    @JsonCreator
    public static ContainerStatus fromString(String name) {
        return fromString(name, ContainerStatus.class);
    }

    /** @return known ContainerStatus values. */
    public static Collection<ContainerStatus> values() {
        return values(ContainerStatus.class);
    }
}
