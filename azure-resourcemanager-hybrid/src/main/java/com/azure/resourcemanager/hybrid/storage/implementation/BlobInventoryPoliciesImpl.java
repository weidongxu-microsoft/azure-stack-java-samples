// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.storage.fluent.BlobInventoryPoliciesClient;
import com.azure.resourcemanager.hybrid.storage.fluent.models.BlobInventoryPolicyInner;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicies;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicy;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicyName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BlobInventoryPoliciesImpl implements BlobInventoryPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobInventoryPoliciesImpl.class);

    private final BlobInventoryPoliciesClient innerClient;

    private final com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager;

    public BlobInventoryPoliciesImpl(
        BlobInventoryPoliciesClient innerClient,
        com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BlobInventoryPolicy get(
        String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName) {
        BlobInventoryPolicyInner inner =
            this.serviceClient().get(resourceGroupName, accountName, blobInventoryPolicyName);
        if (inner != null) {
            return new BlobInventoryPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BlobInventoryPolicy> getWithResponse(
        String resourceGroupName,
        String accountName,
        BlobInventoryPolicyName blobInventoryPolicyName,
        Context context) {
        Response<BlobInventoryPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BlobInventoryPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, blobInventoryPolicyName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String accountName,
        BlobInventoryPolicyName blobInventoryPolicyName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, context);
    }

    public PagedIterable<BlobInventoryPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<BlobInventoryPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new BlobInventoryPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<BlobInventoryPolicy> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<BlobInventoryPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new BlobInventoryPolicyImpl(inner1, this.manager()));
    }

    public BlobInventoryPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        BlobInventoryPolicyName blobInventoryPolicyName =
            BlobInventoryPolicyName.fromString(Utils.getValueFromIdByName(id, "inventoryPolicies"));
        if (blobInventoryPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inventoryPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, Context.NONE).getValue();
    }

    public Response<BlobInventoryPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        BlobInventoryPolicyName blobInventoryPolicyName =
            BlobInventoryPolicyName.fromString(Utils.getValueFromIdByName(id, "inventoryPolicies"));
        if (blobInventoryPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inventoryPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        BlobInventoryPolicyName blobInventoryPolicyName =
            BlobInventoryPolicyName.fromString(Utils.getValueFromIdByName(id, "inventoryPolicies"));
        if (blobInventoryPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inventoryPolicies'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        BlobInventoryPolicyName blobInventoryPolicyName =
            BlobInventoryPolicyName.fromString(Utils.getValueFromIdByName(id, "inventoryPolicies"));
        if (blobInventoryPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inventoryPolicies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, blobInventoryPolicyName, context);
    }

    private BlobInventoryPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.storage.StorageManager manager() {
        return this.serviceManager;
    }

    public BlobInventoryPolicyImpl define(BlobInventoryPolicyName name) {
        return new BlobInventoryPolicyImpl(name, this.manager());
    }
}
