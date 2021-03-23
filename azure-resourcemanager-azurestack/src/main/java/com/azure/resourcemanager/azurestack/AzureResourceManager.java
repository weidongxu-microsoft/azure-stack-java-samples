// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.azurestack;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.compute.ComputeManager;
import com.azure.resourcemanager.azurestack.iothub.IotHubManager;
import com.azure.resourcemanager.azurestack.network.NetworkManager;
import com.azure.resourcemanager.azurestack.resources.ResourceManager;
import com.azure.resourcemanager.azurestack.storage.StorageManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AzureResourceManager {

    private final ResourceManager resourceManager;
    private final StorageManager storageManager;
    private final ComputeManager computeManager;
    private final NetworkManager networkManager;
    private final IotHubManager iotHubManager;

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

    public ResourceManager resources() {
        return resourceManager;
    }

    public StorageManager storage() {
        return storageManager;
    }

    public ComputeManager compute() {
        return computeManager;
    }

    public NetworkManager network() {
        return networkManager;
    }

    public IotHubManager iotHub() {
        return iotHubManager;
    }

    private AzureResourceManager(TokenCredential credential, AzureProfile profile, Configurable configurable) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");

        ResourceManager.Configurable resourceManagerConfigurable = ResourceManager.configure();
        StorageManager.Configurable storageManagerConfigurable = StorageManager.configure();
        ComputeManager.Configurable computeManagerConfigurable = ComputeManager.configure();
        NetworkManager.Configurable networkManagerConfigurable = NetworkManager.configure();
        IotHubManager.Configurable iotHubManagerConfigurable = IotHubManager.configure();

        HttpClient httpClient = configurable.httpClient;
        if (httpClient == null) {
            httpClient = HttpClient.createDefault();
        }
        if (httpClient != null) {
            resourceManagerConfigurable.withHttpClient(httpClient);
            storageManagerConfigurable.withHttpClient(httpClient);
            computeManagerConfigurable.withHttpClient(httpClient);
            networkManagerConfigurable.withHttpClient(httpClient);
            iotHubManagerConfigurable.withHttpClient(httpClient);
        }
        if (configurable.httpLogOptions != null) {
            resourceManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            storageManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            computeManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            networkManagerConfigurable.withLogOptions(configurable.httpLogOptions);
            iotHubManagerConfigurable.withLogOptions(configurable.httpLogOptions);
        }
        if (configurable.retryPolicy != null) {
            resourceManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            storageManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            computeManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            networkManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
            iotHubManagerConfigurable.withRetryPolicy(configurable.retryPolicy);
        }
        for (HttpPipelinePolicy policy : configurable.policies) {
            resourceManagerConfigurable.withPolicy(policy);
            storageManagerConfigurable.withPolicy(policy);
            computeManagerConfigurable.withPolicy(policy);
            networkManagerConfigurable.withPolicy(policy);
            iotHubManagerConfigurable.withPolicy(policy);
        }
        if (configurable.defaultPollInterval != null) {
            resourceManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            storageManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            computeManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            networkManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
            iotHubManagerConfigurable.withDefaultPollInterval(configurable.defaultPollInterval);
        }

        this.resourceManager = resourceManagerConfigurable
                .authenticate(credential, profile);
        this.storageManager = storageManagerConfigurable
                .authenticate(credential, profile);
        this.computeManager = computeManagerConfigurable
                .authenticate(credential, profile);
        this.networkManager = networkManagerConfigurable
                .authenticate(credential, profile);
        this.iotHubManager = iotHubManagerConfigurable
                .authenticate(credential, profile);

        this.subscriptionId = profile.getSubscriptionId();
        this.tenantId = profile.getTenantId();
    }
}
