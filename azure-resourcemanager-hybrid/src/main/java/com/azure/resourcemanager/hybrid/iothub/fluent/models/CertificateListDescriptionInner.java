// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON-serialized array of Certificate objects. */
@Fluent
public final class CertificateListDescriptionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateListDescriptionInner.class);

    /*
     * The array of Certificate objects.
     */
    @JsonProperty(value = "value")
    private List<CertificateDescriptionInner> value;

    /**
     * Get the value property: The array of Certificate objects.
     *
     * @return the value value.
     */
    public List<CertificateDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of Certificate objects.
     *
     * @param value the value value to set.
     * @return the CertificateListDescriptionInner object itself.
     */
    public CertificateListDescriptionInner withValue(List<CertificateDescriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}