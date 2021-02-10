// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VpnLinkConnectionMode. */
public final class VpnLinkConnectionMode extends ExpandableStringEnum<VpnLinkConnectionMode> {
    /** Static value Default for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode DEFAULT = fromString("Default");

    /** Static value ResponderOnly for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode RESPONDER_ONLY = fromString("ResponderOnly");

    /** Static value InitiatorOnly for VpnLinkConnectionMode. */
    public static final VpnLinkConnectionMode INITIATOR_ONLY = fromString("InitiatorOnly");

    /**
     * Creates or finds a VpnLinkConnectionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnLinkConnectionMode.
     */
    @JsonCreator
    public static VpnLinkConnectionMode fromString(String name) {
        return fromString(name, VpnLinkConnectionMode.class);
    }

    /** @return known VpnLinkConnectionMode values. */
    public static Collection<VpnLinkConnectionMode> values() {
        return values(VpnLinkConnectionMode.class);
    }
}