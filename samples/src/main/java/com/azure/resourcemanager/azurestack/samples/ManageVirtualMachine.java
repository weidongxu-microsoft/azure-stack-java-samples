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
import com.azure.resourcemanager.azurestack.AzureResourceManager;
import com.azure.resourcemanager.azurestack.compute.models.CreationData;
import com.azure.resourcemanager.azurestack.compute.models.DataDisk;
import com.azure.resourcemanager.azurestack.compute.models.Disk;
import com.azure.resourcemanager.azurestack.compute.models.DiskCreateOption;
import com.azure.resourcemanager.azurestack.compute.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.azurestack.compute.models.HardwareProfile;
import com.azure.resourcemanager.azurestack.compute.models.ImageReference;
import com.azure.resourcemanager.azurestack.compute.models.ManagedDiskParameters;
import com.azure.resourcemanager.azurestack.compute.models.NetworkInterfaceReference;
import com.azure.resourcemanager.azurestack.compute.models.NetworkProfile;
import com.azure.resourcemanager.azurestack.compute.models.OSProfile;
import com.azure.resourcemanager.azurestack.compute.models.StorageProfile;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachine;
import com.azure.resourcemanager.azurestack.compute.models.VirtualMachineSizeTypes;
import com.azure.resourcemanager.azurestack.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.azurestack.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.azurestack.network.models.AddressSpace;
import com.azure.resourcemanager.azurestack.network.models.NetworkInterface;
import com.azure.resourcemanager.azurestack.network.models.PublicIpAddress;
import com.azure.resourcemanager.azurestack.network.models.VirtualNetwork;

import java.util.Collections;
import java.util.UUID;

public final class ManageVirtualMachine {

    /**
     * Main function which runs the actual sample.
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(AzureResourceManager azure) {
        String rgName = randomString("rg", 16);
        Region region = Region.US_WEST;
        String networkName = randomString("net", 16);
        String virtualMachineName = randomString("vm", 16);
        String networkInterfaceName = randomString("ni", 16);
        String publicIpName = randomString("pip", 16);
        String username = "testUser";
        String password = "Pa5$" + randomString("", 16);
        String addressSpace = "10.5.100.0/24";
        String diskName = randomString("disk", 16);
        int diskSize = 16;

        try {
            azure.resources().resourceGroups().define(rgName)
                    .withRegion(region)
                    .create();

            VirtualNetwork network = azure.network().virtualNetworks().define(networkName)
                    .withRegion(region)
                    .withExistingResourceGroup(rgName)
                    .withAddressSpace(new AddressSpace().withAddressPrefixes(Collections.singletonList(addressSpace)))
                    .withSubnets(Collections.singletonList(
                            new SubnetInner()
                                    .withName("subnet1")
                                    .withAddressPrefix(addressSpace)
                    ))
                    .create();

            PublicIpAddress publicIpAddress = azure.network().publicIpAddresses().define(publicIpName)
                    .withRegion(region)
                    .withExistingResourceGroup(rgName)
                    .create();

            NetworkInterface networkInterface = azure.network().networkInterfaces().define(networkInterfaceName)
                    .withRegion(region)
                    .withExistingResourceGroup(rgName)
                    .withIpConfigurations(Collections.singletonList(
                            new NetworkInterfaceIpConfigurationInner()
                                    .withName("primary")
                                    .withPrimary(true)
                                    .withSubnet(network.subnets().get(0).innerModel())
                                    .withPublicIpAddress(publicIpAddress.innerModel())
                    ))
                    .create();

            // create
            VirtualMachine vm = azure.compute().virtualMachines().define(virtualMachineName)
                    .withRegion(region)
                    .withExistingResourceGroup(rgName)
                    .withHardwareProfile(new HardwareProfile().withVmSize(VirtualMachineSizeTypes.STANDARD_A1_V2))
                    .withStorageProfile(new StorageProfile().withImageReference(
                            new ImageReference()
                                    .withPublisher("Canonical")
                                    .withOffer("UbuntuServer")
                                    .withSku("18.04-LTS")
                                    .withVersion("latest")
                    ))
                    .withOsProfile(
                            new OSProfile()
                                    .withComputerName(virtualMachineName)
                                    .withAdminUsername(username)
                                    .withAdminPassword(password)
                    )
                    .withNetworkProfile(
                            new NetworkProfile()
                                    .withNetworkInterfaces(Collections.singletonList(
                                            new NetworkInterfaceReference()
                                                    .withPrimary(true)
                                                    .withId(networkInterface.id())
                                    ))
                    )
                    .create();

            Disk disk = azure.compute().disks().define(diskName)
                    .withRegion(region)
                    .withExistingResourceGroup(rgName)
                    .withDiskSizeGB(diskSize)
                    .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
                    .create();

            // update
            vm.update()
                    .withStorageProfile(vm.storageProfile().withDataDisks(Collections.singletonList(
                            new DataDisk()
                                    .withCreateOption(DiskCreateOptionTypes.ATTACH)
                                    .withManagedDisk(new ManagedDiskParameters().withId(disk.id()))
                    )))
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
