// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.UserInner;
import com.azure.resourcemanager.hybrid.appservice.models.User;

public final class UserImpl implements User {
    private UserInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    UserImpl(UserInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String publishingUsername() {
        return this.innerModel().publishingUsername();
    }

    public String publishingPassword() {
        return this.innerModel().publishingPassword();
    }

    public String publishingPasswordHash() {
        return this.innerModel().publishingPasswordHash();
    }

    public String publishingPasswordHashSalt() {
        return this.innerModel().publishingPasswordHashSalt();
    }

    public String scmUri() {
        return this.innerModel().scmUri();
    }

    public UserInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
