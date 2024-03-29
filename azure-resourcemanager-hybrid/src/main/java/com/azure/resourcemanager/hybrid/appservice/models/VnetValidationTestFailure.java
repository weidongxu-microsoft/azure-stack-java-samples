// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class that describes a test that failed during NSG and UDR validation. */
@JsonFlatten
@Fluent
public class VnetValidationTestFailure extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetValidationTestFailure.class);

    /*
     * The name of the test that failed.
     */
    @JsonProperty(value = "properties.testName")
    private String testName;

    /*
     * The details of what caused the failure, e.g. the blocking rule name,
     * etc.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /**
     * Get the testName property: The name of the test that failed.
     *
     * @return the testName value.
     */
    public String testName() {
        return this.testName;
    }

    /**
     * Set the testName property: The name of the test that failed.
     *
     * @param testName the testName value to set.
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withTestName(String testName) {
        this.testName = testName;
        return this;
    }

    /**
     * Get the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: The details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @param details the details value to set.
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withDetails(String details) {
        this.details = details;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VnetValidationTestFailure withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
