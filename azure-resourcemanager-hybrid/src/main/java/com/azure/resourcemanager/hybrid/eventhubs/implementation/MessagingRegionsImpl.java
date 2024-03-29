// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.implementation;

import com.azure.resourcemanager.hybrid.eventhubs.fluent.models.MessagingRegionsInner;
import com.azure.resourcemanager.hybrid.eventhubs.models.MessagingRegions;
import com.azure.resourcemanager.hybrid.eventhubs.models.MessagingRegionsProperties;
import java.util.Collections;
import java.util.Map;

public final class MessagingRegionsImpl implements MessagingRegions {
    private MessagingRegionsInner innerObject;

    private final com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager;

    MessagingRegionsImpl(
        MessagingRegionsInner innerObject,
        com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager serviceManager) {
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

    public MessagingRegionsProperties properties() {
        return this.innerModel().properties();
    }

    public MessagingRegionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager manager() {
        return this.serviceManager;
    }
}
