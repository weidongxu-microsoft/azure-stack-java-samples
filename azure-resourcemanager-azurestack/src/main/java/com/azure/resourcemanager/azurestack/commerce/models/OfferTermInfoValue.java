// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.commerce.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OfferTermInfoValue. */
public enum OfferTermInfoValue {
    /** Enum value Recurring Charge. */
    RECURRING_CHARGE("Recurring Charge"),

    /** Enum value Monetary Commitment. */
    MONETARY_COMMITMENT("Monetary Commitment"),

    /** Enum value Monetary Credit. */
    MONETARY_CREDIT("Monetary Credit");

    /** The actual serialized value for a OfferTermInfoValue instance. */
    private final String value;

    OfferTermInfoValue(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OfferTermInfoValue instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OfferTermInfoValue object, or null if unable to parse.
     */
    @JsonCreator
    public static OfferTermInfoValue fromString(String value) {
        OfferTermInfoValue[] items = OfferTermInfoValue.values();
        for (OfferTermInfoValue item : items) {
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
