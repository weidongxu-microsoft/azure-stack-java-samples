// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.ComputeManagementClient;
import com.azure.resourcemanager.compute.generated.implementation.AvailabilitySetsImpl;
import com.azure.resourcemanager.compute.generated.implementation.ComputeManagementClientBuilder;
import com.azure.resourcemanager.compute.generated.implementation.DedicatedHostGroupsImpl;
import com.azure.resourcemanager.compute.generated.implementation.DedicatedHostsImpl;
import com.azure.resourcemanager.compute.generated.implementation.DiskAccessesImpl;
import com.azure.resourcemanager.compute.generated.implementation.DiskEncryptionSetsImpl;
import com.azure.resourcemanager.compute.generated.implementation.DiskRestorePointsImpl;
import com.azure.resourcemanager.compute.generated.implementation.DisksImpl;
import com.azure.resourcemanager.compute.generated.implementation.GalleriesImpl;
import com.azure.resourcemanager.compute.generated.implementation.GalleryApplicationVersionsImpl;
import com.azure.resourcemanager.compute.generated.implementation.GalleryApplicationsImpl;
import com.azure.resourcemanager.compute.generated.implementation.GalleryImageVersionsImpl;
import com.azure.resourcemanager.compute.generated.implementation.GalleryImagesImpl;
import com.azure.resourcemanager.compute.generated.implementation.ImagesImpl;
import com.azure.resourcemanager.compute.generated.implementation.LogAnalyticsImpl;
import com.azure.resourcemanager.compute.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.compute.generated.implementation.ProximityPlacementGroupsImpl;
import com.azure.resourcemanager.compute.generated.implementation.ResourceSkusImpl;
import com.azure.resourcemanager.compute.generated.implementation.SnapshotsImpl;
import com.azure.resourcemanager.compute.generated.implementation.SshPublicKeysImpl;
import com.azure.resourcemanager.compute.generated.implementation.UsagesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineExtensionImagesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineExtensionsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineImagesEdgeZonesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineImagesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineRunCommandsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetExtensionsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetRollingUpgradesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetVMExtensionsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetVMRunCommandsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetVMsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineScaleSetsImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachineSizesImpl;
import com.azure.resourcemanager.compute.generated.implementation.VirtualMachinesImpl;
import com.azure.resourcemanager.compute.generated.models.AvailabilitySets;
import com.azure.resourcemanager.compute.generated.models.DedicatedHostGroups;
import com.azure.resourcemanager.compute.generated.models.DedicatedHosts;
import com.azure.resourcemanager.compute.generated.models.DiskAccesses;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSets;
import com.azure.resourcemanager.compute.generated.models.DiskRestorePoints;
import com.azure.resourcemanager.compute.generated.models.Disks;
import com.azure.resourcemanager.compute.generated.models.Galleries;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersions;
import com.azure.resourcemanager.compute.generated.models.GalleryApplications;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersions;
import com.azure.resourcemanager.compute.generated.models.GalleryImages;
import com.azure.resourcemanager.compute.generated.models.Images;
import com.azure.resourcemanager.compute.generated.models.LogAnalytics;
import com.azure.resourcemanager.compute.generated.models.Operations;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroups;
import com.azure.resourcemanager.compute.generated.models.ResourceSkus;
import com.azure.resourcemanager.compute.generated.models.Snapshots;
import com.azure.resourcemanager.compute.generated.models.SshPublicKeys;
import com.azure.resourcemanager.compute.generated.models.Usages;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionImages;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImages;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImagesEdgeZones;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommands;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtensions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetRollingUpgrades;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMExtensions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMRunCommands;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMs;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSets;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSizes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachines;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to ComputeManager. Compute Client. */
public final class ComputeManager {
    private Operations operations;

    private AvailabilitySets availabilitySets;

    private ProximityPlacementGroups proximityPlacementGroups;

    private DedicatedHostGroups dedicatedHostGroups;

    private DedicatedHosts dedicatedHosts;

    private SshPublicKeys sshPublicKeys;

    private VirtualMachineExtensionImages virtualMachineExtensionImages;

    private VirtualMachineExtensions virtualMachineExtensions;

