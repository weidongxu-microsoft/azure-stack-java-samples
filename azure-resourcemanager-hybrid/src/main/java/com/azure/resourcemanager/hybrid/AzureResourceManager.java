// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.hybrid;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.AppServiceManager;
import com.azure.resourcemanager.hybrid.commerce.UsageManager;
import com.azure.resourcemanager.hybrid.compute.ComputeManager;
import com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.hybrid.eventhubs.EventHubsManager;
import com.azure.resourcemanager.hybrid.iothub.IotHubManager;
import com.azure.resourcemanager.hybrid.keyvault.KeyVaultManager;
import com.azure.resourcemanager.hybrid.monitor.MonitorManager;
import com.azure.resourcemanager.hybrid.network.NetworkManager;
import com.azure.resourcemanager.hybrid.resources.ResourceManager;
import com.azure.resourcemanager.hybrid.storage.StorageManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AzureResourceManager {

    private final String subscriptionId;
    private final String tenantId;

    /**
     * Authenticate to Azure using an Azure credential object.
     *
     * @param credential the credential object
     * @param profile the profile to use
     * @return the authenticated Azure client
     */
    public static AzureResourceManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /** @return an interface allow configurations on the client. */
    public static Configurable configure() {
        return new Configurable();
    }

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
        public AzureResourceManager authenticate(TokenCredential credential, AzureProfile profile) {
            return new AzureResourceManager(credential, profile, this);
        }
    }

    public String subscriptionId() {
        return this.subscriptionId;
    }

    public String tenantId() {
        return this.tenantId;
    }

    private final UsageManager usageManager;

    private final ComputeManager computeManager;

    private final DataBoxEdgeManager dataBoxEdgeManager;

    private final IotHubManager iotHubManager;

    private final EventHubsManager eventHubsManager;

    private final MonitorManager monitorManager;

    private final KeyVaultManager keyVaultManager;

    private final NetworkManager networkManager;

    private final ResourceManager resourceManager;

    private final StorageManager storageManager;

    private final AppServiceManager appServiceManager;

    /** @return the {@link UsageManager}. */
    public UsageManager usage() {
        return usageManager;
    }

    /** @return the {@link ComputeManager}. */
    public ComputeManager compute() {
        return computeManager;
    }

    /** @return the {@link DataBoxEdgeManager}. */
    public DataBoxEdgeManager dataBoxEdge() {
        return dataBoxEdgeManager;
    }

    /** @return the {@link IotHubManager}. */
    public IotHubManager iotHub() {
        return iotHubManager;
    }

    /** @return the {@link EventHubsManager}. */
    public EventHubsManager eventHubs() {
        return eventHubsManager;
    }

    /** @return the {@link MonitorManager}. */
    public MonitorManager monitor() {
        return monitorManager;
    }

    /** @return the {@link KeyVaultManager}. */
    public KeyVaultManager keyVault() {
        return keyVaultManager;
    }

    /** @return the {@link NetworkManager}. */
    public NetworkManager network() {
        return networkManager;
    }

    /** @return the {@link ResourceManager}. */
    public ResourceManager resource() {
        return resourceManager;
    }

    /** @return the {@link StorageManager}. */
    public StorageManager storage() {
        return storageManager;
    }

    /** @return the {@link AppServiceManager}. */
    public AppServiceManager appService() {
        return appServiceManager;
    }

    private AzureResourceManager(TokenCredential credential, AzureProfile profile, Configurable configurable) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");

        UsageManager.Configurable usageManagerConfigurable = UsageManager.configure();
        ComputeManager.Configurable computeManagerConfigurable = ComputeManager.configure();
        DataBoxEdgeManager.Configurable dataBoxEdgeManagerConfigurable = DataBoxEdgeManager.configure();
        IotHubManager.Configurable iotHubManagerConfigurable = IotHubManager.configure();
        EventHubsManager.Configurable eventHubsManagerConfigurable = EventHubsManager.configure();
        MonitorManager.Configurable monitorManagerConfigurable = MonitorManager.configure();
        KeyVaultManager.Configurable keyVaultManagerConfigurable = KeyVaultManager.configure();
        NetworkManager.Configurable networkManagerConfigurable = NetworkManager.configure();
        ResourceManager.Configurable resourceManagerConfigurable = ResourceManager.configure();
        StorageManager.Configurable storageManagerConfigurable = StorageManager.configure();
        AppServiceManager.Configurable appServiceManagerConfigurable = AppServiceManager.configure();

        HttpClient httpClient = configurable.httpClient;
        if (httpClient == null) {
            httpClient = HttpClient.createDefault();
        }
        if (httpClient != null) {
            usageManagerConfigurable.withHttpClient(httpClient);
            computeManagerConfigurable.withHttpClient(httpClient);
            dataBoxEdgeManagerConfigurable.withHttpClient(httpClient);
            iotHubManagerConfigurable.withHttpClient(httpClient);
            eventHubsManagerConfigurable.withHttpClient(httpClient);
            monitorManagerConfigurable.withHttpClient(httpClient);
            keyVaultManagerConfigurable.withHttpClient(httpClient);
            networkManagerConfigurable.withHttpClient(httpClient);
            resourceManagerConfigurable.withHttpClient(httpClient);
            storageManagerConfigurable.withHttpClient(httpClient);
            appServiceManagerConfigurable.withHttpClient(httpClient);
        }
        if (configurable.httpLogOptions != null) {
            usageManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            computeManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            dataBoxEdgeManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            iotHubManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            eventHubsManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            monitorManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            keyVaultManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            networkManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            resourceManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            storageManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            appServiceManagerConfigurable.withLogOptions(configurable.httpLogOptions);
        }
        if (configurable.retryPolicy != null) {
            usageManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            computeManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            dataBoxEdgeManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            iotHubManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            eventHubsManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            monitorManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            keyVaultManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            networkManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            resourceManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            storageManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            appServiceManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
        }
        for (HttpPipelinePolicy policy : configurable.policies) {
            usageManagerConfigurable.withPolicy(policy);
            computeManagerConfigurable.withPolicy(policy);
            dataBoxEdgeManagerConfigurable.withPolicy(policy);
            iotHubManagerConfigurable.withPolicy(policy);
            eventHubsManagerConfigurable.withPolicy(policy);
            monitorManagerConfigurable.withPolicy(policy);
            keyVaultManagerConfigurable.withPolicy(policy);
            networkManagerConfigurable.withPolicy(policy);
            resourceManagerConfigurable.withPolicy(policy);
            storageManagerConfigurable.withPolicy(policy);
            appServiceManagerConfigurable.withPolicy(policy);
        }
        if (configurable.defaultPollInterval != null) {
            usageManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            computeManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            dataBoxEdgeManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            iotHubManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            eventHubsManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            monitorManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            keyVaultManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            networkManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            resourceManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            storageManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            appServiceManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
        }

        this.usageManager = usageManagerConfigurable.authenticate(credential, profile);
        this.computeManager = computeManagerConfigurable.authenticate(credential, profile);
        this.dataBoxEdgeManager = dataBoxEdgeManagerConfigurable.authenticate(credential, profile);
        this.iotHubManager = iotHubManagerConfigurable.authenticate(credential, profile);
        this.eventHubsManager = eventHubsManagerConfigurable.authenticate(credential, profile);
        this.monitorManager = monitorManagerConfigurable.authenticate(credential, profile);
        this.keyVaultManager = keyVaultManagerConfigurable.authenticate(credential, profile);
        this.networkManager = networkManagerConfigurable.authenticate(credential, profile);
        this.resourceManager = resourceManagerConfigurable.authenticate(credential, profile);
        this.storageManager = storageManagerConfigurable.authenticate(credential, profile);
        this.appServiceManager = appServiceManagerConfigurable.authenticate(credential, profile);

        this.subscriptionId = profile.getSubscriptionId();
        this.tenantId = profile.getTenantId();
    }
}
