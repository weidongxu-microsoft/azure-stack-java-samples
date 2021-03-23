// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.models;

import com.azure.resourcemanager.azurestack.web.fluent.models.StringDictionaryInner;
import java.util.Map;

/** An immutable client-side representation of StringDictionary. */
public interface StringDictionary {
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
     * Gets the properties property: Settings.
     *
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.StringDictionaryInner object.
     *
     * @return the inner object.
     */
    StringDictionaryInner innerModel();
}