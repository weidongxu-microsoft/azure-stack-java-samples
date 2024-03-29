// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute;

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
import com.azure.resourcemanager.hybrid.compute.fluent.ComputeManagementClient;
import com.azure.resourcemanager.hybrid.compute.implementation.AvailabilitySetsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.ComputeManagementClientBuilder;
import com.azure.resourcemanager.hybrid.compute.implementation.DedicatedHostGroupsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.DedicatedHostsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.DiskEncryptionSetsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.DisksImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.ImagesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.LogAnalyticsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.OperationsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.ProximityPlacementGroupsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.SnapshotsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.SshPublicKeysImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.UsagesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineExtensionImagesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineExtensionsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineImagesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineScaleSetExtensionsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineScaleSetRollingUpgradesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineScaleSetVMExtensionsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineScaleSetVMsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineScaleSetsImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachineSizesImpl;
import com.azure.resourcemanager.hybrid.compute.implementation.VirtualMachinesImpl;
import com.azure.resourcemanager.hybrid.compute.models.AvailabilitySets;
import com.azure.resourcemanager.hybrid.compute.models.DedicatedHostGroups;
import com.azure.resourcemanager.hybrid.compute.models.DedicatedHosts;
import com.azure.resourcemanager.hybrid.compute.models.DiskEncryptionSets;
import com.azure.resourcemanager.hybrid.compute.models.Disks;
import com.azure.resourcemanager.hybrid.compute.models.Images;
import com.azure.resourcemanager.hybrid.compute.models.LogAnalytics;
import com.azure.resourcemanager.hybrid.compute.models.Operations;
import com.azure.resourcemanager.hybrid.compute.models.ProximityPlacementGroups;
import com.azure.resourcemanager.hybrid.compute.models.Snapshots;
import com.azure.resourcemanager.hybrid.compute.models.SshPublicKeys;
import com.azure.resourcemanager.hybrid.compute.models.Usages;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineExtensionImages;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineExtensions;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineImages;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetExtensions;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetRollingUpgrades;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetVMExtensions;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetVMs;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSets;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineSizes;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachines;
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

    private Usages usages;

    private VirtualMachines virtualMachines;

    private VirtualMachineSizes virtualMachineSizes;

    private Images images;

    private VirtualMachineScaleSets virtualMachineScaleSets;

    private VirtualMachineScaleSetExtensions virtualMachineScaleSetExtensions;

    private VirtualMachineScaleSetRollingUpgrades virtualMachineScaleSetRollingUpgrades;

    private VirtualMachineScaleSetVMExtensions virtualMachineScaleSetVMExtensions;

    private VirtualMachineScaleSetVMs virtualMachineScaleSetVMs;

    private LogAnalytics logAnalytics;

    private Disks disks;

    private Snapshots snapshots;

    private DiskEncryptionSets diskEncryptionSets;

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
                .append("com.azure.resourcemanager.azurestack.compute")
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
            policies.addAll(this.policies);
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

    /** @return Resource collection API of VirtualMachineScaleSets. */
    public VirtualMachineScaleSets virtualMachineScaleSets() {
        if (this.virtualMachineScaleSets == null) {
            this.virtualMachineScaleSets =
                new VirtualMachineScaleSetsImpl(clientObject.getVirtualMachineScaleSets(), this);
        }
        return virtualMachineScaleSets;
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

    /**
     * @return Wrapped service client ComputeManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public ComputeManagementClient serviceClient() {
        return this.clientObject;
    }
}
