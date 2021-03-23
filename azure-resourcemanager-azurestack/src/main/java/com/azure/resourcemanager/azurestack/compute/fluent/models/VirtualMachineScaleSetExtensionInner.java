// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.compute.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a Virtual Machine Scale Set Extension. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetExtensionInner extends SubResourceReadOnly {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetExtensionInner.class);

    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * If a value is provided and is different from the previous value, the
     * extension handler will be forced to update even if the extension
     * configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.publisher")
    private String publisher;

    /*
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "properties.typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "properties.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     */
    @JsonProperty(value = "properties.enableAutomaticUpgrade")
    private Boolean enableAutomaticUpgrade;

    /*
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.settings")
    private Object settings;

    /*
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    @JsonProperty(value = "properties.protectedSettings")
    private Object protectedSettings;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Collection of extension names after which this extension needs to be
     * provisioned.
     */
    @JsonProperty(value = "properties.provisionAfterExtensions")
    private List<String> provisionAfterExtensions;

    /**
     * Get the name property: The name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extension.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the typePropertiesType property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     *
     * @return the provisionAfterExtensions value.
     */
    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions;
    }

    /**
     * Set the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     *
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        this.provisionAfterExtensions = provisionAfterExtensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}