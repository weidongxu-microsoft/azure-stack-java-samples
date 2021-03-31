// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result of the request to calculate template hash. It contains a string of minified template and its hash. */
@Fluent
public final class TemplateHashResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TemplateHashResultInner.class);

    /*
     * The minified template string.
     */
    @JsonProperty(value = "minifiedTemplate")
    private String minifiedTemplate;

    /*
     * The template hash.
     */
    @JsonProperty(value = "templateHash")
    private String templateHash;

    /**
     * Get the minifiedTemplate property: The minified template string.
     *
     * @return the minifiedTemplate value.
     */
    public String minifiedTemplate() {
        return this.minifiedTemplate;
    }

    /**
     * Set the minifiedTemplate property: The minified template string.
     *
     * @param minifiedTemplate the minifiedTemplate value to set.
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withMinifiedTemplate(String minifiedTemplate) {
        this.minifiedTemplate = minifiedTemplate;
        return this;
    }

    /**
     * Get the templateHash property: The template hash.
     *
     * @return the templateHash value.
     */
    public String templateHash() {
        return this.templateHash;
    }

    /**
     * Set the templateHash property: The template hash.
     *
     * @param templateHash the templateHash value to set.
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withTemplateHash(String templateHash) {
        this.templateHash = templateHash;
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