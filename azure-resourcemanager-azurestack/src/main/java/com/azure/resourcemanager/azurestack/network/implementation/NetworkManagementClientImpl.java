// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurestack.network.fluent.DefaultSecurityRulesClient;
import com.azure.resourcemanager.azurestack.network.fluent.InboundNatRulesClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerBackendAddressPoolsClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerFrontendIpConfigurationsClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerLoadBalancingRulesClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerNetworkInterfacesClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerOutboundRulesClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancerProbesClient;
import com.azure.resourcemanager.azurestack.network.fluent.LoadBalancersClient;
import com.azure.resourcemanager.azurestack.network.fluent.LocalNetworkGatewaysClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkInterfaceIpConfigurationsClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkInterfaceLoadBalancersClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkInterfaceTapConfigurationsClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkInterfacesClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkManagementClient;
import com.azure.resourcemanager.azurestack.network.fluent.NetworkSecurityGroupsClient;
import com.azure.resourcemanager.azurestack.network.fluent.OperationsClient;
import com.azure.resourcemanager.azurestack.network.fluent.PublicIpAddressesClient;
import com.azure.resourcemanager.azurestack.network.fluent.RecordSetsClient;
import com.azure.resourcemanager.azurestack.network.fluent.RouteTablesClient;
import com.azure.resourcemanager.azurestack.network.fluent.RoutesClient;
import com.azure.resourcemanager.azurestack.network.fluent.SecurityRulesClient;
import com.azure.resourcemanager.azurestack.network.fluent.SubnetsClient;
import com.azure.resourcemanager.azurestack.network.fluent.VirtualNetworkGatewayConnectionsClient;
import com.azure.resourcemanager.azurestack.network.fluent.VirtualNetworkGatewaysClient;
import com.azure.resourcemanager.azurestack.network.fluent.VirtualNetworkPeeringsClient;
import com.azure.resourcemanager.azurestack.network.fluent.VirtualNetworksClient;
import com.azure.resourcemanager.azurestack.network.fluent.ZonesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the NetworkManagementClientImpl type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NetworkManagementClientImpl implements NetworkManagementClient {
    private final ClientLogger logger = new ClientLogger(NetworkManagementClientImpl.class);

    /**
     * The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The VirtualNetworkGatewaysClient object to access its operations. */
    private final VirtualNetworkGatewaysClient virtualNetworkGateways;

    /**
     * Gets the VirtualNetworkGatewaysClient object to access its operations.
     *
     * @return the VirtualNetworkGatewaysClient object.
     */
    public VirtualNetworkGatewaysClient getVirtualNetworkGateways() {
        return this.virtualNetworkGateways;
    }

    /** The VirtualNetworkGatewayConnectionsClient object to access its operations. */
    private final VirtualNetworkGatewayConnectionsClient virtualNetworkGatewayConnections;

    /**
     * Gets the VirtualNetworkGatewayConnectionsClient object to access its operations.
     *
     * @return the VirtualNetworkGatewayConnectionsClient object.
     */
    public VirtualNetworkGatewayConnectionsClient getVirtualNetworkGatewayConnections() {
        return this.virtualNetworkGatewayConnections;
    }

    /** The LocalNetworkGatewaysClient object to access its operations. */
    private final LocalNetworkGatewaysClient localNetworkGateways;

    /**
     * Gets the LocalNetworkGatewaysClient object to access its operations.
     *
     * @return the LocalNetworkGatewaysClient object.
     */
    public LocalNetworkGatewaysClient getLocalNetworkGateways() {
        return this.localNetworkGateways;
    }

    /** The LoadBalancersClient object to access its operations. */
    private final LoadBalancersClient loadBalancers;

    /**
     * Gets the LoadBalancersClient object to access its operations.
     *
     * @return the LoadBalancersClient object.
     */
    public LoadBalancersClient getLoadBalancers() {
        return this.loadBalancers;
    }

    /** The LoadBalancerBackendAddressPoolsClient object to access its operations. */
    private final LoadBalancerBackendAddressPoolsClient loadBalancerBackendAddressPools;

    /**
     * Gets the LoadBalancerBackendAddressPoolsClient object to access its operations.
     *
     * @return the LoadBalancerBackendAddressPoolsClient object.
     */
    public LoadBalancerBackendAddressPoolsClient getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /** The LoadBalancerFrontendIpConfigurationsClient object to access its operations. */
    private final LoadBalancerFrontendIpConfigurationsClient loadBalancerFrontendIpConfigurations;

    /**
     * Gets the LoadBalancerFrontendIpConfigurationsClient object to access its operations.
     *
     * @return the LoadBalancerFrontendIpConfigurationsClient object.
     */
    public LoadBalancerFrontendIpConfigurationsClient getLoadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations;
    }

    /** The InboundNatRulesClient object to access its operations. */
    private final InboundNatRulesClient inboundNatRules;

    /**
     * Gets the InboundNatRulesClient object to access its operations.
     *
     * @return the InboundNatRulesClient object.
     */
    public InboundNatRulesClient getInboundNatRules() {
        return this.inboundNatRules;
    }

    /** The LoadBalancerLoadBalancingRulesClient object to access its operations. */
    private final LoadBalancerLoadBalancingRulesClient loadBalancerLoadBalancingRules;

    /**
     * Gets the LoadBalancerLoadBalancingRulesClient object to access its operations.
     *
     * @return the LoadBalancerLoadBalancingRulesClient object.
     */
    public LoadBalancerLoadBalancingRulesClient getLoadBalancerLoadBalancingRules() {
        return this.loadBalancerLoadBalancingRules;
    }

    /** The LoadBalancerOutboundRulesClient object to access its operations. */
    private final LoadBalancerOutboundRulesClient loadBalancerOutboundRules;

    /**
     * Gets the LoadBalancerOutboundRulesClient object to access its operations.
     *
     * @return the LoadBalancerOutboundRulesClient object.
     */
    public LoadBalancerOutboundRulesClient getLoadBalancerOutboundRules() {
        return this.loadBalancerOutboundRules;
    }

    /** The LoadBalancerNetworkInterfacesClient object to access its operations. */
    private final LoadBalancerNetworkInterfacesClient loadBalancerNetworkInterfaces;

    /**
     * Gets the LoadBalancerNetworkInterfacesClient object to access its operations.
     *
     * @return the LoadBalancerNetworkInterfacesClient object.
     */
    public LoadBalancerNetworkInterfacesClient getLoadBalancerNetworkInterfaces() {
        return this.loadBalancerNetworkInterfaces;
    }

    /** The LoadBalancerProbesClient object to access its operations. */
    private final LoadBalancerProbesClient loadBalancerProbes;

    /**
     * Gets the LoadBalancerProbesClient object to access its operations.
     *
     * @return the LoadBalancerProbesClient object.
     */
    public LoadBalancerProbesClient getLoadBalancerProbes() {
        return this.loadBalancerProbes;
    }

    /** The NetworkInterfacesClient object to access its operations. */
    private final NetworkInterfacesClient networkInterfaces;

    /**
     * Gets the NetworkInterfacesClient object to access its operations.
     *
     * @return the NetworkInterfacesClient object.
     */
    public NetworkInterfacesClient getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /** The NetworkInterfaceIpConfigurationsClient object to access its operations. */
    private final NetworkInterfaceIpConfigurationsClient networkInterfaceIpConfigurations;

    /**
     * Gets the NetworkInterfaceIpConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceIpConfigurationsClient object.
     */
    public NetworkInterfaceIpConfigurationsClient getNetworkInterfaceIpConfigurations() {
        return this.networkInterfaceIpConfigurations;
    }

    /** The NetworkInterfaceLoadBalancersClient object to access its operations. */
    private final NetworkInterfaceLoadBalancersClient networkInterfaceLoadBalancers;

    /**
     * Gets the NetworkInterfaceLoadBalancersClient object to access its operations.
     *
     * @return the NetworkInterfaceLoadBalancersClient object.
     */
    public NetworkInterfaceLoadBalancersClient getNetworkInterfaceLoadBalancers() {
        return this.networkInterfaceLoadBalancers;
    }

    /** The NetworkInterfaceTapConfigurationsClient object to access its operations. */
    private final NetworkInterfaceTapConfigurationsClient networkInterfaceTapConfigurations;

    /**
     * Gets the NetworkInterfaceTapConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceTapConfigurationsClient object.
     */
    public NetworkInterfaceTapConfigurationsClient getNetworkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }

    /** The NetworkSecurityGroupsClient object to access its operations. */
    private final NetworkSecurityGroupsClient networkSecurityGroups;

    /**
     * Gets the NetworkSecurityGroupsClient object to access its operations.
     *
     * @return the NetworkSecurityGroupsClient object.
     */
    public NetworkSecurityGroupsClient getNetworkSecurityGroups() {
        return this.networkSecurityGroups;
    }

    /** The SecurityRulesClient object to access its operations. */
    private final SecurityRulesClient securityRules;

    /**
     * Gets the SecurityRulesClient object to access its operations.
     *
     * @return the SecurityRulesClient object.
     */
    public SecurityRulesClient getSecurityRules() {
        return this.securityRules;
    }

    /** The DefaultSecurityRulesClient object to access its operations. */
    private final DefaultSecurityRulesClient defaultSecurityRules;

    /**
     * Gets the DefaultSecurityRulesClient object to access its operations.
     *
     * @return the DefaultSecurityRulesClient object.
     */
    public DefaultSecurityRulesClient getDefaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The PublicIpAddressesClient object to access its operations. */
    private final PublicIpAddressesClient publicIpAddresses;

    /**
     * Gets the PublicIpAddressesClient object to access its operations.
     *
     * @return the PublicIpAddressesClient object.
     */
    public PublicIpAddressesClient getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /** The RouteTablesClient object to access its operations. */
    private final RouteTablesClient routeTables;

    /**
     * Gets the RouteTablesClient object to access its operations.
     *
     * @return the RouteTablesClient object.
     */
    public RouteTablesClient getRouteTables() {
        return this.routeTables;
    }

    /** The RoutesClient object to access its operations. */
    private final RoutesClient routes;

    /**
     * Gets the RoutesClient object to access its operations.
     *
     * @return the RoutesClient object.
     */
    public RoutesClient getRoutes() {
        return this.routes;
    }

    /** The VirtualNetworksClient object to access its operations. */
    private final VirtualNetworksClient virtualNetworks;

    /**
     * Gets the VirtualNetworksClient object to access its operations.
     *
     * @return the VirtualNetworksClient object.
     */
    public VirtualNetworksClient getVirtualNetworks() {
        return this.virtualNetworks;
    }

    /** The SubnetsClient object to access its operations. */
    private final SubnetsClient subnets;

    /**
     * Gets the SubnetsClient object to access its operations.
     *
     * @return the SubnetsClient object.
     */
    public SubnetsClient getSubnets() {
        return this.subnets;
    }

    /** The VirtualNetworkPeeringsClient object to access its operations. */
    private final VirtualNetworkPeeringsClient virtualNetworkPeerings;

    /**
     * Gets the VirtualNetworkPeeringsClient object to access its operations.
     *
     * @return the VirtualNetworkPeeringsClient object.
     */
    public VirtualNetworkPeeringsClient getVirtualNetworkPeerings() {
        return this.virtualNetworkPeerings;
    }

    /** The RecordSetsClient object to access its operations. */
    private final RecordSetsClient recordSets;

    /**
     * Gets the RecordSetsClient object to access its operations.
     *
     * @return the RecordSetsClient object.
     */
    public RecordSetsClient getRecordSets() {
        return this.recordSets;
    }

    /** The ZonesClient object to access its operations. */
    private final ZonesClient zones;

    /**
     * Gets the ZonesClient object to access its operations.
     *
     * @return the ZonesClient object.
     */
    public ZonesClient getZones() {
        return this.zones;
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription credentials which uniquely identify the Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    NetworkManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.virtualNetworkGateways = new VirtualNetworkGatewaysClientImpl(this);
        this.virtualNetworkGatewayConnections = new VirtualNetworkGatewayConnectionsClientImpl(this);
        this.localNetworkGateways = new LocalNetworkGatewaysClientImpl(this);
        this.loadBalancers = new LoadBalancersClientImpl(this);
        this.loadBalancerBackendAddressPools = new LoadBalancerBackendAddressPoolsClientImpl(this);
        this.loadBalancerFrontendIpConfigurations = new LoadBalancerFrontendIpConfigurationsClientImpl(this);
        this.inboundNatRules = new InboundNatRulesClientImpl(this);
        this.loadBalancerLoadBalancingRules = new LoadBalancerLoadBalancingRulesClientImpl(this);
        this.loadBalancerOutboundRules = new LoadBalancerOutboundRulesClientImpl(this);
        this.loadBalancerNetworkInterfaces = new LoadBalancerNetworkInterfacesClientImpl(this);
        this.loadBalancerProbes = new LoadBalancerProbesClientImpl(this);
        this.networkInterfaces = new NetworkInterfacesClientImpl(this);
        this.networkInterfaceIpConfigurations = new NetworkInterfaceIpConfigurationsClientImpl(this);
        this.networkInterfaceLoadBalancers = new NetworkInterfaceLoadBalancersClientImpl(this);
        this.networkInterfaceTapConfigurations = new NetworkInterfaceTapConfigurationsClientImpl(this);
        this.networkSecurityGroups = new NetworkSecurityGroupsClientImpl(this);
        this.securityRules = new SecurityRulesClientImpl(this);
        this.defaultSecurityRules = new DefaultSecurityRulesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.publicIpAddresses = new PublicIpAddressesClientImpl(this);
        this.routeTables = new RouteTablesClientImpl(this);
        this.routes = new RoutesClientImpl(this);
        this.virtualNetworks = new VirtualNetworksClientImpl(this);
        this.subnets = new SubnetsClientImpl(this);
        this.virtualNetworkPeerings = new VirtualNetworkPeeringsClientImpl(this);
        this.recordSets = new RecordSetsClientImpl(this);
        this.zones = new ZonesClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
