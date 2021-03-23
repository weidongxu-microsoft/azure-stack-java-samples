// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.implementation;

import com.azure.resourcemanager.azurestack.appservice.fluent.models.SwiftVirtualNetworkInner;
import com.azure.resourcemanager.azurestack.appservice.models.SwiftVirtualNetwork;

public final class SwiftVirtualNetworkImpl implements SwiftVirtualNetwork {
    private SwiftVirtualNetworkInner innerObject;

    private final com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager;

    SwiftVirtualNetworkImpl(
        SwiftVirtualNetworkInner innerObject,
        com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String subnetResourceId() {
        return this.innerModel().subnetResourceId();
    }

    public Boolean swiftSupported() {
        return this.innerModel().swiftSupported();
    }

    public SwiftVirtualNetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}