// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.monitor.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.monitor.fluent.models.DiagnosticSettingsResourceInner;
import java.util.List;

/** An immutable client-side representation of DiagnosticSettingsResource. */
public interface DiagnosticSettingsResource {
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
     * Gets the storageAccountId property: The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     *
     * @return the storageAccountId value.
     */
    String storageAccountId();

    /**
     * Gets the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here to maintain
     * backwards compatibility.
     *
     * @return the serviceBusRuleId value.
     */
    String serviceBusRuleId();

    /**
     * Gets the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization rule.
     *
     * @return the eventHubAuthorizationRuleId value.
     */
    String eventHubAuthorizationRuleId();

    /**
     * Gets the eventHubName property: The name of the event hub. If none is specified, the default event hub will be
     * selected.
     *
     * @return the eventHubName value.
     */
    String eventHubName();

    /**
     * Gets the metrics property: The list of metric settings.
     *
     * @return the metrics value.
     */
    List<MetricSettings> metrics();

    /**
     * Gets the logs property: The list of logs settings.
     *
     * @return the logs value.
     */
    List<LogSettings> logs();

    /**
     * Gets the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you would like to
     * send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the logAnalyticsDestinationType property: A string indicating whether the export to Log Analytics should use
     * the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
     * &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated and null
     * (null is default.).
     *
     * @return the logAnalyticsDestinationType value.
     */
    String logAnalyticsDestinationType();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.monitor.fluent.models.DiagnosticSettingsResourceInner object.
     *
     * @return the inner object.
     */
    DiagnosticSettingsResourceInner innerModel();

    /** The entirety of the DiagnosticSettingsResource definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }
    /** The DiagnosticSettingsResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DiagnosticSettingsResource definition. */
        interface Blank extends WithScope {
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify parent resource. */
        interface WithScope {
            /**
             * Specifies resourceUri.
             *
             * @param resourceUri The identifier of the resource.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceUri(String resourceUri);
        }
        /**
         * The stage of the DiagnosticSettingsResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithStorageAccountId,
                DefinitionStages.WithServiceBusRuleId,
                DefinitionStages.WithEventHubAuthorizationRuleId,
                DefinitionStages.WithEventHubName,
                DefinitionStages.WithMetrics,
                DefinitionStages.WithLogs,
                DefinitionStages.WithWorkspaceId,
                DefinitionStages.WithLogAnalyticsDestinationType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DiagnosticSettingsResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DiagnosticSettingsResource create(Context context);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify storageAccountId. */
        interface WithStorageAccountId {
            /**
             * Specifies the storageAccountId property: The resource ID of the storage account to which you would like
             * to send Diagnostic Logs..
             *
             * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic
             *     Logs.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountId(String storageAccountId);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify serviceBusRuleId. */
        interface WithServiceBusRuleId {
            /**
             * Specifies the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here
             * to maintain backwards compatibility..
             *
             * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain
             *     backwards compatibility.
             * @return the next definition stage.
             */
            WithCreate withServiceBusRuleId(String serviceBusRuleId);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify eventHubAuthorizationRuleId. */
        interface WithEventHubAuthorizationRuleId {
            /**
             * Specifies the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization
             * rule..
             *
             * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule.
             * @return the next definition stage.
             */
            WithCreate withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify eventHubName. */
        interface WithEventHubName {
            /**
             * Specifies the eventHubName property: The name of the event hub. If none is specified, the default event
             * hub will be selected..
             *
             * @param eventHubName The name of the event hub. If none is specified, the default event hub will be
             *     selected.
             * @return the next definition stage.
             */
            WithCreate withEventHubName(String eventHubName);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify metrics. */
        interface WithMetrics {
            /**
             * Specifies the metrics property: The list of metric settings..
             *
             * @param metrics The list of metric settings.
             * @return the next definition stage.
             */
            WithCreate withMetrics(List<MetricSettings> metrics);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify logs. */
        interface WithLogs {
            /**
             * Specifies the logs property: The list of logs settings..
             *
             * @param logs The list of logs settings.
             * @return the next definition stage.
             */
            WithCreate withLogs(List<LogSettings> logs);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify workspaceId. */
        interface WithWorkspaceId {
            /**
             * Specifies the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you
             * would like to send Diagnostic Logs. Example:
             * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
             *
             * @param workspaceId The full ARM resource ID of the Log Analytics workspace to which you would like to
             *     send Diagnostic Logs. Example:
             *     /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
             * @return the next definition stage.
             */
            WithCreate withWorkspaceId(String workspaceId);
        }
        /** The stage of the DiagnosticSettingsResource definition allowing to specify logAnalyticsDestinationType. */
        interface WithLogAnalyticsDestinationType {
            /**
             * Specifies the logAnalyticsDestinationType property: A string indicating whether the export to Log
             * Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type
             * constructed as follows: &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible
             * values are: Dedicated and null (null is default.).
             *
             * @param logAnalyticsDestinationType A string indicating whether the export to Log Analytics should use the
             *     default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
             *     &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated
             *     and null (null is default.).
             * @return the next definition stage.
             */
            WithCreate withLogAnalyticsDestinationType(String logAnalyticsDestinationType);
        }
    }
    /**
     * Begins update for the DiagnosticSettingsResource resource.
     *
     * @return the stage of resource update.
     */
    DiagnosticSettingsResource.Update update();

