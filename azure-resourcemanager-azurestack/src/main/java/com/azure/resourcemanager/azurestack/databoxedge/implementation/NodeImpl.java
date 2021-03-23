// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.implementation;

import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.NodeInner;
import com.azure.resourcemanager.azurestack.databoxedge.models.Node;
import com.azure.resourcemanager.azurestack.databoxedge.models.NodeStatus;

public final class NodeImpl implements Node {
    private NodeInner innerObject;

    private final com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager;

    NodeImpl(
        NodeInner innerObject, com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public NodeStatus nodeStatus() {
        return this.innerModel().nodeStatus();
    }

    public String nodeChassisSerialNumber() {
        return this.innerModel().nodeChassisSerialNumber();
    }

    public String nodeSerialNumber() {
        return this.innerModel().nodeSerialNumber();
    }

    public String nodeDisplayName() {
        return this.innerModel().nodeDisplayName();
    }

    public String nodeFriendlySoftwareVersion() {
        return this.innerModel().nodeFriendlySoftwareVersion();
    }

    public String nodeHcsVersion() {
        return this.innerModel().nodeHcsVersion();
    }

    public String nodeInstanceId() {
        return this.innerModel().nodeInstanceId();
    }

    public NodeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
