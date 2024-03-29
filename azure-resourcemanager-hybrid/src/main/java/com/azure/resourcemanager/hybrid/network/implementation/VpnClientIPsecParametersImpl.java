// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.implementation;

import com.azure.resourcemanager.hybrid.network.fluent.models.VpnClientIPsecParametersInner;
import com.azure.resourcemanager.hybrid.network.models.DhGroup;
import com.azure.resourcemanager.hybrid.network.models.IkeEncryption;
import com.azure.resourcemanager.hybrid.network.models.IkeIntegrity;
import com.azure.resourcemanager.hybrid.network.models.IpsecEncryption;
import com.azure.resourcemanager.hybrid.network.models.IpsecIntegrity;
import com.azure.resourcemanager.hybrid.network.models.PfsGroup;
import com.azure.resourcemanager.hybrid.network.models.VpnClientIPsecParameters;

public final class VpnClientIPsecParametersImpl implements VpnClientIPsecParameters {
    private VpnClientIPsecParametersInner innerObject;

    private final com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager;

    VpnClientIPsecParametersImpl(
        VpnClientIPsecParametersInner innerObject,
        com.azure.resourcemanager.hybrid.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int saLifeTimeSeconds() {
        return this.innerModel().saLifeTimeSeconds();
    }

    public int saDataSizeKilobytes() {
        return this.innerModel().saDataSizeKilobytes();
    }

    public IpsecEncryption ipsecEncryption() {
        return this.innerModel().ipsecEncryption();
    }

    public IpsecIntegrity ipsecIntegrity() {
        return this.innerModel().ipsecIntegrity();
    }

    public IkeEncryption ikeEncryption() {
        return this.innerModel().ikeEncryption();
    }

    public IkeIntegrity ikeIntegrity() {
        return this.innerModel().ikeIntegrity();
    }

    public DhGroup dhGroup() {
        return this.innerModel().dhGroup();
    }

    public PfsGroup pfsGroup() {
        return this.innerModel().pfsGroup();
    }

    public VpnClientIPsecParametersInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
