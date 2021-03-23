// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Publishing options for requested profile. */
@Fluent
public final class CsmPublishingProfileOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CsmPublishingProfileOptions.class);

    /*
     * Name of the format. Valid values are:
     * FileZilla3
     * WebDeploy -- default
     * Ftp
     */
    @JsonProperty(value = "format")
    private PublishingProfileFormat format;

    /*
     * Include the DisasterRecover endpoint if true
     */
    @JsonProperty(value = "includeDisasterRecoveryEndpoints")
    private Boolean includeDisasterRecoveryEndpoints;

    /**
     * Get the format property: Name of the format. Valid values are: FileZilla3 WebDeploy -- default Ftp.
     *
     * @return the format value.
     */
    public PublishingProfileFormat format() {
        return this.format;
    }

    /**
     * Set the format property: Name of the format. Valid values are: FileZilla3 WebDeploy -- default Ftp.
     *
     * @param format the format value to set.
     * @return the CsmPublishingProfileOptions object itself.
     */
    public CsmPublishingProfileOptions withFormat(PublishingProfileFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the includeDisasterRecoveryEndpoints property: Include the DisasterRecover endpoint if true.
     *
     * @return the includeDisasterRecoveryEndpoints value.
     */
    public Boolean includeDisasterRecoveryEndpoints() {
        return this.includeDisasterRecoveryEndpoints;
    }

    /**
     * Set the includeDisasterRecoveryEndpoints property: Include the DisasterRecover endpoint if true.
     *
     * @param includeDisasterRecoveryEndpoints the includeDisasterRecoveryEndpoints value to set.
     * @return the CsmPublishingProfileOptions object itself.
     */
    public CsmPublishingProfileOptions withIncludeDisasterRecoveryEndpoints(Boolean includeDisasterRecoveryEndpoints) {
        this.includeDisasterRecoveryEndpoints = includeDisasterRecoveryEndpoints;
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