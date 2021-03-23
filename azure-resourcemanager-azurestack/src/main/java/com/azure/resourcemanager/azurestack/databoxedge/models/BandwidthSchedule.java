// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.databoxedge.fluent.models.BandwidthScheduleInner;
import java.util.List;

/** An immutable client-side representation of BandwidthSchedule. */
public interface BandwidthSchedule {
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
     * Gets the start property: The start time of the schedule in UTC.
     *
     * @return the start value.
     */
    String start();

    /**
     * Gets the stop property: The stop time of the schedule in UTC.
     *
     * @return the stop value.
     */
    String stop();

    /**
     * Gets the rateInMbps property: The bandwidth rate in Mbps.
     *
     * @return the rateInMbps value.
     */
    int rateInMbps();

    /**
     * Gets the days property: The days of the week when this schedule is applicable.
     *
     * @return the days value.
     */
    List<DayOfWeek> days();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.databoxedge.fluent.models.BandwidthScheduleInner object.
     *
     * @return the inner object.
     */
    BandwidthScheduleInner innerModel();

    /** The entirety of the BandwidthSchedule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithStart,
            DefinitionStages.WithStop,
            DefinitionStages.WithRateInMbps,
            DefinitionStages.WithDays,
            DefinitionStages.WithCreate {
    }
    /** The BandwidthSchedule definition stages. */
    interface DefinitionStages {
        /** The first stage of the BandwidthSchedule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the BandwidthSchedule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies deviceName, resourceGroupName.
             *
             * @param deviceName The device name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithStart withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }
        /** The stage of the BandwidthSchedule definition allowing to specify start. */
        interface WithStart {
            /**
             * Specifies the start property: The start time of the schedule in UTC..
             *
             * @param start The start time of the schedule in UTC.
             * @return the next definition stage.
             */
            WithStop withStart(String start);
        }
        /** The stage of the BandwidthSchedule definition allowing to specify stop. */
        interface WithStop {
            /**
             * Specifies the stop property: The stop time of the schedule in UTC..
             *
             * @param stop The stop time of the schedule in UTC.
             * @return the next definition stage.
             */
            WithRateInMbps withStop(String stop);
        }
        /** The stage of the BandwidthSchedule definition allowing to specify rateInMbps. */
        interface WithRateInMbps {
            /**
             * Specifies the rateInMbps property: The bandwidth rate in Mbps..
             *
             * @param rateInMbps The bandwidth rate in Mbps.
             * @return the next definition stage.
             */
            WithDays withRateInMbps(int rateInMbps);
        }
        /** The stage of the BandwidthSchedule definition allowing to specify days. */
        interface WithDays {
            /**
             * Specifies the days property: The days of the week when this schedule is applicable..
             *
             * @param days The days of the week when this schedule is applicable.
             * @return the next definition stage.
             */
            WithCreate withDays(List<DayOfWeek> days);
        }
        /**
         * The stage of the BandwidthSchedule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BandwidthSchedule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BandwidthSchedule create(Context context);
        }
    }
    /**
     * Begins update for the BandwidthSchedule resource.
     *
     * @return the stage of resource update.
     */
    BandwidthSchedule.Update update();

    /** The template for BandwidthSchedule update. */
    interface Update
        extends UpdateStages.WithStart, UpdateStages.WithStop, UpdateStages.WithRateInMbps, UpdateStages.WithDays {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BandwidthSchedule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BandwidthSchedule apply(Context context);
    }
    /** The BandwidthSchedule update stages. */
    interface UpdateStages {
        /** The stage of the BandwidthSchedule update allowing to specify start. */
        interface WithStart {
            /**
             * Specifies the start property: The start time of the schedule in UTC..
             *
             * @param start The start time of the schedule in UTC.
             * @return the next definition stage.
             */
            Update withStart(String start);
        }
        /** The stage of the BandwidthSchedule update allowing to specify stop. */
        interface WithStop {
            /**
             * Specifies the stop property: The stop time of the schedule in UTC..
             *
             * @param stop The stop time of the schedule in UTC.
             * @return the next definition stage.
             */
            Update withStop(String stop);
        }
        /** The stage of the BandwidthSchedule update allowing to specify rateInMbps. */
        interface WithRateInMbps {
            /**
             * Specifies the rateInMbps property: The bandwidth rate in Mbps..
             *
             * @param rateInMbps The bandwidth rate in Mbps.
             * @return the next definition stage.
             */
            Update withRateInMbps(int rateInMbps);
        }
        /** The stage of the BandwidthSchedule update allowing to specify days. */
        interface WithDays {
            /**
             * Specifies the days property: The days of the week when this schedule is applicable..
             *
             * @param days The days of the week when this schedule is applicable.
             * @return the next definition stage.
             */
            Update withDays(List<DayOfWeek> days);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BandwidthSchedule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BandwidthSchedule refresh(Context context);
}