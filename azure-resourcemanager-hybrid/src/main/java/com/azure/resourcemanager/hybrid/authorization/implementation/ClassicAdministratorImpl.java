// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.implementation;

import com.azure.resourcemanager.hybrid.authorization.fluent.models.ClassicAdministratorInner;
import com.azure.resourcemanager.hybrid.authorization.models.ClassicAdministrator;

public final class ClassicAdministratorImpl implements ClassicAdministrator {
    private ClassicAdministratorInner innerObject;

    private final com.azure.resourcemanager.hybrid.authorization.AuthorizationManager serviceManager;

    ClassicAdministratorImpl(
        ClassicAdministratorInner innerObject,
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

    public String emailAddress() {
        return this.innerModel().emailAddress();
    }

    public String role() {
        return this.innerModel().role();
    }

    public ClassicAdministratorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.authorization.AuthorizationManager manager() {
        return this.serviceManager;
    }
}