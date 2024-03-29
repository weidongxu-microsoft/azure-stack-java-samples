// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** User credentials used for publishing activity. */
@JsonFlatten
@Fluent
public class DeploymentInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentInner.class);

    /*
     * Deployment status.
     */
    @JsonProperty(value = "properties.status")
    private Integer status;

    /*
     * Details about deployment status.
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /*
     * Who authored the deployment.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /*
     * Who performed the deployment.
     */
    @JsonProperty(value = "properties.deployer")
    private String deployer;

    /*
     * Author email.
     */
    @JsonProperty(value = "properties.author_email")
    private String authorEmail;

    /*
     * Start time.
     */
    @JsonProperty(value = "properties.start_time")
    private OffsetDateTime startTime;

    /*
     * End time.
     */
    @JsonProperty(value = "properties.end_time")
    private OffsetDateTime endTime;

    /*
     * True if deployment is currently active, false if completed and null if
     * not started.
     */
    @JsonProperty(value = "properties.active")
    private Boolean active;

    /*
     * Details on deployment.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /**
     * Get the status property: Deployment status.
     *
     * @return the status value.
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the status property: Deployment status.
     *
     * @param status the status value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the message property: Details about deployment status.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Details about deployment status.
     *
     * @param message the message value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the author property: Who authored the deployment.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: Who authored the deployment.
     *
     * @param author the author value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the deployer property: Who performed the deployment.
     *
     * @return the deployer value.
     */
    public String deployer() {
        return this.deployer;
    }

    /**
     * Set the deployer property: Who performed the deployment.
     *
     * @param deployer the deployer value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withDeployer(String deployer) {
        this.deployer = deployer;
        return this;
    }

    /**
     * Get the authorEmail property: Author email.
     *
     * @return the authorEmail value.
     */
    public String authorEmail() {
        return this.authorEmail;
    }

    /**
     * Set the authorEmail property: Author email.
     *
     * @param authorEmail the authorEmail value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time.
     *
     * @param startTime the startTime value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time.
     *
     * @param endTime the endTime value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the active property: True if deployment is currently active, false if completed and null if not started.
     *
     * @return the active value.
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set the active property: True if deployment is currently active, false if completed and null if not started.
     *
     * @param active the active value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the details property: Details on deployment.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: Details on deployment.
     *
     * @param details the details value to set.
     * @return the DeploymentInner object itself.
     */
    public DeploymentInner withDetails(String details) {
        this.details = details;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DeploymentInner withKind(String kind) {
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
