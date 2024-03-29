// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the secret. */
@Fluent
public final class SecretPatchProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretPatchProperties.class);

    /*
     * The value of the secret.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The content type of the secret.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * The attributes of the secret.
     */
    @JsonProperty(value = "attributes")
    private SecretAttributes attributes;

    /**
     * Get the value property: The value of the secret.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the secret.
     *
     * @param value the value value to set.
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the contentType property: The content type of the secret.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of the secret.
     *
     * @param contentType the contentType value to set.
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the attributes property: The attributes of the secret.
     *
     * @return the attributes value.
     */
    public SecretAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of the secret.
     *
     * @param attributes the attributes value to set.
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withAttributes(SecretAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().validate();
        }
    }
}
