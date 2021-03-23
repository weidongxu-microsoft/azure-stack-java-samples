// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineScaleSetVMExtensionInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineScaleSetVMExtensionsListResultInner;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineScaleSetVMExtension;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineScaleSetVMExtensionsListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualMachineScaleSetVMExtensionsListResultImpl
    implements VirtualMachineScaleSetVMExtensionsListResult {
    private VirtualMachineScaleSetVMExtensionsListResultInner innerObject;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

    VirtualMachineScaleSetVMExtensionsListResultImpl(
        VirtualMachineScaleSetVMExtensionsListResultInner innerObject,
        com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<VirtualMachineScaleSetVMExtension> value() {
        List<VirtualMachineScaleSetVMExtensionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineScaleSetVMExtensionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineScaleSetVMExtensionsListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}