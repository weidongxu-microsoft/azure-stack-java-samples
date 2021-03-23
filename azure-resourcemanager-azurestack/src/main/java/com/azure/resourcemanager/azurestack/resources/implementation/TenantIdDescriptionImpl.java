// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.resources.implementation;

import com.azure.resourcemanager.azurestack.resources.fluent.models.TenantIdDescriptionInner;
import com.azure.resourcemanager.azurestack.resources.models.TenantIdDescription;

public final class TenantIdDescriptionImpl implements TenantIdDescription {
    private TenantIdDescriptionInner innerObject;

    private final com.azure.resourcemanager.azurestack.resources.ResourceManager serviceManager;

    TenantIdDescriptionImpl(
        TenantIdDescriptionInner innerObject,
        com.azure.resourcemanager.azurestack.resources.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public TenantIdDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.resources.ResourceManager manager() {
        return this.serviceManager;
    }
}
