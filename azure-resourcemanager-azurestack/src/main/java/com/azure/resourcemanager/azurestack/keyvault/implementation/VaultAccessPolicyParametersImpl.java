// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.keyvault.implementation;

import com.azure.resourcemanager.azurestack.keyvault.fluent.models.VaultAccessPolicyParametersInner;
import com.azure.resourcemanager.azurestack.keyvault.models.VaultAccessPolicyParameters;
import com.azure.resourcemanager.azurestack.keyvault.models.VaultAccessPolicyProperties;

public final class VaultAccessPolicyParametersImpl implements VaultAccessPolicyParameters {
    private VaultAccessPolicyParametersInner innerObject;

    private final com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager serviceManager;

    VaultAccessPolicyParametersImpl(
        VaultAccessPolicyParametersInner innerObject,
        com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager serviceManager) {
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

    public VaultAccessPolicyProperties properties() {
        return this.innerModel().properties();
    }

    public VaultAccessPolicyParametersInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager manager() {
        return this.serviceManager;
    }
}
