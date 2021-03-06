// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProbeProtocol;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A load balancer probe. */
@JsonFlatten
@Fluent
public class ProbeInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProbeInner.class);

    /*
     * The name of the resource that is unique within the set of probes used by
     * the load balancer. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The load balancer rules that use this probe.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * The protocol of the end point. If 'Tcp' is specified, a received ACK is
     * required for the probe to be successful. If 'Http' or 'Https' is
     * specified, a 200 OK response from the specifies URI is required for the
     * probe to be successful.
     */
    @JsonProperty(value = "properties.protocol")
    private ProbeProtocol protocol;

    /*
     * The port for communicating the probe. Possible values range from 1 to
     * 65535, inclusive.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /*
     * The interval, in seconds, for how frequently to probe the endpoint for
     * health status. Typically, the interval is slightly less than half the
     * allocated timeout period (in seconds) which allows two full probes
     * before taking the instance out of rotation. The default value is 15, the
     * minimum value is 5.
     */
    @JsonProperty(value = "properties.intervalInSeconds")
    private Integer intervalInSeconds;

    /*
     * The number of probes where if no response, will result in stopping
     * further traffic from being delivered to the endpoint. This values allows
     * endpoints to be taken out of rotation faster or slower than the typical
     * times used in Azure.
     */
    @JsonProperty(value = "properties.numberOfProbes")
    private Integer numberOfProbes;

    /*
     * The URI used for requesting health status from the VM. Path is required
     * if a protocol is set to http. Otherwise, it is not allowed. There is no
     * default value.
     */
    @JsonProperty(value = "properties.requestPath")
    private String requestPath;

    /*
     * The provisioning state of the probe resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the set of probes used by the load
     * balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of probes used by the load
     * balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withName(String name) {
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
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the loadBalancingRules property: The load balancer rules that use this probe.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the protocol property: The protocol of the end point. If 'Tcp' is specified, a received ACK is required for
     * the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is
     * required for the probe to be successful.
     *
     * @return the protocol value.
     */
    public ProbeProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol of the end point. If 'Tcp' is specified, a received ACK is required for
     * the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is
     * required for the probe to be successful.
     *
     * @param protocol the protocol value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withProtocol(ProbeProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @param port the port value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The interval, in seconds, for how frequently to probe the endpoint for health
     * status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows
     * two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The interval, in seconds, for how frequently to probe the endpoint for health
     * status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows
     * two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the numberOfProbes property: The number of probes where if no response, will result in stopping further
     * traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or
     * slower than the typical times used in Azure.
     *
     * @return the numberOfProbes value.
     */
    public Integer numberOfProbes() {
        return this.numberOfProbes;
    }

    /**
     * Set the numberOfProbes property: The number of probes where if no response, will result in stopping further
     * traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or
     * slower than the typical times used in Azure.
     *
     * @param numberOfProbes the numberOfProbes value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withNumberOfProbes(Integer numberOfProbes) {
        this.numberOfProbes = numberOfProbes;
        return this;
    }

    /**
     * Get the requestPath property: The URI used for requesting health status from the VM. Path is required if a
     * protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @return the requestPath value.
     */
    public String requestPath() {
        return this.requestPath;
    }

    /**
     * Set the requestPath property: The URI used for requesting health status from the VM. Path is required if a
     * protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @param requestPath the requestPath value to set.
     * @return the ProbeInner object itself.
     */
    public ProbeInner withRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the probe resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ProbeInner withId(String id) {
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
