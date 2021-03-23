// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.network.models.BgpSettings;
import com.azure.resourcemanager.azurestack.network.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.azurestack.network.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.azurestack.network.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.azurestack.network.models.VpnClientConfiguration;
import com.azure.resourcemanager.azurestack.network.models.VpnType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A common class for general resource information. */
@JsonFlatten
@Fluent
public class VirtualNetworkGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewayInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * IP configurations for virtual network gateway.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualNetworkGatewayIpConfiguration> ipConfigurations;

    /*
     * The type of this virtual network gateway. Possible values are: 'Vpn' and
     * 'ExpressRoute'.
     */
    @JsonProperty(value = "properties.gatewayType")
    private VirtualNetworkGatewayType gatewayType;

    /*
     * The type of this virtual network gateway. Possible values are:
     * 'PolicyBased' and 'RouteBased'.
     */
    @JsonProperty(value = "properties.vpnType")
    private VpnType vpnType;

    /*
     * Whether BGP is enabled for this virtual network gateway or not.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * ActiveActive flag
     */
    @JsonProperty(value = "properties.activeActive")
    private Boolean active;

    /*
     * The reference of the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of
     * removing existing default site setting.
     */
    @JsonProperty(value = "properties.gatewayDefaultSite")
    private SubResource gatewayDefaultSite;

    /*
     * The reference of the VirtualNetworkGatewaySku resource which represents
     * the SKU selected for Virtual network gateway.
     */
    @JsonProperty(value = "properties.sku")
    private VirtualNetworkGatewaySku sku;

    /*
     * The reference of the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     */
    @JsonProperty(value = "properties.vpnClientConfiguration")
    private VpnClientConfiguration vpnClientConfiguration;

    /*
     * Virtual network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The resource GUID property of the VirtualNetworkGateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the VirtualNetworkGateway resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withIpConfigurations(
        List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the gatewayType property: The type of this virtual network gateway. Possible values are: 'Vpn' and
     * 'ExpressRoute'.
     *
     * @return the gatewayType value.
     */
    public VirtualNetworkGatewayType gatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType property: The type of this virtual network gateway. Possible values are: 'Vpn' and
     * 'ExpressRoute'.
     *
     * @param gatewayType the gatewayType value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the vpnType property: The type of this virtual network gateway. Possible values are: 'PolicyBased' and
     * 'RouteBased'.
     *
     * @return the vpnType value.
     */
    public VpnType vpnType() {
        return this.vpnType;
    }

    /**
     * Set the vpnType property: The type of this virtual network gateway. Possible values are: 'PolicyBased' and
     * 'RouteBased'.
     *
     * @param vpnType the vpnType value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnType(VpnType vpnType) {
        this.vpnType = vpnType;
        return this;
    }

    /**
     * Get the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the active property: ActiveActive flag.
     *
     * @return the active value.
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set the active property: ActiveActive flag.
     *
     * @param active the active value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the gatewayDefaultSite property: The reference of the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @return the gatewayDefaultSite value.
     */
    public SubResource gatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the gatewayDefaultSite property: The reference of the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @param gatewayDefaultSite the gatewayDefaultSite value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
        return this;
    }

    /**
     * Get the sku property: The reference of the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @return the sku value.
     */
    public VirtualNetworkGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The reference of the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @param sku the sku value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the vpnClientConfiguration property: The reference of the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @return the vpnClientConfiguration value.
     */
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the vpnClientConfiguration property: The reference of the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @param vpnClientConfiguration the vpnClientConfiguration value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
        return this;
    }

    /**
     * Get the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the VirtualNetworkGateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the VirtualNetworkGateway resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VirtualNetworkGateway resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (sku() != null) {
            sku().validate();
        }
        if (vpnClientConfiguration() != null) {
            vpnClientConfiguration().validate();
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
    }
}