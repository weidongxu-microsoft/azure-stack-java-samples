// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.monitor.implementation;

import com.azure.resourcemanager.hybrid.monitor.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.hybrid.monitor.fluent.models.MetadataValueInner;
import com.azure.resourcemanager.hybrid.monitor.models.LocalizableString;
import com.azure.resourcemanager.hybrid.monitor.models.MetadataValue;

public final class MetadataValueImpl implements MetadataValue {
    private MetadataValueInner innerObject;

    private final com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager;

    MetadataValueImpl(
        MetadataValueInner innerObject, com.azure.resourcemanager.hybrid.monitor.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LocalizableString name() {
        LocalizableStringInner inner = this.innerModel().name();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String value() {
        return this.innerModel().value();
    }

    public MetadataValueInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.monitor.MonitorManager manager() {
        return this.serviceManager;
    }
}
