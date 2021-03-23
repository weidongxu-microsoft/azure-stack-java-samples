// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.resourcemanager.azurestack.network.fluent.models.VirtualNetworkTapInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualNetworkTap. */
public interface VirtualNetworkTap {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface
     * IP configuration that needs to be tapped.
     *
     * @return the networkInterfaceTapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations();

    /**
     * Gets the resourceGuid property: The resourceGuid property of the virtual network tap.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network tap. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration();

    /**
     * Gets the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration();

    /**
     * Gets the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @return the destinationPort value.
     */
    Integer destinationPort();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.VirtualNetworkTapInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkTapInner innerModel();
}