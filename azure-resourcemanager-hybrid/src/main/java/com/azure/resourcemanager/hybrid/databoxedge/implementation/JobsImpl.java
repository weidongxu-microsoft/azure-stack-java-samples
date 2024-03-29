// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.databoxedge.fluent.JobsClient;
import com.azure.resourcemanager.hybrid.databoxedge.fluent.models.JobInner;
import com.azure.resourcemanager.hybrid.databoxedge.models.Job;
import com.azure.resourcemanager.hybrid.databoxedge.models.Jobs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class JobsImpl implements Jobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager serviceManager;

    public JobsImpl(
        JobsClient innerClient, com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Job get(String deviceName, String name, String resourceGroupName) {
        JobInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Job> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<JobInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
