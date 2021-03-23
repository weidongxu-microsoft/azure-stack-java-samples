// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.DataBoxEdgeDeviceExtendedInfoInner;

/** An immutable client-side representation of DataBoxEdgeDeviceExtendedInfo. */
public interface DataBoxEdgeDeviceExtendedInfo {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the encryptionKeyThumbprint property: The digital signature of encrypted certificate.
     *
     * @return the encryptionKeyThumbprint value.
     */
    String encryptionKeyThumbprint();

    /**
     * Gets the encryptionKey property: The public part of the encryption certificate. Client uses this to encrypt any
     * secret.
     *
     * @return the encryptionKey value.
     */
    String encryptionKey();

    /**
     * Gets the resourceKey property: The Resource ID of the Resource.
     *
     * @return the resourceKey value.
     */
    String resourceKey();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.databoxedge.fluent.models.DataBoxEdgeDeviceExtendedInfoInner
     * object.
     *
     * @return the inner object.
     */
    DataBoxEdgeDeviceExtendedInfoInner innerModel();
}
