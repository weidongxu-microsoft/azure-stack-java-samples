// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.resourcemanager.hybrid.network.fluent.models.EffectiveNetworkSecurityGroupListResultInner;
import java.util.List;

/** An immutable client-side representation of EffectiveNetworkSecurityGroupListResult. */
public interface EffectiveNetworkSecurityGroupListResult {
    /**
     * Gets the value property: A list of effective network security groups.
     *
     * @return the value value.
     */
    List<EffectiveNetworkSecurityGroup> value();

    /**
     * Gets the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner
     * com.azure.resourcemanager.azurestack.network.fluent.models.EffectiveNetworkSecurityGroupListResultInner object.
     *
     * @return the inner object.
     */
    EffectiveNetworkSecurityGroupListResultInner innerModel();
}