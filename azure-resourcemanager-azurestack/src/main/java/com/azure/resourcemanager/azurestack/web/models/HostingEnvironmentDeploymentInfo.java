// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information needed to create resources on an App Service Environment. */
@Fluent
public final class HostingEnvironmentDeploymentInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostingEnvironmentDeploymentInfo.class);

    /*
     * Name of the App Service Environment.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Location of the App Service Environment.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the name property: Name of the App Service Environment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the App Service Environment.
     *
     * @param name the name value to set.
     * @return the HostingEnvironmentDeploymentInfo object itself.
     */
    public HostingEnvironmentDeploymentInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: Location of the App Service Environment.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the App Service Environment.
     *
     * @param location the location value to set.
     * @return the HostingEnvironmentDeploymentInfo object itself.
     */
    public HostingEnvironmentDeploymentInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
