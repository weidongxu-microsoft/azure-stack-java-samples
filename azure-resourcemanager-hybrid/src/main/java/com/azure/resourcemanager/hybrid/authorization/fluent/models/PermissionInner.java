// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role definition permissions. */
@Fluent
public final class PermissionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PermissionInner.class);

    /*
     * Allowed actions.
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /*
     * Denied actions.
     */
    @JsonProperty(value = "notActions")
    private List<String> notActions;

    /**
     * Get the actions property: Allowed actions.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: Allowed actions.
     *
     * @param actions the actions value to set.
     * @return the PermissionInner object itself.
     */
    public PermissionInner withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the notActions property: Denied actions.
     *
     * @return the notActions value.
     */
    public List<String> notActions() {
        return this.notActions;
    }

    /**
     * Set the notActions property: Denied actions.
     *
     * @param notActions the notActions value to set.
     * @return the PermissionInner object itself.
     */
    public PermissionInner withNotActions(List<String> notActions) {
        this.notActions = notActions;
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
