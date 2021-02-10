# Samples for Java Azure Stack

## Requirement

Requires an Azure Subscription.

Configure following system enviornment for default authentication via client/secret.
- `AZURE_CLIENT_ID`
- `AZURE_CLIENT_SECRET`
- `AZURE_TENANT_ID`
- `AZURE_SUBSCRIPTION_ID`

Alternatively one can run it inside Azure resource, with Managed Identity enabled.
This way, only Subscription ID is required.
It can be configured as `AZURE_SUBSCRIPTION_ID` system enviornment, or via `AzureProfile` directly in code.
`AZURE_CLIENT_ID` is required if it is user-assigned managed identity.

## Modules

`azure-resourcemanager-azurestack` is POC of track1 Azure Stack aggregated package. Name is TBD.

Modules under `sdk` is Java SDK for services, as none of the SDK is released, it had to be included with the samples repository.

`samples` module contains the sample.

## Samples

- `ManageVirtualMachine` is sample for managing Azure Virtual Machine
- `ManageIotHub` is sample for managing Azure IoT Hub
