// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.azurestack.network.fluent.models.OutboundRuleInner;
import java.util.List;

/** An immutable client-side representation of OutboundRule. */
public interface OutboundRule {
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
     * Gets the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     *
     * @return the allocatedOutboundPorts value.
     */
    Integer allocatedOutboundPorts();

    /**
     * Gets the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    List<SubResource> frontendIpConfigurations();

    /**
     * Gets the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    SubResource backendAddressPool();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the protocol property: Protocol - TCP, UDP or All.
     *
     * @return the protocol value.
     */
    OutboundRulePropertiesFormatProtocol protocol();

    /**
     * Gets the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * Gets the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.OutboundRuleInner object.
     *
     * @return the inner object.
     */
    OutboundRuleInner innerModel();
}