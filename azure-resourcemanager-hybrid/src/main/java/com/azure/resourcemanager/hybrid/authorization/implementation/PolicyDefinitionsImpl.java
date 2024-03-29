// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.authorization.fluent.PolicyDefinitionsClient;
import com.azure.resourcemanager.hybrid.authorization.fluent.models.PolicyDefinitionInner;
import com.azure.resourcemanager.hybrid.authorization.models.PolicyDefinition;
import com.azure.resourcemanager.hybrid.authorization.models.PolicyDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PolicyDefinitionsImpl implements PolicyDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyDefinitionsImpl.class);

    private final PolicyDefinitionsClient innerClient;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    public PolicyDefinitionsImpl(
        PolicyDefinitionsClient innerClient,
        com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PolicyDefinition createOrUpdate(String policyDefinitionName, PolicyDefinitionInner parameters) {
        PolicyDefinitionInner inner = this.serviceClient().createOrUpdate(policyDefinitionName, parameters);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> createOrUpdateWithResponse(
        String policyDefinitionName, PolicyDefinitionInner parameters, Context context) {
        Response<PolicyDefinitionInner> inner =
            this.serviceClient().createOrUpdateWithResponse(policyDefinitionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String policyDefinitionName) {
        this.serviceClient().delete(policyDefinitionName);
    }

    public Response<Void> deleteWithResponse(String policyDefinitionName, Context context) {
        return this.serviceClient().deleteWithResponse(policyDefinitionName, context);
    }

    public PolicyDefinition get(String policyDefinitionName) {
        PolicyDefinitionInner inner = this.serviceClient().get(policyDefinitionName);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> getWithResponse(String policyDefinitionName, Context context) {
        Response<PolicyDefinitionInner> inner = this.serviceClient().getWithResponse(policyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition getBuiltIn(String policyDefinitionName) {
        PolicyDefinitionInner inner = this.serviceClient().getBuiltIn(policyDefinitionName);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> getBuiltInWithResponse(String policyDefinitionName, Context context) {
        Response<PolicyDefinitionInner> inner =
            this.serviceClient().getBuiltInWithResponse(policyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDefinition createOrUpdateAtManagementGroup(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters) {
        PolicyDefinitionInner inner =
            this.serviceClient().createOrUpdateAtManagementGroup(policyDefinitionName, managementGroupId, parameters);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> createOrUpdateAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters, Context context) {
        Response<PolicyDefinitionInner> inner =
            this
                .serviceClient()
                .createOrUpdateAtManagementGroupWithResponse(
                    policyDefinitionName, managementGroupId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAtManagementGroup(String policyDefinitionName, String managementGroupId) {
        this.serviceClient().deleteAtManagementGroup(policyDefinitionName, managementGroupId);
    }

    public Response<Void> deleteAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context) {
        return this
            .serviceClient()
            .deleteAtManagementGroupWithResponse(policyDefinitionName, managementGroupId, context);
    }

    public PolicyDefinition getAtManagementGroup(String policyDefinitionName, String managementGroupId) {
        PolicyDefinitionInner inner =
            this.serviceClient().getAtManagementGroup(policyDefinitionName, managementGroupId);
        if (inner != null) {
            return new PolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyDefinition> getAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context) {
        Response<PolicyDefinitionInner> inner =
            this.serviceClient().getAtManagementGroupWithResponse(policyDefinitionName, managementGroupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PolicyDefinition> list() {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> list(Context context) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listBuiltIn() {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listBuiltIn();
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listBuiltIn(Context context) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listBuiltIn(context);
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId) {
        PagedIterable<PolicyDefinitionInner> inner = this.serviceClient().listByManagementGroup(managementGroupId);
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId, Context context) {
        PagedIterable<PolicyDefinitionInner> inner =
            this.serviceClient().listByManagementGroup(managementGroupId, context);
        return Utils.mapPage(inner, inner1 -> new PolicyDefinitionImpl(inner1, this.manager()));
    }

    private PolicyDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
