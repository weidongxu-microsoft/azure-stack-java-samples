// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.TriggeredWebJobInner;
import com.azure.resourcemanager.hybrid.appservice.models.TriggeredJobRun;
import com.azure.resourcemanager.hybrid.appservice.models.TriggeredWebJob;
import com.azure.resourcemanager.hybrid.appservice.models.WebJobType;
import java.util.Collections;
import java.util.Map;

public final class TriggeredWebJobImpl implements TriggeredWebJob {
    private TriggeredWebJobInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    TriggeredWebJobImpl(
        TriggeredWebJobInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
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

    public TriggeredJobRun latestRun() {
        return this.innerModel().latestRun();
    }

    public String historyUrl() {
        return this.innerModel().historyUrl();
    }

    public String schedulerLogsUrl() {
        return this.innerModel().schedulerLogsUrl();
    }

    public String runCommand() {
        return this.innerModel().runCommand();
    }

    public String url() {
        return this.innerModel().url();
    }

    public String extraInfoUrl() {
        return this.innerModel().extraInfoUrl();
    }

    public WebJobType webJobType() {
        return this.innerModel().webJobType();
    }

    public String error() {
        return this.innerModel().error();
    }

    public Boolean usingSdk() {
        return this.innerModel().usingSdk();
    }

    public Map<String, Object> settings() {
        Map<String, Object> inner = this.innerModel().settings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public TriggeredWebJobInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
