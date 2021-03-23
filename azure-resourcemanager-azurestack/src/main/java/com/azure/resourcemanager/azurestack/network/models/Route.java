// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.resourcemanager.azurestack.network.fluent.models.RouteInner;

/** An immutable client-side representation of Route. */
public interface Route {
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
     * Gets the addressPrefix property: The destination CIDR to which the route applies.
     *
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the nextHopType property: The type of Azure hop the packet should be sent to. Possible values are:
     * 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'.
     *
     * @return the nextHopType value.
     */
    RouteNextHopType nextHopType();

    /**
     * Gets the nextHopIpAddress property: The IP address packets should be forwarded to. Next hop values are only
     * allowed in routes where the next hop type is VirtualAppliance.
     *
     * @return the nextHopIpAddress value.
     */
    String nextHopIpAddress();

    /**
     * Gets the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.RouteInner object.
     *
     * @return the inner object.
     */
    RouteInner innerModel();
}
