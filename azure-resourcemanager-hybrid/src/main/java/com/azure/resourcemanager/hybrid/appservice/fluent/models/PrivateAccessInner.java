// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.models.PrivateAccessVirtualNetwork;
import com.azure.resourcemanager.hybrid.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of the parameters of Private Access for a Web Site. */
@JsonFlatten
@Fluent
public class PrivateAccessInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateAccessInner.class);

    /*
     * Whether private access is enabled or not.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The Virtual Networks (and subnets) allowed to access the site privately.
     */
    @JsonProperty(value = "properties.virtualNetworks")
    private List<PrivateAccessVirtualNetwork> virtualNetworks;

    /**
     * Get the enabled property: Whether private access is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether private access is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the PrivateAccessInner object itself.
     */
    public PrivateAccessInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the virtualNetworks property: The Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @return the virtualNetworks value.
     */
    public List<PrivateAccessVirtualNetwork> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Set the virtualNetworks property: The Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @param virtualNetworks the virtualNetworks value to set.
     * @return the PrivateAccessInner object itself.
     */
    public PrivateAccessInner withVirtualNetworks(List<PrivateAccessVirtualNetwork> virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateAccessInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (virtualNetworks() != null) {
            virtualNetworks().forEach(e -> e.validate());
        }
    }
}
