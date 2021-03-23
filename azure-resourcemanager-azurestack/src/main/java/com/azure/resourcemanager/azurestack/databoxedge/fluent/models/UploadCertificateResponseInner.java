// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.databoxedge.models.AuthenticationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The upload registration certificate response. */
@Fluent
public final class UploadCertificateResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UploadCertificateResponseInner.class);

    /*
     * Specifies authentication type.
     */
    @JsonProperty(value = "authType")
    private AuthenticationType authType;

    /*
     * The resource ID of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * Azure Active Directory tenant authority.
     */
    @JsonProperty(value = "aadAuthority", access = JsonProperty.Access.WRITE_ONLY)
    private String aadAuthority;

    /*
     * Azure Active Directory tenant ID.
     */
    @JsonProperty(value = "aadTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String aadTenantId;

    /*
     * Azure Active Directory service principal client ID.
     */
    @JsonProperty(value = "servicePrincipalClientId", access = JsonProperty.Access.WRITE_ONLY)
    private String servicePrincipalClientId;

    /*
     * Azure Active Directory service principal object ID.
     */
    @JsonProperty(value = "servicePrincipalObjectId", access = JsonProperty.Access.WRITE_ONLY)
    private String servicePrincipalObjectId;

    /*
     * The azure management endpoint audience.
     */
    @JsonProperty(value = "azureManagementEndpointAudience", access = JsonProperty.Access.WRITE_ONLY)
    private String azureManagementEndpointAudience;

    /*
     * Identifier of the target resource that is the recipient of the requested
     * token.
     */
    @JsonProperty(value = "aadAudience", access = JsonProperty.Access.WRITE_ONLY)
    private String aadAudience;

    /**
     * Get the authType property: Specifies authentication type.
     *
     * @return the authType value.
     */
    public AuthenticationType authType() {
        return this.authType;
    }

    /**
     * Set the authType property: Specifies authentication type.
     *
     * @param authType the authType value to set.
     * @return the UploadCertificateResponseInner object itself.
     */
    public UploadCertificateResponseInner withAuthType(AuthenticationType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the resourceId property: The resource ID of the Data Box Edge/Gateway device.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the aadAuthority property: Azure Active Directory tenant authority.
     *
     * @return the aadAuthority value.
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Get the aadTenantId property: Azure Active Directory tenant ID.
     *
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Get the servicePrincipalClientId property: Azure Active Directory service principal client ID.
     *
     * @return the servicePrincipalClientId value.
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Get the servicePrincipalObjectId property: Azure Active Directory service principal object ID.
     *
     * @return the servicePrincipalObjectId value.
     */
    public String servicePrincipalObjectId() {
        return this.servicePrincipalObjectId;
    }

    /**
     * Get the azureManagementEndpointAudience property: The azure management endpoint audience.
     *
     * @return the azureManagementEndpointAudience value.
     */
    public String azureManagementEndpointAudience() {
        return this.azureManagementEndpointAudience;
    }

    /**
     * Get the aadAudience property: Identifier of the target resource that is the recipient of the requested token.
     *
     * @return the aadAudience value.
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
