// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.HybridConnectionInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.NetworkFeaturesInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.RelayServiceConnectionEntityInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.VnetInfoInner;
import com.azure.resourcemanager.hybrid.appservice.models.HybridConnection;
import com.azure.resourcemanager.hybrid.appservice.models.NetworkFeatures;
import com.azure.resourcemanager.hybrid.appservice.models.RelayServiceConnectionEntity;
import com.azure.resourcemanager.hybrid.appservice.models.VnetInfo;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class NetworkFeaturesImpl implements NetworkFeatures {
    private NetworkFeaturesInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    NetworkFeaturesImpl(
        NetworkFeaturesInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
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

    public String virtualNetworkName() {
        return this.innerModel().virtualNetworkName();
    }

    public VnetInfo virtualNetworkConnection() {
        VnetInfoInner inner = this.innerModel().virtualNetworkConnection();
        if (inner != null) {
            return new VnetInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<RelayServiceConnectionEntity> hybridConnections() {
        List<RelayServiceConnectionEntityInner> inner = this.innerModel().hybridConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new RelayServiceConnectionEntityImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<HybridConnection> hybridConnectionsV2() {
        List<HybridConnectionInner> inner = this.innerModel().hybridConnectionsV2();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new HybridConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkFeaturesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
