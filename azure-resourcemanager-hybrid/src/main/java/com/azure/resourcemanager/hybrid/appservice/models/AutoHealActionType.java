// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AutoHealActionType. */
public enum AutoHealActionType {
    /** Enum value Recycle. */
    RECYCLE("Recycle"),

    /** Enum value LogEvent. */
    LOG_EVENT("LogEvent"),

    /** Enum value CustomAction. */
    CUSTOM_ACTION("CustomAction");

    /** The actual serialized value for a AutoHealActionType instance. */
    private final String value;

    AutoHealActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoHealActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutoHealActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static AutoHealActionType fromString(String value) {
        AutoHealActionType[] items = AutoHealActionType.values();
        for (AutoHealActionType item : items) {
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
