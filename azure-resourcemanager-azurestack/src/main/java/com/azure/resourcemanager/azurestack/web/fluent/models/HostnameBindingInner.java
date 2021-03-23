// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.web.models.AzureResourceType;
import com.azure.resourcemanager.azurestack.web.models.CustomHostnameDnsRecordType;
import com.azure.resourcemanager.azurestack.web.models.HostnameType;
import com.azure.resourcemanager.azurestack.web.models.ProxyOnlyResource;
import com.azure.resourcemanager.azurestack.web.models.SslState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A hostname binding object. */
@JsonFlatten
@Fluent
public class HostnameBindingInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostnameBindingInner.class);

    /*
     * App Service app name.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /*
     * Fully qualified ARM domain resource URI.
     */
    @JsonProperty(value = "properties.domainId")
    private String domainId;

    /*
     * Azure resource name.
     */
    @JsonProperty(value = "properties.azureResourceName")
    private String azureResourceName;

    /*
     * Azure resource type.
     */
    @JsonProperty(value = "properties.azureResourceType")
    private AzureResourceType azureResourceType;

    /*
     * Custom DNS record type.
     */
    @JsonProperty(value = "properties.customHostNameDnsRecordType")
    private CustomHostnameDnsRecordType customHostnameDnsRecordType;

    /*
     * Hostname type.
     */
    @JsonProperty(value = "properties.hostNameType")
    private HostnameType hostnameType;

    /*
     * SSL type
     */
    @JsonProperty(value = "properties.sslState")
    private SslState sslState;

    /*
     * SSL certificate thumbprint
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /*
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    @JsonProperty(value = "properties.virtualIP", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualIp;

    /**
     * Get the siteName property: App Service app name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: App Service app name.
     *
     * @param siteName the siteName value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the domainId property: Fully qualified ARM domain resource URI.
     *
     * @return the domainId value.
     */
    public String domainId() {
        return this.domainId;
    }

    /**
     * Set the domainId property: Fully qualified ARM domain resource URI.
     *
     * @param domainId the domainId value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get the azureResourceName property: Azure resource name.
     *
     * @return the azureResourceName value.
     */
    public String azureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set the azureResourceName property: Azure resource name.
     *
     * @param azureResourceName the azureResourceName value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
        return this;
    }

    /**
     * Get the azureResourceType property: Azure resource type.
     *
     * @return the azureResourceType value.
     */
    public AzureResourceType azureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set the azureResourceType property: Azure resource type.
     *
     * @param azureResourceType the azureResourceType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
        return this;
    }

    /**
     * Get the customHostnameDnsRecordType property: Custom DNS record type.
     *
     * @return the customHostnameDnsRecordType value.
     */
    public CustomHostnameDnsRecordType customHostnameDnsRecordType() {
        return this.customHostnameDnsRecordType;
    }

    /**
     * Set the customHostnameDnsRecordType property: Custom DNS record type.
     *
     * @param customHostnameDnsRecordType the customHostnameDnsRecordType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withCustomHostnameDnsRecordType(
        CustomHostnameDnsRecordType customHostnameDnsRecordType) {
        this.customHostnameDnsRecordType = customHostnameDnsRecordType;
        return this;
    }

    /**
     * Get the hostnameType property: Hostname type.
     *
     * @return the hostnameType value.
     */
    public HostnameType hostnameType() {
        return this.hostnameType;
    }

    /**
     * Set the hostnameType property: Hostname type.
     *
     * @param hostnameType the hostnameType value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withHostnameType(HostnameType hostnameType) {
        this.hostnameType = hostnameType;
        return this;
    }

    /**
     * Get the sslState property: SSL type.
     *
     * @return the sslState value.
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set the sslState property: SSL type.
     *
     * @param sslState the sslState value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    /**
     * Get the thumbprint property: SSL certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: SSL certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the HostnameBindingInner object itself.
     */
    public HostnameBindingInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the virtualIp property: Virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @return the virtualIp value.
     */
    public String virtualIp() {
        return this.virtualIp;
    }

    /** {@inheritDoc} */
    @Override
    public HostnameBindingInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
