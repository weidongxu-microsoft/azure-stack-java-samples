// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.storage.models;

import com.azure.resourcemanager.azurestack.storage.fluent.models.ListServiceSasResponseInner;

/** An immutable client-side representation of ListServiceSasResponse. */
public interface ListServiceSasResponse {
    /**
     * Gets the serviceSasToken property: List service SAS credentials of specific resource.
     *
     * @return the serviceSasToken value.
     */
    String serviceSasToken();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.storage.fluent.models.ListServiceSasResponseInner object.
     *
     * @return the inner object.
     */
    ListServiceSasResponseInner innerModel();
}