// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.resources.implementation;

import com.azure.resourcemanager.azurestack.resources.fluent.models.TagsResourceInner;
import com.azure.resourcemanager.azurestack.resources.models.Tags;
import com.azure.resourcemanager.azurestack.resources.models.TagsResource;

public final class TagsResourceImpl implements TagsResource {
    private TagsResourceInner innerObject;

    private final com.azure.resourcemanager.azurestack.resources.ResourceManager serviceManager;

    TagsResourceImpl(
        TagsResourceInner innerObject, com.azure.resourcemanager.azurestack.resources.ResourceManager serviceManager) {
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

    public Tags properties() {
        return this.innerModel().properties();
    }

    public TagsResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.resources.ResourceManager manager() {
        return this.serviceManager;
    }
}
