// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.iothub.fluent.IotHubsClient;
import com.azure.resourcemanager.azurestack.iothub.models.FailoverInput;
import com.azure.resourcemanager.azurestack.iothub.models.IotHubs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotHubsImpl implements IotHubs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubsImpl.class);

    private final IotHubsClient innerClient;

    private final com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager;

    public IotHubsImpl(
        IotHubsClient innerClient, com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput) {
        this.serviceClient().manualFailover(iotHubName, resourceGroupName, failoverInput);
    }

    public void manualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context) {
        this.serviceClient().manualFailover(iotHubName, resourceGroupName, failoverInput, context);
    }

    private IotHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}
