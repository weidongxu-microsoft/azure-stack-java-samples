// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.eventhubs.fluent.RegionsClient;
import com.azure.resourcemanager.hybrid.eventhubs.fluent.models.MessagingRegionsInner;
import com.azure.resourcemanager.hybrid.eventhubs.models.MessagingRegionsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RegionsClient. */
public final class RegionsClientImpl implements RegionsClient {
    private final ClientLogger logger = new ClientLogger(RegionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RegionsService service;

    /** The service client containing this operation class. */
    private final EventHubManagementClientImpl client;

    /**
     * Initializes an instance of RegionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RegionsClientImpl(EventHubManagementClientImpl client) {
        this.service = RestProxy.create(RegionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for EventHubManagementClientRegions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "EventHubManagementCl")
    private interface RegionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.EventHub/sku/{sku}/regions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MessagingRegionsListResult>> listBySku(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("sku") String sku,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MessagingRegionsListResult>> listBySkuNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MessagingRegionsInner>> listBySkuSinglePageAsync(String sku) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (sku == null) {
            return Mono.error(new IllegalArgumentException("Parameter sku is required and cannot be null."));
        }
        final String apiVersion = "2017-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listBySku(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            sku,
                            accept,
                            context))
            .<PagedResponse<MessagingRegionsInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MessagingRegionsInner>> listBySkuSinglePageAsync(String sku, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (sku == null) {
            return Mono.error(new IllegalArgumentException("Parameter sku is required and cannot be null."));
        }
        final String apiVersion = "2017-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySku(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), sku, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MessagingRegionsInner> listBySkuAsync(String sku) {
        return new PagedFlux<>(() -> listBySkuSinglePageAsync(sku), nextLink -> listBySkuNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MessagingRegionsInner> listBySkuAsync(String sku, Context context) {
        return new PagedFlux<>(
            () -> listBySkuSinglePageAsync(sku, context), nextLink -> listBySkuNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MessagingRegionsInner> listBySku(String sku) {
        return new PagedIterable<>(listBySkuAsync(sku));
    }

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MessagingRegionsInner> listBySku(String sku, Context context) {
        return new PagedIterable<>(listBySkuAsync(sku, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List MessagingRegions operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MessagingRegionsInner>> listBySkuNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listBySkuNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<MessagingRegionsInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List MessagingRegions operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MessagingRegionsInner>> listBySkuNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySkuNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