    private VirtualMachineImages virtualMachineImages;

    private VirtualMachineImagesEdgeZones virtualMachineImagesEdgeZones;

    private Usages usages;

    private VirtualMachines virtualMachines;

    private VirtualMachineScaleSets virtualMachineScaleSets;

    private VirtualMachineSizes virtualMachineSizes;

    private Images images;

    private VirtualMachineScaleSetExtensions virtualMachineScaleSetExtensions;

    private VirtualMachineScaleSetRollingUpgrades virtualMachineScaleSetRollingUpgrades;

    private VirtualMachineScaleSetVMExtensions virtualMachineScaleSetVMExtensions;

    private VirtualMachineScaleSetVMs virtualMachineScaleSetVMs;

    private LogAnalytics logAnalytics;

    private VirtualMachineRunCommands virtualMachineRunCommands;

    private VirtualMachineScaleSetVMRunCommands virtualMachineScaleSetVMRunCommands;

    private ResourceSkus resourceSkus;

    private Disks disks;

    private Snapshots snapshots;

    private DiskEncryptionSets diskEncryptionSets;

    private DiskAccesses diskAccesses;

    private DiskRestorePoints diskRestorePoints;

    private Galleries galleries;

    private GalleryImages galleryImages;

    private GalleryImageVersions galleryImageVersions;

    private GalleryApplications galleryApplications;

    private GalleryApplicationVersions galleryApplicationVersions;

    private final ComputeManagementClient clientObject;

    private ComputeManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ComputeManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Compute service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Compute service API instance.
     */
    public static ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create ComputeManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ComputeManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Compute service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Compute service API instance.
         */
        public ComputeManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.compute.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new ComputeManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of AvailabilitySets. */
    public AvailabilitySets availabilitySets() {
        if (this.availabilitySets == null) {
            this.availabilitySets = new AvailabilitySetsImpl(clientObject.getAvailabilitySets(), this);
        }
        return availabilitySets;
    }

    /** @return Resource collection API of ProximityPlacementGroups. */
    public ProximityPlacementGroups proximityPlacementGroups() {
        if (this.proximityPlacementGroups == null) {
            this.proximityPlacementGroups =
                new ProximityPlacementGroupsImpl(clientObject.getProximityPlacementGroups(), this);
        }
        return proximityPlacementGroups;
    }

    /** @return Resource collection API of DedicatedHostGroups. */
    public DedicatedHostGroups dedicatedHostGroups() {
        if (this.dedicatedHostGroups == null) {
            this.dedicatedHostGroups = new DedicatedHostGroupsImpl(clientObject.getDedicatedHostGroups(), this);
        }
        return dedicatedHostGroups;
    }

