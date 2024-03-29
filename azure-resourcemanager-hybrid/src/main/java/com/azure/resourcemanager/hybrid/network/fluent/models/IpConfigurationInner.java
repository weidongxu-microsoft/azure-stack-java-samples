// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.network.models.IpAllocationMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP configuration. */
@JsonFlatten
@Fluent
public class IpConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIpAddress;

    /*
     * The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * The reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /*
     * The reference of the public IP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIpAddressInner publicIpAddress;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withName(String name) {
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
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The reference of the subnet resource.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference of the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference of the public IP resource.
     *
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The reference of the public IP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddress() != null) {
            publicIpAddress().validate();
        }
    }
}
