// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.commerce.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.commerce.fluent.RateCardsClient;
import com.azure.resourcemanager.azurestack.commerce.fluent.models.ResourceRateCardInfoInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RateCardsClient. */
public final class RateCardsClientImpl implements RateCardsClient {
    private final ClientLogger logger = new ClientLogger(RateCardsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RateCardsService service;

    /** The service client containing this operation class. */
    private final UsageManagementClientImpl client;

    /**
     * Initializes an instance of RateCardsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RateCardsClientImpl(UsageManagementClientImpl client) {
        this.service =
            RestProxy.create(RateCardsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for UsageManagementClientRateCards to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "UsageManagementClien")
    private interface RateCardsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Commerce/RateCard")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceRateCardInfoInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceRateCardInfoInner>> getWithResponseAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ResourceRateCardInfoInner>> getWithResponseAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                filter,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ResourceRateCardInfoInner> getAsync(String filter) {
        return getWithResponseAsync(filter)
            .flatMap(
                (Response<ResourceRateCardInfoInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceRateCardInfoInner get(String filter) {
        return getAsync(filter).block();
    }

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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return price and Metadata information for resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ResourceRateCardInfoInner> getWithResponse(String filter, Context context) {
        return getWithResponseAsync(filter, context).block();
    }
}
