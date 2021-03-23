// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AccessControlEntryAction. */
public enum AccessControlEntryAction {
    /** Enum value Permit. */
    PERMIT("Permit"),

    /** Enum value Deny. */
    DENY("Deny");

    /** The actual serialized value for a AccessControlEntryAction instance. */
    private final String value;

    AccessControlEntryAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessControlEntryAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessControlEntryAction object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessControlEntryAction fromString(String value) {
        AccessControlEntryAction[] items = AccessControlEntryAction.values();
        for (AccessControlEntryAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}