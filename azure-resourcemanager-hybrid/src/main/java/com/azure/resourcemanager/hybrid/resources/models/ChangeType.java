// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ChangeType. */
public enum ChangeType {
    /** Enum value Create. */
    CREATE("Create"),

    /** Enum value Delete. */
    DELETE("Delete"),

    /** Enum value Ignore. */
    IGNORE("Ignore"),

    /** Enum value Deploy. */
    DEPLOY("Deploy"),

    /** Enum value NoChange. */
    NO_CHANGE("NoChange"),

    /** Enum value Modify. */
    MODIFY("Modify");

    /** The actual serialized value for a ChangeType instance. */
    private final String value;

    ChangeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ChangeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ChangeType object, or null if unable to parse.
     */
    @JsonCreator
    public static ChangeType fromString(String value) {
        ChangeType[] items = ChangeType.values();
        for (ChangeType item : items) {
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
