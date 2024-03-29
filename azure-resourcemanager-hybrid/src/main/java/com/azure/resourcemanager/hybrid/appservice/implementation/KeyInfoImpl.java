// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.KeyInfoInner;
import com.azure.resourcemanager.hybrid.appservice.models.KeyInfo;

public final class KeyInfoImpl implements KeyInfo {
    private KeyInfoInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    KeyInfoImpl(KeyInfoInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String value() {
        return this.innerModel().value();
    }

    public KeyInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
