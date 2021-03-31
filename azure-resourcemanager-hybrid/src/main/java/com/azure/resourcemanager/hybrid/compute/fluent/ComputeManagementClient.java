// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ComputeManagementClient class. */
public interface ComputeManagementClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AvailabilitySetsClient object to access its operations.
     *
     * @return the AvailabilitySetsClient object.
     */
    AvailabilitySetsClient getAvailabilitySets();

    /**
     * Gets the ProximityPlacementGroupsClient object to access its operations.
     *
     * @return the ProximityPlacementGroupsClient object.
     */
    ProximityPlacementGroupsClient getProximityPlacementGroups();

    /**
     * Gets the DedicatedHostGroupsClient object to access its operations.
     *
     * @return the DedicatedHostGroupsClient object.
     */
    DedicatedHostGroupsClient getDedicatedHostGroups();

    /**
     * Gets the DedicatedHostsClient object to access its operations.
     *
     * @return the DedicatedHostsClient object.
     */
    DedicatedHostsClient getDedicatedHosts();

    /**
     * Gets the SshPublicKeysClient object to access its operations.
     *
     * @return the SshPublicKeysClient object.
     */
    SshPublicKeysClient getSshPublicKeys();

    /**
     * Gets the VirtualMachineExtensionImagesClient object to access its operations.
     *
     * @return the VirtualMachineExtensionImagesClient object.
     */
    VirtualMachineExtensionImagesClient getVirtualMachineExtensionImages();

    /**
     * Gets the VirtualMachineExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineExtensionsClient object.
     */
    VirtualMachineExtensionsClient getVirtualMachineExtensions();

    /**
     * Gets the VirtualMachineImagesClient object to access its operations.
     *
     * @return the VirtualMachineImagesClient object.
     */
    VirtualMachineImagesClient getVirtualMachineImages();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    VirtualMachinesClient getVirtualMachines();

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     *
     * @return the VirtualMachineSizesClient object.
     */
    VirtualMachineSizesClient getVirtualMachineSizes();

    /**
     * Gets the ImagesClient object to access its operations.
     *
     * @return the ImagesClient object.
     */
    ImagesClient getImages();

    /**
     * Gets the VirtualMachineScaleSetsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetsClient object.
     */
    VirtualMachineScaleSetsClient getVirtualMachineScaleSets();

    /**
     * Gets the VirtualMachineScaleSetExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetExtensionsClient object.
     */
    VirtualMachineScaleSetExtensionsClient getVirtualMachineScaleSetExtensions();

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetRollingUpgradesClient object.
     */
    VirtualMachineScaleSetRollingUpgradesClient getVirtualMachineScaleSetRollingUpgrades();

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMExtensionsClient object.
     */
    VirtualMachineScaleSetVMExtensionsClient getVirtualMachineScaleSetVMExtensions();

    /**
     * Gets the VirtualMachineScaleSetVMsClient object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMsClient object.
     */
    VirtualMachineScaleSetVMsClient getVirtualMachineScaleSetVMs();

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     *
     * @return the LogAnalyticsClient object.
     */
    LogAnalyticsClient getLogAnalytics();

    /**
     * Gets the DisksClient object to access its operations.
     *
     * @return the DisksClient object.
     */
    DisksClient getDisks();

    /**
     * Gets the SnapshotsClient object to access its operations.
     *
     * @return the SnapshotsClient object.
     */
    SnapshotsClient getSnapshots();

    /**
     * Gets the DiskEncryptionSetsClient object to access its operations.
     *
     * @return the DiskEncryptionSetsClient object.
     */
    DiskEncryptionSetsClient getDiskEncryptionSets();
}