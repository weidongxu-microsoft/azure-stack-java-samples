// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.keyvault.implementation;

import com.azure.resourcemanager.azurestack.keyvault.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.azurestack.keyvault.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.azurestack.keyvault.models.Reason;

public final class CheckNameAvailabilityResultImpl implements CheckNameAvailabilityResult {
    private CheckNameAvailabilityResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager serviceManager;

    CheckNameAvailabilityResultImpl(
        CheckNameAvailabilityResultInner innerObject,
        com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public Reason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.keyvault.KeyVaultManager manager() {
        return this.serviceManager;
    }
}
