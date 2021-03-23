// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.monitor.implementation;

import com.azure.resourcemanager.azurestack.monitor.fluent.models.DiagnosticSettingsResourceCollectionInner;
import com.azure.resourcemanager.azurestack.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.azurestack.monitor.models.DiagnosticSettingsResource;
import com.azure.resourcemanager.azurestack.monitor.models.DiagnosticSettingsResourceCollection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DiagnosticSettingsResourceCollectionImpl implements DiagnosticSettingsResourceCollection {
    private DiagnosticSettingsResourceCollectionInner innerObject;

    private final com.azure.resourcemanager.azurestack.monitor.MonitorManager serviceManager;

    DiagnosticSettingsResourceCollectionImpl(
        DiagnosticSettingsResourceCollectionInner innerObject,
        com.azure.resourcemanager.azurestack.monitor.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DiagnosticSettingsResource> value() {
        List<DiagnosticSettingsResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DiagnosticSettingsResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public DiagnosticSettingsResourceCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.monitor.MonitorManager manager() {
        return this.serviceManager;
    }
}
