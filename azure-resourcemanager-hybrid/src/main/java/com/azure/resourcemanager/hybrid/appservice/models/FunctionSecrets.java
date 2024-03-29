// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.models;

import com.azure.resourcemanager.hybrid.appservice.fluent.models.FunctionSecretsInner;

/** An immutable client-side representation of FunctionSecrets. */
public interface FunctionSecrets {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the key property: Secret key.
     *
     * @return the key value.
     */
    String key();

    /**
     * Gets the triggerUrl property: Trigger URL.
     *
     * @return the triggerUrl value.
     */
    String triggerUrl();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.FunctionSecretsInner object.
     *
     * @return the inner object.
     */
    FunctionSecretsInner innerModel();
}
