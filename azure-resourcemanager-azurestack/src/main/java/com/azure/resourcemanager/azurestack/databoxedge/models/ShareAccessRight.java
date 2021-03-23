// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the mapping between this particular user and the type of access he has on shares on this device. */
@Fluent
public final class ShareAccessRight {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShareAccessRight.class);

    /*
     * The share ID.
     */
    @JsonProperty(value = "shareId", required = true)
    private String shareId;

    /*
     * Type of access to be allowed on the share for this user.
     */
    @JsonProperty(value = "accessType", required = true)
    private ShareAccessType accessType;

    /**
     * Get the shareId property: The share ID.
     *
     * @return the shareId value.
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Set the shareId property: The share ID.
     *
     * @param shareId the shareId value to set.
     * @return the ShareAccessRight object itself.
     */
    public ShareAccessRight withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * Get the accessType property: Type of access to be allowed on the share for this user.
     *
     * @return the accessType value.
     */
    public ShareAccessType accessType() {
        return this.accessType;
    }

    /**
     * Set the accessType property: Type of access to be allowed on the share for this user.
     *
     * @param accessType the accessType value to set.
     * @return the ShareAccessRight object itself.
     */
    public ShareAccessRight withAccessType(ShareAccessType accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (shareId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property shareId in model ShareAccessRight"));
        }
        if (accessType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accessType in model ShareAccessRight"));
        }
    }
}
