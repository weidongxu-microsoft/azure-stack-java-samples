// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.network.fluent.models.InboundNatRuleInner;

/** Resource collection API of InboundNatRules. */
public interface InboundNatRules {
    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound nat rules in a load balancer.
     */
    PagedIterable<InboundNatRule> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound nat rules in a load balancer.
     */
    PagedIterable<InboundNatRule> list(String resourceGroupName, String loadBalancerName, Context context);

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName, Context context);

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    InboundNatRule get(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    Response<InboundNatRule> getWithResponse(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand, Context context);

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound nat rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    InboundNatRule createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters);

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Parameters supplied to the create or update inbound nat rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    InboundNatRule createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters,
        Context context);
}
