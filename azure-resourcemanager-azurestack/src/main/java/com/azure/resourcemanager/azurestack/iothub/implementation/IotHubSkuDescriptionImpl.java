// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.implementation;

import com.azure.resourcemanager.azurestack.iothub.fluent.models.IotHubSkuDescriptionInner;
import com.azure.resourcemanager.azurestack.iothub.models.IotHubCapacity;
import com.azure.resourcemanager.azurestack.iothub.models.IotHubSkuDescription;
import com.azure.resourcemanager.azurestack.iothub.models.IotHubSkuInfo;

public final class IotHubSkuDescriptionImpl implements IotHubSkuDescription {
    private IotHubSkuDescriptionInner innerObject;

    private final com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager;

    IotHubSkuDescriptionImpl(
        IotHubSkuDescriptionInner innerObject,
        com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public IotHubSkuInfo sku() {
        return this.innerModel().sku();
    }

    public IotHubCapacity capacity() {
        return this.innerModel().capacity();
    }

    public IotHubSkuDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}