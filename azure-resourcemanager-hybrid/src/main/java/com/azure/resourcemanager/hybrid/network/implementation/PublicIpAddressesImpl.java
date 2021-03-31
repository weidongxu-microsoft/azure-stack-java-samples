// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.fluent.PublicIpAddressesClient;
import com.azure.resourcemanager.hybrid.network.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.hybrid.network.models.PublicIpAddress;
import com.azure.resourcemanager.hybrid.network.models.PublicIpAddresses;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PublicIpAddressesImpl implements PublicIpAddresses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressesImpl.class);

    private final PublicIpAddressesClient innerClient;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    public PublicIpAddressesImpl(
        PublicIpAddressesClient innerClient,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String publicIpAddressName) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName);
    }

    public void delete(String resourceGroupName, String publicIpAddressName, Context context) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName, context);
    }

    public PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName) {
        PublicIpAddressInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpAddress> list() {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> list(Context context) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PublicIpAddress getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PublicIpAddress> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, expand, context);
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
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        this.delete(resourceGroupName, publicIpAddressName, Context.NONE);
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
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        this.delete(resourceGroupName, publicIpAddressName, context);
    }

    private PublicIpAddressesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public PublicIpAddressImpl define(String name) {
        return new PublicIpAddressImpl(name, this.manager());
    }
}