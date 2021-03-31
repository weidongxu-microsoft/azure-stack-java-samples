// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.resources.implementation;

import com.azure.resourcemanager.hybrid.resources.fluent.models.ProviderInner;
import com.azure.resourcemanager.hybrid.resources.models.Provider;
import com.azure.resourcemanager.hybrid.resources.models.ProviderResourceType;
import java.util.Collections;
import java.util.List;

public final class ProviderImpl implements Provider {
    private ProviderInner innerObject;

    private final com.azure.resourcemanager.hybrid.resources.ResourceManager serviceManager;

    ProviderImpl(
        ProviderInner innerObject, com.azure.resourcemanager.hybrid.resources.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String namespace() {
        return this.innerModel().namespace();
    }

    public String registrationState() {
        return this.innerModel().registrationState();
    }

    public String registrationPolicy() {
        return this.innerModel().registrationPolicy();
    }

    public List<ProviderResourceType> resourceTypes() {
        List<ProviderResourceType> inner = this.innerModel().resourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProviderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.resources.ResourceManager manager() {
        return this.serviceManager;
    }
}