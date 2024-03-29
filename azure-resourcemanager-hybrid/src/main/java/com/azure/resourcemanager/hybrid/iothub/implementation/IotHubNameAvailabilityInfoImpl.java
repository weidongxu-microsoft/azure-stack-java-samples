// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.iothub.implementation;

import com.azure.resourcemanager.hybrid.iothub.fluent.models.IotHubNameAvailabilityInfoInner;
import com.azure.resourcemanager.hybrid.iothub.models.IotHubNameAvailabilityInfo;
import com.azure.resourcemanager.hybrid.iothub.models.IotHubNameUnavailabilityReason;

public final class IotHubNameAvailabilityInfoImpl implements IotHubNameAvailabilityInfo {
    private IotHubNameAvailabilityInfoInner innerObject;

    private final com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager;

    IotHubNameAvailabilityInfoImpl(
        IotHubNameAvailabilityInfoInner innerObject,
        com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public IotHubNameUnavailabilityReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public IotHubNameAvailabilityInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}
