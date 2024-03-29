// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the dedicated host group that the dedicated host should be assigned to. Only tags may be
 * updated.
 */
@JsonFlatten
@Fluent
public class DedicatedHostGroupUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostGroupUpdate.class);

    /*
     * Availability Zone to use for this host group. Only single zone is
     * supported. The zone can be assigned only during creation. If not
     * provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Number of fault domains that the host group can span.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * A list of references to all dedicated hosts in the dedicated host group.
     */
    @JsonProperty(value = "properties.hosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> hosts;

    /*
     * The dedicated host group instance view, which has the list of instance
     * view of the dedicated hosts under the dedicated host group.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private DedicatedHostGroupInstanceView instanceView;

    /*
     * Specifies whether virtual machines or virtual machine scale sets can be
     * placed automatically on the dedicated host group. Automatic placement
     * means resources are allocated on dedicated hosts, that are chosen by
     * Azure, under the dedicated host group. The value is defaulted to 'false'
     * when not provided. <br><br>Minimum api-version: 2020-06-01.
     */
    @JsonProperty(value = "properties.supportAutomaticPlacement")
    private Boolean supportAutomaticPlacement;

    /**
     * Get the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     *
     * @param zones the zones value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Number of fault domains that the host group can span.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Number of fault domains that the host group can span.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the hosts property: A list of references to all dedicated hosts in the dedicated host group.
     *
     * @return the hosts value.
     */
    public List<SubResourceReadOnly> hosts() {
        return this.hosts;
    }

    /**
     * Get the instanceView property: The dedicated host group instance view, which has the list of instance view of the
     * dedicated hosts under the dedicated host group.
     *
     * @return the instanceView value.
     */
    public DedicatedHostGroupInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get the supportAutomaticPlacement property: Specifies whether virtual machines or virtual machine scale sets can
     * be placed automatically on the dedicated host group. Automatic placement means resources are allocated on
     * dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when
     * not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the supportAutomaticPlacement value.
     */
    public Boolean supportAutomaticPlacement() {
        return this.supportAutomaticPlacement;
    }

    /**
     * Set the supportAutomaticPlacement property: Specifies whether virtual machines or virtual machine scale sets can
     * be placed automatically on the dedicated host group. Automatic placement means resources are allocated on
     * dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when
     * not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @param supportAutomaticPlacement the supportAutomaticPlacement value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withSupportAutomaticPlacement(Boolean supportAutomaticPlacement) {
        this.supportAutomaticPlacement = supportAutomaticPlacement;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedHostGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hosts() != null) {
            hosts().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
