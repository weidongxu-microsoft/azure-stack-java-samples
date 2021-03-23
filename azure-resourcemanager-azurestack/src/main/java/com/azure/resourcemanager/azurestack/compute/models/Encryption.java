// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption at rest settings for disk or snapshot. */
@Fluent
public final class Encryption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Encryption.class);

    /*
     * ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * The type of key used to encrypt the data of the disk.
     */
    @JsonProperty(value = "type", required = true)
    private EncryptionType type;

    /**
     * Get the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the Encryption object itself.
     */
    public Encryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the type property: The type of key used to encrypt the data of the disk.
     *
     * @return the type value.
     */
    public EncryptionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of key used to encrypt the data of the disk.
     *
     * @param type the type value to set.
     * @return the Encryption object itself.
     */
    public Encryption withType(EncryptionType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model Encryption"));
        }
    }
}
