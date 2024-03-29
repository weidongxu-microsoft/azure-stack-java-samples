// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set network profile's IP configuration. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetIpConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetIpConfiguration.class);

    /*
     * The IP configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ApiEntityReference subnet;

    /*
     * Specifies the primary network interface in case the virtual machine has
     * more than 1 network interface.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * The publicIPAddressConfiguration.
     */
    @JsonProperty(value = "properties.publicIPAddressConfiguration")
    private VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration;

    /*
     * Available from Api-Version 2017-03-30 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IpVersion privateIpAddressVersion;

    /*
     * Specifies an array of references to backend address pools of application
     * gateways. A scale set can reference backend address pools of multiple
     * application gateways. Multiple scale sets cannot use the same
     * application gateway.
     */
    @JsonProperty(value = "properties.applicationGatewayBackendAddressPools")
    private List<SubResource> applicationGatewayBackendAddressPools;

    /*
     * Specifies an array of references to application security group.
     */
    @JsonProperty(value = "properties.applicationSecurityGroups")
    private List<SubResource> applicationSecurityGroups;

    /*
     * Specifies an array of references to backend address pools of load
     * balancers. A scale set can reference backend address pools of one public
     * and one internal load balancer. Multiple scale sets cannot use the same
     * basic sku load balancer.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<SubResource> loadBalancerBackendAddressPools;

    /*
     * Specifies an array of references to inbound Nat pools of the load
     * balancers. A scale set can reference inbound nat pools of one public and
     * one internal load balancer. Multiple scale sets cannot use the same
     * basic sku load balancer.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatPools")
    private List<SubResource> loadBalancerInboundNatPools;

    /**
     * Get the name property: The IP configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The IP configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subnet property: Specifies the identifier of the subnet.
     *
     * @return the subnet value.
     */
    public ApiEntityReference subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Specifies the identifier of the subnet.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withSubnet(ApiEntityReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration() {
        return this.publicIpAddressConfiguration;
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withPublicIpAddressConfiguration(
        VirtualMachineScaleSetPublicIpAddressConfiguration publicIpAddressConfiguration) {
        this.publicIpAddressConfiguration = publicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A scale set can reference backend address pools of multiple application gateways.
     * Multiple scale sets cannot use the same application gateway.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: Specifies an array of references to backend address pools
     * of application gateways. A scale set can reference backend address pools of multiple application gateways.
     * Multiple scale sets cannot use the same application gateway.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withApplicationGatewayBackendAddressPools(
        List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withApplicationSecurityGroups(
        List<SubResource> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A scale set can reference backend address pools of one public and one internal load balancer.
     * Multiple scale sets cannot use the same basic sku load balancer.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools property: Specifies an array of references to backend address pools of
     * load balancers. A scale set can reference backend address pools of one public and one internal load balancer.
     * Multiple scale sets cannot use the same basic sku load balancer.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withLoadBalancerBackendAddressPools(
        List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerInboundNatPools property: Specifies an array of references to inbound Nat pools of the load
     * balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple
     * scale sets cannot use the same basic sku load balancer.
     *
     * @return the loadBalancerInboundNatPools value.
     */
    public List<SubResource> loadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools;
    }

    /**
     * Set the loadBalancerInboundNatPools property: Specifies an array of references to inbound Nat pools of the load
     * balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple
     * scale sets cannot use the same basic sku load balancer.
     *
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set.
     * @return the VirtualMachineScaleSetIpConfiguration object itself.
     */
    public VirtualMachineScaleSetIpConfiguration withLoadBalancerInboundNatPools(
        List<SubResource> loadBalancerInboundNatPools) {
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetIpConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model VirtualMachineScaleSetIpConfiguration"));
        }
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddressConfiguration() != null) {
            publicIpAddressConfiguration().validate();
        }
    }
}
