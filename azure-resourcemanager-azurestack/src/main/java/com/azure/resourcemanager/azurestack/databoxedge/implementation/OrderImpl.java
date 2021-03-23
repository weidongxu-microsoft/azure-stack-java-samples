// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.implementation;

import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.OrderInner;
import com.azure.resourcemanager.azurestack.databoxedge.models.Address;
import com.azure.resourcemanager.azurestack.databoxedge.models.ContactDetails;
import com.azure.resourcemanager.azurestack.databoxedge.models.Order;
import com.azure.resourcemanager.azurestack.databoxedge.models.OrderStatus;
import com.azure.resourcemanager.azurestack.databoxedge.models.TrackingInfo;
import java.util.Collections;
import java.util.List;

public final class OrderImpl implements Order {
    private OrderInner innerObject;

    private final com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager;

    OrderImpl(
        OrderInner innerObject, com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ContactDetails contactInformation() {
        return this.innerModel().contactInformation();
    }

    public Address shippingAddress() {
        return this.innerModel().shippingAddress();
    }

    public OrderStatus currentStatus() {
        return this.innerModel().currentStatus();
    }

    public List<OrderStatus> orderHistory() {
        List<OrderStatus> inner = this.innerModel().orderHistory();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String serialNumber() {
        return this.innerModel().serialNumber();
    }

    public List<TrackingInfo> deliveryTrackingInfo() {
        List<TrackingInfo> inner = this.innerModel().deliveryTrackingInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<TrackingInfo> returnTrackingInfo() {
        List<TrackingInfo> inner = this.innerModel().returnTrackingInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OrderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
