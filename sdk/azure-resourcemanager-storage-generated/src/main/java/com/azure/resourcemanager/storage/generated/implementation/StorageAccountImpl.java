// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobRestoreStatusInner;
import com.azure.resourcemanager.storage.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountInner;
import com.azure.resourcemanager.storage.generated.models.AccessTier;
import com.azure.resourcemanager.storage.generated.models.AccountSasParameters;
import com.azure.resourcemanager.storage.generated.models.AccountStatus;
import com.azure.resourcemanager.storage.generated.models.AzureFilesIdentityBasedAuthentication;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreParameters;
import com.azure.resourcemanager.storage.generated.models.BlobRestoreStatus;
import com.azure.resourcemanager.storage.generated.models.CustomDomain;
import com.azure.resourcemanager.storage.generated.models.Encryption;
import com.azure.resourcemanager.storage.generated.models.Endpoints;
import com.azure.resourcemanager.storage.generated.models.ExtendedLocation;
import com.azure.resourcemanager.storage.generated.models.GeoReplicationStats;
import com.azure.resourcemanager.storage.generated.models.Identity;
import com.azure.resourcemanager.storage.generated.models.Kind;
import com.azure.resourcemanager.storage.generated.models.LargeFileSharesState;
import com.azure.resourcemanager.storage.generated.models.ListAccountSasResponse;
import com.azure.resourcemanager.storage.generated.models.ListKeyExpand;
import com.azure.resourcemanager.storage.generated.models.ListServiceSasResponse;
import com.azure.resourcemanager.storage.generated.models.MinimumTlsVersion;
import com.azure.resourcemanager.storage.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.storage.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.storage.generated.models.ProvisioningState;
import com.azure.resourcemanager.storage.generated.models.RoutingPreference;
import com.azure.resourcemanager.storage.generated.models.ServiceSasParameters;
import com.azure.resourcemanager.storage.generated.models.Sku;
import com.azure.resourcemanager.storage.generated.models.StorageAccount;
import com.azure.resourcemanager.storage.generated.models.StorageAccountCreateParameters;
import com.azure.resourcemanager.storage.generated.models.StorageAccountExpand;
import com.azure.resourcemanager.storage.generated.models.StorageAccountListKeysResult;
import com.azure.resourcemanager.storage.generated.models.StorageAccountRegenerateKeyParameters;
import com.azure.resourcemanager.storage.generated.models.StorageAccountUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class StorageAccountImpl implements StorageAccount, StorageAccount.Definition, StorageAccount.Update {
    private StorageAccountInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Endpoints primaryEndpoints() {
        return this.innerModel().primaryEndpoints();
    }

    public String primaryLocation() {
        return this.innerModel().primaryLocation();
    }

    public AccountStatus statusOfPrimary() {
        return this.innerModel().statusOfPrimary();
    }

    public OffsetDateTime lastGeoFailoverTime() {
        return this.innerModel().lastGeoFailoverTime();
    }

    public String secondaryLocation() {
        return this.innerModel().secondaryLocation();
    }

    public AccountStatus statusOfSecondary() {
        return this.innerModel().statusOfSecondary();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public CustomDomain customDomain() {
        return this.innerModel().customDomain();
    }

    public Endpoints secondaryEndpoints() {
        return this.innerModel().secondaryEndpoints();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public AccessTier accessTier() {
        return this.innerModel().accessTier();
    }

    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerModel().azureFilesIdentityBasedAuthentication();
    }

    public Boolean enableHttpsTrafficOnly() {
        return this.innerModel().enableHttpsTrafficOnly();
    }

    public NetworkRuleSet networkRuleSet() {
        return this.innerModel().networkRuleSet();
    }

    public Boolean isHnsEnabled() {
        return this.innerModel().isHnsEnabled();
    }

    public GeoReplicationStats geoReplicationStats() {
        return this.innerModel().geoReplicationStats();
    }

    public Boolean failoverInProgress() {
        return this.innerModel().failoverInProgress();
    }

    public LargeFileSharesState largeFileSharesState() {
        return this.innerModel().largeFileSharesState();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public RoutingPreference routingPreference() {
        return this.innerModel().routingPreference();
    }

    public BlobRestoreStatus blobRestoreStatus() {
        BlobRestoreStatusInner inner = this.innerModel().blobRestoreStatus();
        if (inner != null) {
            return new BlobRestoreStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Boolean allowBlobPublicAccess() {
        return this.innerModel().allowBlobPublicAccess();
    }

    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerModel().minimumTlsVersion();
    }

    public Boolean allowSharedKeyAccess() {
        return this.innerModel().allowSharedKeyAccess();
    }

    public Boolean enableNfsV3() {
        return this.innerModel().enableNfsV3();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public StorageAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private StorageAccountCreateParameters createParameters;

    private StorageAccountUpdateParameters updateParameters;

    public StorageAccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StorageAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .create(resourceGroupName, accountName, createParameters, Context.NONE);
        return this;
    }

    public StorageAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .create(resourceGroupName, accountName, createParameters, context);
        return this;
    }

    StorageAccountImpl(String name, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new StorageAccountInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
        this.createParameters = new StorageAccountCreateParameters();
    }

    public StorageAccountImpl update() {
        this.updateParameters = new StorageAccountUpdateParameters();
        return this;
    }

    public StorageAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .updateWithResponse(resourceGroupName, accountName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public StorageAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .updateWithResponse(resourceGroupName, accountName, updateParameters, context)
                .getValue();
        return this;
    }

    StorageAccountImpl(
        StorageAccountInner innerObject, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
    }

    public StorageAccount refresh() {
        StorageAccountExpand localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public StorageAccount refresh(Context context) {
        StorageAccountExpand localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, localExpand, context)
                .getValue();
        return this;
    }

    public StorageAccountListKeysResult listKeys() {
        return serviceManager.storageAccounts().listKeys(resourceGroupName, accountName);
    }

    public Response<StorageAccountListKeysResult> listKeysWithResponse(ListKeyExpand expand, Context context) {
        return serviceManager.storageAccounts().listKeysWithResponse(resourceGroupName, accountName, expand, context);
    }

    public StorageAccountListKeysResult regenerateKey(StorageAccountRegenerateKeyParameters regenerateKey) {
        return serviceManager.storageAccounts().regenerateKey(resourceGroupName, accountName, regenerateKey);
    }

    public Response<StorageAccountListKeysResult> regenerateKeyWithResponse(
        StorageAccountRegenerateKeyParameters regenerateKey, Context context) {
        return serviceManager
            .storageAccounts()
            .regenerateKeyWithResponse(resourceGroupName, accountName, regenerateKey, context);
    }

    public ListAccountSasResponse listAccountSas(AccountSasParameters parameters) {
        return serviceManager.storageAccounts().listAccountSas(resourceGroupName, accountName, parameters);
    }

    public Response<ListAccountSasResponse> listAccountSasWithResponse(
        AccountSasParameters parameters, Context context) {
        return serviceManager
            .storageAccounts()
            .listAccountSasWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public ListServiceSasResponse listServiceSas(ServiceSasParameters parameters) {
        return serviceManager.storageAccounts().listServiceSas(resourceGroupName, accountName, parameters);
    }

    public Response<ListServiceSasResponse> listServiceSasWithResponse(
        ServiceSasParameters parameters, Context context) {
        return serviceManager
            .storageAccounts()
            .listServiceSasWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public void failover() {
        serviceManager.storageAccounts().failover(resourceGroupName, accountName);
    }

    public void failover(Context context) {
        serviceManager.storageAccounts().failover(resourceGroupName, accountName, context);
    }

    public BlobRestoreStatus restoreBlobRanges(BlobRestoreParameters parameters) {
        return serviceManager.storageAccounts().restoreBlobRanges(resourceGroupName, accountName, parameters);
    }

    public BlobRestoreStatus restoreBlobRanges(BlobRestoreParameters parameters, Context context) {
        return serviceManager.storageAccounts().restoreBlobRanges(resourceGroupName, accountName, parameters, context);
    }

    public void revokeUserDelegationKeys() {
        serviceManager.storageAccounts().revokeUserDelegationKeys(resourceGroupName, accountName);
    }

    public Response<Void> revokeUserDelegationKeysWithResponse(Context context) {
        return serviceManager
            .storageAccounts()
            .revokeUserDelegationKeysWithResponse(resourceGroupName, accountName, context);
    }

    public StorageAccountImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public StorageAccountImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public StorageAccountImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameters.withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public StorageAccountImpl withKind(Kind kind) {
        if (isInCreateMode()) {
            this.createParameters.withKind(kind);
            return this;
        } else {
            this.updateParameters.withKind(kind);
            return this;
        }
    }

    public StorageAccountImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public StorageAccountImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.createParameters.withExtendedLocation(extendedLocation);
        return this;
    }

    public StorageAccountImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.createParameters.withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public StorageAccountImpl withCustomDomain(CustomDomain customDomain) {
        if (isInCreateMode()) {
            this.createParameters.withCustomDomain(customDomain);
            return this;
        } else {
            this.updateParameters.withCustomDomain(customDomain);
            return this;
        }
    }

    public StorageAccountImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.createParameters.withEncryption(encryption);
            return this;
        } else {
            this.updateParameters.withEncryption(encryption);
            return this;
        }
    }

    public StorageAccountImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.createParameters.withNetworkRuleSet(networkRuleSet);
            return this;
        } else {
            this.updateParameters.withNetworkRuleSet(networkRuleSet);
            return this;
        }
    }

    public StorageAccountImpl withAccessTier(AccessTier accessTier) {
        if (isInCreateMode()) {
            this.createParameters.withAccessTier(accessTier);
            return this;
        } else {
            this.updateParameters.withAccessTier(accessTier);
            return this;
        }
    }

    public StorageAccountImpl withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (isInCreateMode()) {
            this.createParameters.withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
            return this;
        } else {
            this.updateParameters.withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
            return this;
        }
    }

    public StorageAccountImpl withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (isInCreateMode()) {
            this.createParameters.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
            return this;
        } else {
            this.updateParameters.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
            return this;
        }
    }

    public StorageAccountImpl withIsHnsEnabled(Boolean isHnsEnabled) {
        this.createParameters.withIsHnsEnabled(isHnsEnabled);
        return this;
    }

    public StorageAccountImpl withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (isInCreateMode()) {
            this.createParameters.withLargeFileSharesState(largeFileSharesState);
            return this;
        } else {
            this.updateParameters.withLargeFileSharesState(largeFileSharesState);
            return this;
        }
    }

    public StorageAccountImpl withRoutingPreference(RoutingPreference routingPreference) {
        if (isInCreateMode()) {
            this.createParameters.withRoutingPreference(routingPreference);
            return this;
        } else {
            this.updateParameters.withRoutingPreference(routingPreference);
            return this;
        }
    }

    public StorageAccountImpl withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (isInCreateMode()) {
            this.createParameters.withAllowBlobPublicAccess(allowBlobPublicAccess);
            return this;
        } else {
            this.updateParameters.withAllowBlobPublicAccess(allowBlobPublicAccess);
            return this;
        }
    }

    public StorageAccountImpl withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (isInCreateMode()) {
            this.createParameters.withMinimumTlsVersion(minimumTlsVersion);
            return this;
        } else {
            this.updateParameters.withMinimumTlsVersion(minimumTlsVersion);
            return this;
        }
    }

    public StorageAccountImpl withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        if (isInCreateMode()) {
            this.createParameters.withAllowSharedKeyAccess(allowSharedKeyAccess);
            return this;
        } else {
            this.updateParameters.withAllowSharedKeyAccess(allowSharedKeyAccess);
            return this;
        }
    }

    public StorageAccountImpl withEnableNfsV3(Boolean enableNfsV3) {
        this.createParameters.withEnableNfsV3(enableNfsV3);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
