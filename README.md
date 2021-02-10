# Samples for Java SDK for Azure Stack

## Limitation

The samples only works for Azure Cloud, not Azure Stack, as the api-version of the services involved is not yet available to any Azure Stack.

## Requirement

Requires an Azure Subscription.

JDK 8 or above, and Maven.

Configure following system environment for default authentication via client/secret.
- `AZURE_CLIENT_ID`
- `AZURE_CLIENT_SECRET`
- `AZURE_TENANT_ID`
- `AZURE_SUBSCRIPTION_ID`

Alternatively one can run it inside Azure resource, with Managed Identity enabled.
This way, only Subscription ID is required. It can be configured as `AZURE_SUBSCRIPTION_ID` system environment, or via `AzureProfile` directly in code.
`AZURE_CLIENT_ID` is required if it is user-assigned managed identity.

## Modules

`azure-resourcemanager-azurestack` module is the proof of concept of the new Azure Stack aggregated package. Artifact name and package name is TBD.

Modules under `sdk` is Java SDK for services, as none of the SDK is released, it had to be included with this repository. Artifact name and package name is TBD.

`samples` module contains the classes for samples.

## Samples

- [`ManageVirtualMachine`](samples/src/main/java/com/azure/resourcemanager/azurestack/samples/ManageVirtualMachine.java) is sample for managing Azure Virtual Machine.
- [`ManageIotHub`](samples/src/main/java/com/azure/resourcemanager/azurestack/samples/ManageIotHub.java) is sample for managing Azure IoT Hub.
