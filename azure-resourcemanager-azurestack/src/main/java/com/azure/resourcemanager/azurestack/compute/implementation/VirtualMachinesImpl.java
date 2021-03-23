// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.compute.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.azurestack.compute.fluent.models.RetrieveBootDiagnosticsDataResultInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineAssessPatchesResultInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineCaptureResultInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineInstanceViewInner;
import com.azure.resourcemanager.azurestack.compute.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.azurestack.compute.models.InstanceViewTypes;
import com.azure.resourcemanager.azurestack.compute.models.RetrieveBootDiagnosticsDataResult;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachine;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineAssessPatchesResult;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineCaptureParameters;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineCaptureResult;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineInstanceView;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineReimageParameters;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineSize;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachines;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualMachinesImpl implements VirtualMachines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachinesImpl.class);

    private final VirtualMachinesClient innerClient;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

    public VirtualMachinesImpl(
        VirtualMachinesClient innerClient, com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VirtualMachine> listByLocation(String location) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByLocation(location);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> listByLocation(String location, Context context) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByLocation(location, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public VirtualMachineCaptureResult capture(
        String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters) {
        VirtualMachineCaptureResultInner inner = this.serviceClient().capture(resourceGroupName, vmName, parameters);
        if (inner != null) {
            return new VirtualMachineCaptureResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineCaptureResult capture(
        String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters, Context context) {
        VirtualMachineCaptureResultInner inner =
            this.serviceClient().capture(resourceGroupName, vmName, parameters, context);
        if (inner != null) {
            return new VirtualMachineCaptureResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmName, Boolean forceDeletion) {
        this.serviceClient().delete(resourceGroupName, vmName, forceDeletion);
    }

    public void delete(String resourceGroupName, String vmName) {
        this.serviceClient().delete(resourceGroupName, vmName);
    }

    public void delete(String resourceGroupName, String vmName, Boolean forceDeletion, Context context) {
        this.serviceClient().delete(resourceGroupName, vmName, forceDeletion, context);
    }

    public VirtualMachine getByResourceGroup(String resourceGroupName, String vmName) {
        VirtualMachineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vmName);
        if (inner != null) {
            return new VirtualMachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String vmName, InstanceViewTypes expand, Context context) {
        Response<VirtualMachineInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vmName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineInstanceView instanceView(String resourceGroupName, String vmName) {
        VirtualMachineInstanceViewInner inner = this.serviceClient().instanceView(resourceGroupName, vmName);
        if (inner != null) {
            return new VirtualMachineInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineInstanceView> instanceViewWithResponse(
        String resourceGroupName, String vmName, Context context) {
        Response<VirtualMachineInstanceViewInner> inner =
            this.serviceClient().instanceViewWithResponse(resourceGroupName, vmName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineInstanceViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void convertToManagedDisks(String resourceGroupName, String vmName) {
        this.serviceClient().convertToManagedDisks(resourceGroupName, vmName);
    }

    public void convertToManagedDisks(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().convertToManagedDisks(resourceGroupName, vmName, context);
    }

    public void deallocate(String resourceGroupName, String vmName) {
        this.serviceClient().deallocate(resourceGroupName, vmName);
    }

    public void deallocate(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().deallocate(resourceGroupName, vmName, context);
    }

    public void generalize(String resourceGroupName, String vmName) {
        this.serviceClient().generalize(resourceGroupName, vmName);
    }

    public Response<Void> generalizeWithResponse(String resourceGroupName, String vmName, Context context) {
        return this.serviceClient().generalizeWithResponse(resourceGroupName, vmName, context);
    }

    public PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> list() {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> list(String statusOnly, Context context) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().list(statusOnly, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String vmName) {
        PagedIterable<VirtualMachineSizeInner> inner =
            this.serviceClient().listAvailableSizes(resourceGroupName, vmName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(
        String resourceGroupName, String vmName, Context context) {
        PagedIterable<VirtualMachineSizeInner> inner =
            this.serviceClient().listAvailableSizes(resourceGroupName, vmName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public void powerOff(String resourceGroupName, String vmName, Boolean skipShutdown) {
        this.serviceClient().powerOff(resourceGroupName, vmName, skipShutdown);
    }

    public void powerOff(String resourceGroupName, String vmName) {
        this.serviceClient().powerOff(resourceGroupName, vmName);
    }

    public void powerOff(String resourceGroupName, String vmName, Boolean skipShutdown, Context context) {
        this.serviceClient().powerOff(resourceGroupName, vmName, skipShutdown, context);
    }

    public void reapply(String resourceGroupName, String vmName) {
        this.serviceClient().reapply(resourceGroupName, vmName);
    }

    public void reapply(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().reapply(resourceGroupName, vmName, context);
    }

    public void restart(String resourceGroupName, String vmName) {
        this.serviceClient().restart(resourceGroupName, vmName);
    }

    public void restart(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().restart(resourceGroupName, vmName, context);
    }

    public void start(String resourceGroupName, String vmName) {
        this.serviceClient().start(resourceGroupName, vmName);
    }

    public void start(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().start(resourceGroupName, vmName, context);
    }

    public void redeploy(String resourceGroupName, String vmName) {
        this.serviceClient().redeploy(resourceGroupName, vmName);
    }

    public void redeploy(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().redeploy(resourceGroupName, vmName, context);
    }

    public void reimage(String resourceGroupName, String vmName, VirtualMachineReimageParameters parameters) {
        this.serviceClient().reimage(resourceGroupName, vmName, parameters);
    }

    public void reimage(String resourceGroupName, String vmName) {
        this.serviceClient().reimage(resourceGroupName, vmName);
    }

    public void reimage(
        String resourceGroupName, String vmName, VirtualMachineReimageParameters parameters, Context context) {
        this.serviceClient().reimage(resourceGroupName, vmName, parameters, context);
    }

    public RetrieveBootDiagnosticsDataResult retrieveBootDiagnosticsData(String resourceGroupName, String vmName) {
        RetrieveBootDiagnosticsDataResultInner inner =
            this.serviceClient().retrieveBootDiagnosticsData(resourceGroupName, vmName);
        if (inner != null) {
            return new RetrieveBootDiagnosticsDataResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataWithResponse(
        String resourceGroupName, String vmName, Integer sasUriExpirationTimeInMinutes, Context context) {
        Response<RetrieveBootDiagnosticsDataResultInner> inner =
            this
                .serviceClient()
                .retrieveBootDiagnosticsDataWithResponse(
                    resourceGroupName, vmName, sasUriExpirationTimeInMinutes, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RetrieveBootDiagnosticsDataResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void performMaintenance(String resourceGroupName, String vmName) {
        this.serviceClient().performMaintenance(resourceGroupName, vmName);
    }

    public void performMaintenance(String resourceGroupName, String vmName, Context context) {
        this.serviceClient().performMaintenance(resourceGroupName, vmName, context);
    }

    public void simulateEviction(String resourceGroupName, String vmName) {
        this.serviceClient().simulateEviction(resourceGroupName, vmName);
    }

    public Response<Void> simulateEvictionWithResponse(String resourceGroupName, String vmName, Context context) {
        return this.serviceClient().simulateEvictionWithResponse(resourceGroupName, vmName, context);
    }

    public VirtualMachineAssessPatchesResult assessPatches(String resourceGroupName, String vmName) {
        VirtualMachineAssessPatchesResultInner inner = this.serviceClient().assessPatches(resourceGroupName, vmName);
        if (inner != null) {
            return new VirtualMachineAssessPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineAssessPatchesResult assessPatches(String resourceGroupName, String vmName, Context context) {
        VirtualMachineAssessPatchesResultInner inner =
            this.serviceClient().assessPatches(resourceGroupName, vmName, context);
        if (inner != null) {
            return new VirtualMachineAssessPatchesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        InstanceViewTypes localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, vmName, localExpand, Context.NONE).getValue();
    }

    public Response<VirtualMachine> getByIdWithResponse(String id, InstanceViewTypes expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vmName, expand, context);
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
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        Boolean localForceDeletion = null;
        this.delete(resourceGroupName, vmName, localForceDeletion, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean forceDeletion, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        this.delete(resourceGroupName, vmName, forceDeletion, context);
    }

    private VirtualMachinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineImpl define(String name) {
        return new VirtualMachineImpl(name, this.manager());
    }
}