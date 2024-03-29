// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.eventhubs.fluent.models.EventhubInner;
import com.azure.resourcemanager.hybrid.eventhubs.models.CaptureDescription;
import com.azure.resourcemanager.hybrid.eventhubs.models.EntityStatus;
import com.azure.resourcemanager.hybrid.eventhubs.models.Eventhub;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class EventhubImpl implements Eventhub, Eventhub.Definition, Eventhub.Update {
    private EventhubInner innerObject;

    private final com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<String> partitionIds() {
        List<String> inner = this.innerModel().partitionIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public Long messageRetentionInDays() {
        return this.innerModel().messageRetentionInDays();
    }

    public Long partitionCount() {
        return this.innerModel().partitionCount();
    }

    public EntityStatus status() {
        return this.innerModel().status();
    }

    public CaptureDescription captureDescription() {
        return this.innerModel().captureDescription();
    }

    public EventhubInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String eventHubName;

    public EventhubImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public Eventhub create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, eventHubName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Eventhub create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EventhubImpl(String name, com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager) {
        this.innerObject = new EventhubInner();
        this.serviceManager = serviceManager;
        this.eventHubName = name;
    }

    public EventhubImpl update() {
        return this;
    }

    public Eventhub apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, eventHubName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Eventhub apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, eventHubName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EventhubImpl(
        EventhubInner innerObject, com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.eventHubName = Utils.getValueFromIdByName(innerObject.id(), "eventhubs");
    }

    public Eventhub refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .getWithResponse(resourceGroupName, namespaceName, eventHubName, Context.NONE)
                .getValue();
        return this;
    }

    public Eventhub refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventHubs()
                .getWithResponse(resourceGroupName, namespaceName, eventHubName, context)
                .getValue();
        return this;
    }

    public EventhubImpl withMessageRetentionInDays(Long messageRetentionInDays) {
        this.innerModel().withMessageRetentionInDays(messageRetentionInDays);
        return this;
    }

    public EventhubImpl withPartitionCount(Long partitionCount) {
        this.innerModel().withPartitionCount(partitionCount);
        return this;
    }

    public EventhubImpl withStatus(EntityStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public EventhubImpl withCaptureDescription(CaptureDescription captureDescription) {
        this.innerModel().withCaptureDescription(captureDescription);
        return this;
    }
}
