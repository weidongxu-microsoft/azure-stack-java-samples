// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.hybrid.appservice.models.CsmOperationDescription;
import com.azure.resourcemanager.hybrid.appservice.models.CsmOperationDescriptionProperties;
import com.azure.resourcemanager.hybrid.appservice.models.CsmOperationDisplay;

public final class CsmOperationDescriptionImpl implements CsmOperationDescription {
    private CsmOperationDescriptionInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    CsmOperationDescriptionImpl(
        CsmOperationDescriptionInner innerObject,
        com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public CsmOperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public CsmOperationDescriptionProperties properties() {
        return this.innerModel().properties();
    }

    public CsmOperationDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
