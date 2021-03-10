// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.RetrieveBootDiagnosticsDataResultInner;
import com.azure.resourcemanager.compute.generated.models.RetrieveBootDiagnosticsDataResult;

public final class RetrieveBootDiagnosticsDataResultImpl implements RetrieveBootDiagnosticsDataResult {
    private RetrieveBootDiagnosticsDataResultInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    RetrieveBootDiagnosticsDataResultImpl(
        RetrieveBootDiagnosticsDataResultInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String consoleScreenshotBlobUri() {
        return this.innerModel().consoleScreenshotBlobUri();
    }

    public String serialConsoleLogBlobUri() {
        return this.innerModel().serialConsoleLogBlobUri();
    }

    public RetrieveBootDiagnosticsDataResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
