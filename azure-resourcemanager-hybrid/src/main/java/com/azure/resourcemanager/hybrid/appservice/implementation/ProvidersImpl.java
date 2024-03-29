// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.fluent.ProvidersClient;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.ApplicationStackInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.hybrid.appservice.models.ApplicationStack;
import com.azure.resourcemanager.hybrid.appservice.models.CsmOperationDescription;
import com.azure.resourcemanager.hybrid.appservice.models.ProviderOsTypeSelected;
import com.azure.resourcemanager.hybrid.appservice.models.Providers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProvidersImpl implements Providers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProvidersImpl.class);

    private final ProvidersClient innerClient;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    public ProvidersImpl(
        ProvidersClient innerClient, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplicationStack> getAvailableStacks() {
        PagedIterable<ApplicationStackInner> inner = this.serviceClient().getAvailableStacks();
        return Utils.mapPage(inner, inner1 -> new ApplicationStackImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStack> getAvailableStacks(ProviderOsTypeSelected osTypeSelected, Context context) {
        PagedIterable<ApplicationStackInner> inner = this.serviceClient().getAvailableStacks(osTypeSelected, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationStackImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmOperationDescription> listOperations() {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations();
        return Utils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmOperationDescription> listOperations(Context context) {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations(context);
        return Utils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStack> list() {
        PagedIterable<ApplicationStackInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ApplicationStackImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationStack> list(ProviderOsTypeSelected osTypeSelected, Context context) {
        PagedIterable<ApplicationStackInner> inner = this.serviceClient().list(osTypeSelected, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationStackImpl(inner1, this.manager()));
    }

    private ProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}
