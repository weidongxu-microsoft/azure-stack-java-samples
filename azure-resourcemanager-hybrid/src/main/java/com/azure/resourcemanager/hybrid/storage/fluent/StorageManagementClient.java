// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for StorageManagementClient class. */
public interface StorageManagementClient {
    /**
     * Gets The ID of the target subscription.
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
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

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
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the StorageAccountsClient object to access its operations.
     *
     * @return the StorageAccountsClient object.
     */
    StorageAccountsClient getStorageAccounts();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the ManagementPoliciesClient object to access its operations.
     *
     * @return the ManagementPoliciesClient object.
     */
    ManagementPoliciesClient getManagementPolicies();

    /**
     * Gets the BlobInventoryPoliciesClient object to access its operations.
     *
     * @return the BlobInventoryPoliciesClient object.
     */
    BlobInventoryPoliciesClient getBlobInventoryPolicies();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the ObjectReplicationPoliciesOperationsClient object to access its operations.
     *
     * @return the ObjectReplicationPoliciesOperationsClient object.
     */
    ObjectReplicationPoliciesOperationsClient getObjectReplicationPoliciesOperations();

    /**
     * Gets the EncryptionScopesClient object to access its operations.
     *
     * @return the EncryptionScopesClient object.
     */
    EncryptionScopesClient getEncryptionScopes();
}