// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.databoxedge.fluent.ContainersClient;
import com.azure.resourcemanager.hybrid.databoxedge.fluent.models.ContainerInner;
import com.azure.resourcemanager.hybrid.databoxedge.models.Container;
import com.azure.resourcemanager.hybrid.databoxedge.models.Containers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ContainersImpl implements Containers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainersImpl.class);

    private final ContainersClient innerClient;

    private final com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager serviceManager;

    public ContainersImpl(
        ContainersClient innerClient,
        com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Container> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName) {
        PagedIterable<ContainerInner> inner =
            this.serviceClient().listByStorageAccount(deviceName, storageAccountName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<Container> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName, Context context) {
        PagedIterable<ContainerInner> inner =
            this.serviceClient().listByStorageAccount(deviceName, storageAccountName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ContainerImpl(inner1, this.manager()));
    }

    public Container get(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        ContainerInner inner =
            this.serviceClient().get(deviceName, storageAccountName, containerName, resourceGroupName);
        if (inner != null) {
            return new ContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Container> getWithResponse(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        Response<ContainerInner> inner =
            this
                .serviceClient()
                .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, storageAccountName, containerName, resourceGroupName);
    }

    public void delete(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    public void refresh(String deviceName, String storageAccountName, String containerName, String resourceGroupName) {
        this.serviceClient().refresh(deviceName, storageAccountName, containerName, resourceGroupName);
    }

    public void refresh(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context) {
        this.serviceClient().refresh(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    public Container getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = Utils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this
            .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, Context.NONE)
            .getValue();
    }

    public Response<Container> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = Utils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = Utils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, storageAccountName, containerName, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String storageAccountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (storageAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String containerName = Utils.getValueFromIdByName(id, "containers");
        if (containerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containers'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, storageAccountName, containerName, resourceGroupName, context);
    }

    private ContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public ContainerImpl define(String name) {
        return new ContainerImpl(name, this.manager());
    }
}