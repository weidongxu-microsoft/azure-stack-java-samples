// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tracking courier information. */
@Fluent
public final class TrackingInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrackingInfo.class);

    /*
     * Serial number of the device being tracked.
     */
    @JsonProperty(value = "serialNumber")
    private String serialNumber;

    /*
     * Name of the carrier used in the delivery.
     */
    @JsonProperty(value = "carrierName")
    private String carrierName;

    /*
     * Tracking ID of the shipment.
     */
    @JsonProperty(value = "trackingId")
    private String trackingId;

    /*
     * Tracking URL of the shipment.
     */
    @JsonProperty(value = "trackingUrl")
    private String trackingUrl;

    /**
     * Get the serialNumber property: Serial number of the device being tracked.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: Serial number of the device being tracked.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the carrierName property: Name of the carrier used in the delivery.
     *
     * @return the carrierName value.
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Set the carrierName property: Name of the carrier used in the delivery.
     *
     * @param carrierName the carrierName value to set.
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the trackingId property: Tracking ID of the shipment.
     *
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set the trackingId property: Tracking ID of the shipment.
     *
     * @param trackingId the trackingId value to set.
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the trackingUrl property: Tracking URL of the shipment.
     *
     * @return the trackingUrl value.
     */
    public String trackingUrl() {
        return this.trackingUrl;
    }

    /**
     * Set the trackingUrl property: Tracking URL of the shipment.
     *
     * @param trackingUrl the trackingUrl value to set.
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
