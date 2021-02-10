// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trusted client certificates of an application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewayTrustedClientCertificate extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayTrustedClientCertificate.class);

    /*
     * Name of the trusted client certificate that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Certificate public data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /*
     * The provisioning state of the trusted client certificate resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the trusted client certificate that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the trusted client certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayTrustedClientCertificate object itself.
     */
    public ApplicationGatewayTrustedClientCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the data property: Certificate public data.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Certificate public data.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewayTrustedClientCertificate object itself.
     */
    public ApplicationGatewayTrustedClientCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the trusted client certificate resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayTrustedClientCertificate withId(String id) {
        super.withId(id);
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
