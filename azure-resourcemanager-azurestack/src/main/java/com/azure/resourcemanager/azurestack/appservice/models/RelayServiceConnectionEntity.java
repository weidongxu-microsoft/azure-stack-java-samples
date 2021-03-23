// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.appservice.fluent.models.RelayServiceConnectionEntityInner;

/** An immutable client-side representation of RelayServiceConnectionEntity. */
public interface RelayServiceConnectionEntity {
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
     * Gets the entityName property: The entityName property.
     *
     * @return the entityName value.
     */
    String entityName();

    /**
     * Gets the entityConnectionString property: The entityConnectionString property.
     *
     * @return the entityConnectionString value.
     */
    String entityConnectionString();

    /**
     * Gets the resourceType property: The resourceType property.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the resourceConnectionString property: The resourceConnectionString property.
     *
     * @return the resourceConnectionString value.
     */
    String resourceConnectionString();

    /**
     * Gets the hostname property: The hostname property.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the port property: The port property.
     *
     * @return the port value.
     */
    Integer port();

    /**
     * Gets the biztalkUri property: The biztalkUri property.
     *
     * @return the biztalkUri value.
     */
    String biztalkUri();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.RelayServiceConnectionEntityInner object.
     *
     * @return the inner object.
     */
    RelayServiceConnectionEntityInner innerModel();

    /** The entirety of the RelayServiceConnectionEntity definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The RelayServiceConnectionEntity definition stages. */
    interface DefinitionStages {
        /** The first stage of the RelayServiceConnectionEntity definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }
        /**
         * The stage of the RelayServiceConnectionEntity definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithEntityName,
                DefinitionStages.WithEntityConnectionString,
                DefinitionStages.WithResourceType,
                DefinitionStages.WithResourceConnectionString,
                DefinitionStages.WithHostname,
                DefinitionStages.WithPort,
                DefinitionStages.WithBiztalkUri {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RelayServiceConnectionEntity create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RelayServiceConnectionEntity create(Context context);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify entityName. */
        interface WithEntityName {
            /**
             * Specifies the entityName property: The entityName property..
             *
             * @param entityName The entityName property.
             * @return the next definition stage.
             */
            WithCreate withEntityName(String entityName);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify entityConnectionString. */
        interface WithEntityConnectionString {
            /**
             * Specifies the entityConnectionString property: The entityConnectionString property..
             *
             * @param entityConnectionString The entityConnectionString property.
             * @return the next definition stage.
             */
            WithCreate withEntityConnectionString(String entityConnectionString);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify resourceType. */
        interface WithResourceType {
            /**
             * Specifies the resourceType property: The resourceType property..
             *
             * @param resourceType The resourceType property.
             * @return the next definition stage.
             */
            WithCreate withResourceType(String resourceType);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify resourceConnectionString. */
        interface WithResourceConnectionString {
            /**
             * Specifies the resourceConnectionString property: The resourceConnectionString property..
             *
             * @param resourceConnectionString The resourceConnectionString property.
             * @return the next definition stage.
             */
            WithCreate withResourceConnectionString(String resourceConnectionString);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: The hostname property..
             *
             * @param hostname The hostname property.
             * @return the next definition stage.
             */
            WithCreate withHostname(String hostname);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify port. */
        interface WithPort {
            /**
             * Specifies the port property: The port property..
             *
             * @param port The port property.
             * @return the next definition stage.
             */
            WithCreate withPort(Integer port);
        }
        /** The stage of the RelayServiceConnectionEntity definition allowing to specify biztalkUri. */
        interface WithBiztalkUri {
            /**
             * Specifies the biztalkUri property: The biztalkUri property..
             *
             * @param biztalkUri The biztalkUri property.
             * @return the next definition stage.
             */
            WithCreate withBiztalkUri(String biztalkUri);
        }
    }
    /**
     * Begins update for the RelayServiceConnectionEntity resource.
     *
     * @return the stage of resource update.
     */
    RelayServiceConnectionEntity.Update update();

    /** The template for RelayServiceConnectionEntity update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithEntityName,
            UpdateStages.WithEntityConnectionString,
            UpdateStages.WithResourceType,
            UpdateStages.WithResourceConnectionString,
            UpdateStages.WithHostname,
            UpdateStages.WithPort,
            UpdateStages.WithBiztalkUri {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RelayServiceConnectionEntity apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RelayServiceConnectionEntity apply(Context context);
    }
    /** The RelayServiceConnectionEntity update stages. */
    interface UpdateStages {
        /** The stage of the RelayServiceConnectionEntity update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify entityName. */
        interface WithEntityName {
            /**
             * Specifies the entityName property: The entityName property..
             *
             * @param entityName The entityName property.
             * @return the next definition stage.
             */
            Update withEntityName(String entityName);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify entityConnectionString. */
        interface WithEntityConnectionString {
            /**
             * Specifies the entityConnectionString property: The entityConnectionString property..
             *
             * @param entityConnectionString The entityConnectionString property.
             * @return the next definition stage.
             */
            Update withEntityConnectionString(String entityConnectionString);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify resourceType. */
        interface WithResourceType {
            /**
             * Specifies the resourceType property: The resourceType property..
             *
             * @param resourceType The resourceType property.
             * @return the next definition stage.
             */
            Update withResourceType(String resourceType);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify resourceConnectionString. */
        interface WithResourceConnectionString {
            /**
             * Specifies the resourceConnectionString property: The resourceConnectionString property..
             *
             * @param resourceConnectionString The resourceConnectionString property.
             * @return the next definition stage.
             */
            Update withResourceConnectionString(String resourceConnectionString);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: The hostname property..
             *
             * @param hostname The hostname property.
             * @return the next definition stage.
             */
            Update withHostname(String hostname);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify port. */
        interface WithPort {
            /**
             * Specifies the port property: The port property..
             *
             * @param port The port property.
             * @return the next definition stage.
             */
            Update withPort(Integer port);
        }
        /** The stage of the RelayServiceConnectionEntity update allowing to specify biztalkUri. */
        interface WithBiztalkUri {
            /**
             * Specifies the biztalkUri property: The biztalkUri property..
             *
             * @param biztalkUri The biztalkUri property.
             * @return the next definition stage.
             */
            Update withBiztalkUri(String biztalkUri);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RelayServiceConnectionEntity refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RelayServiceConnectionEntity refresh(Context context);
}