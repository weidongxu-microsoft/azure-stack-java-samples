// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrchestrationServiceStateAction. */
public final class OrchestrationServiceStateAction extends ExpandableStringEnum<OrchestrationServiceStateAction> {
    /** Static value Resume for OrchestrationServiceStateAction. */
    public static final OrchestrationServiceStateAction RESUME = fromString("Resume");

    /** Static value Suspend for OrchestrationServiceStateAction. */
    public static final OrchestrationServiceStateAction SUSPEND = fromString("Suspend");

    /**
     * Creates or finds a OrchestrationServiceStateAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrchestrationServiceStateAction.
     */
    @JsonCreator
    public static OrchestrationServiceStateAction fromString(String name) {
        return fromString(name, OrchestrationServiceStateAction.class);
    }

    /** @return known OrchestrationServiceStateAction values. */
    public static Collection<OrchestrationServiceStateAction> values() {
        return values(OrchestrationServiceStateAction.class);
    }
}
