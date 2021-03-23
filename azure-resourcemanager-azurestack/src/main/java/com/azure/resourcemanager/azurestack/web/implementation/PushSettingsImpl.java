// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.implementation;

import com.azure.resourcemanager.azurestack.web.fluent.models.PushSettingsInner;
import com.azure.resourcemanager.azurestack.web.models.PushSettings;

public final class PushSettingsImpl implements PushSettings {
    private PushSettingsInner innerObject;

    private final com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager;

    PushSettingsImpl(
        PushSettingsInner innerObject, com.azure.resourcemanager.azurestack.web.AppServiceManager serviceManager) {
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

    public Boolean isPushEnabled() {
        return this.innerModel().isPushEnabled();
    }

    public String tagWhitelistJson() {
        return this.innerModel().tagWhitelistJson();
    }

    public String tagsRequiringAuth() {
        return this.innerModel().tagsRequiringAuth();
    }

    public String dynamicTagsJson() {
        return this.innerModel().dynamicTagsJson();
    }

    public PushSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.web.AppServiceManager manager() {
        return this.serviceManager;
    }
}
