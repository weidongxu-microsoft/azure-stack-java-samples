// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.resourcemanager.azurestack.compute.fluent.models.ComputeOperationValueInner;
import com.azure.resourcemanager.azurestack.compute.models.ComputeOperationValue;

public final class ComputeOperationValueImpl implements ComputeOperationValue {
    private ComputeOperationValueInner innerObject;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

    ComputeOperationValueImpl(
        ComputeOperationValueInner innerObject,
        com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public String resource() {
        return this.innerModel().resource();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String provider() {
        return this.innerModel().provider();
    }

    public ComputeOperationValueInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}