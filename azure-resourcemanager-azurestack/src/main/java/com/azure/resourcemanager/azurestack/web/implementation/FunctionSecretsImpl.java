// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.implementation;

import com.azure.resourcemanager.azurestack.web.fluent.models.FunctionSecretsInner;
import com.azure.resourcemanager.azurestack.web.models.FunctionSecrets;

public final class FunctionSecretsImpl implements FunctionSecrets {
    private FunctionSecretsInner innerObject;

    private final com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager;

    FunctionSecretsImpl(
        FunctionSecretsInner innerObject, com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String key() {
        return this.innerModel().key();
    }

    public String triggerUrl() {
        return this.innerModel().triggerUrl();
    }

    public FunctionSecretsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.web.AppServiceManager manager() {
        return this.serviceManager;
    }
}