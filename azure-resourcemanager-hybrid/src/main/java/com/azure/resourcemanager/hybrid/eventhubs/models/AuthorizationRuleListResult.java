// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.eventhubs.fluent.models.AuthorizationRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List namespace operation. */
@Fluent
public final class AuthorizationRuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AuthorizationRuleListResult.class);

    /*
     * Result of the List Authorization Rules operation.
     */
    @JsonProperty(value = "value")
    private List<AuthorizationRuleInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains an
     * incomplete list of Authorization Rules
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Authorization Rules operation.
     *
     * @return the value value.
     */
    public List<AuthorizationRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Authorization Rules operation.
     *
     * @param value the value value to set.
     * @return the AuthorizationRuleListResult object itself.
     */
    public AuthorizationRuleListResult withValue(List<AuthorizationRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains an incomplete list of
     * Authorization Rules.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains an incomplete list of
     * Authorization Rules.
     *
     * @param nextLink the nextLink value to set.
     * @return the AuthorizationRuleListResult object itself.
     */
    public AuthorizationRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}