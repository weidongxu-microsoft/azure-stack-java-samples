// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.resourcemanager.azurestack.compute.fluent.models.SshPublicKeyGenerateKeyPairResultInner;
import com.azure.resourcemanager.azurestack.compute.models.SshPublicKeyGenerateKeyPairResult;

public final class SshPublicKeyGenerateKeyPairResultImpl implements SshPublicKeyGenerateKeyPairResult {
    private SshPublicKeyGenerateKeyPairResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

    SshPublicKeyGenerateKeyPairResultImpl(
        SshPublicKeyGenerateKeyPairResultInner innerObject,
        com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String privateKey() {
        return this.innerModel().privateKey();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public String id() {
        return this.innerModel().id();
    }

    public SshPublicKeyGenerateKeyPairResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
