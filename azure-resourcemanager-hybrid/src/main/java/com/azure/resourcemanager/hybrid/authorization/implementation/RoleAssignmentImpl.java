// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.authorization.fluent.models.RoleAssignmentInner;
import com.azure.resourcemanager.hybrid.authorization.models.RoleAssignment;
import com.azure.resourcemanager.hybrid.authorization.models.RoleAssignmentCreateParameters;
import com.azure.resourcemanager.hybrid.authorization.models.RoleAssignmentProperties;
import com.azure.resourcemanager.hybrid.authorization.models.RoleAssignmentPropertiesWithScope;

public final class RoleAssignmentImpl implements RoleAssignment, RoleAssignment.Definition {
    private RoleAssignmentInner innerObject;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    RoleAssignmentImpl(
        RoleAssignmentInner innerObject,
        com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public RoleAssignmentPropertiesWithScope properties() {
        return this.innerModel().properties();
    }

    public RoleAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String roleAssignmentName;

    private RoleAssignmentCreateParameters createParameters;

    public RoleAssignmentImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public RoleAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createWithResponse(scope, roleAssignmentName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RoleAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .createWithResponse(scope, roleAssignmentName, createParameters, context)
                .getValue();
        return this;
    }

    RoleAssignmentImpl(
        String name, com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerObject = new RoleAssignmentInner();
        this.serviceManager = serviceManager;
        this.roleAssignmentName = name;
        this.createParameters = new RoleAssignmentCreateParameters();
    }

    public RoleAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(scope, roleAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public RoleAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoleAssignments()
                .getWithResponse(scope, roleAssignmentName, context)
                .getValue();
        return this;
    }

    public RoleAssignmentImpl withProperties(RoleAssignmentProperties properties) {
        this.createParameters.withProperties(properties);
        return this;
    }
}
