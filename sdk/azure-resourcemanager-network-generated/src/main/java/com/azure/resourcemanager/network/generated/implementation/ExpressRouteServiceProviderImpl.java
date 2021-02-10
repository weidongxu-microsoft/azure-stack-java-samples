// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteServiceProviderInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteServiceProvider;
import com.azure.resourcemanager.network.generated.models.ExpressRouteServiceProviderBandwidthsOffered;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ExpressRouteServiceProviderImpl implements ExpressRouteServiceProvider {
    private ExpressRouteServiceProviderInner innerObject;

    private final NetworkManager serviceManager;

    ExpressRouteServiceProviderImpl(ExpressRouteServiceProviderInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
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

    public List<String> peeringLocations() {
        List<String> inner = this.innerModel().peeringLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        List<ExpressRouteServiceProviderBandwidthsOffered> inner = this.innerModel().bandwidthsOffered();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String id() {
        return this.innerModel().id();
    }

    public ExpressRouteServiceProviderInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}