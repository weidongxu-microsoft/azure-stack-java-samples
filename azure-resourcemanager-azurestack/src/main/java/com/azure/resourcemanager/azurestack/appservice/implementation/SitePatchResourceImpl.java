// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.implementation;

import com.azure.resourcemanager.azurestack.appservice.fluent.models.SiteConfigInner;
import com.azure.resourcemanager.azurestack.appservice.fluent.models.SitePatchResourceInner;
import com.azure.resourcemanager.azurestack.appservice.models.CloningInfo;
import com.azure.resourcemanager.azurestack.appservice.models.GeoDistribution;
import com.azure.resourcemanager.azurestack.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.azurestack.appservice.models.HostnameSslState;
import com.azure.resourcemanager.azurestack.appservice.models.ManagedServiceIdentity;
import com.azure.resourcemanager.azurestack.appservice.models.RedundancyMode;
import com.azure.resourcemanager.azurestack.appservice.models.SiteAvailabilityState;
import com.azure.resourcemanager.azurestack.appservice.models.SiteConfig;
import com.azure.resourcemanager.azurestack.appservice.models.SitePatchResource;
import com.azure.resourcemanager.azurestack.appservice.models.SlotSwapStatus;
import com.azure.resourcemanager.azurestack.appservice.models.UsageState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class SitePatchResourceImpl implements SitePatchResource {
    private SitePatchResourceInner innerObject;

    private final com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager;

    SitePatchResourceImpl(
        SitePatchResourceInner innerObject, com.azure.resourcemanager.azurestack.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
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

    public SitePatchResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }
}