// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.models;

import com.azure.resourcemanager.azurestack.web.fluent.models.BillingMeterInner;

/** An immutable client-side representation of BillingMeter. */
public interface BillingMeter {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the meterId property: Meter GUID onboarded in Commerce.
     *
     * @return the meterId value.
     */
    String meterId();

    /**
     * Gets the billingLocation property: Azure Location of billable resource.
     *
     * @return the billingLocation value.
     */
    String billingLocation();

    /**
     * Gets the shortName property: Short Name from App Service Azure pricing Page.
     *
     * @return the shortName value.
     */
    String shortName();

    /**
     * Gets the friendlyName property: Friendly name of the meter.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the resourceType property: App Service ResourceType meter used for.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the osType property: App Service OS type meter used for.
     *
     * @return the osType value.
     */
    String osType();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.BillingMeterInner object.
     *
     * @return the inner object.
     */
    BillingMeterInner innerModel();
}
