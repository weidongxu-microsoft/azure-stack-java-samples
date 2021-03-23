// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.eventhub.implementation;

import com.azure.resourcemanager.azurestack.eventhub.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.azurestack.eventhub.models.AccessKeys;

public final class AccessKeysImpl implements AccessKeys {
    private AccessKeysInner innerObject;

    private final com.azure.resourcemanager.azurestack.eventhub.EventHubsManager serviceManager;

    AccessKeysImpl(
        AccessKeysInner innerObject, com.azure.resourcemanager.azurestack.eventhub.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryConnectionString() {
        return this.innerModel().primaryConnectionString();
    }

    public String secondaryConnectionString() {
        return this.innerModel().secondaryConnectionString();
    }

    public String aliasPrimaryConnectionString() {
        return this.innerModel().aliasPrimaryConnectionString();
    }

    public String aliasSecondaryConnectionString() {
        return this.innerModel().aliasSecondaryConnectionString();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public AccessKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.eventhub.EventHubsManager manager() {
        return this.serviceManager;
    }
}