    /** The template for DiagnosticSettingsResource update. */
    interface Update
        extends UpdateStages.WithStorageAccountId,
            UpdateStages.WithServiceBusRuleId,
            UpdateStages.WithEventHubAuthorizationRuleId,
            UpdateStages.WithEventHubName,
            UpdateStages.WithMetrics,
            UpdateStages.WithLogs,
            UpdateStages.WithWorkspaceId,
            UpdateStages.WithLogAnalyticsDestinationType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DiagnosticSettingsResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DiagnosticSettingsResource apply(Context context);
    }
    /** The DiagnosticSettingsResource update stages. */
    interface UpdateStages {
        /** The stage of the DiagnosticSettingsResource update allowing to specify storageAccountId. */
        interface WithStorageAccountId {
            /**
             * Specifies the storageAccountId property: The resource ID of the storage account to which you would like
             * to send Diagnostic Logs..
             *
             * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic
             *     Logs.
             * @return the next definition stage.
             */
            Update withStorageAccountId(String storageAccountId);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify serviceBusRuleId. */
        interface WithServiceBusRuleId {
            /**
             * Specifies the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here
             * to maintain backwards compatibility..
             *
             * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain
             *     backwards compatibility.
             * @return the next definition stage.
             */
            Update withServiceBusRuleId(String serviceBusRuleId);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify eventHubAuthorizationRuleId. */
        interface WithEventHubAuthorizationRuleId {
            /**
             * Specifies the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization
             * rule..
             *
             * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule.
             * @return the next definition stage.
             */
            Update withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify eventHubName. */
        interface WithEventHubName {
            /**
             * Specifies the eventHubName property: The name of the event hub. If none is specified, the default event
             * hub will be selected..
             *
             * @param eventHubName The name of the event hub. If none is specified, the default event hub will be
             *     selected.
             * @return the next definition stage.
             */
            Update withEventHubName(String eventHubName);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify metrics. */
        interface WithMetrics {
            /**
             * Specifies the metrics property: The list of metric settings..
             *
             * @param metrics The list of metric settings.
             * @return the next definition stage.
             */
            Update withMetrics(List<MetricSettings> metrics);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify logs. */
        interface WithLogs {
            /**
             * Specifies the logs property: The list of logs settings..
             *
             * @param logs The list of logs settings.
             * @return the next definition stage.
             */
            Update withLogs(List<LogSettings> logs);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify workspaceId. */
        interface WithWorkspaceId {
            /**
             * Specifies the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you
             * would like to send Diagnostic Logs. Example:
             * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
             *
             * @param workspaceId The full ARM resource ID of the Log Analytics workspace to which you would like to
             *     send Diagnostic Logs. Example:
             *     /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
             * @return the next definition stage.
             */
            Update withWorkspaceId(String workspaceId);
        }
        /** The stage of the DiagnosticSettingsResource update allowing to specify logAnalyticsDestinationType. */
        interface WithLogAnalyticsDestinationType {
            /**
             * Specifies the logAnalyticsDestinationType property: A string indicating whether the export to Log
             * Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type
             * constructed as follows: &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible
             * values are: Dedicated and null (null is default.).
             *
             * @param logAnalyticsDestinationType A string indicating whether the export to Log Analytics should use the
             *     default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
             *     &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated
             *     and null (null is default.).
             * @return the next definition stage.
             */
            Update withLogAnalyticsDestinationType(String logAnalyticsDestinationType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DiagnosticSettingsResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DiagnosticSettingsResource refresh(Context context);
}
