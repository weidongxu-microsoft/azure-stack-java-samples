// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An NS record. */
@Fluent
public final class NsRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NsRecord.class);

    /*
     * The name server name for this NS record.
     */
    @JsonProperty(value = "nsdname")
    private String nsdname;

    /**
     * Get the nsdname property: The name server name for this NS record.
     *
     * @return the nsdname value.
     */
    public String nsdname() {
        return this.nsdname;
    }

    /**
     * Set the nsdname property: The name server name for this NS record.
     *
     * @param nsdname the nsdname value to set.
     * @return the NsRecord object itself.
     */
    public NsRecord withNsdname(String nsdname) {
        this.nsdname = nsdname;
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
