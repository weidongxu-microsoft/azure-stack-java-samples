// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.compute.fluent.models.SnapshotInner;
import com.azure.resourcemanager.azurestack.compute.models.CreationData;
import com.azure.resourcemanager.azurestack.compute.models.Encryption;
import com.azure.resourcemanager.azurestack.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.azurestack.compute.models.HyperVGeneration;
import com.azure.resourcemanager.azurestack.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.azurestack.compute.models.Snapshot;
import com.azure.resourcemanager.azurestack.compute.models.SnapshotSku;
import com.azure.resourcemanager.azurestack.compute.models.SnapshotUpdate;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class SnapshotImpl implements Snapshot, Snapshot.Definition, Snapshot.Update {
    private SnapshotInner innerObject;

    private final com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager;

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

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public SnapshotSku sku() {
        return this.innerModel().sku();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public CreationData creationData() {
        return this.innerModel().creationData();
    }

    public Integer diskSizeGB() {
        return this.innerModel().diskSizeGB();
    }

    public Long diskSizeBytes() {
        return this.innerModel().diskSizeBytes();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerModel().encryptionSettingsCollection();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean incremental() {
        return this.innerModel().incremental();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SnapshotInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String snapshotName;

    private SnapshotUpdate updateSnapshot;

    public SnapshotImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Snapshot create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .createOrUpdate(resourceGroupName, snapshotName, this.innerModel(), Context.NONE);
        return this;
    }

    public Snapshot create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .createOrUpdate(resourceGroupName, snapshotName, this.innerModel(), context);
        return this;
    }

    SnapshotImpl(String name, com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerObject = new SnapshotInner();
        this.serviceManager = serviceManager;
        this.snapshotName = name;
    }

    public SnapshotImpl update() {
        this.updateSnapshot = new SnapshotUpdate();
        return this;
    }

    public Snapshot apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .update(resourceGroupName, snapshotName, updateSnapshot, Context.NONE);
        return this;
    }

    public Snapshot apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .update(resourceGroupName, snapshotName, updateSnapshot, context);
        return this;
    }

    SnapshotImpl(
        SnapshotInner innerObject, com.azure.resourcemanager.azurestack.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.snapshotName = Utils.getValueFromIdByName(innerObject.id(), "snapshots");
    }

    public Snapshot refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .getByResourceGroupWithResponse(resourceGroupName, snapshotName, Context.NONE)
                .getValue();
        return this;
    }

    public Snapshot refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSnapshots()
                .getByResourceGroupWithResponse(resourceGroupName, snapshotName, context)
                .getValue();
        return this;
    }

    public SnapshotImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SnapshotImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SnapshotImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateSnapshot.withTags(tags);
            return this;
        }
    }

    public SnapshotImpl withSku(SnapshotSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateSnapshot.withSku(sku);
            return this;
        }
    }

    public SnapshotImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.innerModel().withOsType(osType);
            return this;
        } else {
            this.updateSnapshot.withOsType(osType);
            return this;
        }
    }

    public SnapshotImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.innerModel().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    public SnapshotImpl withCreationData(CreationData creationData) {
        this.innerModel().withCreationData(creationData);
        return this;
    }

    public SnapshotImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.innerModel().withDiskSizeGB(diskSizeGB);
            return this;
        } else {
            this.updateSnapshot.withDiskSizeGB(diskSizeGB);
            return this;
        }
    }

    public SnapshotImpl withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionSettingsCollection(encryptionSettingsCollection);
            return this;
        } else {
            this.updateSnapshot.withEncryptionSettingsCollection(encryptionSettingsCollection);
            return this;
        }
    }

    public SnapshotImpl withIncremental(Boolean incremental) {
        this.innerModel().withIncremental(incremental);
        return this;
    }

    public SnapshotImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateSnapshot.withEncryption(encryption);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}