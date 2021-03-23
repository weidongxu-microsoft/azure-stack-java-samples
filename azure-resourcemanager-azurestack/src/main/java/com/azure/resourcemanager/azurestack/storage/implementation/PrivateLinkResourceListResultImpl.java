// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.storage.implementation;

import com.azure.resourcemanager.azurestack.storage.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.azurestack.storage.models.PrivateLinkResource;
import com.azure.resourcemanager.azurestack.storage.models.PrivateLinkResourceListResult;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourceListResultImpl implements PrivateLinkResourceListResult {
    private PrivateLinkResourceListResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.storage.StorageManager serviceManager;

    PrivateLinkResourceListResultImpl(
        PrivateLinkResourceListResultInner innerObject,
        com.azure.resourcemanager.azurestack.storage.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResource> value() {
        List<PrivateLinkResource> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourceListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.storage.StorageManager manager() {
        return this.serviceManager;
    }
}
