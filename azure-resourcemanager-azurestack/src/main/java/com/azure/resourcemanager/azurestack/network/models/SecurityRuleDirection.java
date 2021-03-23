// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityRuleDirection. */
public final class SecurityRuleDirection extends ExpandableStringEnum<SecurityRuleDirection> {
    /** Static value Inbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection INBOUND = fromString("Inbound");

    /** Static value Outbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a SecurityRuleDirection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityRuleDirection.
     */
    @JsonCreator
    public static SecurityRuleDirection fromString(String name) {
        return fromString(name, SecurityRuleDirection.class);
    }

    /** @return known SecurityRuleDirection values. */
    public static Collection<SecurityRuleDirection> values() {
        return values(SecurityRuleDirection.class);
    }
}