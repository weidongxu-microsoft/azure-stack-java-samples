// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.TableServicePropertiesInner;

/** An immutable client-side representation of TableServiceProperties. */
public interface TableServiceProperties {
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
     * Gets the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     *
     * @return the cors value.
     */
    CorsRules cors();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.TableServicePropertiesInner object.
     *
     * @return the inner object.
     */
    TableServicePropertiesInner innerModel();

    /** The entirety of the TableServiceProperties definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The TableServiceProperties definition stages. */
    interface DefinitionStages {
        /** The first stage of the TableServiceProperties definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the TableServiceProperties definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             *     names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the TableServiceProperties definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithCors {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            TableServiceProperties create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TableServiceProperties create(Context context);
        }
        /** The stage of the TableServiceProperties definition allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Specifies CORS rules for the Table service. You can include up to five
             * CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS
             * rules will be deleted, and CORS will be disabled for the Table service..
             *
             * @param cors Specifies CORS rules for the Table service. You can include up to five CorsRule elements in
             *     the request. If no CorsRule elements are included in the request body, all CORS rules will be
             *     deleted, and CORS will be disabled for the Table service.
             * @return the next definition stage.
             */
            WithCreate withCors(CorsRules cors);
        }
    }
    /**
     * Begins update for the TableServiceProperties resource.
     *
     * @return the stage of resource update.
     */
    TableServiceProperties.Update update();

    /** The template for TableServiceProperties update. */
    interface Update extends UpdateStages.WithCors {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        TableServiceProperties apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TableServiceProperties apply(Context context);
    }
    /** The TableServiceProperties update stages. */
    interface UpdateStages {
        /** The stage of the TableServiceProperties update allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: Specifies CORS rules for the Table service. You can include up to five
             * CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS
             * rules will be deleted, and CORS will be disabled for the Table service..
             *
             * @param cors Specifies CORS rules for the Table service. You can include up to five CorsRule elements in
             *     the request. If no CorsRule elements are included in the request body, all CORS rules will be
             *     deleted, and CORS will be disabled for the Table service.
             * @return the next definition stage.
             */
            Update withCors(CorsRules cors);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    TableServiceProperties refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TableServiceProperties refresh(Context context);
}