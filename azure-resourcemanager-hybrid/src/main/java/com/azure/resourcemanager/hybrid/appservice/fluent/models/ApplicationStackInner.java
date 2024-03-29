// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.models.StackMajorVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application stack. */
@Fluent
public final class ApplicationStackInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationStackInner.class);

    /*
     * Application stack name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Application stack display name.
     */
    @JsonProperty(value = "display")
    private String display;

    /*
     * Application stack dependency.
     */
    @JsonProperty(value = "dependency")
    private String dependency;

    /*
     * List of major versions available.
     */
    @JsonProperty(value = "majorVersions")
    private List<StackMajorVersion> majorVersions;

    /*
     * List of frameworks associated with application stack.
     */
    @JsonProperty(value = "frameworks")
    private List<ApplicationStackInner> frameworks;

    /**
     * Get the name property: Application stack name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Application stack name.
     *
     * @param name the name value to set.
     * @return the ApplicationStackInner object itself.
     */
    public ApplicationStackInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Application stack display name.
     *
     * @return the display value.
     */
    public String display() {
        return this.display;
    }

    /**
     * Set the display property: Application stack display name.
     *
     * @param display the display value to set.
     * @return the ApplicationStackInner object itself.
     */
    public ApplicationStackInner withDisplay(String display) {
        this.display = display;
        return this;
    }

    /**
     * Get the dependency property: Application stack dependency.
     *
     * @return the dependency value.
     */
    public String dependency() {
        return this.dependency;
    }

    /**
     * Set the dependency property: Application stack dependency.
     *
     * @param dependency the dependency value to set.
     * @return the ApplicationStackInner object itself.
     */
    public ApplicationStackInner withDependency(String dependency) {
        this.dependency = dependency;
        return this;
    }

    /**
     * Get the majorVersions property: List of major versions available.
     *
     * @return the majorVersions value.
     */
    public List<StackMajorVersion> majorVersions() {
        return this.majorVersions;
    }

    /**
     * Set the majorVersions property: List of major versions available.
     *
     * @param majorVersions the majorVersions value to set.
     * @return the ApplicationStackInner object itself.
     */
    public ApplicationStackInner withMajorVersions(List<StackMajorVersion> majorVersions) {
        this.majorVersions = majorVersions;
        return this;
    }

    /**
     * Get the frameworks property: List of frameworks associated with application stack.
     *
     * @return the frameworks value.
     */
    public List<ApplicationStackInner> frameworks() {
        return this.frameworks;
    }

    /**
     * Set the frameworks property: List of frameworks associated with application stack.
     *
     * @param frameworks the frameworks value to set.
     * @return the ApplicationStackInner object itself.
     */
    public ApplicationStackInner withFrameworks(List<ApplicationStackInner> frameworks) {
        this.frameworks = frameworks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (majorVersions() != null) {
            majorVersions().forEach(e -> e.validate());
        }
        if (frameworks() != null) {
            frameworks().forEach(e -> e.validate());
        }
    }
}
