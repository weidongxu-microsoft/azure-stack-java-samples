// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.storage.models;

import com.azure.resourcemanager.azurestack.storage.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Display metadata associated with the operation.
     *
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: The origin of operations.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the serviceSpecification property: One property of operation, include metric specifications.
     *
     * @return the serviceSpecification value.
     */
    ServiceSpecification serviceSpecification();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.storage.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}
