// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.fluent.NetworkInterfaceLoadBalancersClient;
import com.azure.resourcemanager.hybrid.network.fluent.models.LoadBalancerInner;
import com.azure.resourcemanager.hybrid.network.models.LoadBalancer;
import com.azure.resourcemanager.hybrid.network.models.NetworkInterfaceLoadBalancers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkInterfaceLoadBalancersImpl implements NetworkInterfaceLoadBalancers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceLoadBalancersImpl.class);

    private final NetworkInterfaceLoadBalancersClient innerClient;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    public NetworkInterfaceLoadBalancersImpl(
        NetworkInterfaceLoadBalancersClient innerClient,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LoadBalancer> list(String resourceGroupName, String networkInterfaceName) {
        PagedIterable<LoadBalancerInner> inner = this.serviceClient().list(resourceGroupName, networkInterfaceName);
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    public PagedIterable<LoadBalancer> list(String resourceGroupName, String networkInterfaceName, Context context) {
        PagedIterable<LoadBalancerInner> inner =
            this.serviceClient().list(resourceGroupName, networkInterfaceName, context);
        return Utils.mapPage(inner, inner1 -> new LoadBalancerImpl(inner1, this.manager()));
    }

    private NetworkInterfaceLoadBalancersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
