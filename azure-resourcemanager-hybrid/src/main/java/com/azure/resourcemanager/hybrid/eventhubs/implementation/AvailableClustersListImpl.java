// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.implementation;

import com.azure.resourcemanager.hybrid.eventhubs.fluent.models.AvailableClustersListInner;
import com.azure.resourcemanager.hybrid.eventhubs.models.AvailableCluster;
import com.azure.resourcemanager.hybrid.eventhubs.models.AvailableClustersList;
import java.util.Collections;
import java.util.List;

public final class AvailableClustersListImpl implements AvailableClustersList {
    private AvailableClustersListInner innerObject;

    private final com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager;

    AvailableClustersListImpl(
        AvailableClustersListInner innerObject,
        com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<AvailableCluster> value() {
        List<AvailableCluster> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AvailableClustersListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager manager() {
        return this.serviceManager;
    }
}