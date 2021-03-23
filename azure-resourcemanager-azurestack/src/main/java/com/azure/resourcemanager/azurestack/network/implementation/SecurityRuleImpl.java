// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.resourcemanager.azurestack.network.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.azurestack.network.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.azurestack.network.models.SecurityRule;
import com.azure.resourcemanager.azurestack.network.models.SecurityRuleAccess;
import com.azure.resourcemanager.azurestack.network.models.SecurityRuleDirection;
import com.azure.resourcemanager.azurestack.network.models.SecurityRuleProtocol;
import java.util.Collections;
import java.util.List;

public final class SecurityRuleImpl implements SecurityRule {
    private SecurityRuleInner innerObject;

    private final com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager;

    SecurityRuleImpl(
        SecurityRuleInner innerObject, com.azure.resourcemanager.azurestack.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String description() {
        return this.innerModel().description();
    }

    public SecurityRuleProtocol protocol() {
        return this.innerModel().protocol();
    }

    public String sourcePortRange() {
        return this.innerModel().sourcePortRange();
    }

    public String destinationPortRange() {
        return this.innerModel().destinationPortRange();
    }

    public String sourceAddressPrefix() {
        return this.innerModel().sourceAddressPrefix();
    }

    public List<String> sourceAddressPrefixes() {
        List<String> inner = this.innerModel().sourceAddressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> sourceApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> inner = this.innerModel().sourceApplicationSecurityGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String destinationAddressPrefix() {
        return this.innerModel().destinationAddressPrefix();
    }

    public List<String> destinationAddressPrefixes() {
        List<String> inner = this.innerModel().destinationAddressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> destinationApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> inner = this.innerModel().destinationApplicationSecurityGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> sourcePortRanges() {
        List<String> inner = this.innerModel().sourcePortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> destinationPortRanges() {
        List<String> inner = this.innerModel().destinationPortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SecurityRuleAccess access() {
        return this.innerModel().access();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public SecurityRuleDirection direction() {
        return this.innerModel().direction();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SecurityRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.network.NetworkManager manager() {
        return this.serviceManager;
    }
}