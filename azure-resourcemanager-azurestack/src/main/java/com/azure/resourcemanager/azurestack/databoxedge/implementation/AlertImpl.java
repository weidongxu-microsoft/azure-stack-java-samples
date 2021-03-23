// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.implementation;

import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.AlertInner;
import com.azure.resourcemanager.azurestack.databoxedge.models.Alert;
import com.azure.resourcemanager.azurestack.databoxedge.models.AlertErrorDetails;
import com.azure.resourcemanager.azurestack.databoxedge.models.AlertSeverity;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class AlertImpl implements Alert {
    private AlertInner innerObject;

    private final com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager;

    AlertImpl(
        AlertInner innerObject, com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager serviceManager) {
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

    public String title() {
        return this.innerModel().title();
    }

    public String alertType() {
        return this.innerModel().alertType();
    }

    public OffsetDateTime appearedAtDateTime() {
        return this.innerModel().appearedAtDateTime();
    }

    public String recommendation() {
        return this.innerModel().recommendation();
    }

    public AlertSeverity severity() {
        return this.innerModel().severity();
    }

    public AlertErrorDetails errorDetails() {
        return this.innerModel().errorDetails();
    }

    public Map<String, String> detailedInformation() {
        Map<String, String> inner = this.innerModel().detailedInformation();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public AlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
