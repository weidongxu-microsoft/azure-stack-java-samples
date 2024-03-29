// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.keyvault.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.keyvault.fluent.models.SecretInner;
import com.azure.resourcemanager.hybrid.keyvault.models.Secret;
import com.azure.resourcemanager.hybrid.keyvault.models.SecretCreateOrUpdateParameters;
import com.azure.resourcemanager.hybrid.keyvault.models.SecretPatchParameters;
import com.azure.resourcemanager.hybrid.keyvault.models.SecretPatchProperties;
import com.azure.resourcemanager.hybrid.keyvault.models.SecretProperties;
import java.util.Collections;
import java.util.Map;

public final class SecretImpl implements Secret, Secret.Definition, Secret.Update {
    private SecretInner innerObject;

    private final com.azure.resourcemanager.hybrid.keyvault.KeyVaultManager serviceManager;

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

    public SecretProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SecretInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.keyvault.KeyVaultManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private String secretName;

    private SecretCreateOrUpdateParameters createParameters;

    private SecretPatchParameters updateParameters;

    public SecretImpl withExistingVault(String resourceGroupName, String vaultName) {
        this.resourceGroupName = resourceGroupName;
        this.vaultName = vaultName;
        return this;
    }

    public Secret create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .createOrUpdateWithResponse(resourceGroupName, vaultName, secretName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Secret create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .createOrUpdateWithResponse(resourceGroupName, vaultName, secretName, createParameters, context)
                .getValue();
        return this;
    }

    SecretImpl(String name, com.azure.resourcemanager.hybrid.keyvault.KeyVaultManager serviceManager) {
        this.innerObject = new SecretInner();
        this.serviceManager = serviceManager;
        this.secretName = name;
        this.createParameters = new SecretCreateOrUpdateParameters();
    }

    public SecretImpl update() {
        this.updateParameters = new SecretPatchParameters();
        return this;
    }

    public Secret apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .updateWithResponse(resourceGroupName, vaultName, secretName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Secret apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .updateWithResponse(resourceGroupName, vaultName, secretName, updateParameters, context)
                .getValue();
        return this;
    }

    SecretImpl(SecretInner innerObject, com.azure.resourcemanager.hybrid.keyvault.KeyVaultManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.secretName = Utils.getValueFromIdByName(innerObject.id(), "secrets");
    }

    public Secret refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .getWithResponse(resourceGroupName, vaultName, secretName, Context.NONE)
                .getValue();
        return this;
    }

    public Secret refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecrets()
                .getWithResponse(resourceGroupName, vaultName, secretName, context)
                .getValue();
        return this;
    }

    public SecretImpl withProperties(SecretProperties properties) {
        this.createParameters.withProperties(properties);
        return this;
    }

    public SecretImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SecretImpl withProperties(SecretPatchProperties properties) {
        this.updateParameters.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
