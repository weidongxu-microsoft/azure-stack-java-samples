// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.commerce.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RateCards. */
public interface RateCards {
    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID,
     * Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to
     * service names, types, resources, units of measure, and regions, is subject to change at any time and without
     * notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to
     * uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing
     * model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this
     *     time. All the 4 query parameters 'OfferDurableId', 'Currency', 'Locale', 'Region' are required to be a part
     *     of the $filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    ResourceRateCardInfo get(String filter);

    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID,
     * Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to
     * service names, types, resources, units of measure, and regions, is subject to change at any time and without
     * notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to
     * uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing
     * model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this
     *     time. All the 4 query parameters 'OfferDurableId', 'Currency', 'Locale', 'Region' are required to be a part
     *     of the $filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    Response<ResourceRateCardInfo> getWithResponse(String filter, Context context);
}
