// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.iothub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.iothub.fluent.ResourceProviderCommonsClient;
import com.azure.resourcemanager.azurestack.iothub.fluent.models.UserSubscriptionQuotaListResultInner;
import com.azure.resourcemanager.azurestack.iothub.models.ResourceProviderCommons;
import com.azure.resourcemanager.azurestack.iothub.models.UserSubscriptionQuotaListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProviderCommonsImpl implements ResourceProviderCommons {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProviderCommonsImpl.class);

    private final ResourceProviderCommonsClient innerClient;

    private final com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager;

    public ResourceProviderCommonsImpl(
        ResourceProviderCommonsClient innerClient,
        com.azure.resourcemanager.azurestack.iothub.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public UserSubscriptionQuotaListResult getSubscriptionQuota() {
        UserSubscriptionQuotaListResultInner inner = this.serviceClient().getSubscriptionQuota();
        if (inner != null) {
            return new UserSubscriptionQuotaListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UserSubscriptionQuotaListResult> getSubscriptionQuotaWithResponse(Context context) {
        Response<UserSubscriptionQuotaListResultInner> inner =
            this.serviceClient().getSubscriptionQuotaWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserSubscriptionQuotaListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceProviderCommonsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}