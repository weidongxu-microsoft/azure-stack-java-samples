// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.implementation;

import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineScaleSetInstanceViewInner;
import com.azure.resourcemanager.hybrid.compute.models.InstanceViewStatus;
import com.azure.resourcemanager.hybrid.compute.models.OrchestrationServiceSummary;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetInstanceView;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetInstanceViewStatusesSummary;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetVMExtensionsSummary;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineScaleSetInstanceViewImpl implements VirtualMachineScaleSetInstanceView {
    private VirtualMachineScaleSetInstanceViewInner innerObject;

    private final com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager;

    VirtualMachineScaleSetInstanceViewImpl(
        VirtualMachineScaleSetInstanceViewInner innerObject,
        com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine() {
        return this.innerModel().virtualMachine();
    }

    public List<VirtualMachineScaleSetVMExtensionsSummary> extensions() {
        List<VirtualMachineScaleSetVMExtensionsSummary> inner = this.innerModel().extensions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<InstanceViewStatus> statuses() {
        List<InstanceViewStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<OrchestrationServiceSummary> orchestrationServices() {
        List<OrchestrationServiceSummary> inner = this.innerModel().orchestrationServices();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineScaleSetInstanceViewInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
