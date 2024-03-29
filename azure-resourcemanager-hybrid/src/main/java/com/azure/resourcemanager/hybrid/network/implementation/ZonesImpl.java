// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.fluent.ZonesClient;
import com.azure.resourcemanager.hybrid.network.fluent.models.ZoneDeleteResultInner;
import com.azure.resourcemanager.hybrid.network.fluent.models.ZoneInner;
import com.azure.resourcemanager.hybrid.network.models.Zone;
import com.azure.resourcemanager.hybrid.network.models.ZoneDeleteResult;
import com.azure.resourcemanager.hybrid.network.models.Zones;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ZonesImpl implements Zones {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ZonesImpl.class);

    private final ZonesClient innerClient;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    public ZonesImpl(
        ZonesClient innerClient, com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ZoneDeleteResult delete(String resourceGroupName, String zoneName, String ifMatch) {
        ZoneDeleteResultInner inner = this.serviceClient().delete(resourceGroupName, zoneName, ifMatch);
        if (inner != null) {
            return new ZoneDeleteResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ZoneDeleteResult delete(String resourceGroupName, String zoneName) {
        ZoneDeleteResultInner inner = this.serviceClient().delete(resourceGroupName, zoneName);
        if (inner != null) {
            return new ZoneDeleteResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ZoneDeleteResult delete(String resourceGroupName, String zoneName, String ifMatch, Context context) {
        ZoneDeleteResultInner inner = this.serviceClient().delete(resourceGroupName, zoneName, ifMatch, context);
        if (inner != null) {
            return new ZoneDeleteResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Zone getByResourceGroup(String resourceGroupName, String zoneName) {
        ZoneInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, zoneName);
        if (inner != null) {
            return new ZoneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Zone> getByResourceGroupWithResponse(String resourceGroupName, String zoneName, Context context) {
        Response<ZoneInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, zoneName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ZoneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Zone> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ZoneInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ZoneImpl(inner1, this.manager()));
    }

    public PagedIterable<Zone> listByResourceGroup(String resourceGroupName, Integer top, Context context) {
        PagedIterable<ZoneInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, top, context);
        return Utils.mapPage(inner, inner1 -> new ZoneImpl(inner1, this.manager()));
    }

    public PagedIterable<Zone> list() {
        PagedIterable<ZoneInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ZoneImpl(inner1, this.manager()));
    }

    public PagedIterable<Zone> list(Integer top, Context context) {
        PagedIterable<ZoneInner> inner = this.serviceClient().list(top, context);
        return Utils.mapPage(inner, inner1 -> new ZoneImpl(inner1, this.manager()));
    }

    public Zone getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String zoneName = Utils.getValueFromIdByName(id, "dnsZones");
        if (zoneName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsZones'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, zoneName, Context.NONE).getValue();
    }

    public Response<Zone> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String zoneName = Utils.getValueFromIdByName(id, "dnsZones");
        if (zoneName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsZones'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, zoneName, context);
    }

    public ZoneDeleteResult deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String zoneName = Utils.getValueFromIdByName(id, "dnsZones");
        if (zoneName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsZones'.", id)));
        }
        String localIfMatch = null;
        return this.delete(resourceGroupName, zoneName, localIfMatch, Context.NONE);
    }

    public ZoneDeleteResult deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String zoneName = Utils.getValueFromIdByName(id, "dnsZones");
        if (zoneName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsZones'.", id)));
        }
        return this.delete(resourceGroupName, zoneName, ifMatch, context);
    }

    private ZonesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public ZoneImpl define(String name) {
        return new ZoneImpl(name, this.manager());
    }
}
