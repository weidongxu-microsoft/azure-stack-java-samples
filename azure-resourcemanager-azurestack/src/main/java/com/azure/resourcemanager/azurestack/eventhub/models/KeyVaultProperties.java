// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.eventhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties to configure keyVault Properties. */
@Fluent
public final class KeyVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultProperties.class);

    /*
     * Name of the Key from KeyVault
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * Uri of KeyVault
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /*
     * Key Version
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Get the keyName property: Name of the Key from KeyVault.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Name of the Key from KeyVault.
     *
     * @param keyName the keyName value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVaultUri property: Uri of KeyVault.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: Uri of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the keyVersion property: Key Version.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: Key Version.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
