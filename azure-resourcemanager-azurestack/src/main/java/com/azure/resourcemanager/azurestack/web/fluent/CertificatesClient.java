// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.web.fluent.models.CertificateInner;
import com.azure.resourcemanager.azurestack.web.models.CertificatePatchResource;

/** An instance of this class provides access to all the operations defined in CertificatesClient. */
public interface CertificatesClient {
    /**
     * Get all certificates for a subscription.
     *
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all certificates for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> list();

    /**
     * Get all certificates for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all certificates for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> list(Context context);

    /**
     * Get all certificates in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all certificates in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all certificates in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all certificates in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CertificateInner> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate, if it exists already.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner createOrUpdate(String resourceGroupName, String name, CertificateInner certificateEnvelope);

    /**
     * Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate, if it exists already.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CertificateInner> createOrUpdateWithResponse(
        String resourceGroupName, String name, CertificateInner certificateEnvelope, Context context);

    /**
     * Delete a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Delete a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate, if it exists already.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner update(String resourceGroupName, String name, CertificatePatchResource certificateEnvelope);

    /**
     * Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate, if it exists already.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.azurestack.web.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CertificateInner> updateWithResponse(
        String resourceGroupName, String name, CertificatePatchResource certificateEnvelope, Context context);
}