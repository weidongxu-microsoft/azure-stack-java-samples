// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.resourcemanager.hybrid.network.fluent.models.VirtualNetworkUsageInner;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkUsage;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkUsageName;

public final class VirtualNetworkUsageImpl implements VirtualNetworkUsage {
    private VirtualNetworkUsageInner innerObject;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    VirtualNetworkUsageImpl(
        VirtualNetworkUsageInner innerObject,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Double currentValue() {
        return this.innerModel().currentValue();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Double limit() {
        return this.innerModel().limit();
    }

    public VirtualNetworkUsageName name() {
        return this.innerModel().name();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public VirtualNetworkUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
