// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.storage.fluent.ManagementPoliciesClient;
import com.azure.resourcemanager.hybrid.storage.fluent.models.ManagementPolicyInner;
import com.azure.resourcemanager.hybrid.storage.models.ManagementPolicies;
import com.azure.resourcemanager.hybrid.storage.models.ManagementPolicy;
import com.azure.resourcemanager.hybrid.storage.models.ManagementPolicyName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagementPoliciesImpl implements ManagementPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPoliciesImpl.class);

    private final ManagementPoliciesClient innerClient;

    private final com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager;

    public ManagementPoliciesImpl(
        ManagementPoliciesClient innerClient,
        com.azure.resourcemanager.hybrid.storage.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagementPolicy get(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        ManagementPolicyInner inner = this.serviceClient().get(resourceGroupName, accountName, managementPolicyName);
        if (inner != null) {
            return new ManagementPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementPolicy> getWithResponse(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        Response<ManagementPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, managementPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, managementPolicyName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, managementPolicyName, context);
    }

    public ManagementPolicy getById(String id) {
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
        ManagementPolicyName managementPolicyName =
            ManagementPolicyName.fromString(Utils.getValueFromIdByName(id, "managementPolicies"));
        if (managementPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managementPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, managementPolicyName, Context.NONE).getValue();
    }

    public Response<ManagementPolicy> getByIdWithResponse(String id, Context context) {
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
        ManagementPolicyName managementPolicyName =
            ManagementPolicyName.fromString(Utils.getValueFromIdByName(id, "managementPolicies"));
        if (managementPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managementPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, managementPolicyName, context);
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
        ManagementPolicyName managementPolicyName =
            ManagementPolicyName.fromString(Utils.getValueFromIdByName(id, "managementPolicies"));
        if (managementPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managementPolicies'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, managementPolicyName, Context.NONE).getValue();
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
        ManagementPolicyName managementPolicyName =
            ManagementPolicyName.fromString(Utils.getValueFromIdByName(id, "managementPolicies"));
        if (managementPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managementPolicies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, managementPolicyName, context);
    }

    private ManagementPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.storage.StorageManager manager() {
        return this.serviceManager;
    }

    public ManagementPolicyImpl define(ManagementPolicyName name) {
        return new ManagementPolicyImpl(name, this.manager());
    }
}
