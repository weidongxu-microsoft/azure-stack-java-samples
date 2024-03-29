// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.hybrid.network.fluent.models.InboundNatRuleInner;

/** An immutable client-side representation of InboundNatRule. */
public interface InboundNatRule {
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
     * Gets the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    SubResource frontendIpConfiguration();

    /**
     * Gets the backendIpConfiguration property: A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     *
     * @return the backendIpConfiguration value.
     */
    NetworkInterfaceIpConfiguration backendIpConfiguration();

    /**
     * Gets the protocol property: The transport protocol for the endpoint. Possible values are 'Udp' or 'Tcp' or 'All'.
     *
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * Gets the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPort value.
     */
    Integer frontendPort();

    /**
     * Gets the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * Gets the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    Boolean enableFloatingIp();

    /**
     * Gets the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.InboundNatRuleInner object.
     *
     * @return the inner object.
     */
    InboundNatRuleInner innerModel();
}
