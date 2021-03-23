// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.implementation;

import com.azure.resourcemanager.azurestack.web.fluent.models.CapabilityInner;
import com.azure.resourcemanager.azurestack.web.models.Capability;

public final class CapabilityImpl implements Capability {
    private CapabilityInner innerObject;

    private final com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager;

    CapabilityImpl(
        CapabilityInner innerObject, com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public CapabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.web.AppServiceManager manager() {
        return this.serviceManager;
    }
}
