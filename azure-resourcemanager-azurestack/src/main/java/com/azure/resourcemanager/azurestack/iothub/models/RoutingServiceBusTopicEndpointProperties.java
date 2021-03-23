// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties related to service bus topic endpoint types. */
@Fluent
public final class RoutingServiceBusTopicEndpointProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingServiceBusTopicEndpointProperties.class);

    /*
     * The connection string of the service bus topic endpoint.
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /*
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types.  The name need not be the same as the actual topic name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The subscription identifier of the service bus topic endpoint.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The name of the resource group of the service bus topic endpoint.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the connectionString property: The connection string of the service bus topic endpoint.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of the service bus topic endpoint.
     *
     * @param connectionString the connectionString value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual topic name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual topic name.
     *
     * @param name the name value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription identifier of the service bus topic endpoint.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier of the service bus topic endpoint.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The name of the resource group of the service bus topic endpoint.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The name of the resource group of the service bus topic endpoint.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the RoutingServiceBusTopicEndpointProperties object itself.
     */
    public RoutingServiceBusTopicEndpointProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model"
                            + " RoutingServiceBusTopicEndpointProperties"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model RoutingServiceBusTopicEndpointProperties"));
        }
    }
}
