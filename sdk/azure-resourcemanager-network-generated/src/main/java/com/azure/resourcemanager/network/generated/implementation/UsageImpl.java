// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.network.generated.models.Usage;
import com.azure.resourcemanager.network.generated.models.UsageName;
import com.azure.resourcemanager.network.generated.models.UsageUnit;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    UsageImpl(UsageInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public UsageUnit unit() {
        return this.innerModel().unit();
    }

    public long currentValue() {
        return this.innerModel().currentValue();
    }

    public long limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
