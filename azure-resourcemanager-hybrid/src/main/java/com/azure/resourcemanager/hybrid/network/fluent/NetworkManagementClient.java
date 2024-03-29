// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for NetworkManagementClient class. */
public interface NetworkManagementClient {
    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
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
     * Gets the VirtualNetworkGatewaysClient object to access its operations.
     *
     * @return the VirtualNetworkGatewaysClient object.
     */
    VirtualNetworkGatewaysClient getVirtualNetworkGateways();

    /**
     * Gets the VirtualNetworkGatewayConnectionsClient object to access its operations.
     *
     * @return the VirtualNetworkGatewayConnectionsClient object.
     */
    VirtualNetworkGatewayConnectionsClient getVirtualNetworkGatewayConnections();

    /**
     * Gets the LocalNetworkGatewaysClient object to access its operations.
     *
     * @return the LocalNetworkGatewaysClient object.
     */
    LocalNetworkGatewaysClient getLocalNetworkGateways();

    /**
     * Gets the LoadBalancersClient object to access its operations.
     *
     * @return the LoadBalancersClient object.
     */
    LoadBalancersClient getLoadBalancers();

    /**
     * Gets the LoadBalancerBackendAddressPoolsClient object to access its operations.
     *
     * @return the LoadBalancerBackendAddressPoolsClient object.
     */
    LoadBalancerBackendAddressPoolsClient getLoadBalancerBackendAddressPools();

    /**
     * Gets the LoadBalancerFrontendIpConfigurationsClient object to access its operations.
     *
     * @return the LoadBalancerFrontendIpConfigurationsClient object.
     */
    LoadBalancerFrontendIpConfigurationsClient getLoadBalancerFrontendIpConfigurations();

    /**
     * Gets the InboundNatRulesClient object to access its operations.
     *
     * @return the InboundNatRulesClient object.
     */
    InboundNatRulesClient getInboundNatRules();

    /**
     * Gets the LoadBalancerLoadBalancingRulesClient object to access its operations.
     *
     * @return the LoadBalancerLoadBalancingRulesClient object.
     */
    LoadBalancerLoadBalancingRulesClient getLoadBalancerLoadBalancingRules();

    /**
     * Gets the LoadBalancerOutboundRulesClient object to access its operations.
     *
     * @return the LoadBalancerOutboundRulesClient object.
     */
    LoadBalancerOutboundRulesClient getLoadBalancerOutboundRules();

    /**
     * Gets the LoadBalancerNetworkInterfacesClient object to access its operations.
     *
     * @return the LoadBalancerNetworkInterfacesClient object.
     */
    LoadBalancerNetworkInterfacesClient getLoadBalancerNetworkInterfaces();

    /**
     * Gets the LoadBalancerProbesClient object to access its operations.
     *
     * @return the LoadBalancerProbesClient object.
     */
    LoadBalancerProbesClient getLoadBalancerProbes();

    /**
     * Gets the NetworkInterfacesClient object to access its operations.
     *
     * @return the NetworkInterfacesClient object.
     */
    NetworkInterfacesClient getNetworkInterfaces();

    /**
     * Gets the NetworkInterfaceIpConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceIpConfigurationsClient object.
     */
    NetworkInterfaceIpConfigurationsClient getNetworkInterfaceIpConfigurations();

    /**
     * Gets the NetworkInterfaceLoadBalancersClient object to access its operations.
     *
     * @return the NetworkInterfaceLoadBalancersClient object.
     */
    NetworkInterfaceLoadBalancersClient getNetworkInterfaceLoadBalancers();

    /**
     * Gets the NetworkInterfaceTapConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceTapConfigurationsClient object.
     */
    NetworkInterfaceTapConfigurationsClient getNetworkInterfaceTapConfigurations();

    /**
     * Gets the NetworkSecurityGroupsClient object to access its operations.
     *
     * @return the NetworkSecurityGroupsClient object.
     */
    NetworkSecurityGroupsClient getNetworkSecurityGroups();

    /**
     * Gets the SecurityRulesClient object to access its operations.
     *
     * @return the SecurityRulesClient object.
     */
    SecurityRulesClient getSecurityRules();

    /**
     * Gets the DefaultSecurityRulesClient object to access its operations.
     *
     * @return the DefaultSecurityRulesClient object.
     */
    DefaultSecurityRulesClient getDefaultSecurityRules();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PublicIpAddressesClient object to access its operations.
     *
     * @return the PublicIpAddressesClient object.
     */
    PublicIpAddressesClient getPublicIpAddresses();

    /**
     * Gets the RouteTablesClient object to access its operations.
     *
     * @return the RouteTablesClient object.
     */
    RouteTablesClient getRouteTables();

    /**
     * Gets the RoutesClient object to access its operations.
     *
     * @return the RoutesClient object.
     */
    RoutesClient getRoutes();

    /**
     * Gets the VirtualNetworksClient object to access its operations.
     *
     * @return the VirtualNetworksClient object.
     */
    VirtualNetworksClient getVirtualNetworks();

    /**
     * Gets the SubnetsClient object to access its operations.
     *
     * @return the SubnetsClient object.
     */
    SubnetsClient getSubnets();

    /**
     * Gets the VirtualNetworkPeeringsClient object to access its operations.
     *
     * @return the VirtualNetworkPeeringsClient object.
     */
    VirtualNetworkPeeringsClient getVirtualNetworkPeerings();

    /**
     * Gets the RecordSetsClient object to access its operations.
     *
     * @return the RecordSetsClient object.
     */
    RecordSetsClient getRecordSets();

    /**
     * Gets the ZonesClient object to access its operations.
     *
     * @return the ZonesClient object.
     */
    ZonesClient getZones();
}
