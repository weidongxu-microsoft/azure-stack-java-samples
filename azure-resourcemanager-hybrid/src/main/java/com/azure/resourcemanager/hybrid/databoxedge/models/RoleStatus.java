// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoleStatus. */
public final class RoleStatus extends ExpandableStringEnum<RoleStatus> {
    /** Static value Enabled for RoleStatus. */
    public static final RoleStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for RoleStatus. */
    public static final RoleStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a RoleStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoleStatus.
     */
    @JsonCreator
    public static RoleStatus fromString(String name) {
        return fromString(name, RoleStatus.class);
    }

    /** @return known RoleStatus values. */
    public static Collection<RoleStatus> values() {
        return values(RoleStatus.class);
    }
}
