// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiagnosticSettingsCategories. */
public interface DiagnosticSettingsCategories {
    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    DiagnosticSettingsCategoryResource get(String resourceUri, String name);

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    Response<DiagnosticSettingsCategoryResource> getWithResponse(String resourceUri, String name, Context context);

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    DiagnosticSettingsCategoryResourceCollection list(String resourceUri);

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    Response<DiagnosticSettingsCategoryResourceCollection> listWithResponse(String resourceUri, Context context);
}
