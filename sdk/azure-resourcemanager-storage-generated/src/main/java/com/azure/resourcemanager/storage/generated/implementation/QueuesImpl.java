// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.QueuesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.ListQueueInner;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageQueueInner;
import com.azure.resourcemanager.storage.generated.models.ListQueue;
import com.azure.resourcemanager.storage.generated.models.Queues;
import com.azure.resourcemanager.storage.generated.models.StorageQueue;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class QueuesImpl implements Queues {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueuesImpl.class);

    private final QueuesClient innerClient;

    private final StorageManager serviceManager;

    public QueuesImpl(QueuesClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public StorageQueue get(String resourceGroupName, String accountName, String queueName) {
        StorageQueueInner inner = this.serviceClient().get(resourceGroupName, accountName, queueName);
        if (inner != null) {
            return new StorageQueueImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageQueue> getWithResponse(
        String resourceGroupName, String accountName, String queueName, Context context) {
        Response<StorageQueueInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, queueName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageQueueImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String queueName) {
        this.serviceClient().delete(resourceGroupName, accountName, queueName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String queueName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, queueName, context);
    }

    public PagedIterable<ListQueue> list(String resourceGroupName, String accountName) {
        PagedIterable<ListQueueInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new ListQueueImpl(inner1, this.manager()));
    }

    public PagedIterable<ListQueue> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, Context context) {
        PagedIterable<ListQueueInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, maxpagesize, filter, context);
        return Utils.mapPage(inner, inner1 -> new ListQueueImpl(inner1, this.manager()));
    }

    public StorageQueue getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String queueName = Utils.getValueFromIdByName(id, "queues");
        if (queueName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queues'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, queueName, Context.NONE).getValue();
    }

    public Response<StorageQueue> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String queueName = Utils.getValueFromIdByName(id, "queues");
        if (queueName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queues'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, queueName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String queueName = Utils.getValueFromIdByName(id, "queues");
        if (queueName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queues'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, queueName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String queueName = Utils.getValueFromIdByName(id, "queues");
        if (queueName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queues'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, queueName, context);
    }

    private QueuesClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    public StorageQueueImpl define(String name) {
        return new StorageQueueImpl(name, this.manager());
    }
}