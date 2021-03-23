// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.implementation;

import com.azure.resourcemanager.azurestack.appservice.fluent.models.BillingMeterInner;
import com.azure.resourcemanager.azurestack.appservice.models.BillingMeter;

public final class BillingMeterImpl implements BillingMeter {
    private BillingMeterInner innerObject;

    private final com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager;

    BillingMeterImpl(
        BillingMeterInner innerObject, com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String meterId() {
        return this.innerModel().meterId();
    }

    public String billingLocation() {
        return this.innerModel().billingLocation();
    }

    public String shortName() {
        return this.innerModel().shortName();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String osType() {
        return this.innerModel().osType();
    }

    public BillingMeterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}