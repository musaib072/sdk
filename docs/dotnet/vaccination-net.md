# Vaccination Use Case for .NET Core

--8<----
/snippets/intro-infrastructure.md
/snippets/intro-use-case.md
--8<----

## Technical requirements

You can run this example on your local machine, or you can use our Gitpod setup to bootstrap a full development environment. If running locally, you only need .NET Core installed. We will use the dotnet CLI and the editor of your choice.

!!! note "Supported runtimes"
    Xamarin targets for iOS and Android are fully supported using the same package dependencies. Support for Blazor in Web Assembly will be available in a future release.

## Create new project

Let's create a new .NET console app that we will use to add our sample code

```bash
dotnet new console -n VaccinationSample && cd VaccinationSample
```

Add the required dependencies

```bash
dotnet add package Trinsic --prerelease
dotnet add package Okapi.Net --prerelease
```

!!! note ""
    The package `Okapi.Net` is already a dependency of `Trinsic` package, but we must add explicitly to bring in static library dependencies.
    This will not be required in future version and only package `Trinsic` can be used.

## Configure services

Create a reference to the wallet service that points to your ecosystem service. You should have received this URL with your ecosystem setup. In your `Program.cs` file add the following line replacing the `null` argument with your URL (ignore the `serverConfig` argument):

<!--codeinclude-->
```csharp
[Create Wallet](../../dotnet/Tests/Tests.cs) inside_block:createService
```
<!--/codeinclude-->

## Setup wallet profiles

Let's create three different profiles, each pointing to a separate wallet. Since we are using a single console app for this demo, we will simply set the active profile before each interaction to designate which actor is currently taking action.
To create a new wallet profile, we use the [Create Wallet](../reference/services/wallet-service/#create-wallet) feature.

<!--codeinclude-->
```csharp
[Setup Wallets](../../dotnet/Tests/Tests.cs) inside_block:setupActors
```
<!--/codeinclude-->

If you would like to save the profile for future use, you can simply export the serialized profile to a local storage. Please note that the profiles contain sensitive key data, so they should be stored in a secure enclave.

```csharp
using Google.Protobuf;
using System.IO;

// Serialize profile by exporting the binary protobuf form
File.WriteAllBytes("allison.bin", allison.ToByteString().ToByteArray());

// Create profile from existing data
var allison = WalletProfile.Parser.ParseFrom(File.ReadAllBytes("allison.bin"));
```

Read more about [security profiles](../reference/#authorization) and authentication.

## Certificate issuance

Upon receiving her vaccine, Allison also receives a digital certificate from the clinic. This certificate is digitally signed by the clinic, acting as an issuer.
The certificate is in a JSON form, and for this example, we will use the following JSON. Add this file to your project named `vaccination-certificate-unsigned.jsonld`.

=== "vaccination-certificate-unsigned.jsonld"
```json
----8<---- "devops/testdata/vaccination-certificate-unsigned.jsonld"
```

Let's set the active profile to the clinic, and call the issuance endpoint

<!--codeinclude-->
```csharp
[Issue Credential](../../dotnet/Tests/Tests.cs) inside_block:issueCredential
```
<!--/codeinclude-->

At this point, the clinic can send the signed credential to Allison using any available methods. These methods can include any message exchange protocol, or a custom transport. In this case, we'll assume that the credential was delivered to Allison in an offline environment.

## Store certificate in personal wallet

Allison can store this credential in her cloud wallet, simply by calling the [Insert Item](/reference/services/wallet-service/#insert-record) function.

<!--codeinclude-->
```csharp
[Store Credential](../../dotnet/Tests/Tests.cs) inside_block:storeCredential
```
<!--/codeinclude-->

## Proof of vaccination

Before boarding an airplane, Allison must show a proof of vaccination. The request for this proof also comes in a form of JSON, in this case a JSON-LD frame.
This request can be communicated using any exchange protocol. Again, we'll assume this was done offline.

Let's save this request in a file named `vaccination-certificate-frame.jsonld`

=== "vaccination-certificate-frame.jsonld"
```json
----8<---- "devops/testdata/vaccination-certificate-frame.jsonld"
```

This request asks Allison to provide proof of valid vaccination certificate, including the `issuer`, `batchNumber`and `countryOfVaccination` fields.

Allison can use the [Create Proof](../reference/services/wallet-service/#create-proof) functions to build a proof that will share only the requested fields.

<!--codeinclude-->
```csharp
[Share Credential](../../dotnet/Tests/Tests.cs) inside_block:shareCredential
```
<!--/codeinclude-->

## Verification

Allison shares the proof of credential she created with the airline. The airline can now use [Verify Proof](../reference/services/wallet-service/#verify-proof) functions to check the validity of the proof.

<!--codeinclude-->
```csharp
[Verify Credential](../../dotnet/Tests/Tests.cs) inside_block:verifyCredential
```
<!--/codeinclude-->

## Complete sample code

This sample is available in our [GitHub]() repo. You can also simply run the code using Replit and inspect the results.

??? example "Run example in Replit"
    <iframe frameborder="0" width="100%" height="650px" src="https://replit.com/@trinsic/VaccinationSample-dotnet?lite=true"></iframe>