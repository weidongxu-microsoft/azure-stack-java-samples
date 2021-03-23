// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.azurestack.network.fluent.models.FrontendIpConfigurationInner;
import java.util.List;

/** An immutable client-side representation of FrontendIpConfiguration. */
public interface FrontendIpConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the inboundNatRules property: Read only. Inbound rules URIs that use this frontend IP.
     *
     * @return the inboundNatRules value.
     */
    List<SubResource> inboundNatRules();

    /**
     * Gets the inboundNatPools property: Read only. Inbound pools URIs that use this frontend IP.
     *
     * @return the inboundNatPools value.
     */
    List<SubResource> inboundNatPools();

    /**
     * Gets the outboundRules property: Read only. Outbound rules URIs that use this frontend IP.
     *
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * Gets the loadBalancingRules property: Gets load balancing rules URIs that use this frontend IP.
     *
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The Private IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the subnet property: The reference of the subnet resource.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference of the Public IP resource.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the publicIpPrefix property: The reference of the Public IP Prefix resource.
     *
     * @return the publicIpPrefix value.
     */
    SubResource publicIpPrefix();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.FrontendIpConfigurationInner object.
     *
     * @return the inner object.
     */
    FrontendIpConfigurationInner innerModel();
}
