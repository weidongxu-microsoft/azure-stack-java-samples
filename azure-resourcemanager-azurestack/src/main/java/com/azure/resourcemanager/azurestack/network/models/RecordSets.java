// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.network.fluent.models.RecordSetInner;

/** Resource collection API of RecordSets. */
public interface RecordSets {
    /**
     * Updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set.
     * @param parameters Parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS record set (a collection of DNS records with the same name and type).
     */
    RecordSet update(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        RecordSetInner parameters);

    /**
     * Updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set.
     * @param parameters Parameters supplied to the Update operation.
     * @param ifMatch The etag of the record set. Omit this value to always overwrite the current record set. Specify
     *     the last-seen etag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS record set (a collection of DNS records with the same name and type).
     */
    Response<RecordSet> updateWithResponse(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        RecordSetInner parameters,
        String ifMatch,
        Context context);

    /**
     * Creates or updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA can be updated but not
     *     created (they are created when the DNS zone is created).
     * @param parameters Parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS record set (a collection of DNS records with the same name and type).
     */
    RecordSet createOrUpdate(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        RecordSetInner parameters);

    /**
     * Creates or updates a record set within a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA can be updated but not
     *     created (they are created when the DNS zone is created).
     * @param parameters Parameters supplied to the CreateOrUpdate operation.
     * @param ifMatch The etag of the record set. Omit this value to always overwrite the current record set. Specify
     *     the last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new record set to be created, but to prevent updating an existing record
     *     set. Other values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS record set (a collection of DNS records with the same name and type).
     */
    Response<RecordSet> createOrUpdateWithResponse(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        RecordSetInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a record set from a DNS zone. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA cannot be deleted (they are
     *     deleted when the DNS zone is deleted).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType);

    /**
     * Deletes a record set from a DNS zone. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set. Record sets of type SOA cannot be deleted (they are
     *     deleted when the DNS zone is deleted).
     * @param ifMatch The etag of the record set. Omit this value to always delete the current record set. Specify the
     *     last-seen etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        String ifMatch,
        Context context);

    /**
     * Gets a record set.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a record set.
     */
    RecordSet get(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType);

    /**
     * Gets a record set.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
     * @param recordType The type of DNS record in this record set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a record set.
     */
    Response<RecordSet> getWithResponse(
        String resourceGroupName,
        String zoneName,
        String relativeRecordSetName,
        RecordType recordType,
        Context context);

    /**
     * Lists the record sets of a specified type in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param recordType The type of record sets to enumerate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a record set List operation.
     */
    PagedIterable<RecordSet> listByType(String resourceGroupName, String zoneName, RecordType recordType);

    /**
     * Lists the record sets of a specified type in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param recordType The type of record sets to enumerate.
     * @param top The maximum number of record sets to return. If not specified, returns up to 100 record sets.
     * @param recordsetnamesuffix The suffix label of the record set name that has to be used to filter the record set
     *     enumerations. If this parameter is specified, Enumeration will return only records that end with
     *     .&lt;recordSetNameSuffix&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a record set List operation.
     */
    PagedIterable<RecordSet> listByType(
        String resourceGroupName,
        String zoneName,
        RecordType recordType,
        Integer top,
        String recordsetnamesuffix,
        Context context);

    /**
     * Lists all record sets in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a record set List operation.
     */
    PagedIterable<RecordSet> listByDnsZone(String resourceGroupName, String zoneName);

    /**
     * Lists all record sets in a DNS zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param top The maximum number of record sets to return. If not specified, returns up to 100 record sets.
     * @param recordsetnamesuffix The suffix label of the record set name that has to be used to filter the record set
     *     enumerations. If this parameter is specified, Enumeration will return only records that end with
     *     .&lt;recordSetNameSuffix&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a record set List operation.
     */
    PagedIterable<RecordSet> listByDnsZone(
        String resourceGroupName, String zoneName, Integer top, String recordsetnamesuffix, Context context);
}
