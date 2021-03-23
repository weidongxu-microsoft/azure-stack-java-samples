// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A PTR record. */
@Fluent
public final class PtrRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PtrRecord.class);

    /*
     * The PTR target domain name for this PTR record.
     */
    @JsonProperty(value = "ptrdname")
    private String ptrdname;

    /**
     * Get the ptrdname property: The PTR target domain name for this PTR record.
     *
     * @return the ptrdname value.
     */
    public String ptrdname() {
        return this.ptrdname;
    }

    /**
     * Set the ptrdname property: The PTR target domain name for this PTR record.
     *
     * @param ptrdname the ptrdname value to set.
     * @return the PtrRecord object itself.
     */
    public PtrRecord withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
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
