// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.CustomIpPrefixesClient;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefix;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefixes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CustomIpPrefixesImpl implements CustomIpPrefixes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomIpPrefixesImpl.class);

    private final CustomIpPrefixesClient innerClient;

    private final NetworkManager serviceManager;

    public CustomIpPrefixesImpl(CustomIpPrefixesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String customIpPrefixName) {
        this.serviceClient().delete(resourceGroupName, customIpPrefixName);
    }

    public void delete(String resourceGroupName, String customIpPrefixName, Context context) {
        this.serviceClient().delete(resourceGroupName, customIpPrefixName, context);
    }

    public CustomIpPrefix getByResourceGroup(String resourceGroupName, String customIpPrefixName) {
        CustomIpPrefixInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, customIpPrefixName);
        if (inner != null) {
            return new CustomIpPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomIpPrefix> getByResourceGroupWithResponse(
        String resourceGroupName, String customIpPrefixName, String expand, Context context) {
        Response<CustomIpPrefixInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, customIpPrefixName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomIpPrefixImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<CustomIpPrefix> list() {
        PagedIterable<CustomIpPrefixInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CustomIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomIpPrefix> list(Context context) {
        PagedIterable<CustomIpPrefixInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CustomIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomIpPrefix> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CustomIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CustomIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomIpPrefix> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CustomIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CustomIpPrefixImpl(inner1, this.manager()));
    }

    public CustomIpPrefix getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String customIpPrefixName = Utils.getValueFromIdByName(id, "customIpPrefixes");
        if (customIpPrefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customIpPrefixes'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, customIpPrefixName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<CustomIpPrefix> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String customIpPrefixName = Utils.getValueFromIdByName(id, "customIpPrefixes");
        if (customIpPrefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customIpPrefixes'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, customIpPrefixName, expand, context);
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
        String customIpPrefixName = Utils.getValueFromIdByName(id, "customIpPrefixes");
        if (customIpPrefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customIpPrefixes'.", id)));
        }
        this.delete(resourceGroupName, customIpPrefixName, Context.NONE);
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
        String customIpPrefixName = Utils.getValueFromIdByName(id, "customIpPrefixes");
        if (customIpPrefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customIpPrefixes'.", id)));
        }
        this.delete(resourceGroupName, customIpPrefixName, context);
    }

    private CustomIpPrefixesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public CustomIpPrefixImpl define(String name) {
        return new CustomIpPrefixImpl(name, this.manager());
    }
}
