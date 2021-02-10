// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in ApplicationSecurityGroupsClient. */
public interface ApplicationSecurityGroupsClient {
    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String applicationSecurityGroupName);

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String applicationSecurityGroupName, Context context);

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationSecurityGroupName);

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationSecurityGroupName, Context context);

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationSecurityGroupInner getByResourceGroup(String resourceGroupName, String applicationSecurityGroupName);

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationSecurityGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationSecurityGroupName, Context context);

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to the create or update ApplicationSecurityGroup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationSecurityGroupInner>, ApplicationSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String applicationSecurityGroupName, ApplicationSecurityGroupInner parameters);

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to the create or update ApplicationSecurityGroup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationSecurityGroupInner>, ApplicationSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String applicationSecurityGroupName,
        ApplicationSecurityGroupInner parameters,
        Context context);

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to the create or update ApplicationSecurityGroup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationSecurityGroupInner createOrUpdate(
        String resourceGroupName, String applicationSecurityGroupName, ApplicationSecurityGroupInner parameters);

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to the create or update ApplicationSecurityGroup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationSecurityGroupInner createOrUpdate(
        String resourceGroupName,
        String applicationSecurityGroupName,
        ApplicationSecurityGroupInner parameters,
        Context context);

    /**
     * Updates an application security group's tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to update application security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationSecurityGroupInner updateTags(
        String resourceGroupName, String applicationSecurityGroupName, TagsObject parameters);

    /**
     * Updates an application security group's tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters Parameters supplied to update application security group tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationSecurityGroupInner> updateTagsWithResponse(
        String resourceGroupName, String applicationSecurityGroupName, TagsObject parameters, Context context);

    /**
     * Gets all application security groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationSecurityGroupInner> list();

    /**
     * Gets all application security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationSecurityGroupInner> list(Context context);

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationSecurityGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationSecurityGroupInner> listByResourceGroup(String resourceGroupName, Context context);
}