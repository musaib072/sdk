package trinsic;

import org.junit.jupiter.api.Assertions;
import trinsic.okapi.DidException;
import trinsic.services.AccountService;
import trinsic.services.TrustRegistryService;
import trinsic.services.trustregistry.v1.TrustRegistryOuterClass;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TrustRegistryDemo {
    public static void main(String[] args) throws IOException, DidException, ExecutionException, InterruptedException {
        // Make sure you set the TEST_SERVER_ENDPOINT environment variable
        run();
    }

    public static void run() throws IOException, DidException, ExecutionException, InterruptedException {
        var accountService = new AccountService(null,TrinsicUtilities.getTestServerConfig());
        var account = accountService.signIn(null).get().getProfile();
        var service = new TrustRegistryService(account, TrinsicUtilities.getTestServerConfig());

        final String didUri = "did:example:test";
        final String frameworkUri = "https://example.com";
        final String typeUri = "https://schema.org/Card";
        service.registerIssuer(TrustRegistryOuterClass.RegisterIssuerRequest.newBuilder()
                .setDidUri(didUri).setGovernanceFrameworkUri(frameworkUri).setCredentialTypeUri(typeUri).build());

        service.registerVerifier(TrustRegistryOuterClass.RegisterVerifierRequest.newBuilder().setDidUri(didUri).setGovernanceFrameworkUri(frameworkUri).setPresentationTypeUri(typeUri).build());

        var issuerStatus = service.checkIssuerStatus(TrustRegistryOuterClass.CheckIssuerStatusRequest.newBuilder().setDidUri(didUri).setGovernanceFrameworkUri(frameworkUri).setCredentialTypeUri(typeUri).build()).get();
        Assertions.assertEquals(TrustRegistryOuterClass.RegistrationStatus.CURRENT, issuerStatus.getStatus());

        var verifierStatus = service.checkIssuerStatus(TrustRegistryOuterClass.CheckIssuerStatusRequest.newBuilder().setDidUri(didUri).setGovernanceFrameworkUri(frameworkUri).setCredentialTypeUri(typeUri).build()).get();
        Assertions.assertEquals(TrustRegistryOuterClass.RegistrationStatus.CURRENT, verifierStatus.getStatus());

        var searchResult = service.searchRegistry(null).get();

        Assertions.assertNotNull(searchResult);
        Assertions.assertNotNull(searchResult.getItemsJson());
        Assertions.assertTrue(searchResult.getItemsJson().length() > 0);
    }
}
