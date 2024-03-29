// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.iothub.implementation;

import com.azure.resourcemanager.hybrid.iothub.fluent.models.UserSubscriptionQuotaListResultInner;
import com.azure.resourcemanager.hybrid.iothub.models.UserSubscriptionQuota;
import com.azure.resourcemanager.hybrid.iothub.models.UserSubscriptionQuotaListResult;
import java.util.Collections;
import java.util.List;

public final class UserSubscriptionQuotaListResultImpl implements UserSubscriptionQuotaListResult {
    private UserSubscriptionQuotaListResultInner innerObject;

    private final com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager;

    UserSubscriptionQuotaListResultImpl(
        UserSubscriptionQuotaListResultInner innerObject,
        com.azure.resourcemanager.hybrid.iothub.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<UserSubscriptionQuota> value() {
        List<UserSubscriptionQuota> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public UserSubscriptionQuotaListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}
