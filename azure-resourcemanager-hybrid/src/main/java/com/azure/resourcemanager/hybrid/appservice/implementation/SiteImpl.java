// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.BackupRequestInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.RestoreRequestInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.SiteInner;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.SitePatchResourceInner;
import com.azure.resourcemanager.hybrid.appservice.models.BackupItem;
import com.azure.resourcemanager.hybrid.appservice.models.CloningInfo;
import com.azure.resourcemanager.hybrid.appservice.models.CsmPublishingProfileOptions;
import com.azure.resourcemanager.hybrid.appservice.models.CsmSlotEntity;
import com.azure.resourcemanager.hybrid.appservice.models.DeletedAppRestoreRequest;
import com.azure.resourcemanager.hybrid.appservice.models.FunctionSecrets;
import com.azure.resourcemanager.hybrid.appservice.models.GeoDistribution;
import com.azure.resourcemanager.hybrid.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.hybrid.appservice.models.HostnameSslState;
import com.azure.resourcemanager.hybrid.appservice.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hybrid.appservice.models.MigrateMySqlRequest;
import com.azure.resourcemanager.hybrid.appservice.models.Operation;
import com.azure.resourcemanager.hybrid.appservice.models.RedundancyMode;
import com.azure.resourcemanager.hybrid.appservice.models.RestoreRequest;
import com.azure.resourcemanager.hybrid.appservice.models.Site;
import com.azure.resourcemanager.hybrid.appservice.models.SiteAvailabilityState;
import com.azure.resourcemanager.hybrid.appservice.models.SiteCloneability;
import com.azure.resourcemanager.hybrid.appservice.models.SiteConfig;
import com.azure.resourcemanager.hybrid.appservice.models.SlotDifference;
import com.azure.resourcemanager.hybrid.appservice.models.SlotSwapStatus;
import com.azure.resourcemanager.hybrid.appservice.models.SnapshotRestoreRequest;
import com.azure.resourcemanager.hybrid.appservice.models.UsageState;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class SiteImpl implements Site, Site.Definition, Site.Update {
    private SiteInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String state() {
        return this.innerModel().state();
    }

    public List<String> hostNames() {
        List<String> inner = this.innerModel().hostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String repositorySiteName() {
        return this.innerModel().repositorySiteName();
    }

    public UsageState usageState() {
        return this.innerModel().usageState();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public List<String> enabledHostNames() {
        List<String> inner = this.innerModel().enabledHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SiteAvailabilityState availabilityState() {
        return this.innerModel().availabilityState();
    }

    public List<HostnameSslState> hostnameSslStates() {
        List<HostnameSslState> inner = this.innerModel().hostnameSslStates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String serverFarmId() {
        return this.innerModel().serverFarmId();
    }

    public Boolean reserved() {
        return this.innerModel().reserved();
    }

    public Boolean isXenon() {
        return this.innerModel().isXenon();
    }

    public Boolean hyperV() {
        return this.innerModel().hyperV();
    }

    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerModel().lastModifiedTimeUtc();
    }

    public SiteConfig siteConfig() {
        SiteConfigInner inner = this.innerModel().siteConfig();
        if (inner != null) {
            return new SiteConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<String> trafficManagerHostNames() {
        List<String> inner = this.innerModel().trafficManagerHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean scmSiteAlsoStopped() {
        return this.innerModel().scmSiteAlsoStopped();
    }

    public String targetSwapSlot() {
        return this.innerModel().targetSwapSlot();
    }

    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerModel().hostingEnvironmentProfile();
    }

    public Boolean clientAffinityEnabled() {
        return this.innerModel().clientAffinityEnabled();
    }

    public Boolean clientCertEnabled() {
        return this.innerModel().clientCertEnabled();
    }

    public String clientCertExclusionPaths() {
        return this.innerModel().clientCertExclusionPaths();
    }

    public Boolean hostNamesDisabled() {
        return this.innerModel().hostNamesDisabled();
    }

    public String outboundIpAddresses() {
        return this.innerModel().outboundIpAddresses();
    }

    public String possibleOutboundIpAddresses() {
        return this.innerModel().possibleOutboundIpAddresses();
    }

    public Integer containerSize() {
        return this.innerModel().containerSize();
    }

    public Integer dailyMemoryTimeQuota() {
        return this.innerModel().dailyMemoryTimeQuota();
    }

    public OffsetDateTime suspendedTill() {
        return this.innerModel().suspendedTill();
    }

    public Integer maxNumberOfWorkers() {
        return this.innerModel().maxNumberOfWorkers();
    }

    public CloningInfo cloningInfo() {
        return this.innerModel().cloningInfo();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public Boolean isDefaultContainer() {
        return this.innerModel().isDefaultContainer();
    }

    public String defaultHostname() {
        return this.innerModel().defaultHostname();
    }

    public SlotSwapStatus slotSwapStatus() {
        return this.innerModel().slotSwapStatus();
    }

    public Boolean httpsOnly() {
        return this.innerModel().httpsOnly();
    }

    public RedundancyMode redundancyMode() {
        return this.innerModel().redundancyMode();
    }

    public UUID inProgressOperationId() {
        return this.innerModel().inProgressOperationId();
    }

    public List<GeoDistribution> geoDistributions() {
        List<GeoDistribution> inner = this.innerModel().geoDistributions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SiteInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private SitePatchResourceInner updateSiteEnvelope;

    public SiteImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Site create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public Site create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    SiteImpl(String name, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = new SiteInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public SiteImpl update() {
        this.updateSiteEnvelope = new SitePatchResourceInner();
        return this;
    }

    public Site apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateWithResponse(resourceGroupName, name, updateSiteEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public Site apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateWithResponse(resourceGroupName, name, updateSiteEnvelope, context)
                .getValue();
        return this;
    }

    SiteImpl(SiteInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
    }

    public Site refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public Site refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public void applySlotConfigToProduction(CsmSlotEntity slotSwapEntity) {
        serviceManager.webApps().applySlotConfigToProduction(resourceGroupName, name, slotSwapEntity);
    }

    public Response<Void> applySlotConfigToProductionWithResponse(CsmSlotEntity slotSwapEntity, Context context) {
        return serviceManager
            .webApps()
            .applySlotConfigToProductionWithResponse(resourceGroupName, name, slotSwapEntity, context);
    }

    public BackupItem backup(BackupRequestInner request) {
        return serviceManager.webApps().backup(resourceGroupName, name, request);
    }

    public Response<BackupItem> backupWithResponse(BackupRequestInner request, Context context) {
        return serviceManager.webApps().backupWithResponse(resourceGroupName, name, request, context);
    }

    public InputStream getWebSiteContainerLogs() {
        return serviceManager.webApps().getWebSiteContainerLogs(resourceGroupName, name);
    }

    public StreamResponse getWebSiteContainerLogsWithResponse(Context context) {
        return serviceManager.webApps().getWebSiteContainerLogsWithResponse(resourceGroupName, name, context);
    }

    public RestoreRequest discoverBackup(RestoreRequestInner request) {
        return serviceManager.webApps().discoverBackup(resourceGroupName, name, request);
    }

    public Response<RestoreRequest> discoverBackupWithResponse(RestoreRequestInner request, Context context) {
        return serviceManager.webApps().discoverBackupWithResponse(resourceGroupName, name, request, context);
    }

    public SiteCloneability isCloneable() {
        return serviceManager.webApps().isCloneable(resourceGroupName, name);
    }

    public Response<SiteCloneability> isCloneableWithResponse(Context context) {
        return serviceManager.webApps().isCloneableWithResponse(resourceGroupName, name, context);
    }

    public FunctionSecrets listSyncFunctionTriggers() {
        return serviceManager.webApps().listSyncFunctionTriggers(resourceGroupName, name);
    }

    public Response<FunctionSecrets> listSyncFunctionTriggersWithResponse(Context context) {
        return serviceManager.webApps().listSyncFunctionTriggersWithResponse(resourceGroupName, name, context);
    }

    public Operation migrateMySql(MigrateMySqlRequest migrationRequestEnvelope) {
        return serviceManager.webApps().migrateMySql(resourceGroupName, name, migrationRequestEnvelope);
    }

    public Operation migrateMySql(MigrateMySqlRequest migrationRequestEnvelope, Context context) {
        return serviceManager.webApps().migrateMySql(resourceGroupName, name, migrationRequestEnvelope, context);
    }

    public void generateNewSitePublishingPassword() {
        serviceManager.webApps().generateNewSitePublishingPassword(resourceGroupName, name);
    }

    public Response<Void> generateNewSitePublishingPasswordWithResponse(Context context) {
        return serviceManager.webApps().generateNewSitePublishingPasswordWithResponse(resourceGroupName, name, context);
    }

    public InputStream listPublishingProfileXmlWithSecrets(CsmPublishingProfileOptions publishingProfileOptions) {
        return serviceManager
            .webApps()
            .listPublishingProfileXmlWithSecrets(resourceGroupName, name, publishingProfileOptions);
    }

    public StreamResponse listPublishingProfileXmlWithSecretsWithResponse(
        CsmPublishingProfileOptions publishingProfileOptions, Context context) {
        return serviceManager
            .webApps()
            .listPublishingProfileXmlWithSecretsWithResponse(
                resourceGroupName, name, publishingProfileOptions, context);
    }

    public void resetProductionSlotConfig() {
        serviceManager.webApps().resetProductionSlotConfig(resourceGroupName, name);
    }

    public Response<Void> resetProductionSlotConfigWithResponse(Context context) {
        return serviceManager.webApps().resetProductionSlotConfigWithResponse(resourceGroupName, name, context);
    }

    public void restart() {
        serviceManager.webApps().restart(resourceGroupName, name);
    }

    public Response<Void> restartWithResponse(Boolean softRestart, Boolean synchronous, Context context) {
        return serviceManager.webApps().restartWithResponse(resourceGroupName, name, softRestart, synchronous, context);
    }

    public void restoreFromBackupBlob(RestoreRequestInner request) {
        serviceManager.webApps().restoreFromBackupBlob(resourceGroupName, name, request);
    }

    public void restoreFromBackupBlob(RestoreRequestInner request, Context context) {
        serviceManager.webApps().restoreFromBackupBlob(resourceGroupName, name, request, context);
    }

    public void restoreFromDeletedApp(DeletedAppRestoreRequest restoreRequest) {
        serviceManager.webApps().restoreFromDeletedApp(resourceGroupName, name, restoreRequest);
    }

    public void restoreFromDeletedApp(DeletedAppRestoreRequest restoreRequest, Context context) {
        serviceManager.webApps().restoreFromDeletedApp(resourceGroupName, name, restoreRequest, context);
    }

    public void restoreSnapshot(SnapshotRestoreRequest restoreRequest) {
        serviceManager.webApps().restoreSnapshot(resourceGroupName, name, restoreRequest);
    }

    public void restoreSnapshot(SnapshotRestoreRequest restoreRequest, Context context) {
        serviceManager.webApps().restoreSnapshot(resourceGroupName, name, restoreRequest, context);
    }

    public PagedIterable<SlotDifference> listSlotDifferencesFromProduction(CsmSlotEntity slotSwapEntity) {
        return serviceManager.webApps().listSlotDifferencesFromProduction(resourceGroupName, name, slotSwapEntity);
    }

    public PagedIterable<SlotDifference> listSlotDifferencesFromProduction(
        CsmSlotEntity slotSwapEntity, Context context) {
        return serviceManager
            .webApps()
            .listSlotDifferencesFromProduction(resourceGroupName, name, slotSwapEntity, context);
    }

    public void swapSlotWithProduction(CsmSlotEntity slotSwapEntity) {
        serviceManager.webApps().swapSlotWithProduction(resourceGroupName, name, slotSwapEntity);
    }

    public void swapSlotWithProduction(CsmSlotEntity slotSwapEntity, Context context) {
        serviceManager.webApps().swapSlotWithProduction(resourceGroupName, name, slotSwapEntity, context);
    }

    public void start() {
        serviceManager.webApps().start(resourceGroupName, name);
    }

    public Response<Void> startWithResponse(Context context) {
        return serviceManager.webApps().startWithResponse(resourceGroupName, name, context);
    }

    public Object startNetworkTrace(Integer durationInSeconds, Integer maxFrameLength, String sasUrl) {
        return serviceManager
            .webApps()
            .startNetworkTrace(resourceGroupName, name, durationInSeconds, maxFrameLength, sasUrl);
    }

    public Object startNetworkTrace() {
        return serviceManager.webApps().startNetworkTrace(resourceGroupName, name);
    }

    public Object startNetworkTrace(Integer durationInSeconds, Integer maxFrameLength, String sasUrl, Context context) {
        return serviceManager
            .webApps()
            .startNetworkTrace(resourceGroupName, name, durationInSeconds, maxFrameLength, sasUrl, context);
    }

    public void stop() {
        serviceManager.webApps().stop(resourceGroupName, name);
    }

    public Response<Void> stopWithResponse(Context context) {
        return serviceManager.webApps().stopWithResponse(resourceGroupName, name, context);
    }

    public void stopNetworkTrace() {
        serviceManager.webApps().stopNetworkTrace(resourceGroupName, name);
    }

    public Response<Void> stopNetworkTraceWithResponse(Context context) {
        return serviceManager.webApps().stopNetworkTraceWithResponse(resourceGroupName, name, context);
    }

    public void syncRepository() {
        serviceManager.webApps().syncRepository(resourceGroupName, name);
    }

    public Response<Void> syncRepositoryWithResponse(Context context) {
        return serviceManager.webApps().syncRepositoryWithResponse(resourceGroupName, name, context);
    }

    public void syncFunctionTriggers() {
        serviceManager.webApps().syncFunctionTriggers(resourceGroupName, name);
    }

    public Response<Void> syncFunctionTriggersWithResponse(Context context) {
        return serviceManager.webApps().syncFunctionTriggersWithResponse(resourceGroupName, name, context);
    }

    public SiteImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SiteImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SiteImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public SiteImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateSiteEnvelope.withIdentity(identity);
            return this;
        }
    }

    public SiteImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateSiteEnvelope.withEnabled(enabled);
            return this;
        }
    }

    public SiteImpl withHostnameSslStates(List<HostnameSslState> hostnameSslStates) {
        if (isInCreateMode()) {
            this.innerModel().withHostnameSslStates(hostnameSslStates);
            return this;
        } else {
            this.updateSiteEnvelope.withHostnameSslStates(hostnameSslStates);
            return this;
        }
    }

    public SiteImpl withServerFarmId(String serverFarmId) {
        if (isInCreateMode()) {
            this.innerModel().withServerFarmId(serverFarmId);
            return this;
        } else {
            this.updateSiteEnvelope.withServerFarmId(serverFarmId);
            return this;
        }
    }

    public SiteImpl withReserved(Boolean reserved) {
        this.innerModel().withReserved(reserved);
        return this;
    }

    public SiteImpl withIsXenon(Boolean isXenon) {
        this.innerModel().withIsXenon(isXenon);
        return this;
    }

    public SiteImpl withHyperV(Boolean hyperV) {
        this.innerModel().withHyperV(hyperV);
        return this;
    }

    public SiteImpl withSiteConfig(SiteConfigInner siteConfig) {
        if (isInCreateMode()) {
            this.innerModel().withSiteConfig(siteConfig);
            return this;
        } else {
            this.updateSiteEnvelope.withSiteConfig(siteConfig);
            return this;
        }
    }

    public SiteImpl withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        if (isInCreateMode()) {
            this.innerModel().withScmSiteAlsoStopped(scmSiteAlsoStopped);
            return this;
        } else {
            this.updateSiteEnvelope.withScmSiteAlsoStopped(scmSiteAlsoStopped);
            return this;
        }
    }

    public SiteImpl withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.innerModel().withHostingEnvironmentProfile(hostingEnvironmentProfile);
        return this;
    }

    public SiteImpl withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withClientAffinityEnabled(clientAffinityEnabled);
            return this;
        } else {
            this.updateSiteEnvelope.withClientAffinityEnabled(clientAffinityEnabled);
            return this;
        }
    }

    public SiteImpl withClientCertEnabled(Boolean clientCertEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withClientCertEnabled(clientCertEnabled);
            return this;
        } else {
            this.updateSiteEnvelope.withClientCertEnabled(clientCertEnabled);
            return this;
        }
    }

    public SiteImpl withClientCertExclusionPaths(String clientCertExclusionPaths) {
        if (isInCreateMode()) {
            this.innerModel().withClientCertExclusionPaths(clientCertExclusionPaths);
            return this;
        } else {
            this.updateSiteEnvelope.withClientCertExclusionPaths(clientCertExclusionPaths);
            return this;
        }
    }

    public SiteImpl withHostNamesDisabled(Boolean hostNamesDisabled) {
        if (isInCreateMode()) {
            this.innerModel().withHostNamesDisabled(hostNamesDisabled);
            return this;
        } else {
            this.updateSiteEnvelope.withHostNamesDisabled(hostNamesDisabled);
            return this;
        }
    }

    public SiteImpl withContainerSize(Integer containerSize) {
        if (isInCreateMode()) {
            this.innerModel().withContainerSize(containerSize);
            return this;
        } else {
            this.updateSiteEnvelope.withContainerSize(containerSize);
            return this;
        }
    }

    public SiteImpl withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        if (isInCreateMode()) {
            this.innerModel().withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
            return this;
        } else {
            this.updateSiteEnvelope.withDailyMemoryTimeQuota(dailyMemoryTimeQuota);
            return this;
        }
    }

    public SiteImpl withCloningInfo(CloningInfo cloningInfo) {
        this.innerModel().withCloningInfo(cloningInfo);
        return this;
    }

    public SiteImpl withHttpsOnly(Boolean httpsOnly) {
        if (isInCreateMode()) {
            this.innerModel().withHttpsOnly(httpsOnly);
            return this;
        } else {
            this.updateSiteEnvelope.withHttpsOnly(httpsOnly);
            return this;
        }
    }

    public SiteImpl withRedundancyMode(RedundancyMode redundancyMode) {
        if (isInCreateMode()) {
            this.innerModel().withRedundancyMode(redundancyMode);
            return this;
        } else {
            this.updateSiteEnvelope.withRedundancyMode(redundancyMode);
            return this;
        }
    }

    public SiteImpl withGeoDistributions(List<GeoDistribution> geoDistributions) {
        if (isInCreateMode()) {
            this.innerModel().withGeoDistributions(geoDistributions);
            return this;
        } else {
            this.updateSiteEnvelope.withGeoDistributions(geoDistributions);
            return this;
        }
    }

    public SiteImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateSiteEnvelope.withKind(kind);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
