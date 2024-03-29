// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.hybrid.appservice.models.KeyVaultSecretStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** SSL certificate for an app. */
@JsonFlatten
@Fluent
public class CertificateInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateInner.class);

    /*
     * Friendly name of the certificate.
     */
    @JsonProperty(value = "properties.friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /*
     * Subject name of the certificate.
     */
    @JsonProperty(value = "properties.subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /*
     * Host names the certificate applies to.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /*
     * Pfx blob.
     */
    @JsonProperty(value = "properties.pfxBlob")
    private byte[] pfxBlob;

    /*
     * App name.
     */
    @JsonProperty(value = "properties.siteName", access = JsonProperty.Access.WRITE_ONLY)
    private String siteName;

    /*
     * Self link.
     */
    @JsonProperty(value = "properties.selfLink", access = JsonProperty.Access.WRITE_ONLY)
    private String selfLink;

    /*
     * Certificate issuer.
     */
    @JsonProperty(value = "properties.issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /*
     * Certificate issue Date.
     */
    @JsonProperty(value = "properties.issueDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime issueDate;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "properties.expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDate;

    /*
     * Certificate password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Is the certificate valid?.
     */
    @JsonProperty(value = "properties.valid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean valid;

    /*
     * Raw bytes of .cer file
     */
    @JsonProperty(value = "properties.cerBlob", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] cerBlob;

    /*
     * Public key hash.
     */
    @JsonProperty(value = "properties.publicKeyHash", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKeyHash;

    /*
     * Specification for the App Service Environment to use for the
     * certificate.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * Key Vault Csm resource Id.
     */
    @JsonProperty(value = "properties.keyVaultId")
    private String keyVaultId;

    /*
     * Key Vault secret name.
     */
    @JsonProperty(value = "properties.keyVaultSecretName")
    private String keyVaultSecretName;

    /*
     * Status of the Key Vault secret.
     */
    @JsonProperty(value = "properties.keyVaultSecretStatus", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus keyVaultSecretStatus;

    /*
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the friendlyName property: Friendly name of the certificate.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the hostNames property: Host names the certificate applies to.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: Host names the certificate applies to.
     *
     * @param hostNames the hostNames value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get the pfxBlob property: Pfx blob.
     *
     * @return the pfxBlob value.
     */
    public byte[] pfxBlob() {
        return CoreUtils.clone(this.pfxBlob);
    }

    /**
     * Set the pfxBlob property: Pfx blob.
     *
     * @param pfxBlob the pfxBlob value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPfxBlob(byte[] pfxBlob) {
        this.pfxBlob = CoreUtils.clone(pfxBlob);
        return this;
    }

    /**
     * Get the siteName property: App name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Get the selfLink property: Self link.
     *
     * @return the selfLink value.
     */
    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the password property: Certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Certificate password.
     *
     * @param password the password value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get the cerBlob property: Raw bytes of .cer file.
     *
     * @return the cerBlob value.
     */
    public byte[] cerBlob() {
        return CoreUtils.clone(this.cerBlob);
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the
     * certificate.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Get the keyVaultId property: Key Vault Csm resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Key Vault Csm resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the keyVaultSecretStatus property: Status of the Key Vault secret.
     *
     * @return the keyVaultSecretStatus value.
     */
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
    }
}
