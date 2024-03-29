// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.storage.fluent.models.BlobInventoryPolicyInner;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicy;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicyName;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicySchema;
import java.time.OffsetDateTime;

public final class BlobInventoryPolicyImpl
    implements BlobInventoryPolicy, BlobInventoryPolicy.Definition, BlobInventoryPolicy.Update {
    private BlobInventoryPolicyInner innerObject;

    private final com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public BlobInventoryPolicySchema policy() {
        return this.innerModel().policy();
    }

    public BlobInventoryPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.storage.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private BlobInventoryPolicyName blobInventoryPolicyName;

    public BlobInventoryPolicyImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BlobInventoryPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, blobInventoryPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobInventoryPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, blobInventoryPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobInventoryPolicyImpl(
        BlobInventoryPolicyName name, com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager) {
        this.innerObject = new BlobInventoryPolicyInner();
        this.serviceManager = serviceManager;
        this.blobInventoryPolicyName = name;
    }

    public BlobInventoryPolicyImpl update() {
        return this;
    }

    public BlobInventoryPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, blobInventoryPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobInventoryPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, blobInventoryPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobInventoryPolicyImpl(
        BlobInventoryPolicyInner innerObject,
        com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.blobInventoryPolicyName =
            BlobInventoryPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "inventoryPolicies"));
    }

    public BlobInventoryPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .getWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public BlobInventoryPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobInventoryPolicies()
                .getWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, context)
                .getValue();
        return this;
    }

    public BlobInventoryPolicyImpl withPolicy(BlobInventoryPolicySchema policy) {
        this.innerModel().withPolicy(policy);
        return this;
    }
}
