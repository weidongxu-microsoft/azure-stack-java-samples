// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureContainerDataFormat. */
public final class AzureContainerDataFormat extends ExpandableStringEnum<AzureContainerDataFormat> {
    /** Static value BlockBlob for AzureContainerDataFormat. */
    public static final AzureContainerDataFormat BLOCK_BLOB = fromString("BlockBlob");

    /** Static value PageBlob for AzureContainerDataFormat. */
    public static final AzureContainerDataFormat PAGE_BLOB = fromString("PageBlob");

    /** Static value AzureFile for AzureContainerDataFormat. */
    public static final AzureContainerDataFormat AZURE_FILE = fromString("AzureFile");

    /**
     * Creates or finds a AzureContainerDataFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureContainerDataFormat.
     */
    @JsonCreator
    public static AzureContainerDataFormat fromString(String name) {
        return fromString(name, AzureContainerDataFormat.class);
    }

    /** @return known AzureContainerDataFormat values. */
    public static Collection<AzureContainerDataFormat> values() {
        return values(AzureContainerDataFormat.class);
    }
}