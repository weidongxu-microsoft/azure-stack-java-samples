// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.web.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App Service billing entity that contains information about meter which the Azure billing system utilizes to charge
 * users for services.
 */
@JsonFlatten
@Fluent
public class BillingMeterInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BillingMeterInner.class);

    /*
     * Meter GUID onboarded in Commerce
     */
    @JsonProperty(value = "properties.meterId")
    private String meterId;

    /*
     * Azure Location of billable resource
     */
    @JsonProperty(value = "properties.billingLocation")
    private String billingLocation;

    /*
     * Short Name from App Service Azure pricing Page
     */
    @JsonProperty(value = "properties.shortName")
    private String shortName;

    /*
     * Friendly name of the meter
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * App Service ResourceType meter used for
     */
    @JsonProperty(value = "properties.resourceType")
    private String resourceType;

    /*
     * App Service OS type meter used for
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * Get the meterId property: Meter GUID onboarded in Commerce.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set the meterId property: Meter GUID onboarded in Commerce.
     *
     * @param meterId the meterId value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get the billingLocation property: Azure Location of billable resource.
     *
     * @return the billingLocation value.
     */
    public String billingLocation() {
        return this.billingLocation;
    }

    /**
     * Set the billingLocation property: Azure Location of billable resource.
     *
     * @param billingLocation the billingLocation value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withBillingLocation(String billingLocation) {
        this.billingLocation = billingLocation;
        return this;
    }

    /**
     * Get the shortName property: Short Name from App Service Azure pricing Page.
     *
     * @return the shortName value.
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set the shortName property: Short Name from App Service Azure pricing Page.
     *
     * @param shortName the shortName value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the meter.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the meter.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the resourceType property: App Service ResourceType meter used for.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: App Service ResourceType meter used for.
     *
     * @param resourceType the resourceType value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the osType property: App Service OS type meter used for.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: App Service OS type meter used for.
     *
     * @param osType the osType value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BillingMeterInner withKind(String kind) {
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
    }
}
