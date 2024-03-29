// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Action. */
public enum Action {
    /** Enum value Allow. */
    ALLOW("Allow");

    /** The actual serialized value for a Action instance. */
    private final String value;

    Action(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Action instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Action object, or null if unable to parse.
     */
    @JsonCreator
    public static Action fromString(String value) {
        Action[] items = Action.values();
        for (Action item : items) {
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
