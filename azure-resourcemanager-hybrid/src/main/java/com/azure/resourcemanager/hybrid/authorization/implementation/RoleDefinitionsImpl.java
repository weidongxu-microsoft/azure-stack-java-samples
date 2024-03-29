// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.authorization.fluent.RoleDefinitionsClient;
import com.azure.resourcemanager.hybrid.authorization.fluent.models.RoleDefinitionInner;
import com.azure.resourcemanager.hybrid.authorization.models.RoleDefinition;
import com.azure.resourcemanager.hybrid.authorization.models.RoleDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RoleDefinitionsImpl implements RoleDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleDefinitionsImpl.class);

    private final RoleDefinitionsClient innerClient;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    public RoleDefinitionsImpl(
        RoleDefinitionsClient innerClient,
        com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RoleDefinition deleteByResourceGroup(String scope, String roleDefinitionId) {
        RoleDefinitionInner inner = this.serviceClient().delete(scope, roleDefinitionId);
        if (inner != null) {
            return new RoleDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleDefinition> deleteWithResponse(String scope, String roleDefinitionId, Context context) {
        Response<RoleDefinitionInner> inner = this.serviceClient().deleteWithResponse(scope, roleDefinitionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleDefinition get(String scope, String roleDefinitionId) {
        RoleDefinitionInner inner = this.serviceClient().get(scope, roleDefinitionId);
        if (inner != null) {
            return new RoleDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleDefinition> getWithResponse(String scope, String roleDefinitionId, Context context) {
        Response<RoleDefinitionInner> inner = this.serviceClient().getWithResponse(scope, roleDefinitionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RoleDefinition> list(String scope) {
        PagedIterable<RoleDefinitionInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new RoleDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleDefinition> list(String scope, String filter, Context context) {
        PagedIterable<RoleDefinitionInner> inner = this.serviceClient().list(scope, filter, context);
        return Utils.mapPage(inner, inner1 -> new RoleDefinitionImpl(inner1, this.manager()));
    }

    public RoleDefinition getById(String roleDefinitionId) {
        RoleDefinitionInner inner = this.serviceClient().getById(roleDefinitionId);
        if (inner != null) {
            return new RoleDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleDefinition> getByIdWithResponse(String roleDefinitionId, Context context) {
        Response<RoleDefinitionInner> inner = this.serviceClient().getByIdWithResponse(roleDefinitionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleDefinition deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String roleDefinitionId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}",
                    "roleDefinitionId");
        if (roleDefinitionId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'roleDefinitions'.", id)));
        }
        return this.deleteWithResponse(scope, roleDefinitionId, Context.NONE).getValue();
    }

    public Response<RoleDefinition> deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String roleDefinitionId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}",
                    "roleDefinitionId");
        if (roleDefinitionId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'roleDefinitions'.", id)));
        }
        return this.deleteWithResponse(scope, roleDefinitionId, context);
    }

    private RoleDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }

    public RoleDefinitionImpl define(String name) {
        return new RoleDefinitionImpl(name, this.manager());
    }
}