    /** @return Resource collection API of DedicatedHosts. */
    public DedicatedHosts dedicatedHosts() {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new DedicatedHostsImpl(clientObject.getDedicatedHosts(), this);
        }
        return dedicatedHosts;
    }

    /** @return Resource collection API of SshPublicKeys. */
    public SshPublicKeys sshPublicKeys() {
        if (this.sshPublicKeys == null) {
            this.sshPublicKeys = new SshPublicKeysImpl(clientObject.getSshPublicKeys(), this);
        }
        return sshPublicKeys;
    }

    /** @return Resource collection API of VirtualMachineExtensionImages. */
    public VirtualMachineExtensionImages virtualMachineExtensionImages() {
        if (this.virtualMachineExtensionImages == null) {
            this.virtualMachineExtensionImages =
                new VirtualMachineExtensionImagesImpl(clientObject.getVirtualMachineExtensionImages(), this);
        }
        return virtualMachineExtensionImages;
    }

    /** @return Resource collection API of VirtualMachineExtensions. */
    public VirtualMachineExtensions virtualMachineExtensions() {
        if (this.virtualMachineExtensions == null) {
            this.virtualMachineExtensions =
                new VirtualMachineExtensionsImpl(clientObject.getVirtualMachineExtensions(), this);
        }
        return virtualMachineExtensions;
    }

    /** @return Resource collection API of VirtualMachineImages. */
    public VirtualMachineImages virtualMachineImages() {
        if (this.virtualMachineImages == null) {
            this.virtualMachineImages = new VirtualMachineImagesImpl(clientObject.getVirtualMachineImages(), this);
        }
        return virtualMachineImages;
    }

    /** @return Resource collection API of VirtualMachineImagesEdgeZones. */
    public VirtualMachineImagesEdgeZones virtualMachineImagesEdgeZones() {
        if (this.virtualMachineImagesEdgeZones == null) {
            this.virtualMachineImagesEdgeZones =
                new VirtualMachineImagesEdgeZonesImpl(clientObject.getVirtualMachineImagesEdgeZones(), this);
        }
        return virtualMachineImagesEdgeZones;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of VirtualMachines. */
    public VirtualMachines virtualMachines() {
        if (this.virtualMachines == null) {
            this.virtualMachines = new VirtualMachinesImpl(clientObject.getVirtualMachines(), this);
        }
        return virtualMachines;
    }

    /** @return Resource collection API of VirtualMachineScaleSets. */
    public VirtualMachineScaleSets virtualMachineScaleSets() {
        if (this.virtualMachineScaleSets == null) {
            this.virtualMachineScaleSets =
                new VirtualMachineScaleSetsImpl(clientObject.getVirtualMachineScaleSets(), this);
        }
        return virtualMachineScaleSets;
    }

    /** @return Resource collection API of VirtualMachineSizes. */
    public VirtualMachineSizes virtualMachineSizes() {
        if (this.virtualMachineSizes == null) {
            this.virtualMachineSizes = new VirtualMachineSizesImpl(clientObject.getVirtualMachineSizes(), this);
        }
        return virtualMachineSizes;
    }

    /** @return Resource collection API of Images. */
    public Images images() {
        if (this.images == null) {
            this.images = new ImagesImpl(clientObject.getImages(), this);
        }
        return images;
    }

    /** @return Resource collection API of VirtualMachineScaleSetExtensions. */
    public VirtualMachineScaleSetExtensions virtualMachineScaleSetExtensions() {
        if (this.virtualMachineScaleSetExtensions == null) {
            this.virtualMachineScaleSetExtensions =
                new VirtualMachineScaleSetExtensionsImpl(clientObject.getVirtualMachineScaleSetExtensions(), this);
        }
        return virtualMachineScaleSetExtensions;
    }

    /** @return Resource collection API of VirtualMachineScaleSetRollingUpgrades. */
    public VirtualMachineScaleSetRollingUpgrades virtualMachineScaleSetRollingUpgrades() {
        if (this.virtualMachineScaleSetRollingUpgrades == null) {
            this.virtualMachineScaleSetRollingUpgrades =
                new VirtualMachineScaleSetRollingUpgradesImpl(
                    clientObject.getVirtualMachineScaleSetRollingUpgrades(), this);
        }
        return virtualMachineScaleSetRollingUpgrades;
    }

    /** @return Resource collection API of VirtualMachineScaleSetVMExtensions. */
    public VirtualMachineScaleSetVMExtensions virtualMachineScaleSetVMExtensions() {
        if (this.virtualMachineScaleSetVMExtensions == null) {
            this.virtualMachineScaleSetVMExtensions =
                new VirtualMachineScaleSetVMExtensionsImpl(clientObject.getVirtualMachineScaleSetVMExtensions(), this);
        }
        return virtualMachineScaleSetVMExtensions;
    }

    /** @return Resource collection API of VirtualMachineScaleSetVMs. */
    public VirtualMachineScaleSetVMs virtualMachineScaleSetVMs() {
        if (this.virtualMachineScaleSetVMs == null) {
            this.virtualMachineScaleSetVMs =
                new VirtualMachineScaleSetVMsImpl(clientObject.getVirtualMachineScaleSetVMs(), this);
        }
        return virtualMachineScaleSetVMs;
    }

    /** @return Resource collection API of LogAnalytics. */
    public LogAnalytics logAnalytics() {
        if (this.logAnalytics == null) {
            this.logAnalytics = new LogAnalyticsImpl(clientObject.getLogAnalytics(), this);
        }
        return logAnalytics;
    }

    /** @return Resource collection API of VirtualMachineRunCommands. */
    public VirtualMachineRunCommands virtualMachineRunCommands() {
        if (this.virtualMachineRunCommands == null) {
            this.virtualMachineRunCommands =
                new VirtualMachineRunCommandsImpl(clientObject.getVirtualMachineRunCommands(), this);
        }
        return virtualMachineRunCommands;
    }

    /** @return Resource collection API of VirtualMachineScaleSetVMRunCommands. */
    public VirtualMachineScaleSetVMRunCommands virtualMachineScaleSetVMRunCommands() {
        if (this.virtualMachineScaleSetVMRunCommands == null) {
            this.virtualMachineScaleSetVMRunCommands =
                new VirtualMachineScaleSetVMRunCommandsImpl(
                    clientObject.getVirtualMachineScaleSetVMRunCommands(), this);
        }
        return virtualMachineScaleSetVMRunCommands;
    }

    /** @return Resource collection API of ResourceSkus. */
    public ResourceSkus resourceSkus() {
        if (this.resourceSkus == null) {
            this.resourceSkus = new ResourceSkusImpl(clientObject.getResourceSkus(), this);
        }
        return resourceSkus;
    }

    /** @return Resource collection API of Disks. */
    public Disks disks() {
        if (this.disks == null) {
            this.disks = new DisksImpl(clientObject.getDisks(), this);
        }
        return disks;
    }

    /** @return Resource collection API of Snapshots. */
    public Snapshots snapshots() {
        if (this.snapshots == null) {
            this.snapshots = new SnapshotsImpl(clientObject.getSnapshots(), this);
        }
        return snapshots;
    }

    /** @return Resource collection API of DiskEncryptionSets. */
    public DiskEncryptionSets diskEncryptionSets() {
        if (this.diskEncryptionSets == null) {
            this.diskEncryptionSets = new DiskEncryptionSetsImpl(clientObject.getDiskEncryptionSets(), this);
        }
        return diskEncryptionSets;
    }

    /** @return Resource collection API of DiskAccesses. */
    public DiskAccesses diskAccesses() {
        if (this.diskAccesses == null) {
            this.diskAccesses = new DiskAccessesImpl(clientObject.getDiskAccesses(), this);
        }
        return diskAccesses;
    }

    /** @return Resource collection API of DiskRestorePoints. */
    public DiskRestorePoints diskRestorePoints() {
        if (this.diskRestorePoints == null) {
            this.diskRestorePoints = new DiskRestorePointsImpl(clientObject.getDiskRestorePoints(), this);
        }
        return diskRestorePoints;
    }

    /** @return Resource collection API of Galleries. */
    public Galleries galleries() {
        if (this.galleries == null) {
            this.galleries = new GalleriesImpl(clientObject.getGalleries(), this);
        }
        return galleries;
    }

    /** @return Resource collection API of GalleryImages. */
    public GalleryImages galleryImages() {
        if (this.galleryImages == null) {
            this.galleryImages = new GalleryImagesImpl(clientObject.getGalleryImages(), this);
        }
        return galleryImages;
    }

    /** @return Resource collection API of GalleryImageVersions. */
    public GalleryImageVersions galleryImageVersions() {
        if (this.galleryImageVersions == null) {
            this.galleryImageVersions = new GalleryImageVersionsImpl(clientObject.getGalleryImageVersions(), this);
        }
        return galleryImageVersions;
    }

    /** @return Resource collection API of GalleryApplications. */
    public GalleryApplications galleryApplications() {
        if (this.galleryApplications == null) {
            this.galleryApplications = new GalleryApplicationsImpl(clientObject.getGalleryApplications(), this);
        }
        return galleryApplications;
    }

    /** @return Resource collection API of GalleryApplicationVersions. */
    public GalleryApplicationVersions galleryApplicationVersions() {
        if (this.galleryApplicationVersions == null) {
            this.galleryApplicationVersions =
                new GalleryApplicationVersionsImpl(clientObject.getGalleryApplicationVersions(), this);
        }
        return galleryApplicationVersions;
    }

    /**
     * @return Wrapped service client ComputeManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public ComputeManagementClient serviceClient() {
        return this.clientObject;
    }
}
