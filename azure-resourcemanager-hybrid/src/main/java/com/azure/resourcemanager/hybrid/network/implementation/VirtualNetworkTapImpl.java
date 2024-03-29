// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.resourcemanager.hybrid.network.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.hybrid.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.hybrid.network.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.hybrid.network.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.hybrid.network.models.FrontendIpConfiguration;
import com.azure.resourcemanager.hybrid.network.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.hybrid.network.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.hybrid.network.models.VirtualNetworkTap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualNetworkTapImpl implements VirtualNetworkTap {
    private VirtualNetworkTapInner innerObject;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    VirtualNetworkTapImpl(
        VirtualNetworkTapInner innerObject,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations() {
        List<NetworkInterfaceTapConfigurationInner> inner = this.innerModel().networkInterfaceTapConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceTapConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration() {
        NetworkInterfaceIpConfigurationInner inner = this.innerModel().destinationNetworkInterfaceIpConfiguration();
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration() {
        FrontendIpConfigurationInner inner = this.innerModel().destinationLoadBalancerFrontEndIpConfiguration();
        if (inner != null) {
            return new FrontendIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Integer destinationPort() {
        return this.innerModel().destinationPort();
    }

    public String id() {
        return this.innerModel().id();
    }

    public VirtualNetworkTapInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
