// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.hybrid.network.fluent.models.BackendAddressPoolInner;
import java.util.List;

/** An immutable client-side representation of BackendAddressPool. */
public interface BackendAddressPool {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Gets name of the resource that is unique within a resource group. This name can be used
     * to access the resource.
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
     * Gets the backendIpConfigurations property: Gets collection of references to IP addresses defined in network
     * interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    List<NetworkInterfaceIpConfiguration> backendIpConfigurations();

    /**
     * Gets the loadBalancingRules property: Gets load balancing rules that use this backend address pool.
     *
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the outboundRule property: Gets outbound rules that use this backend address pool.
     *
     * @return the outboundRule value.
     */
    SubResource outboundRule();

    /**
     * Gets the outboundRules property: Gets outbound rules that use this backend address pool.
     *
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * Gets the provisioningState property: Get provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.BackendAddressPoolInner object.
     *
     * @return the inner object.
     */
    BackendAddressPoolInner innerModel();
}