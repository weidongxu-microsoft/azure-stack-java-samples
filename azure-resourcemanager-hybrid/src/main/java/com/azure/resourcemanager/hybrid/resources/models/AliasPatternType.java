// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AliasPatternType. */
public enum AliasPatternType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Extract. */
    EXTRACT("Extract");

    /** The actual serialized value for a AliasPatternType instance. */
    private final String value;

    AliasPatternType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AliasPatternType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AliasPatternType object, or null if unable to parse.
     */
    @JsonCreator
    public static AliasPatternType fromString(String value) {
        AliasPatternType[] items = AliasPatternType.values();
        for (AliasPatternType item : items) {
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
