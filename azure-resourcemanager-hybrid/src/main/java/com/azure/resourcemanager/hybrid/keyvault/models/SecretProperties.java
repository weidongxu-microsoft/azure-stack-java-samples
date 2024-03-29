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
public final class SecretProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretProperties.class);

    /*
     * The value of the secret. NOTE: 'value' will never be returned from the
     * service, as APIs using this model are is intended for internal use in
     * ARM deployments. Users should use the data-plane REST service for
     * interaction with vault secrets.
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

    /*
     * The URI to retrieve the current version of the secret.
     */
    @JsonProperty(value = "secretUri", access = JsonProperty.Access.WRITE_ONLY)
    private String secretUri;

    /*
     * The URI to retrieve the specific version of the secret.
     */
    @JsonProperty(value = "secretUriWithVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String secretUriWithVersion;

    /**
     * Get the value property: The value of the secret. NOTE: 'value' will never be returned from the service, as APIs
     * using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST
     * service for interaction with vault secrets.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the secret. NOTE: 'value' will never be returned from the service, as APIs
     * using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST
     * service for interaction with vault secrets.
     *
     * @param value the value value to set.
     * @return the SecretProperties object itself.
     */
    public SecretProperties withValue(String value) {
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
     * @return the SecretProperties object itself.
     */
    public SecretProperties withContentType(String contentType) {
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
     * @return the SecretProperties object itself.
     */
    public SecretProperties withAttributes(SecretAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the secretUri property: The URI to retrieve the current version of the secret.
     *
     * @return the secretUri value.
     */
    public String secretUri() {
        return this.secretUri;
    }

    /**
     * Get the secretUriWithVersion property: The URI to retrieve the specific version of the secret.
     *
     * @return the secretUriWithVersion value.
     */
    public String secretUriWithVersion() {
        return this.secretUriWithVersion;
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
