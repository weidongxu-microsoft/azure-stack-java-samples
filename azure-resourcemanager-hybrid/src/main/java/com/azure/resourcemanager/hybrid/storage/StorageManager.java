// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.storage;

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
import com.azure.resourcemanager.hybrid.storage.fluent.StorageManagementClient;
import com.azure.resourcemanager.hybrid.storage.implementation.BlobInventoryPoliciesImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.EncryptionScopesImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.ManagementPoliciesImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.ObjectReplicationPoliciesOperationsImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.OperationsImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.SkusImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.hybrid.storage.implementation.StorageManagementClientBuilder;
import com.azure.resourcemanager.hybrid.storage.implementation.UsagesImpl;
import com.azure.resourcemanager.hybrid.storage.models.BlobInventoryPolicies;
import com.azure.resourcemanager.hybrid.storage.models.EncryptionScopes;
import com.azure.resourcemanager.hybrid.storage.models.ManagementPolicies;
import com.azure.resourcemanager.hybrid.storage.models.ObjectReplicationPoliciesOperations;
import com.azure.resourcemanager.hybrid.storage.models.Operations;
import com.azure.resourcemanager.hybrid.storage.models.PrivateEndpointConnections;
import com.azure.resourcemanager.hybrid.storage.models.PrivateLinkResources;
import com.azure.resourcemanager.hybrid.storage.models.Skus;
import com.azure.resourcemanager.hybrid.storage.models.StorageAccounts;
import com.azure.resourcemanager.hybrid.storage.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to StorageManager. The Azure Storage Management API. */
public final class StorageManager {
    private Operations operations;

    private Skus skus;

    private StorageAccounts storageAccounts;

    private Usages usages;

    private ManagementPolicies managementPolicies;

    private BlobInventoryPolicies blobInventoryPolicies;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations;

    private EncryptionScopes encryptionScopes;

    private final StorageManagementClient clientObject;

    private StorageManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new StorageManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Storage service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Storage service API instance.
     */
    public static StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create StorageManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new StorageManager.Configurable();
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
         * Creates an instance of Storage service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Storage service API instance.
         */
        public StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.azurestack.storage")
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
            return new StorageManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Skus. */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /** @return Resource collection API of StorageAccounts. */
    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(clientObject.getStorageAccounts(), this);
        }
        return storageAccounts;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of ManagementPolicies. */
    public ManagementPolicies managementPolicies() {
        if (this.managementPolicies == null) {
            this.managementPolicies = new ManagementPoliciesImpl(clientObject.getManagementPolicies(), this);
        }
        return managementPolicies;
    }

    /** @return Resource collection API of BlobInventoryPolicies. */
    public BlobInventoryPolicies blobInventoryPolicies() {
        if (this.blobInventoryPolicies == null) {
            this.blobInventoryPolicies = new BlobInventoryPoliciesImpl(clientObject.getBlobInventoryPolicies(), this);
        }
        return blobInventoryPolicies;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of ObjectReplicationPoliciesOperations. */
    public ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations() {
        if (this.objectReplicationPoliciesOperations == null) {
            this.objectReplicationPoliciesOperations =
                new ObjectReplicationPoliciesOperationsImpl(
                    clientObject.getObjectReplicationPoliciesOperations(), this);
        }
        return objectReplicationPoliciesOperations;
    }

    /** @return Resource collection API of EncryptionScopes. */
    public EncryptionScopes encryptionScopes() {
        if (this.encryptionScopes == null) {
            this.encryptionScopes = new EncryptionScopesImpl(clientObject.getEncryptionScopes(), this);
        }
        return encryptionScopes;
    }

    /**
     * @return Wrapped service client StorageManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public StorageManagementClient serviceClient() {
        return this.clientObject;
    }
}
