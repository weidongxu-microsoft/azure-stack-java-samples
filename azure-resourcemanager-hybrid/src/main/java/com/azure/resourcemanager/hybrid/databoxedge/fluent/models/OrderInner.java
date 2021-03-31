// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.databoxedge.models.Address;
import com.azure.resourcemanager.hybrid.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.hybrid.databoxedge.models.ContactDetails;
import com.azure.resourcemanager.hybrid.databoxedge.models.OrderStatus;
import com.azure.resourcemanager.hybrid.databoxedge.models.TrackingInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The order details. */
@JsonFlatten
@Fluent
public class OrderInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrderInner.class);

    /*
     * The contact details.
     */
    @JsonProperty(value = "properties.contactInformation")
    private ContactDetails contactInformation;

    /*
     * The shipping address.
     */
    @JsonProperty(value = "properties.shippingAddress")
    private Address shippingAddress;

    /*
     * Current status of the order.
     */
    @JsonProperty(value = "properties.currentStatus")
    private OrderStatus currentStatus;

    /*
     * List of status changes in the order.
     */
    @JsonProperty(value = "properties.orderHistory", access = JsonProperty.Access.WRITE_ONLY)
    private List<OrderStatus> orderHistory;

    /*
     * Serial number of the device.
     */
    @JsonProperty(value = "properties.serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Tracking information for the package delivered to the customer whether
     * it has an original or a replacement device.
     */
    @JsonProperty(value = "properties.deliveryTrackingInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrackingInfo> deliveryTrackingInfo;

    /*
     * Tracking information for the package returned from the customer whether
     * it has an original or a replacement device.
     */
    @JsonProperty(value = "properties.returnTrackingInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrackingInfo> returnTrackingInfo;

    /**
     * Get the contactInformation property: The contact details.
     *
     * @return the contactInformation value.
     */
    public ContactDetails contactInformation() {
        return this.contactInformation;
    }

    /**
     * Set the contactInformation property: The contact details.
     *
     * @param contactInformation the contactInformation value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withContactInformation(ContactDetails contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Get the shippingAddress property: The shipping address.
     *
     * @return the shippingAddress value.
     */
    public Address shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set the shippingAddress property: The shipping address.
     *
     * @param shippingAddress the shippingAddress value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get the currentStatus property: Current status of the order.
     *
     * @return the currentStatus value.
     */
    public OrderStatus currentStatus() {
        return this.currentStatus;
    }

    /**
     * Set the currentStatus property: Current status of the order.
     *
     * @param currentStatus the currentStatus value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withCurrentStatus(OrderStatus currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    /**
     * Get the orderHistory property: List of status changes in the order.
     *
     * @return the orderHistory value.
     */
    public List<OrderStatus> orderHistory() {
        return this.orderHistory;
    }

    /**
     * Get the serialNumber property: Serial number of the device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the deliveryTrackingInfo property: Tracking information for the package delivered to the customer whether it
     * has an original or a replacement device.
     *
     * @return the deliveryTrackingInfo value.
     */
    public List<TrackingInfo> deliveryTrackingInfo() {
        return this.deliveryTrackingInfo;
    }

    /**
     * Get the returnTrackingInfo property: Tracking information for the package returned from the customer whether it
     * has an original or a replacement device.
     *
     * @return the returnTrackingInfo value.
     */
    public List<TrackingInfo> returnTrackingInfo() {
        return this.returnTrackingInfo;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (contactInformation() != null) {
            contactInformation().validate();
        }
        if (shippingAddress() != null) {
            shippingAddress().validate();
        }
        if (currentStatus() != null) {
            currentStatus().validate();
        }
        if (orderHistory() != null) {
            orderHistory().forEach(e -> e.validate());
        }
        if (deliveryTrackingInfo() != null) {
            deliveryTrackingInfo().forEach(e -> e.validate());
        }
        if (returnTrackingInfo() != null) {
            returnTrackingInfo().forEach(e -> e.validate());
        }
    }
}