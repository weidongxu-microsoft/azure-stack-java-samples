// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a Virtual Network subnet that is useable for private site access. */
@Fluent
public final class PrivateAccessSubnet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateAccessSubnet.class);

    /*
     * The name of the subnet.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The key (ID) of the subnet.
     */
    @JsonProperty(value = "key")
    private Integer key;

    /**
     * Get the name property: The name of the subnet.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the subnet.
     *
     * @param name the name value to set.
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key property: The key (ID) of the subnet.
     *
     * @return the key value.
     */
    public Integer key() {
        return this.key;
    }

    /**
     * Set the key property: The key (ID) of the subnet.
     *
     * @param key the key value to set.
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withKey(Integer key) {
        this.key = key;
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
