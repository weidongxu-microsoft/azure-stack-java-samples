// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.resources.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.resources.fluent.models.DeploymentExtendedInner;
import java.util.Map;

/** An immutable client-side representation of DeploymentExtended. */
public interface DeploymentExtended {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Deployment properties.
     *
     * @return the properties value.
     */
    DeploymentPropertiesExtended properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.resources.fluent.models.DeploymentExtendedInner object.
     *
     * @return the inner object.
     */
    DeploymentExtendedInner innerModel();

    /** The entirety of the DeploymentExtended definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DeploymentExtended definition stages. */
    interface DefinitionStages {
        /** The first stage of the DeploymentExtended definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the DeploymentExtended definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group to deploy the resources to. The name is case
             *     insensitive. The resource group must already exist.
             * @return the next definition stage.
             */
            WithProperties withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the DeploymentExtended definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The deployment properties..
             *
             * @param properties The deployment properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(DeploymentProperties properties);
        }
        /**
         * The stage of the DeploymentExtended definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DeploymentExtended create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DeploymentExtended create(Context context);
        }
        /** The stage of the DeploymentExtended definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The location to store the deployment data.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The location to store the deployment data.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the DeploymentExtended definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Deployment tags.
             *
             * @param tags Deployment tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the DeploymentExtended resource.
     *
     * @return the stage of resource update.
     */
    DeploymentExtended.Update update();

    /** The template for DeploymentExtended update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DeploymentExtended apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DeploymentExtended apply(Context context);
    }
    /** The DeploymentExtended update stages. */
    interface UpdateStages {
        /** The stage of the DeploymentExtended update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Deployment tags.
             *
             * @param tags Deployment tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DeploymentExtended update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The deployment properties..
             *
             * @param properties The deployment properties.
             * @return the next definition stage.
             */
            Update withProperties(DeploymentProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DeploymentExtended refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DeploymentExtended refresh(Context context);
}
