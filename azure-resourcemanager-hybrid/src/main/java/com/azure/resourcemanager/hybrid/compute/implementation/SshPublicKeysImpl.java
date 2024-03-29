// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.compute.fluent.SshPublicKeysClient;
import com.azure.resourcemanager.hybrid.compute.fluent.models.SshPublicKeyGenerateKeyPairResultInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.SshPublicKeyResourceInner;
import com.azure.resourcemanager.hybrid.compute.models.SshPublicKeyGenerateKeyPairResult;
import com.azure.resourcemanager.hybrid.compute.models.SshPublicKeyResource;
import com.azure.resourcemanager.hybrid.compute.models.SshPublicKeys;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SshPublicKeysImpl implements SshPublicKeys {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshPublicKeysImpl.class);

    private final SshPublicKeysClient innerClient;

    private final com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager;

    public SshPublicKeysImpl(
        SshPublicKeysClient innerClient, com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SshPublicKeyResource> list() {
        PagedIterable<SshPublicKeyResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SshPublicKeyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SshPublicKeyResource> list(Context context) {
        PagedIterable<SshPublicKeyResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SshPublicKeyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SshPublicKeyResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SshPublicKeyResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SshPublicKeyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SshPublicKeyResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SshPublicKeyResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SshPublicKeyResourceImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String sshPublicKeyName) {
        this.serviceClient().delete(resourceGroupName, sshPublicKeyName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String sshPublicKeyName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, sshPublicKeyName, context);
    }

    public SshPublicKeyResource getByResourceGroup(String resourceGroupName, String sshPublicKeyName) {
        SshPublicKeyResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, sshPublicKeyName);
        if (inner != null) {
            return new SshPublicKeyResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SshPublicKeyResource> getByResourceGroupWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context) {
        Response<SshPublicKeyResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, sshPublicKeyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SshPublicKeyResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SshPublicKeyGenerateKeyPairResult generateKeyPair(String resourceGroupName, String sshPublicKeyName) {
        SshPublicKeyGenerateKeyPairResultInner inner =
            this.serviceClient().generateKeyPair(resourceGroupName, sshPublicKeyName);
        if (inner != null) {
            return new SshPublicKeyGenerateKeyPairResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SshPublicKeyGenerateKeyPairResult> generateKeyPairWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context) {
        Response<SshPublicKeyGenerateKeyPairResultInner> inner =
            this.serviceClient().generateKeyPairWithResponse(resourceGroupName, sshPublicKeyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SshPublicKeyGenerateKeyPairResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SshPublicKeyResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sshPublicKeyName = Utils.getValueFromIdByName(id, "sshPublicKeys");
        if (sshPublicKeyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sshPublicKeys'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sshPublicKeyName, Context.NONE).getValue();
    }

    public Response<SshPublicKeyResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sshPublicKeyName = Utils.getValueFromIdByName(id, "sshPublicKeys");
        if (sshPublicKeyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sshPublicKeys'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sshPublicKeyName, context);
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
        String sshPublicKeyName = Utils.getValueFromIdByName(id, "sshPublicKeys");
        if (sshPublicKeyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sshPublicKeys'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, sshPublicKeyName, Context.NONE).getValue();
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
        String sshPublicKeyName = Utils.getValueFromIdByName(id, "sshPublicKeys");
        if (sshPublicKeyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sshPublicKeys'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, sshPublicKeyName, context);
    }

    private SshPublicKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    public SshPublicKeyResourceImpl define(String name) {
        return new SshPublicKeyResourceImpl(name, this.manager());
    }
}
