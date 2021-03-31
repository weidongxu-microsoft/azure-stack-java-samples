// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.models;

import com.azure.resourcemanager.hybrid.monitor.fluent.models.ResponseInner;
import java.time.Duration;
import java.util.List;

/** An immutable client-side representation of ResponseModel. */
public interface ResponseModel {
    /**
     * Gets the cost property: The integer value representing the cost of the query, for data case.
     *
     * @return the cost value.
     */
    Integer cost();

    /**
     * Gets the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @return the timespan value.
     */
    String timespan();

    /**
     * Gets the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @return the interval value.
     */
    Duration interval();

    /**
     * Gets the namespace property: The namespace of the metrics been queried.
     *
     * @return the namespace value.
     */
    String namespace();

    /**
     * Gets the resourceRegion property: The region of the resource been queried for metrics.
     *
     * @return the resourceRegion value.
     */
    String resourceRegion();

    /**
     * Gets the value property: the value of the collection.
     *
     * @return the value value.
     */
    List<Metric> value();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.monitor.fluent.models.ResponseInner object.
     *
     * @return the inner object.
     */
    ResponseInner innerModel();
}