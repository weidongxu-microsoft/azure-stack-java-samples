// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.azurestack.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.iothub.generated.models.IotHubDescription;
import com.azure.resourcemanager.iothub.generated.models.IotHubSku;
import com.azure.resourcemanager.iothub.generated.models.IotHubSkuInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ManageIotHub {

    /**
     * Main function which runs the actual sample.
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(AzureResourceManager azure) {
        String rgName = randomString("rg", 16);
        Region region = Region.US_WEST;
        String iotHubName = randomString("iot", 15);

        try {
            IotHubDescription iotHubDescription = azure.iotHub().iotHubResources().define(iotHubName)
                    .withRegion(Region.US_WEST)
                    .withExistingResourceGroup(rgName)
                    .withSku(new IotHubSkuInfo()
                            .withName(IotHubSku.B1)
                            .withCapacity(1l))
                    .create();

            // list iothub resources
            boolean foundIotHub = false;
            for (IotHubDescription resource : azure.iotHub().iotHubResources().list()) {
                if (iotHubName.equals(resource.name())) {
                    foundIotHub = true;
                    break;
                }
            }

            // update iothub resource
            Map<String, String> tags = new HashMap<>();
            tags.put("key1", "value1");
            iotHubDescription.update()
                    .withTags(tags)
                    .apply();

            return true;
        } finally {
            azure.resources().resourceGroups().delete(rgName);
        }
    }

    /**
     * Main entry point.
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {

            //=============================================================
            // Authenticate

            final AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);
            final TokenCredential credential = new DefaultAzureCredentialBuilder()
                    .authorityHost(profile.getEnvironment().getActiveDirectoryEndpoint())
                    .build();

            AzureResourceManager azure = AzureResourceManager
                    .configure()
                    .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
                    .authenticate(credential, profile);

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static String randomString(String prefix, int length) {
        StringBuilder randomString = new StringBuilder();
        while (randomString.length() < length) {
            randomString.append(UUID.randomUUID().toString().replace("-", ""));
        }
        return prefix + randomString.substring(0, length - prefix.length());
    }
}
