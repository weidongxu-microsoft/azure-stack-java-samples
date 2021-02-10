// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner;
import java.util.List;

/** An immutable client-side representation of VirtualMachineExtensionsListResult. */
public interface VirtualMachineExtensionsListResult {
    /**
     * Gets the value property: The list of extensions.
     *
     * @return the value value.
     */
    List<VirtualMachineExtension> value();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineExtensionsListResultInner innerModel();
}