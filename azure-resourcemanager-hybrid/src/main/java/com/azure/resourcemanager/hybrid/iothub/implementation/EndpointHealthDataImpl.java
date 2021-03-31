// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.iothub.implementation;

import com.azure.resourcemanager.hybrid.iothub.fluent.models.EndpointHealthDataInner;
import com.azure.resourcemanager.hybrid.iothub.models.EndpointHealthData;
import com.azure.resourcemanager.hybrid.iothub.models.EndpointHealthStatus;

public final class EndpointHealthDataImpl implements EndpointHealthData {
    private EndpointHealthDataInner innerObject;

    private final com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager;

    EndpointHealthDataImpl(
        EndpointHealthDataInner innerObject, com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String endpointId() {
        return this.innerModel().endpointId();
    }

    public EndpointHealthStatus healthStatus() {
        return this.innerModel().healthStatus();
    }

    public EndpointHealthDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}