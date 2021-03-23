// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.azurestack.databoxedge.models.AzureContainerDataFormat;
import com.azure.resourcemanager.azurestack.databoxedge.models.ContainerStatus;
import com.azure.resourcemanager.azurestack.databoxedge.models.RefreshDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a container on the Data Box Edge/Gateway device. */
@JsonFlatten
@Fluent
public class ContainerInner extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerInner.class);

    /*
     * Current status of the container.
     */
    @JsonProperty(value = "properties.containerStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerStatus containerStatus;

    /*
     * DataFormat for Container
     */
    @JsonProperty(value = "properties.dataFormat", required = true)
    private AzureContainerDataFormat dataFormat;

    /*
     * Details of the refresh job on this container.
     */
    @JsonProperty(value = "properties.refreshDetails", access = JsonProperty.Access.WRITE_ONLY)
    private RefreshDetails refreshDetails;

    /*
     * The UTC time when container got created.
     */
    @JsonProperty(value = "properties.createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /**
     * Get the containerStatus property: Current status of the container.
     *
     * @return the containerStatus value.
     */
    public ContainerStatus containerStatus() {
        return this.containerStatus;
    }

    /**
     * Get the dataFormat property: DataFormat for Container.
     *
     * @return the dataFormat value.
     */
    public AzureContainerDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set the dataFormat property: DataFormat for Container.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the ContainerInner object itself.
     */
    public ContainerInner withDataFormat(AzureContainerDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * Get the refreshDetails property: Details of the refresh job on this container.
     *
     * @return the refreshDetails value.
     */
    public RefreshDetails refreshDetails() {
        return this.refreshDetails;
    }

    /**
     * Get the createdDateTime property: The UTC time when container got created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataFormat in model ContainerInner"));
        }
        if (refreshDetails() != null) {
            refreshDetails().validate();
        }
    }
}
