// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurestack.iothub.models.FailoverInput;

/** An instance of this class provides access to all the operations defined in IotHubsClient. */
public interface IotHubsClient {
    /**
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param failoverInput Region to failover to. Must be a azure DR pair.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.iothub.models.ErrorDetailsException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput);

    /**
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param failoverInput Region to failover to. Must be a azure DR pair.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.iothub.models.ErrorDetailsException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginManualFailover(
        String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context);

    /**
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param failoverInput Region to failover to. Must be a azure DR pair.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.iothub.models.ErrorDetailsException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput);

    /**
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over.
     * @param resourceGroupName resource group which Iot Hub belongs to.
     * @param failoverInput Region to failover to. Must be a azure DR pair.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.iothub.models.ErrorDetailsException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manualFailover(String iotHubName, String resourceGroupName, FailoverInput failoverInput, Context context);
}
