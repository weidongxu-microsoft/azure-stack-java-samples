// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.monitor.fluent.EventCategoriesClient;
import com.azure.resourcemanager.hybrid.monitor.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.hybrid.monitor.models.EventCategories;
import com.azure.resourcemanager.hybrid.monitor.models.LocalizableString;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EventCategoriesImpl implements EventCategories {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventCategoriesImpl.class);

    private final EventCategoriesClient innerClient;

    private final com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager;

    public EventCategoriesImpl(
        EventCategoriesClient innerClient, com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LocalizableString> list() {
        PagedIterable<LocalizableStringInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LocalizableStringImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalizableString> list(Context context) {
        PagedIterable<LocalizableStringInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new LocalizableStringImpl(inner1, this.manager()));
    }

    private EventCategoriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.monitor.MonitorManager manager() {
        return this.serviceManager;
    }
}