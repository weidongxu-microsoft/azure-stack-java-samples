// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.resourcemanager.azurestack.network.fluent.models.EffectiveRouteListResultInner;
import com.azure.resourcemanager.azurestack.network.models.EffectiveRoute;
import com.azure.resourcemanager.azurestack.network.models.EffectiveRouteListResult;
import java.util.Collections;
import java.util.List;

public final class EffectiveRouteListResultImpl implements EffectiveRouteListResult {
    private EffectiveRouteListResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    EffectiveRouteListResultImpl(
        EffectiveRouteListResultInner innerObject,
        com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<EffectiveRoute> value() {
        List<EffectiveRoute> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public EffectiveRouteListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
