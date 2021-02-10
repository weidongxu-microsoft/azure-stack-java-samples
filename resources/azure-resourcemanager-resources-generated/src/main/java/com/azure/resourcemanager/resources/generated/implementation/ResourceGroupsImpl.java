// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.ResourceGroupsClient;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupExportResultInner;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupInner;
import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupExportResult;
import com.azure.resourcemanager.resources.generated.models.ResourceGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceGroupsImpl implements ResourceGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceGroupsImpl.class);

    private final ResourceGroupsClient innerClient;

    private final ResourceManager serviceManager;

    public ResourceGroupsImpl(ResourceGroupsClient innerClient, ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public boolean checkExistence(String resourceGroupName) {
        return this.serviceClient().checkExistence(resourceGroupName);
    }

    public Response<Boolean> checkExistenceWithResponse(String resourceGroupName, Context context) {
        return this.serviceClient().checkExistenceWithResponse(resourceGroupName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String forceDeletionResourceTypes) {
        this.serviceClient().delete(resourceGroupName, forceDeletionResourceTypes);
    }

    public void delete(String resourceGroupName) {
        this.serviceClient().delete(resourceGroupName);
    }

    public void delete(String resourceGroupName, String forceDeletionResourceTypes, Context context) {
        this.serviceClient().delete(resourceGroupName, forceDeletionResourceTypes, context);
    }

    public ResourceGroup get(String resourceGroupName) {
        ResourceGroupInner inner = this.serviceClient().get(resourceGroupName);
        if (inner != null) {
            return new ResourceGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceGroup> getWithResponse(String resourceGroupName, Context context) {
        Response<ResourceGroupInner> inner = this.serviceClient().getWithResponse(resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResourceGroupExportResult exportTemplate(String resourceGroupName, ExportTemplateRequest parameters) {
        ResourceGroupExportResultInner inner = this.serviceClient().exportTemplate(resourceGroupName, parameters);
        if (inner != null) {
            return new ResourceGroupExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ResourceGroupExportResult exportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters, Context context) {
        ResourceGroupExportResultInner inner =
            this.serviceClient().exportTemplate(resourceGroupName, parameters, context);
        if (inner != null) {
            return new ResourceGroupExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceGroup> list() {
        PagedIterable<ResourceGroupInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceGroup> list(String filter, Integer top, Context context) {
        PagedIterable<ResourceGroupInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new ResourceGroupImpl(inner1, this.manager()));
    }

    public ResourceGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, Context.NONE).getValue();
    }

    public Response<ResourceGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String localForceDeletionResourceTypes = null;
        this.delete(resourceGroupName, localForceDeletionResourceTypes, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String forceDeletionResourceTypes, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        this.delete(resourceGroupName, forceDeletionResourceTypes, context);
    }

    private ResourceGroupsClient serviceClient() {
        return this.innerClient;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }

    public ResourceGroupImpl define(String name) {
        return new ResourceGroupImpl(name, this.manager());
    }
}
