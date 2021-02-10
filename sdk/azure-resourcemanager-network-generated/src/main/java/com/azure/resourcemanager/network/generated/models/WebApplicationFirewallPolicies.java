// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WebApplicationFirewallPolicies. */
public interface WebApplicationFirewallPolicies {
    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    PagedIterable<WebApplicationFirewallPolicy> list();

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    PagedIterable<WebApplicationFirewallPolicy> list(Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    WebApplicationFirewallPolicy getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    Response<WebApplicationFirewallPolicy> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String policyName, Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    WebApplicationFirewallPolicy getById(String id);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    Response<WebApplicationFirewallPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Deletes Policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes Policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new WebApplicationFirewallPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new WebApplicationFirewallPolicy definition.
     */
    WebApplicationFirewallPolicy.DefinitionStages.Blank define(String name);
}