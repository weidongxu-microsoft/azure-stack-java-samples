// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.compute.models.InstanceViewStatus;
import com.azure.resourcemanager.hybrid.compute.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines
 * specified in the same availability set are allocated to different nodes to maximize availability. For more
 * information about availability sets, see [Manage the availability of virtual
 * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
 * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines
 * in
 * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
 * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be
 * added to an availability set.
 */
@JsonFlatten
@Fluent
public class AvailabilitySetInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilitySetInner.class);

    /*
     * Sku of the availability set, only name is required to be set. See
     * AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for
     * virtual machines with managed disks and 'Classic' for virtual machines
     * with unmanaged disks. Default value is 'Classic'.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /*
     * Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachines;

    /*
     * Specifies information about the proximity placement group that the
     * availability set should be assigned to. <br><br>Minimum api-version:
     * 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "properties.statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * Get the sku property: Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes
     * for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual
     * machines with unmanaged disks. Default value is 'Classic'.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes
     * for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual
     * machines with unmanaged disks. Default value is 'Classic'.
     *
     * @param sku the sku value to set.
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the platformUpdateDomainCount property: Update Domain count.
     *
     * @return the platformUpdateDomainCount value.
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set the platformUpdateDomainCount property: Update Domain count.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set.
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value.
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set the virtualMachines property: A list of references to all virtual machines in the availability set.
     *
     * @param virtualMachines the virtualMachines value to set.
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /** {@inheritDoc} */
    @Override
    public AvailabilitySetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvailabilitySetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
