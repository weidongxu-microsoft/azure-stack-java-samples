// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.eventhubs.models.ConnectionState;
import com.azure.resourcemanager.azurestack.eventhubs.models.EndPointProvisioningState;
import com.azure.resourcemanager.azurestack.eventhubs.models.PrivateEndpoint;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the PrivateEndpointConnection. */
@JsonFlatten
@Fluent
public class PrivateEndpointConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionInner.class);

    /*
     * The Private Endpoint resource for this Connection.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * Details about the state of the connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private ConnectionState privateLinkServiceConnectionState;

    /*
     * Provisioning state of the Private Endpoint Connection.
     */
    @JsonProperty(value = "properties.provisioningState")
    private EndPointProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: The Private Endpoint resource for this Connection.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The Private Endpoint resource for this Connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Details about the state of the connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public ConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Details about the state of the connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(
        ConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Private Endpoint Connection.
     *
     * @return the provisioningState value.
     */
    public EndPointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the Private Endpoint Connection.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProvisioningState(EndPointProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}