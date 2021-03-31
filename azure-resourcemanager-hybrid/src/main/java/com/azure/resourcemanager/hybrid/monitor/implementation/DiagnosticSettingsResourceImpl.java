// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.hybrid.monitor.models.DiagnosticSettingsResource;
import com.azure.resourcemanager.hybrid.monitor.models.LogSettings;
import com.azure.resourcemanager.hybrid.monitor.models.MetricSettings;
import java.util.Collections;
import java.util.List;

public final class DiagnosticSettingsResourceImpl
    implements DiagnosticSettingsResource, DiagnosticSettingsResource.Definition, DiagnosticSettingsResource.Update {
    private DiagnosticSettingsResourceInner innerObject;

    private final com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String storageAccountId() {
        return this.innerModel().storageAccountId();
    }

    public String serviceBusRuleId() {
        return this.innerModel().serviceBusRuleId();
    }

    public String eventHubAuthorizationRuleId() {
        return this.innerModel().eventHubAuthorizationRuleId();
    }

    public String eventHubName() {
        return this.innerModel().eventHubName();
    }

    public List<MetricSettings> metrics() {
        List<MetricSettings> inner = this.innerModel().metrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<LogSettings> logs() {
        List<LogSettings> inner = this.innerModel().logs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String logAnalyticsDestinationType() {
        return this.innerModel().logAnalyticsDestinationType();
    }

    public DiagnosticSettingsResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.monitor.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceUri;

    private String name;

    public DiagnosticSettingsResourceImpl withExistingResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    public DiagnosticSettingsResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .createOrUpdateWithResponse(resourceUri, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DiagnosticSettingsResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .createOrUpdateWithResponse(resourceUri, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DiagnosticSettingsResourceImpl(
        String name, com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager) {
        this.innerObject = new DiagnosticSettingsResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DiagnosticSettingsResourceImpl update() {
        return this;
    }

    public DiagnosticSettingsResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .createOrUpdateWithResponse(resourceUri, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DiagnosticSettingsResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .createOrUpdateWithResponse(resourceUri, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DiagnosticSettingsResourceImpl(
        DiagnosticSettingsResourceInner innerObject,
        com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceUri =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{resourceUri}/providers/microsoft.insights/diagnosticSettings/{name}",
                    "resourceUri");
        this.name =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{resourceUri}/providers/microsoft.insights/diagnosticSettings/{name}", "name");
    }

    public DiagnosticSettingsResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .getWithResponse(resourceUri, name, Context.NONE)
                .getValue();
        return this;
    }

    public DiagnosticSettingsResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnosticSettings()
                .getWithResponse(resourceUri, name, context)
                .getValue();
        return this;
    }

    public DiagnosticSettingsResourceImpl withStorageAccountId(String storageAccountId) {
        this.innerModel().withStorageAccountId(storageAccountId);
        return this;
    }

    public DiagnosticSettingsResourceImpl withServiceBusRuleId(String serviceBusRuleId) {
        this.innerModel().withServiceBusRuleId(serviceBusRuleId);
        return this;
    }

    public DiagnosticSettingsResourceImpl withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId) {
        this.innerModel().withEventHubAuthorizationRuleId(eventHubAuthorizationRuleId);
        return this;
    }

    public DiagnosticSettingsResourceImpl withEventHubName(String eventHubName) {
        this.innerModel().withEventHubName(eventHubName);
        return this;
    }

    public DiagnosticSettingsResourceImpl withMetrics(List<MetricSettings> metrics) {
        this.innerModel().withMetrics(metrics);
        return this;
    }

    public DiagnosticSettingsResourceImpl withLogs(List<LogSettings> logs) {
        this.innerModel().withLogs(logs);
        return this;
    }

    public DiagnosticSettingsResourceImpl withWorkspaceId(String workspaceId) {
        this.innerModel().withWorkspaceId(workspaceId);
        return this;
    }

    public DiagnosticSettingsResourceImpl withLogAnalyticsDestinationType(String logAnalyticsDestinationType) {
        this.innerModel().withLogAnalyticsDestinationType(logAnalyticsDestinationType);
        return this;
    }
}