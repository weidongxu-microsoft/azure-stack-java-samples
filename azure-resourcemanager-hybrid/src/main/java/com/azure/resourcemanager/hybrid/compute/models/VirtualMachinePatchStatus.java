// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of virtual machine patch operations. */
@Fluent
public final class VirtualMachinePatchStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachinePatchStatus.class);

    /*
     * The available patch summary of the latest assessment operation for the
     * virtual machine.
     */
    @JsonProperty(value = "availablePatchSummary")
    private AvailablePatchSummary availablePatchSummary;

    /*
     * The installation summary of the latest installation operation for the
     * virtual machine.
     */
    @JsonProperty(value = "lastPatchInstallationSummary")
    private LastPatchInstallationSummary lastPatchInstallationSummary;

    /**
     * Get the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     *
     * @return the availablePatchSummary value.
     */
    public AvailablePatchSummary availablePatchSummary() {
        return this.availablePatchSummary;
    }

    /**
     * Set the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     *
     * @param availablePatchSummary the availablePatchSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus withAvailablePatchSummary(AvailablePatchSummary availablePatchSummary) {
        this.availablePatchSummary = availablePatchSummary;
        return this;
    }

    /**
     * Get the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     *
     * @return the lastPatchInstallationSummary value.
     */
    public LastPatchInstallationSummary lastPatchInstallationSummary() {
        return this.lastPatchInstallationSummary;
    }

    /**
     * Set the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     *
     * @param lastPatchInstallationSummary the lastPatchInstallationSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus withLastPatchInstallationSummary(
        LastPatchInstallationSummary lastPatchInstallationSummary) {
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availablePatchSummary() != null) {
            availablePatchSummary().validate();
        }
        if (lastPatchInstallationSummary() != null) {
            lastPatchInstallationSummary().validate();
        }
    }
}