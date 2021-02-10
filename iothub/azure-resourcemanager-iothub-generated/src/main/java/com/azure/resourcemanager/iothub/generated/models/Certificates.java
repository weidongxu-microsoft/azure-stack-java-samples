// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Certificates. */
public interface Certificates {
    /**
     * Returns the list of certificates.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the JSON-serialized array of Certificate objects.
     */
    CertificateListDescription listByIotHub(String resourceGroupName, String resourceName);

    /**
     * Returns the list of certificates.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the JSON-serialized array of Certificate objects.
     */
    Response<CertificateListDescription> listByIotHubWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Returns the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    CertificateDescription get(String resourceGroupName, String resourceName, String certificateName);

    /**
     * Returns the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    Response<CertificateDescription> getWithResponse(
        String resourceGroupName, String resourceName, String certificateName, Context context);

    /**
     * Deletes an existing X509 certificate or does nothing if it does not exist.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String certificateName, String ifMatch);

    /**
     * Deletes an existing X509 certificate or does nothing if it does not exist.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch, Context context);

    /**
     * Generates verification code for proof of possession flow. The verification code will be used to generate a leaf
     * certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    CertificateWithNonceDescription generateVerificationCode(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch);

    /**
     * Generates verification code for proof of possession flow. The verification code will be used to generate a leaf
     * certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    Response<CertificateWithNonceDescription> generateVerificationCodeWithResponse(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch, Context context);

    /**
     * Verifies the certificate's private key possession by providing the leaf cert issued by the verifying pre uploaded
     * certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @param certificateVerificationBody The name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    CertificateDescription verify(
        String resourceGroupName,
        String resourceName,
        String certificateName,
        String ifMatch,
        CertificateVerificationDescription certificateVerificationBody);

    /**
     * Verifies the certificate's private key possession by providing the leaf cert issued by the verifying pre uploaded
     * certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate.
     * @param ifMatch ETag of the Certificate.
     * @param certificateVerificationBody The name of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    Response<CertificateDescription> verifyWithResponse(
        String resourceGroupName,
        String resourceName,
        String certificateName,
        String ifMatch,
        CertificateVerificationDescription certificateVerificationBody,
        Context context);

    /**
     * Returns the certificate.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    CertificateDescription getById(String id);

    /**
     * Returns the certificate.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    Response<CertificateDescription> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing X509 certificate or does nothing if it does not exist.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing X509 certificate or does nothing if it does not exist.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the Certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException thrown if the request is rejected
     *     by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Begins definition for a new CertificateDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new CertificateDescription definition.
     */
    CertificateDescription.DefinitionStages.Blank define(String name);
}
