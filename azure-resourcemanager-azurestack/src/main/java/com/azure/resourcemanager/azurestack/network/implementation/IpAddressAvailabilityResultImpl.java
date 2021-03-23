// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.resourcemanager.azurestack.network.fluent.models.IpAddressAvailabilityResultInner;
import com.azure.resourcemanager.azurestack.network.models.IpAddressAvailabilityResult;
import java.util.Collections;
import java.util.List;

public final class IpAddressAvailabilityResultImpl implements IpAddressAvailabilityResult {
    private IpAddressAvailabilityResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    IpAddressAvailabilityResultImpl(
        IpAddressAvailabilityResultInner innerObject,
        com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean available() {
        return this.innerModel().available();
    }

    public List<String> availableIpAddresses() {
        List<String> inner = this.innerModel().availableIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IpAddressAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }
}