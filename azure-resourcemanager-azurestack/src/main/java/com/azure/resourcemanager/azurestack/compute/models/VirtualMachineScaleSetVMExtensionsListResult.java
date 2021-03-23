// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.models;

import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineScaleSetVMExtensionsListResultInner;
import java.util.List;

/** An immutable client-side representation of VirtualMachineScaleSetVMExtensionsListResult. */
public interface VirtualMachineScaleSetVMExtensionsListResult {
    /**
     * Gets the value property: The list of VMSS VM extensions.
     *
     * @return the value value.
     */
    List<VirtualMachineScaleSetVMExtension> value();

    /**
     * Gets the inner
     * com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineScaleSetVMExtensionsListResultInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineScaleSetVMExtensionsListResultInner innerModel();
}
