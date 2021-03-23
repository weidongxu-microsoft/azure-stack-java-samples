// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.appservice.models;

import com.azure.resourcemanager.azurestack.appservice.fluent.models.BackupRequestInner;
import java.util.List;

/** An immutable client-side representation of BackupRequest. */
public interface BackupRequest {
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
     * Gets the backupName property: Name of the backup.
     *
     * @return the backupName value.
     */
    String backupName();

    /**
     * Gets the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the storageAccountUrl property: SAS URL to the container.
     *
     * @return the storageAccountUrl value.
     */
    String storageAccountUrl();

    /**
     * Gets the backupSchedule property: Schedule for the backup if it is executed periodically.
     *
     * @return the backupSchedule value.
     */
    BackupSchedule backupSchedule();

    /**
     * Gets the databases property: Databases included in the backup.
     *
     * @return the databases value.
     */
    List<DatabaseBackupSetting> databases();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.BackupRequestInner object.
     *
     * @return the inner object.
     */
    BackupRequestInner innerModel();
}