// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SiteLoadBalancing. */
public enum SiteLoadBalancing {
    /** Enum value WeightedRoundRobin. */
    WEIGHTED_ROUND_ROBIN("WeightedRoundRobin"),

    /** Enum value LeastRequests. */
    LEAST_REQUESTS("LeastRequests"),

    /** Enum value LeastResponseTime. */
    LEAST_RESPONSE_TIME("LeastResponseTime"),

    /** Enum value WeightedTotalTraffic. */
    WEIGHTED_TOTAL_TRAFFIC("WeightedTotalTraffic"),

    /** Enum value RequestHash. */
    REQUEST_HASH("RequestHash");

    /** The actual serialized value for a SiteLoadBalancing instance. */
    private final String value;

    SiteLoadBalancing(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SiteLoadBalancing instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SiteLoadBalancing object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteLoadBalancing fromString(String value) {
        SiteLoadBalancing[] items = SiteLoadBalancing.values();
        for (SiteLoadBalancing item : items) {
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
