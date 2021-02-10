// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details the service to which the subnet is delegated. */
@JsonFlatten
@Fluent
public class Delegation extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Delegation.class);

    /*
     * The name of the resource that is unique within a subnet. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     */
    @JsonProperty(value = "properties.serviceName")
    private String serviceName;

    /*
     * The actions permitted to the service upon delegation.
     */
    @JsonProperty(value = "properties.actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actions;

    /*
     * The provisioning state of the service delegation resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a subnet. This name can be used to access
     * the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a subnet. This name can be used to access
     * the resource.
     *
     * @param name the name value to set.
     * @return the Delegation object itself.
     */
    public Delegation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @param serviceName the serviceName value to set.
     * @return the Delegation object itself.
     */
    public Delegation withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the actions property: The actions permitted to the service upon delegation.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service delegation resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public Delegation withId(String id) {
        super.withId(id);
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