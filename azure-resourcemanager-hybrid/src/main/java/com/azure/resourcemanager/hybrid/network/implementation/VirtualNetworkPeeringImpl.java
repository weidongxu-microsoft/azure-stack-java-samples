// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.hybrid.network.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.hybrid.network.models.AddressSpace;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkPeering;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkPeeringState;

public final class VirtualNetworkPeeringImpl implements VirtualNetworkPeering {
    private VirtualNetworkPeeringInner innerObject;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    VirtualNetworkPeeringImpl(
        VirtualNetworkPeeringInner innerObject,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
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

    public Boolean allowVirtualNetworkAccess() {
        return this.innerModel().allowVirtualNetworkAccess();
    }

    public Boolean allowForwardedTraffic() {
        return this.innerModel().allowForwardedTraffic();
    }

    public Boolean allowGatewayTransit() {
        return this.innerModel().allowGatewayTransit();
    }

    public Boolean useRemoteGateways() {
        return this.innerModel().useRemoteGateways();
    }

    public SubResource remoteVirtualNetwork() {
        return this.innerModel().remoteVirtualNetwork();
    }

    public AddressSpace remoteAddressSpace() {
        return this.innerModel().remoteAddressSpace();
    }

    public VirtualNetworkPeeringState peeringState() {
        return this.innerModel().peeringState();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualNetworkPeeringInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }
}