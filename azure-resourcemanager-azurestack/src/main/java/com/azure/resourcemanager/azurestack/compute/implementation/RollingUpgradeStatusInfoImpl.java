// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.resourcemanager.azurestack.compute.fluent.models.RollingUpgradeStatusInfoInner;
import com.azure.resourcemanager.azurestack.compute.models.ApiError;
import com.azure.resourcemanager.azurestack.compute.models.RollingUpgradePolicy;
import com.azure.resourcemanager.azurestack.compute.models.RollingUpgradeProgressInfo;
import com.azure.resourcemanager.azurestack.compute.models.RollingUpgradeRunningStatus;
import com.azure.resourcemanager.azurestack.compute.models.RollingUpgradeStatusInfo;
import java.util.Collections;
import java.util.Map;

public final class RollingUpgradeStatusInfoImpl implements RollingUpgradeStatusInfo {
    private RollingUpgradeStatusInfoInner innerObject;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

    RollingUpgradeStatusInfoImpl(
        RollingUpgradeStatusInfoInner innerObject,
        com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public RollingUpgradePolicy policy() {
        return this.innerModel().policy();
    }

    public RollingUpgradeRunningStatus runningStatus() {
        return this.innerModel().runningStatus();
    }

    public RollingUpgradeProgressInfo progress() {
        return this.innerModel().progress();
    }

    public ApiError error() {
        return this.innerModel().error();
    }

    public RollingUpgradeStatusInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
