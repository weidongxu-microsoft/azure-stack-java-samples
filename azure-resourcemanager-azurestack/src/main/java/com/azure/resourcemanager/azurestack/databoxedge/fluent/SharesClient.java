// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.ShareInner;

/** An instance of this class provides access to all the operations defined in SharesClient. */
public interface SharesClient {
    /**
     * Lists all the shares in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the shares on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ShareInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the shares in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the shares on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ShareInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets a share by name.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a share by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ShareInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets a share by name.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a share by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ShareInner> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Creates a new share or updates an existing share on the device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param share The share properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a share on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ShareInner>, ShareInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, ShareInner share);

    /**
     * Creates a new share or updates an existing share on the device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param share The share properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a share on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ShareInner>, ShareInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, ShareInner share, Context context);

    /**
     * Creates a new share or updates an existing share on the device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param share The share properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a share on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ShareInner createOrUpdate(String deviceName, String name, String resourceGroupName, ShareInner share);

    /**
     * Creates a new share or updates an existing share on the device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param share The share properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a share on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ShareInner createOrUpdate(
        String deviceName, String name, String resourceGroupName, ShareInner share, Context context);

    /**
     * Deletes the share on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the share on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Deletes the share on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the share on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Refreshes the share metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRefresh(String deviceName, String name, String resourceGroupName);

    /**
     * Refreshes the share metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRefresh(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Refreshes the share metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void refresh(String deviceName, String name, String resourceGroupName);

    /**
     * Refreshes the share metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param name The share name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void refresh(String deviceName, String name, String resourceGroupName, Context context);
}