// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybrid.appservice.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybrid.appservice.fluent.models.FunctionEnvelopeInner;
import com.azure.resourcemanager.hybrid.appservice.models.FunctionEnvelope;
import com.azure.resourcemanager.hybrid.appservice.models.FunctionSecrets;
import com.azure.resourcemanager.hybrid.appservice.models.StringDictionary;
import java.util.Collections;
import java.util.Map;

public final class FunctionEnvelopeImpl implements FunctionEnvelope, FunctionEnvelope.Definition {
    private FunctionEnvelopeInner innerObject;

    private final com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager;

    FunctionEnvelopeImpl(
        FunctionEnvelopeInner innerObject, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String functionAppId() {
        return this.innerModel().functionAppId();
    }

    public String scriptRootPathHref() {
        return this.innerModel().scriptRootPathHref();
    }

    public String scriptHref() {
        return this.innerModel().scriptHref();
    }

    public String configHref() {
        return this.innerModel().configHref();
    }

    public String testDataHref() {
        return this.innerModel().testDataHref();
    }

    public String secretsFileHref() {
        return this.innerModel().secretsFileHref();
    }

    public String href() {
        return this.innerModel().href();
    }

    public Object config() {
        return this.innerModel().config();
    }

    public Map<String, String> files() {
        Map<String, String> inner = this.innerModel().files();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String testData() {
        return this.innerModel().testData();
    }

    public String invokeUrlTemplate() {
        return this.innerModel().invokeUrlTemplate();
    }

    public String language() {
        return this.innerModel().language();
    }

    public Boolean isDisabled() {
        return this.innerModel().isDisabled();
    }

    public FunctionEnvelopeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybrid.appservice.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String functionName;

    public FunctionEnvelopeImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public FunctionEnvelope create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createFunction(resourceGroupName, name, functionName, this.innerModel(), Context.NONE);
        return this;
    }

    public FunctionEnvelope create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createFunction(resourceGroupName, name, functionName, this.innerModel(), context);
        return this;
    }

    FunctionEnvelopeImpl(String name, com.azure.resourcemanager.hybrid.appservice.AppServiceManager serviceManager) {
        this.innerObject = new FunctionEnvelopeInner();
        this.serviceManager = serviceManager;
        this.functionName = name;
    }

    public FunctionEnvelope refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getFunctionWithResponse(resourceGroupName, name, functionName, Context.NONE)
                .getValue();
        return this;
    }

    public FunctionEnvelope refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getFunctionWithResponse(resourceGroupName, name, functionName, context)
                .getValue();
        return this;
    }

    public StringDictionary listFunctionKeys() {
        return serviceManager.webApps().listFunctionKeys(resourceGroupName, name, functionName);
    }

    public Response<StringDictionary> listFunctionKeysWithResponse(Context context) {
        return serviceManager.webApps().listFunctionKeysWithResponse(resourceGroupName, name, functionName, context);
    }

    public FunctionSecrets listFunctionSecrets() {
        return serviceManager.webApps().listFunctionSecrets(resourceGroupName, name, functionName);
    }

    public Response<FunctionSecrets> listFunctionSecretsWithResponse(Context context) {
        return serviceManager.webApps().listFunctionSecretsWithResponse(resourceGroupName, name, functionName, context);
    }

    public FunctionEnvelopeImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public FunctionEnvelopeImpl withFunctionAppId(String functionAppId) {
        this.innerModel().withFunctionAppId(functionAppId);
        return this;
    }

    public FunctionEnvelopeImpl withScriptRootPathHref(String scriptRootPathHref) {
        this.innerModel().withScriptRootPathHref(scriptRootPathHref);
        return this;
    }

    public FunctionEnvelopeImpl withScriptHref(String scriptHref) {
        this.innerModel().withScriptHref(scriptHref);
        return this;
    }

    public FunctionEnvelopeImpl withConfigHref(String configHref) {
        this.innerModel().withConfigHref(configHref);
        return this;
    }

    public FunctionEnvelopeImpl withTestDataHref(String testDataHref) {
        this.innerModel().withTestDataHref(testDataHref);
        return this;
    }

    public FunctionEnvelopeImpl withSecretsFileHref(String secretsFileHref) {
        this.innerModel().withSecretsFileHref(secretsFileHref);
        return this;
    }

    public FunctionEnvelopeImpl withHref(String href) {
        this.innerModel().withHref(href);
        return this;
    }

    public FunctionEnvelopeImpl withConfig(Object config) {
        this.innerModel().withConfig(config);
        return this;
    }

    public FunctionEnvelopeImpl withFiles(Map<String, String> files) {
        this.innerModel().withFiles(files);
        return this;
    }

    public FunctionEnvelopeImpl withTestData(String testData) {
        this.innerModel().withTestData(testData);
        return this;
    }

    public FunctionEnvelopeImpl withInvokeUrlTemplate(String invokeUrlTemplate) {
        this.innerModel().withInvokeUrlTemplate(invokeUrlTemplate);
        return this;
    }

    public FunctionEnvelopeImpl withLanguage(String language) {
        this.innerModel().withLanguage(language);
        return this;
    }

    public FunctionEnvelopeImpl withIsDisabled(Boolean isDisabled) {
        this.innerModel().withIsDisabled(isDisabled);
        return this;
    }
}