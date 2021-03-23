// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.resourcemanager.azurestack.network.fluent.models.RouteInner;
import com.azure.resourcemanager.azurestack.network.models.Route;
import com.azure.resourcemanager.azurestack.network.models.RouteNextHopType;

public final class RouteImpl implements Route {
    private RouteInner innerObject;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    RouteImpl(RouteInner innerObject, com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public RouteNextHopType nextHopType() {
        return this.innerModel().nextHopType();
    }

    public String nextHopIpAddress() {
        return this.innerModel().nextHopIpAddress();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RouteInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
