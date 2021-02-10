// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A dictionary of name and value pairs. */
@Fluent
public final class Tags {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Tags.class);

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags property: Dictionary of &lt;string&gt;.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Dictionary of &lt;string&gt;.
     *
     * @param tags the tags value to set.
     * @return the Tags object itself.
     */
    public Tags withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}