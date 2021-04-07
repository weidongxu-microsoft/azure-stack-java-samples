// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.authorization.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.authorization.fluent.models.PolicyDefinitionInner;

/** Resource collection API of PolicyDefinitions. */
public interface PolicyDefinitions {
    /**
     * Creates or updates a policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    PolicyDefinition createOrUpdate(String policyDefinitionName, PolicyDefinitionInner parameters);

    /**
     * Creates or updates a policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    Response<PolicyDefinition> createOrUpdateWithResponse(
        String policyDefinitionName, PolicyDefinitionInner parameters, Context context);

    /**
     * Deletes a policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String policyDefinitionName);

    /**
     * Deletes a policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String policyDefinitionName, Context context);

    /**
     * Gets the policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    PolicyDefinition get(String policyDefinitionName);

    /**
     * Gets the policy definition.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    Response<PolicyDefinition> getWithResponse(String policyDefinitionName, Context context);

    /**
     * Gets the built in policy definition.
     *
     * @param policyDefinitionName The name of the built in policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the built in policy definition.
     */
    PolicyDefinition getBuiltIn(String policyDefinitionName);

    /**
     * Gets the built in policy definition.
     *
     * @param policyDefinitionName The name of the built in policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the built in policy definition.
     */
    Response<PolicyDefinition> getBuiltInWithResponse(String policyDefinitionName, Context context);

    /**
     * Creates or updates a policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    PolicyDefinition createOrUpdateAtManagementGroup(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters);

    /**
     * Creates or updates a policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    Response<PolicyDefinition> createOrUpdateAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters, Context context);

    /**
     * Deletes a policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * Deletes a policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * Gets the policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition at management group level.
     */
    PolicyDefinition getAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * Gets the policy definition at management group level.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition at management group level.
     */
    Response<PolicyDefinition> getAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * Gets all the policy definitions for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the policy definitions for a subscription.
     */
    PagedIterable<PolicyDefinition> list();

    /**
     * Gets all the policy definitions for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the policy definitions for a subscription.
     */
    PagedIterable<PolicyDefinition> list(Context context);

    /**
     * Gets all the built in policy definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the built in policy definitions.
     */
    PagedIterable<PolicyDefinition> listBuiltIn();

    /**
     * Gets all the built in policy definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the built in policy definitions.
     */
    PagedIterable<PolicyDefinition> listBuiltIn(Context context);

    /**
     * Gets all the policy definitions for a subscription at management group level.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the policy definitions for a subscription at management group level.
     */
    PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId);

    /**
     * Gets all the policy definitions for a subscription at management group level.
     *
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the policy definitions for a subscription at management group level.
     */
    PagedIterable<PolicyDefinition> listByManagementGroup(String managementGroupId, Context context);
}
