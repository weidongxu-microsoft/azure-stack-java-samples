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
import java.util.List;

/** SSL profile of an application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewaySslProfile extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslProfile.class);

    /*
     * Name of the SSL profile that is unique within an Application Gateway.
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
     * Array of references to application gateway trusted client certificates.
     */
    @JsonProperty(value = "properties.trustedClientCertificates")
    private List<SubResource> trustedClientCertificates;

    /*
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /*
     * Client authentication configuration of the application gateway resource.
     */
    @JsonProperty(value = "properties.clientAuthConfiguration")
    private ApplicationGatewayClientAuthConfiguration clientAuthConfiguration;

    /*
     * The provisioning state of the HTTP listener resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the SSL profile that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SSL profile that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withName(String name) {
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
     * Get the trustedClientCertificates property: Array of references to application gateway trusted client
     * certificates.
     *
     * @return the trustedClientCertificates value.
     */
    public List<SubResource> trustedClientCertificates() {
        return this.trustedClientCertificates;
    }

    /**
     * Set the trustedClientCertificates property: Array of references to application gateway trusted client
     * certificates.
     *
     * @param trustedClientCertificates the trustedClientCertificates value to set.
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withTrustedClientCertificates(List<SubResource> trustedClientCertificates) {
        this.trustedClientCertificates = trustedClientCertificates;
        return this;
    }

    /**
     * Get the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @return the sslPolicy value.
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @param sslPolicy the sslPolicy value to set.
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get the clientAuthConfiguration property: Client authentication configuration of the application gateway
     * resource.
     *
     * @return the clientAuthConfiguration value.
     */
    public ApplicationGatewayClientAuthConfiguration clientAuthConfiguration() {
        return this.clientAuthConfiguration;
    }

    /**
     * Set the clientAuthConfiguration property: Client authentication configuration of the application gateway
     * resource.
     *
     * @param clientAuthConfiguration the clientAuthConfiguration value to set.
     * @return the ApplicationGatewaySslProfile object itself.
     */
    public ApplicationGatewaySslProfile withClientAuthConfiguration(
        ApplicationGatewayClientAuthConfiguration clientAuthConfiguration) {
        this.clientAuthConfiguration = clientAuthConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the HTTP listener resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewaySslProfile withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sslPolicy() != null) {
            sslPolicy().validate();
        }
        if (clientAuthConfiguration() != null) {
            clientAuthConfiguration().validate();
        }
    }
}