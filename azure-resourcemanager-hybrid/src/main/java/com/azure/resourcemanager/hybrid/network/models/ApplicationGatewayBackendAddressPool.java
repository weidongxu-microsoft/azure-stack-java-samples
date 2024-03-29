// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Backend Address Pool of an application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewayBackendAddressPool extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendAddressPool.class);

    /*
     * Name of the backend address pool that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Collection of references to IPs defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations")
    private List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations;

    /*
     * Backend addresses
     */
    @JsonProperty(value = "properties.backendAddresses")
    private List<ApplicationGatewayBackendAddress> backendAddresses;

    /*
     * Provisioning state of the backend address pool resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the backend address pool that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend address pool that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the backendIpConfigurations property: Collection of references to IPs defined in network interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }

    /**
     * Set the backendIpConfigurations property: Collection of references to IPs defined in network interfaces.
     *
     * @param backendIpConfigurations the backendIpConfigurations value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withBackendIpConfigurations(
        List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations) {
        this.backendIpConfigurations = backendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddresses property: Backend addresses.
     *
     * @return the backendAddresses value.
     */
    public List<ApplicationGatewayBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }

    /**
     * Set the backendAddresses property: Backend addresses.
     *
     * @param backendAddresses the backendAddresses value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withBackendAddresses(
        List<ApplicationGatewayBackendAddress> backendAddresses) {
        this.backendAddresses = backendAddresses;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend address pool resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend address pool resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayBackendAddressPool withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendIpConfigurations() != null) {
            backendIpConfigurations().forEach(e -> e.validate());
        }
        if (backendAddresses() != null) {
            backendAddresses().forEach(e -> e.validate());
        }
    }
}
