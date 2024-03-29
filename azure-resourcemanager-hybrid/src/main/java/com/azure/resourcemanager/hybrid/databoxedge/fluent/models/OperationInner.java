// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.databoxedge.models.OperationDisplay;
import com.azure.resourcemanager.hybrid.databoxedge.models.ServiceSpecification;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operations. */
@JsonFlatten
@Fluent
public class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties displayed for the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Service specification.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get the name property: Name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the operation.
     *
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Properties displayed for the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Properties displayed for the operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the serviceSpecification property: Service specification.
     *
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: Service specification.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
