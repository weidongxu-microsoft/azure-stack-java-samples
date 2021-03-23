// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.web.models;

import com.azure.resourcemanager.azurestack.web.fluent.models.SourceControlInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SourceControl. */
public interface SourceControl {
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
     * Gets the token property: OAuth access token.
     *
     * @return the token value.
     */
    String token();

    /**
     * Gets the tokenSecret property: OAuth access token secret.
     *
     * @return the tokenSecret value.
     */
    String tokenSecret();

    /**
     * Gets the refreshToken property: OAuth refresh token.
     *
     * @return the refreshToken value.
     */
    String refreshToken();

    /**
     * Gets the expirationTime property: OAuth token expiration.
     *
     * @return the expirationTime value.
     */
    OffsetDateTime expirationTime();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.web.fluent.models.SourceControlInner object.
     *
     * @return the inner object.
     */
    SourceControlInner innerModel();
}
