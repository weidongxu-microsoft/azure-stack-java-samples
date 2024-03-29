// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.compute.fluent.AvailabilitySetsClient;
import com.azure.resourcemanager.hybrid.compute.fluent.models.AvailabilitySetInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.hybrid.compute.models.AvailabilitySet;
import com.azure.resourcemanager.hybrid.compute.models.AvailabilitySets;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineSize;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AvailabilitySetsImpl implements AvailabilitySets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilitySetsImpl.class);

    private final AvailabilitySetsClient innerClient;

    private final com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager;

    public AvailabilitySetsImpl(
        AvailabilitySetsClient innerClient,
        com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String availabilitySetName) {
        this.serviceClient().delete(resourceGroupName, availabilitySetName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String availabilitySetName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, availabilitySetName, context);
    }

    public AvailabilitySet getByResourceGroup(String resourceGroupName, String availabilitySetName) {
        AvailabilitySetInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, availabilitySetName);
        if (inner != null) {
            return new AvailabilitySetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AvailabilitySet> getByResourceGroupWithResponse(
        String resourceGroupName, String availabilitySetName, Context context) {
        Response<AvailabilitySetInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AvailabilitySetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AvailabilitySet> list() {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> list(String expand, Context context) {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().list(expand, context);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AvailabilitySetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String availabilitySetName) {
        PagedIterable<VirtualMachineSizeInner> inner =
            this.serviceClient().listAvailableSizes(resourceGroupName, availabilitySetName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(
        String resourceGroupName, String availabilitySetName, Context context) {
        PagedIterable<VirtualMachineSizeInner> inner =
            this.serviceClient().listAvailableSizes(resourceGroupName, availabilitySetName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public AvailabilitySet getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, Context.NONE).getValue();
    }

    public Response<AvailabilitySet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context);
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
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, availabilitySetName, Context.NONE).getValue();
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
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, availabilitySetName, context);
    }

    private AvailabilitySetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    public AvailabilitySetImpl define(String name) {
        return new AvailabilitySetImpl(name, this.manager());
    }
}
