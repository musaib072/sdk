import base64
from abc import ABC, abstractmethod
from datetime import datetime

import betterproto
from blake3 import blake3
from trinsicokapi import oberon
from trinsicokapi.proto.okapi.security.v1 import CreateOberonProofRequest

from trinsic.proto.services.account.v1 import AccountProfile
from trinsic.proto.services.common.v1 import Nonce


class SecurityProvider(ABC):
    @abstractmethod
    def get_auth_header(self, account_profile: AccountProfile, message: betterproto.Message) -> str:
        pass


class OberonSecurityProvider(SecurityProvider):
    def get_auth_header(self, account_profile: AccountProfile, message: betterproto.Message) -> str:
        if account_profile.protection and account_profile.protection.enabled:
            raise ValueError("The token must be unprotected before use")

        # Compute the hash of the request and capture current timestamp
        request_hash = blake3(bytes(message)).digest(64)

        nonce = Nonce(timestamp=int(datetime.now().timestamp() * 1000), request_hash=request_hash)
        proof = oberon.create_proof(
            CreateOberonProofRequest(token=account_profile.auth_token, data=account_profile.auth_data,
                                     nonce=bytes(nonce)))
        return (f"Oberon ver={1},"
                f"proof={base64.urlsafe_b64encode(bytes(proof.proof)).decode('utf-8')},"
                f"data={base64.urlsafe_b64encode(bytes(account_profile.auth_data)).decode('utf-8')},"
                f"nonce={base64.urlsafe_b64encode(bytes(nonce)).decode('utf-8')}")
