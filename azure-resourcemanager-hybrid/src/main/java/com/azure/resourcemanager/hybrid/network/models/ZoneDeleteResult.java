// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.resourcemanager.hybrid.network.fluent.models.ZoneDeleteResultInner;

/** An immutable client-side representation of ZoneDeleteResult. */
public interface ZoneDeleteResult {
    /**
     * Gets the azureAsyncOperation property: Users can perform a Get on Azure-AsyncOperation to get the status of their
     * delete Zone operations.
     *
     * @return the azureAsyncOperation value.
     */
    String azureAsyncOperation();

    /**
     * Gets the status property: The status property.
     *
     * @return the status value.
     */
    OperationStatus status();

    /**
     * Gets the statusCode property: The statusCode property.
     *
     * @return the statusCode value.
     */
    HttpStatusCode statusCode();

    /**
     * Gets the requestId property: The requestId property.
     *
     * @return the requestId value.
     */
    String requestId();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.network.fluent.models.ZoneDeleteResultInner object.
     *
     * @return the inner object.
     */
    ZoneDeleteResultInner innerModel();
}
