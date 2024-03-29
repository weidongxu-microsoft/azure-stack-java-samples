// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.compute.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineInstanceViewInner;
import com.azure.resourcemanager.hybrid.compute.fluent.models.VirtualMachineUpdateInner;
import com.azure.resourcemanager.hybrid.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.hybrid.compute.models.BillingProfile;
import com.azure.resourcemanager.hybrid.compute.models.DiagnosticsProfile;
import com.azure.resourcemanager.hybrid.compute.models.HardwareProfile;
import com.azure.resourcemanager.hybrid.compute.models.InstanceViewTypes;
import com.azure.resourcemanager.hybrid.compute.models.NetworkProfile;
import com.azure.resourcemanager.hybrid.compute.models.OSProfile;
import com.azure.resourcemanager.hybrid.compute.models.Plan;
import com.azure.resourcemanager.hybrid.compute.models.SecurityProfile;
import com.azure.resourcemanager.hybrid.compute.models.StorageProfile;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachine;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineExtension;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineIdentity;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachineInstanceView;
import com.azure.resourcemanager.hybrid.compute.models.VirtualMachinePriorityTypes;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualMachineImpl implements VirtualMachine, VirtualMachine.Definition, VirtualMachine.Update {
    private VirtualMachineInner innerObject;

    private final com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtensionInner> inner = this.innerModel().resources();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineExtensionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineIdentity identity() {
        return this.innerModel().identity();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public SubResource virtualMachineScaleSet() {
        return this.innerModel().virtualMachineScaleSet();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public VirtualMachinePriorityTypes priority() {
        return this.innerModel().priority();
    }

    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.innerModel().evictionPolicy();
    }

    public BillingProfile billingProfile() {
        return this.innerModel().billingProfile();
    }

    public SubResource host() {
        return this.innerModel().host();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public String extensionsTimeBudget() {
        return this.innerModel().extensionsTimeBudget();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualMachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmName;

    private VirtualMachineUpdateInner updateParameters;

    public VirtualMachineImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualMachine create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, vmName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachine create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .createOrUpdate(resourceGroupName, vmName, this.innerModel(), context);
        return this;
    }

    VirtualMachineImpl(String name, com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineInner();
        this.serviceManager = serviceManager;
        this.vmName = name;
    }

    public VirtualMachineImpl update() {
        this.updateParameters = new VirtualMachineUpdateInner();
        return this;
    }

    public VirtualMachine apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .update(resourceGroupName, vmName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualMachine apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .update(resourceGroupName, vmName, updateParameters, context);
        return this;
    }

    VirtualMachineImpl(
        VirtualMachineInner innerObject, com.azure.resourcemanager.hybrid.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachines");
    }

    public VirtualMachine refresh() {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getByResourceGroupWithResponse(resourceGroupName, vmName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachine refresh(Context context) {
        InstanceViewTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachines()
                .getByResourceGroupWithResponse(resourceGroupName, vmName, localExpand, context)
                .getValue();
        return this;
    }

    public VirtualMachineImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.innerModel().withPlan(plan);
            return this;
        } else {
            this.updateParameters.withPlan(plan);
            return this;
        }
    }

    public VirtualMachineImpl withIdentity(VirtualMachineIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public VirtualMachineImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.innerModel().withZones(zones);
            return this;
        } else {
            this.updateParameters.withZones(zones);
            return this;
        }
    }

    public VirtualMachineImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        if (isInCreateMode()) {
            this.innerModel().withHardwareProfile(hardwareProfile);
            return this;
        } else {
            this.updateParameters.withHardwareProfile(hardwareProfile);
            return this;
        }
    }

    public VirtualMachineImpl withStorageProfile(StorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.innerModel().withStorageProfile(storageProfile);
            return this;
        } else {
            this.updateParameters.withStorageProfile(storageProfile);
            return this;
        }
    }

    public VirtualMachineImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalCapabilities(additionalCapabilities);
            return this;
        } else {
            this.updateParameters.withAdditionalCapabilities(additionalCapabilities);
            return this;
        }
    }

    public VirtualMachineImpl withOsProfile(OSProfile osProfile) {
        if (isInCreateMode()) {
            this.innerModel().withOsProfile(osProfile);
            return this;
        } else {
            this.updateParameters.withOsProfile(osProfile);
            return this;
        }
    }

    public VirtualMachineImpl withNetworkProfile(NetworkProfile networkProfile) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkProfile(networkProfile);
            return this;
        } else {
            this.updateParameters.withNetworkProfile(networkProfile);
            return this;
        }
    }

    public VirtualMachineImpl withSecurityProfile(SecurityProfile securityProfile) {
        if (isInCreateMode()) {
            this.innerModel().withSecurityProfile(securityProfile);
            return this;
        } else {
            this.updateParameters.withSecurityProfile(securityProfile);
            return this;
        }
    }

    public VirtualMachineImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (isInCreateMode()) {
            this.innerModel().withDiagnosticsProfile(diagnosticsProfile);
            return this;
        } else {
            this.updateParameters.withDiagnosticsProfile(diagnosticsProfile);
            return this;
        }
    }

    public VirtualMachineImpl withAvailabilitySet(SubResource availabilitySet) {
        if (isInCreateMode()) {
            this.innerModel().withAvailabilitySet(availabilitySet);
            return this;
        } else {
            this.updateParameters.withAvailabilitySet(availabilitySet);
            return this;
        }
    }

    public VirtualMachineImpl withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualMachineScaleSet(virtualMachineScaleSet);
            return this;
        } else {
            this.updateParameters.withVirtualMachineScaleSet(virtualMachineScaleSet);
            return this;
        }
    }

    public VirtualMachineImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    public VirtualMachineImpl withPriority(VirtualMachinePriorityTypes priority) {
        if (isInCreateMode()) {
            this.innerModel().withPriority(priority);
            return this;
        } else {
            this.updateParameters.withPriority(priority);
            return this;
        }
    }

    public VirtualMachineImpl withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withEvictionPolicy(evictionPolicy);
            return this;
        } else {
            this.updateParameters.withEvictionPolicy(evictionPolicy);
            return this;
        }
    }

    public VirtualMachineImpl withBillingProfile(BillingProfile billingProfile) {
        if (isInCreateMode()) {
            this.innerModel().withBillingProfile(billingProfile);
            return this;
        } else {
            this.updateParameters.withBillingProfile(billingProfile);
            return this;
        }
    }

    public VirtualMachineImpl withHost(SubResource host) {
        if (isInCreateMode()) {
            this.innerModel().withHost(host);
            return this;
        } else {
            this.updateParameters.withHost(host);
            return this;
        }
    }

    public VirtualMachineImpl withHostGroup(SubResource hostGroup) {
        if (isInCreateMode()) {
            this.innerModel().withHostGroup(hostGroup);
            return this;
        } else {
            this.updateParameters.withHostGroup(hostGroup);
            return this;
        }
    }

    public VirtualMachineImpl withLicenseType(String licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    public VirtualMachineImpl withExtensionsTimeBudget(String extensionsTimeBudget) {
        if (isInCreateMode()) {
            this.innerModel().withExtensionsTimeBudget(extensionsTimeBudget);
            return this;
        } else {
            this.updateParameters.withExtensionsTimeBudget(extensionsTimeBudget);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
