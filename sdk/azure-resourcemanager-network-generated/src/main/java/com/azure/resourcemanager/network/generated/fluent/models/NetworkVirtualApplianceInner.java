// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkuProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** NetworkVirtualAppliance Resource. */
@JsonFlatten
@Fluent
public class NetworkVirtualApplianceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualApplianceInner.class);

    /*
     * The service principal that has read access to cloud-init and config
     * blob.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Network Virtual Appliance SKU.
     */
    @JsonProperty(value = "properties.nvaSku")
    private VirtualApplianceSkuProperties nvaSku;

    /*
     * Address Prefix.
     */
    @JsonProperty(value = "properties.addressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String addressPrefix;

    /*
     * BootStrapConfigurationBlobs storage URLs.
     */
    @JsonProperty(value = "properties.bootStrapConfigurationBlobs")
    private List<String> bootStrapConfigurationBlobs;

    /*
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * CloudInitConfigurationBlob storage URLs.
     */
    @JsonProperty(value = "properties.cloudInitConfigurationBlobs")
    private List<String> cloudInitConfigurationBlobs;

    /*
     * CloudInitConfiguration string in plain text.
     */
    @JsonProperty(value = "properties.cloudInitConfiguration")
    private String cloudInitConfiguration;

    /*
     * VirtualAppliance ASN.
     */
    @JsonProperty(value = "properties.virtualApplianceAsn")
    private Long virtualApplianceAsn;

    /*
     * List of Virtual Appliance Network Interfaces.
     */
    @JsonProperty(value = "properties.virtualApplianceNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualApplianceNicProperties> virtualApplianceNics;

    /*
     * List of references to VirtualApplianceSite.
     */
    @JsonProperty(value = "properties.virtualApplianceSites", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualApplianceSites;

    /*
     * List of references to InboundSecurityRules.
     */
    @JsonProperty(value = "properties.inboundSecurityRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundSecurityRules;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @param identity the identity value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
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
     * Get the nvaSku property: Network Virtual Appliance SKU.
     *
     * @return the nvaSku value.
     */
    public VirtualApplianceSkuProperties nvaSku() {
        return this.nvaSku;
    }

    /**
     * Set the nvaSku property: Network Virtual Appliance SKU.
     *
     * @param nvaSku the nvaSku value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        this.nvaSku = nvaSku;
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Get the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @return the bootStrapConfigurationBlobs value.
     */
    public List<String> bootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs;
    }

    /**
     * Set the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     *
     * @param bootStrapConfigurationBlobs the bootStrapConfigurationBlobs value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs) {
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        return this;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @return the cloudInitConfigurationBlobs value.
     */
    public List<String> cloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs;
    }

    /**
     * Set the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     *
     * @param cloudInitConfigurationBlobs the cloudInitConfigurationBlobs value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs) {
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        return this;
    }

    /**
     * Get the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @return the cloudInitConfiguration value.
     */
    public String cloudInitConfiguration() {
        return this.cloudInitConfiguration;
    }

    /**
     * Set the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     *
     * @param cloudInitConfiguration the cloudInitConfiguration value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withCloudInitConfiguration(String cloudInitConfiguration) {
        this.cloudInitConfiguration = cloudInitConfiguration;
        return this;
    }

    /**
     * Get the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @return the virtualApplianceAsn value.
     */
    public Long virtualApplianceAsn() {
        return this.virtualApplianceAsn;
    }

    /**
     * Set the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @param virtualApplianceAsn the virtualApplianceAsn value to set.
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.virtualApplianceAsn = virtualApplianceAsn;
        return this;
    }

    /**
     * Get the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     *
     * @return the virtualApplianceNics value.
     */
    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        return this.virtualApplianceNics;
    }

    /**
     * Get the virtualApplianceSites property: List of references to VirtualApplianceSite.
     *
     * @return the virtualApplianceSites value.
     */
    public List<SubResource> virtualApplianceSites() {
        return this.virtualApplianceSites;
    }

    /**
     * Get the inboundSecurityRules property: List of references to InboundSecurityRules.
     *
     * @return the inboundSecurityRules value.
     */
    public List<SubResource> inboundSecurityRules() {
        return this.inboundSecurityRules;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
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
     * @return the NetworkVirtualApplianceInner object itself.
     */
    public NetworkVirtualApplianceInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (nvaSku() != null) {
            nvaSku().validate();
        }
        if (virtualApplianceNics() != null) {
            virtualApplianceNics().forEach(e -> e.validate());
        }
    }
}