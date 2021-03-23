// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.resources.models;

import com.azure.resourcemanager.azurestack.resources.fluent.models.DeploymentExportResultInner;

/** An immutable client-side representation of DeploymentExportResult. */
public interface DeploymentExportResult {
    /**
     * Gets the template property: The template content.
     *
     * @return the template value.
     */
    Object template();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.resources.fluent.models.DeploymentExportResultInner object.
     *
     * @return the inner object.
     */
    DeploymentExportResultInner innerModel();
}
