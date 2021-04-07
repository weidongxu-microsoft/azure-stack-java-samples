// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.resourcemanager.hybrid.authorization.fluent.models.ProviderOperationsMetadataInner;
import com.azure.resourcemanager.hybrid.authorization.models.ProviderOperation;
import com.azure.resourcemanager.hybrid.authorization.models.ProviderOperationsMetadata;
import com.azure.resourcemanager.hybrid.authorization.models.ResourceType;
import java.util.Collections;
import java.util.List;

public final class ProviderOperationsMetadataImpl implements ProviderOperationsMetadata {
    private ProviderOperationsMetadataInner innerObject;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    ProviderOperationsMetadataImpl(
        ProviderOperationsMetadataInner innerObject,
        com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
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

    public String displayName() {
        return this.innerModel().displayName();
    }

    public List<ResourceType> resourceTypes() {
        List<ResourceType> inner = this.innerModel().resourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ProviderOperation> operations() {
        List<ProviderOperation> inner = this.innerModel().operations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProviderOperationsMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
