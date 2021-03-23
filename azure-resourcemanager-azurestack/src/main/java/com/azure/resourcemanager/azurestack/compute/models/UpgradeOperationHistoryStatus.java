// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Information about the current running state of the overall upgrade. */
@Immutable
public final class UpgradeOperationHistoryStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpgradeOperationHistoryStatus.class);

    /*
     * Code indicating the current status of the upgrade.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeState code;

    /*
     * Start time of the upgrade.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * End time of the upgrade.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /**
     * Get the code property: Code indicating the current status of the upgrade.
     *
     * @return the code value.
     */
    public UpgradeState code() {
        return this.code;
    }

    /**
     * Get the startTime property: Start time of the upgrade.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: End time of the upgrade.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}