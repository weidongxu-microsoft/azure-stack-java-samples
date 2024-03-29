// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the Security profile settings for the virtual machine or virtual machine scale set. */
@Fluent
public final class SecurityProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityProfile.class);

    /*
     * This property can be used by user in the request to enable or disable
     * the Host Encryption for the virtual machine or virtual machine scale
     * set. This will enable the encryption for all the disks including
     * Resource/Temp disk at host itself. <br><br> Default: The Encryption at
     * host will be disabled unless this property is set to true for the
     * resource.
     */
    @JsonProperty(value = "encryptionAtHost")
    private Boolean encryptionAtHost;

    /**
     * Get the encryptionAtHost property: This property can be used by user in the request to enable or disable the Host
     * Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the
     * disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be
     * disabled unless this property is set to true for the resource.
     *
     * @return the encryptionAtHost value.
     */
    public Boolean encryptionAtHost() {
        return this.encryptionAtHost;
    }

    /**
     * Set the encryptionAtHost property: This property can be used by user in the request to enable or disable the Host
     * Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the
     * disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be
     * disabled unless this property is set to true for the resource.
     *
     * @param encryptionAtHost the encryptionAtHost value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withEncryptionAtHost(Boolean encryptionAtHost) {
        this.encryptionAtHost = encryptionAtHost;
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
