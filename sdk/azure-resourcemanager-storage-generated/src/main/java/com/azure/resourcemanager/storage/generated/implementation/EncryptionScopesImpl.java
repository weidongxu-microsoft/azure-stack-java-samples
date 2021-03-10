// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.EncryptionScopesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.EncryptionScopeInner;
import com.azure.resourcemanager.storage.generated.models.EncryptionScope;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EncryptionScopesImpl implements EncryptionScopes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionScopesImpl.class);

    private final EncryptionScopesClient innerClient;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public EncryptionScopesImpl(
        EncryptionScopesClient innerClient, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EncryptionScope get(String resourceGroupName, String accountName, String encryptionScopeName) {
        EncryptionScopeInner inner = this.serviceClient().get(resourceGroupName, accountName, encryptionScopeName);
        if (inner != null) {
            return new EncryptionScopeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EncryptionScope> getWithResponse(
        String resourceGroupName, String accountName, String encryptionScopeName, Context context) {
        Response<EncryptionScopeInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, encryptionScopeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EncryptionScopeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EncryptionScope> list(String resourceGroupName, String accountName) {
        PagedIterable<EncryptionScopeInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new EncryptionScopeImpl(inner1, this.manager()));
    }

    public PagedIterable<EncryptionScope> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<EncryptionScopeInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new EncryptionScopeImpl(inner1, this.manager()));
    }

    public EncryptionScope getById(String id) {
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
        String encryptionScopeName = Utils.getValueFromIdByName(id, "encryptionScopes");
        if (encryptionScopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'encryptionScopes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, encryptionScopeName, Context.NONE).getValue();
    }

    public Response<EncryptionScope> getByIdWithResponse(String id, Context context) {
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
        String encryptionScopeName = Utils.getValueFromIdByName(id, "encryptionScopes");
        if (encryptionScopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'encryptionScopes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, encryptionScopeName, context);
    }

    private EncryptionScopesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    public EncryptionScopeImpl define(String name) {
        return new EncryptionScopeImpl(name, this.manager());
    }
}
