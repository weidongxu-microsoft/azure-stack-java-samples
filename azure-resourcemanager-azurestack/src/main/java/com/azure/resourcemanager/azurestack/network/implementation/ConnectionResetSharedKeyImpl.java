// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.resourcemanager.azurestack.network.fluent.models.ConnectionResetSharedKeyInner;
import com.azure.resourcemanager.azurestack.network.models.ConnectionResetSharedKey;

public final class ConnectionResetSharedKeyImpl implements ConnectionResetSharedKey {
    private ConnectionResetSharedKeyInner innerObject;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    ConnectionResetSharedKeyImpl(
        ConnectionResetSharedKeyInner innerObject,
        com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int keyLength() {
        return this.innerModel().keyLength();
    }

    public ConnectionResetSharedKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
