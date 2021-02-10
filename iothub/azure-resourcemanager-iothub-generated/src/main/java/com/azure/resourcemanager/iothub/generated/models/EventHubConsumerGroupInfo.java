// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.generated.fluent.models.EventHubConsumerGroupInfoInner;
import java.util.Map;

/** An immutable client-side representation of EventHubConsumerGroupInfo. */
public interface EventHubConsumerGroupInfo {
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
     * Gets the properties property: The tags.
     *
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * Gets the etag property: The etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.EventHubConsumerGroupInfoInner object.
     *
     * @return the inner object.
     */
    EventHubConsumerGroupInfoInner innerModel();

    /** The entirety of the EventHubConsumerGroupInfo definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The EventHubConsumerGroupInfo definition stages. */
    interface DefinitionStages {
        /** The first stage of the EventHubConsumerGroupInfo definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the EventHubConsumerGroupInfo definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName, eventHubEndpointName.
             *
             * @param resourceGroupName The name of the resource group that contains the IoT hub.
             * @param resourceName The name of the IoT hub.
             * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub.
             * @return the next definition stage.
             */
            WithCreate withExistingEventHubEndpoint(
                String resourceGroupName, String resourceName, String eventHubEndpointName);
        }
        /**
         * The stage of the EventHubConsumerGroupInfo definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            EventHubConsumerGroupInfo create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EventHubConsumerGroupInfo create(Context context);
        }
        /** The stage of the EventHubConsumerGroupInfo definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The EventHub consumer group name..
             *
             * @param properties The EventHub consumer group name.
             * @return the next definition stage.
             */
            WithCreate withProperties(EventHubConsumerGroupName properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    EventHubConsumerGroupInfo refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EventHubConsumerGroupInfo refresh(Context context);
}
