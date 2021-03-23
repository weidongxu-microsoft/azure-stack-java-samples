// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.network.fluent.LocalNetworkGatewaysClient;
import com.azure.resourcemanager.azurestack.network.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.azurestack.network.models.LocalNetworkGateway;
import com.azure.resourcemanager.azurestack.network.models.LocalNetworkGateways;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocalNetworkGatewaysImpl implements LocalNetworkGateways {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalNetworkGatewaysImpl.class);

    private final LocalNetworkGatewaysClient innerClient;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    public LocalNetworkGatewaysImpl(
        LocalNetworkGatewaysClient innerClient,
        com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LocalNetworkGateway getByResourceGroup(String resourceGroupName, String localNetworkGatewayName) {
        LocalNetworkGatewayInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, localNetworkGatewayName);
        if (inner != null) {
            return new LocalNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LocalNetworkGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String localNetworkGatewayName, Context context) {
        Response<LocalNetworkGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LocalNetworkGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String localNetworkGatewayName) {
        this.serviceClient().delete(resourceGroupName, localNetworkGatewayName);
    }

    public void delete(String resourceGroupName, String localNetworkGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, localNetworkGatewayName, context);
    }

    public PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LocalNetworkGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new LocalNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalNetworkGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<LocalNetworkGatewayInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new LocalNetworkGatewayImpl(inner1, this.manager()));
    }

    public LocalNetworkGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localNetworkGatewayName = Utils.getValueFromIdByName(id, "localNetworkGateways");
        if (localNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'localNetworkGateways'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, Context.NONE).getValue();
    }

    public Response<LocalNetworkGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localNetworkGatewayName = Utils.getValueFromIdByName(id, "localNetworkGateways");
        if (localNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'localNetworkGateways'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, localNetworkGatewayName, context);
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
        String localNetworkGatewayName = Utils.getValueFromIdByName(id, "localNetworkGateways");
        if (localNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'localNetworkGateways'.",
                                id)));
        }
        this.delete(resourceGroupName, localNetworkGatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localNetworkGatewayName = Utils.getValueFromIdByName(id, "localNetworkGateways");
        if (localNetworkGatewayName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'localNetworkGateways'.",
                                id)));
        }
        this.delete(resourceGroupName, localNetworkGatewayName, context);
    }

    private LocalNetworkGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public LocalNetworkGatewayImpl define(String name) {
        return new LocalNetworkGatewayImpl(name, this.manager());
    }
}