// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.network.fluent.models.ConnectionResetSharedKeyInner;
import com.azure.resourcemanager.hybrid.network.fluent.models.ConnectionSharedKeyInner;

/** Resource collection API of VirtualNetworkGatewayConnections. */
public interface VirtualNetworkGatewayConnections {
    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    VirtualNetworkGatewayConnection getByResourceGroup(
        String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    Response<VirtualNetworkGatewayConnection> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key
     * for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Parameters supplied to the Begin Set Virtual Network Gateway connection Shared key operation
     *     throughNetwork resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey setSharedKey(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKeyInner parameters);

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key
     * for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Parameters supplied to the Begin Set Virtual Network Gateway connection Shared key operation
     *     throughNetwork resource provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey setSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionSharedKeyInner parameters,
        Context context);

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual
     * network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection shared key name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    ConnectionSharedKey getSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName);

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual
     * network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection shared key name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetConnectionSharedKey API service call.
     */
    Response<ConnectionSharedKey> getSharedKeyWithResponse(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, Context context);

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections
     * created.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListVirtualNetworkGatewayConnections API service call.
     */
    PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName);

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections
     * created.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListVirtualNetworkGatewayConnections API service call.
     */
    PagedIterable<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared
     * key for passed virtual network gateway connection in the specified resource group through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters Parameters supplied to the begin reset virtual network gateway connection shared key operation
     *     through network resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual network connection reset shared key.
     */
    ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionResetSharedKeyInner parameters);

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared
     * key for passed virtual network gateway connection in the specified resource group through Network resource
     * provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters Parameters supplied to the begin reset virtual network gateway connection shared key operation
     *     through network resource provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual network connection reset shared key.
     */
    ConnectionResetSharedKey resetSharedKey(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        ConnectionResetSharedKeyInner parameters,
        Context context);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    VirtualNetworkGatewayConnection getById(String id);

    /**
     * Gets the specified virtual network gateway connection by resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway connection by resource group.
     */
    Response<VirtualNetworkGatewayConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified virtual network Gateway connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetworkGatewayConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkGatewayConnection definition.
     */
    VirtualNetworkGatewayConnection.DefinitionStages.Blank define(String name);
}
