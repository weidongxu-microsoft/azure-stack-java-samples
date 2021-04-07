// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.authorization.fluent.models.PolicyAssignmentInner;
import com.azure.resourcemanager.hybrid.authorization.models.PolicyAssignment;

public final class PolicyAssignmentImpl implements PolicyAssignment, PolicyAssignment.Definition {
    private PolicyAssignmentInner innerObject;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    PolicyAssignmentImpl(
        PolicyAssignmentInner innerObject,
        com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String policyDefinitionId() {
        return this.innerModel().policyDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public Object parameters() {
        return this.innerModel().parameters();
    }

    public String description() {
        return this.innerModel().description();
    }

    public PolicyAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String policyAssignmentName;

    public PolicyAssignmentImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public PolicyAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .createWithResponse(scope, policyAssignmentName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PolicyAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .createWithResponse(scope, policyAssignmentName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PolicyAssignmentImpl(
        String name, com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager) {
        this.innerObject = new PolicyAssignmentInner();
        this.serviceManager = serviceManager;
        this.policyAssignmentName = name;
    }

    public PolicyAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .getWithResponse(scope, policyAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public PolicyAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .getWithResponse(scope, policyAssignmentName, context)
                .getValue();
        return this;
    }

    public PolicyAssignmentImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public PolicyAssignmentImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public PolicyAssignmentImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public PolicyAssignmentImpl withPolicyDefinitionId(String policyDefinitionId) {
        this.innerModel().withPolicyDefinitionId(policyDefinitionId);
        return this;
    }

    public PolicyAssignmentImpl withScope(String scope) {
        this.innerModel().withScope(scope);
        return this;
    }

    public PolicyAssignmentImpl withParameters(Object parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }

    public PolicyAssignmentImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }
}
