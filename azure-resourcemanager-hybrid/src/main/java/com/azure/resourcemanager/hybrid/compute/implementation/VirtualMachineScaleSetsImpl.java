// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybrid.compute.fluent.VirtualMachineScaleSetsClient;
import com.azure.resourcemanager.hybrid.compute.fluent.models.RecoveryWalkResponseInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.UpgradeOperationHistoricalStatusInfoInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineScaleSetInstanceViewInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineScaleSetSkuInner;
import com.azure.resourcemanager.hybrid.compute.models.OrchestrationServiceStateInput;
import com.azure.resourcemanager.hybrid.compute.models.RecoveryWalkResponse;
import com.azure.resourcemanager.hybrid.compute.models.UpgradeOperationHistoricalStatusInfo;
import com.azure.resourcemanager.hybrid.compute.models.VMScaleSetConvertToSinglePlacementGroupInput;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSet;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetInstanceView;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetReimageParameters;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetSku;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetVMInstanceIDs;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineScaleSets;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualMachineScaleSetsImpl implements VirtualMachineScaleSets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetsImpl.class);

    private final VirtualMachineScaleSetsClient innerClient;

    private final com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager;

    public VirtualMachineScaleSetsImpl(
        VirtualMachineScaleSetsClient innerClient,
        com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName);
    }

    public void delete(String resourceGroupName, String vmScaleSetName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, context);
    }

    public VirtualMachineScaleSet getByResourceGroup(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vmScaleSetName);
        if (inner != null) {
            return new VirtualMachineScaleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSet> getByResourceGroupWithResponse(
        String resourceGroupName, String vmScaleSetName, Context context) {
        Response<VirtualMachineScaleSetInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deallocate(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().deallocate(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void deallocate(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().deallocate(resourceGroupName, vmScaleSetName);
    }

    public void deallocate(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().deallocate(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void deleteInstances(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        this.serviceClient().deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void deleteInstances(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public VirtualMachineScaleSetInstanceView getInstanceView(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetInstanceViewInner inner =
            this.serviceClient().getInstanceView(resourceGroupName, vmScaleSetName);
        if (inner != null) {
            return new VirtualMachineScaleSetInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetInstanceView> getInstanceViewWithResponse(
        String resourceGroupName, String vmScaleSetName, Context context) {
        Response<VirtualMachineScaleSetInstanceViewInner> inner =
            this.serviceClient().getInstanceViewWithResponse(resourceGroupName, vmScaleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetInstanceViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineScaleSet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualMachineScaleSetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualMachineScaleSetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSet> list() {
        PagedIterable<VirtualMachineScaleSetInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSet> list(Context context) {
        PagedIterable<VirtualMachineScaleSetInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSetSku> listSkus(String resourceGroupName, String vmScaleSetName) {
        PagedIterable<VirtualMachineScaleSetSkuInner> inner =
            this.serviceClient().listSkus(resourceGroupName, vmScaleSetName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSetSku> listSkus(
        String resourceGroupName, String vmScaleSetName, Context context) {
        PagedIterable<VirtualMachineScaleSetSkuInner> inner =
            this.serviceClient().listSkus(resourceGroupName, vmScaleSetName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<UpgradeOperationHistoricalStatusInfo> getOSUpgradeHistory(
        String resourceGroupName, String vmScaleSetName) {
        PagedIterable<UpgradeOperationHistoricalStatusInfoInner> inner =
            this.serviceClient().getOSUpgradeHistory(resourceGroupName, vmScaleSetName);
        return Utils.mapPage(inner, inner1 -> new UpgradeOperationHistoricalStatusInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<UpgradeOperationHistoricalStatusInfo> getOSUpgradeHistory(
        String resourceGroupName, String vmScaleSetName, Context context) {
        PagedIterable<UpgradeOperationHistoricalStatusInfoInner> inner =
            this.serviceClient().getOSUpgradeHistory(resourceGroupName, vmScaleSetName, context);
        return Utils.mapPage(inner, inner1 -> new UpgradeOperationHistoricalStatusInfoImpl(inner1, this.manager()));
    }

    public void powerOff(
        String resourceGroupName,
        String vmScaleSetName,
        Boolean skipShutdown,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName, skipShutdown, vmInstanceIDs);
    }

    public void powerOff(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName);
    }

    public void powerOff(
        String resourceGroupName,
        String vmScaleSetName,
        Boolean skipShutdown,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().powerOff(resourceGroupName, vmScaleSetName, skipShutdown, vmInstanceIDs, context);
    }

    public void restart(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().restart(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void restart(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().restart(resourceGroupName, vmScaleSetName);
    }

    public void restart(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().restart(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void start(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().start(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void start(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().start(resourceGroupName, vmScaleSetName);
    }

    public void start(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().start(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void redeploy(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().redeploy(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void redeploy(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().redeploy(resourceGroupName, vmScaleSetName);
    }

    public void redeploy(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().redeploy(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void performMaintenance(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().performMaintenance(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void performMaintenance(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().performMaintenance(resourceGroupName, vmScaleSetName);
    }

    public void performMaintenance(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().performMaintenance(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void updateInstances(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        this.serviceClient().updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void updateInstances(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetReimageParameters vmScaleSetReimageInput) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName, vmScaleSetReimageInput);
    }

    public void reimage(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName);
    }

    public void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetReimageParameters vmScaleSetReimageInput,
        Context context) {
        this.serviceClient().reimage(resourceGroupName, vmScaleSetName, vmScaleSetReimageInput, context);
    }

    public void reimageAll(
        String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        this.serviceClient().reimageAll(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void reimageAll(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().reimageAll(resourceGroupName, vmScaleSetName);
    }

    public void reimageAll(
        String resourceGroupName,
        String vmScaleSetName,
        VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs,
        Context context) {
        this.serviceClient().reimageAll(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public RecoveryWalkResponse forceRecoveryServiceFabricPlatformUpdateDomainWalk(
        String resourceGroupName, String vmScaleSetName, int platformUpdateDomain) {
        RecoveryWalkResponseInner inner =
            this
                .serviceClient()
                .forceRecoveryServiceFabricPlatformUpdateDomainWalk(
                    resourceGroupName, vmScaleSetName, platformUpdateDomain);
        if (inner != null) {
            return new RecoveryWalkResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecoveryWalkResponse> forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
        String resourceGroupName, String vmScaleSetName, int platformUpdateDomain, Context context) {
        Response<RecoveryWalkResponseInner> inner =
            this
                .serviceClient()
                .forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
                    resourceGroupName, vmScaleSetName, platformUpdateDomain, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecoveryWalkResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void convertToSinglePlacementGroup(
        String resourceGroupName, String vmScaleSetName, VMScaleSetConvertToSinglePlacementGroupInput parameters) {
        this.serviceClient().convertToSinglePlacementGroup(resourceGroupName, vmScaleSetName, parameters);
    }

    public Response<Void> convertToSinglePlacementGroupWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        VMScaleSetConvertToSinglePlacementGroupInput parameters,
        Context context) {
        return this
            .serviceClient()
            .convertToSinglePlacementGroupWithResponse(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public void setOrchestrationServiceState(
        String resourceGroupName, String vmScaleSetName, OrchestrationServiceStateInput parameters) {
        this.serviceClient().setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters);
    }

    public void setOrchestrationServiceState(
        String resourceGroupName, String vmScaleSetName, OrchestrationServiceStateInput parameters, Context context) {
        this.serviceClient().setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public VirtualMachineScaleSet getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, Context.NONE).getValue();
    }

    public Response<VirtualMachineScaleSet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, context);
    }

    private VirtualMachineScaleSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybrid.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineScaleSetImpl define(String name) {
        return new VirtualMachineScaleSetImpl(name, this.manager());
    }
}
