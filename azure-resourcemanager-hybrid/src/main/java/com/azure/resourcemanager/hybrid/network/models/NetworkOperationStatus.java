// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkOperationStatus. */
public final class NetworkOperationStatus extends ExpandableStringEnum<NetworkOperationStatus> {
    /** Static value InProgress for NetworkOperationStatus. */
    public static final NetworkOperationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for NetworkOperationStatus. */
    public static final NetworkOperationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for NetworkOperationStatus. */
    public static final NetworkOperationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a NetworkOperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkOperationStatus.
     */
    @JsonCreator
    public static NetworkOperationStatus fromString(String name) {
        return fromString(name, NetworkOperationStatus.class);
    }

    /** @return known NetworkOperationStatus values. */
    public static Collection<NetworkOperationStatus> values() {
        return values(NetworkOperationStatus.class);
    }
}
