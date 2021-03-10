// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.generated.models.GroupIdInformation;
import com.azure.resourcemanager.iothub.generated.models.GroupIdInformationProperties;

public final class GroupIdInformationImpl implements GroupIdInformation {
    private GroupIdInformationInner innerObject;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    GroupIdInformationImpl(
        GroupIdInformationInner innerObject, com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
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

    public GroupIdInformationProperties properties() {
        return this.innerModel().properties();
    }

    public GroupIdInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
