// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for KeySource. */
public enum KeySource {
    /** Enum value Microsoft.KeyVault. */
    MICROSOFT_KEY_VAULT("Microsoft.KeyVault");

    /** The actual serialized value for a KeySource instance. */
    private final String value;

    KeySource(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeySource instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeySource object, or null if unable to parse.
     */
    @JsonCreator
    public static KeySource fromString(String value) {
        KeySource[] items = KeySource.values();
        for (KeySource item : items) {
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
