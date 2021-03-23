// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.resources.implementation;

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
import com.azure.resourcemanager.azurestack.resources.fluent.SubscriptionsClient;
import com.azure.resourcemanager.azurestack.resources.fluent.models.LocationInner;
import com.azure.resourcemanager.azurestack.resources.fluent.models.SubscriptionInner;
import com.azure.resourcemanager.azurestack.resources.models.LocationListResult;
import com.azure.resourcemanager.azurestack.resources.models.SubscriptionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubscriptionsClient. */
public final class SubscriptionsClientImpl implements SubscriptionsClient {
    private final ClientLogger logger = new ClientLogger(SubscriptionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SubscriptionsService service;

    /** The service client containing this operation class. */
    private final ResourceManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionsClientImpl(ResourceManagementClientImpl client) {
        this.service =
            RestProxy.create(SubscriptionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceManagementClientSubscriptions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementCl")
    private interface SubscriptionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/locations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LocationListResult>> listLocations(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocationInner>> listLocationsSinglePageAsync(String subscriptionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.listLocations(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context))
            .<PagedResponse<LocationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocationInner>> listLocationsSinglePageAsync(String subscriptionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listLocations(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocationInner> listLocationsAsync(String subscriptionId) {
        return new PagedFlux<>(() -> listLocationsSinglePageAsync(subscriptionId));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocationInner> listLocationsAsync(String subscriptionId, Context context) {
        return new PagedFlux<>(() -> listLocationsSinglePageAsync(subscriptionId, context));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocationInner> listLocations(String subscriptionId) {
        return new PagedIterable<>(listLocationsAsync(subscriptionId));
    }

    /**
     * This operation provides all the locations that are available for resource providers; however, each resource
     * provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return location list operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocationInner> listLocations(String subscriptionId, Context context) {
        return new PagedIterable<>(listLocationsAsync(subscriptionId, context));
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionInner>> getWithResponseAsync(String subscriptionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionInner>> getWithResponseAsync(String subscriptionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), subscriptionId, apiVersion, accept, context);
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SubscriptionInner> getAsync(String subscriptionId) {
        return getWithResponseAsync(subscriptionId)
            .flatMap(
                (Response<SubscriptionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionInner get(String subscriptionId) {
        return getAsync(subscriptionId).block();
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SubscriptionInner> getWithResponse(String subscriptionId, Context context) {
        return getWithResponseAsync(subscriptionId, context).block();
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, accept, context))
            .<PagedResponse<SubscriptionInner>>map(
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
     * Gets all subscriptions for a tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2016-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, accept, context)
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
     * Gets all subscriptions for a tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SubscriptionInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SubscriptionInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subscriptions for a tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionInner>> listNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SubscriptionInner>>map(
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
     * @return subscription list operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
