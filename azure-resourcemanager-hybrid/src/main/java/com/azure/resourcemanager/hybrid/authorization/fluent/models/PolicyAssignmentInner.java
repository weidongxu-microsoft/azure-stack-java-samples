// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The policy assignment. */
@JsonFlatten
@Fluent
public class PolicyAssignmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyAssignmentInner.class);

    /*
     * The type of the policy assignment.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The name of the policy assignment.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The ID of the policy definition.
     */
    @JsonProperty(value = "properties.policyDefinitionId")
    private String policyDefinitionId;

    /*
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /*
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /*
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the type property: The type of the policy assignment.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the policy assignment.
     *
     * @param type the type value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the policy assignment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the policy assignment.
     *
     * @param name the name value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy assignment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy assignment.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policyDefinitionId property: The ID of the policy definition.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: The ID of the policy definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The scope for the policy assignment.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope for the policy assignment.
     *
     * @param scope the scope value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the parameters property: Required if a parameter is used in policy rule.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the description property: This message will be part of response in case of policy violation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: This message will be part of response in case of policy violation.
     *
     * @param description the description value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}