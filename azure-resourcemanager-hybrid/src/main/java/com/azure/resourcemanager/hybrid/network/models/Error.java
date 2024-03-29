// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Error model. */
@Fluent
public final class Error {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Error.class);

    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<ErrorDetails> details;

    /*
     * The innerError property.
     */
    @JsonProperty(value = "innerError")
    private String innerError;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the Error object itself.
     */
    public Error withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public List<ErrorDetails> details() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error withDetails(List<ErrorDetails> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError property: The innerError property.
     *
     * @return the innerError value.
     */
    public String innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: The innerError property.
     *
     * @param innerError the innerError value to set.
     * @return the Error object itself.
     */
    public Error withInnerError(String innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
