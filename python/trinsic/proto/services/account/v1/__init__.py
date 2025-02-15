# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/account/v1/account.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict, List

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


class ConfirmationMethod(betterproto.Enum):
    """Confirmation method type for two-factor workflows"""

    # No confirmation required
    None_ = 0
    # Email confirmation required
    Email = 1
    # SMS confirmation required
    Sms = 2
    # Confirmation from a connected device is required
    ConnectedDevice = 3
    # Indicates third-party method of confirmation is required
    Other = 10


@dataclass(eq=False, repr=False)
class SignInRequest(betterproto.Message):
    """Request for creating new account"""

    # Account registration details
    details: "AccountDetails" = betterproto.message_field(1)
    # Invitation code associated with this registration This field is optional.
    invitation_code: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class AccountDetails(betterproto.Message):
    """Account Registration Details"""

    # Account name (optional)
    name: str = betterproto.string_field(1)
    # Email account (required)
    email: str = betterproto.string_field(2)
    # SMS number including country code (optional)
    sms: str = betterproto.string_field(3)


@dataclass(eq=False, repr=False)
class SignInResponse(betterproto.Message):
    """
    Response for creating new account This object will indicate if a
    confirmation code was sent to one of the users two-factor methods like
    email, SMS, etc.
    """

    # The status of the response
    status: "__common_v1__.ResponseStatus" = betterproto.enum_field(1)
    # Indicates if confirmation of account is required. This settings is
    # configured globally by the server administrator.
    confirmation_method: "ConfirmationMethod" = betterproto.enum_field(3)
    # Contains authentication data for use with the current device. This object
    # must be stored in a secure place. It can also be protected with a PIN, but
    # this is optional. See the docs at https://docs.trinsic.id for more
    # information on working with authentication data.
    profile: "AccountProfile" = betterproto.message_field(4)


@dataclass(eq=False, repr=False)
class AccountProfile(betterproto.Message):
    """
    Device profile containing sensitive authentication data. This information
    should be stored securely
    """

    # The type of profile, used to differentiate between protocol schemes or
    # versions
    profile_type: str = betterproto.string_field(1)
    # Auth data containg information about the current device access
    auth_data: bytes = betterproto.bytes_field(2)
    # Secure token issued by server used to generate zero-knowledge proofs
    auth_token: bytes = betterproto.bytes_field(3)
    # Token security information about the token. If token protection is enabled,
    # implementations must supply protection secret before using the token for
    # authentication.
    protection: "TokenProtection" = betterproto.message_field(4)


@dataclass(eq=False, repr=False)
class TokenProtection(betterproto.Message):
    """Token protection info"""

    # Indicates if token is protected using a PIN, security code, HSM secret,
    # etc.
    enabled: bool = betterproto.bool_field(1)
    # The method used to protect the token
    method: "ConfirmationMethod" = betterproto.enum_field(2)


@dataclass(eq=False, repr=False)
class InfoRequest(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class InfoResponse(betterproto.Message):
    # The account details associated with the calling request context
    details: "AccountDetails" = betterproto.message_field(1)
    # any ecosystems the account has access to
    ecosystems: List["__provider_v1__.Ecosystem"] = betterproto.message_field(2)


@dataclass(eq=False, repr=False)
class ListDevicesRequest(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class ListDevicesResponse(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class RevokeDeviceRequest(betterproto.Message):
    pass


@dataclass(eq=False, repr=False)
class RevokeDeviceResponse(betterproto.Message):
    pass


class AccountStub(betterproto.ServiceStub):
    async def sign_in(
        self, *, details: "AccountDetails" = None, invitation_code: str = ""
    ) -> "SignInResponse":

        request = SignInRequest()
        if details is not None:
            request.details = details
        request.invitation_code = invitation_code

        return await self._unary_unary(
            "/services.account.v1.Account/SignIn", request, SignInResponse
        )

    async def info(self) -> "InfoResponse":

        request = InfoRequest()

        return await self._unary_unary(
            "/services.account.v1.Account/Info", request, InfoResponse
        )

    async def list_devices(self) -> "ListDevicesResponse":

        request = ListDevicesRequest()

        return await self._unary_unary(
            "/services.account.v1.Account/ListDevices", request, ListDevicesResponse
        )

    async def revoke_device(self) -> "RevokeDeviceResponse":

        request = RevokeDeviceRequest()

        return await self._unary_unary(
            "/services.account.v1.Account/RevokeDevice", request, RevokeDeviceResponse
        )


class AccountBase(ServiceBase):
    async def sign_in(
        self, details: "AccountDetails", invitation_code: str
    ) -> "SignInResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def info(self) -> "InfoResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def list_devices(self) -> "ListDevicesResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def revoke_device(self) -> "RevokeDeviceResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_sign_in(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "details": request.details,
            "invitation_code": request.invitation_code,
        }

        response = await self.sign_in(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_info(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {}

        response = await self.info(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_list_devices(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {}

        response = await self.list_devices(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_revoke_device(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {}

        response = await self.revoke_device(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.account.v1.Account/SignIn": grpclib.const.Handler(
                self.__rpc_sign_in,
                grpclib.const.Cardinality.UNARY_UNARY,
                SignInRequest,
                SignInResponse,
            ),
            "/services.account.v1.Account/Info": grpclib.const.Handler(
                self.__rpc_info,
                grpclib.const.Cardinality.UNARY_UNARY,
                InfoRequest,
                InfoResponse,
            ),
            "/services.account.v1.Account/ListDevices": grpclib.const.Handler(
                self.__rpc_list_devices,
                grpclib.const.Cardinality.UNARY_UNARY,
                ListDevicesRequest,
                ListDevicesResponse,
            ),
            "/services.account.v1.Account/RevokeDevice": grpclib.const.Handler(
                self.__rpc_revoke_device,
                grpclib.const.Cardinality.UNARY_UNARY,
                RevokeDeviceRequest,
                RevokeDeviceResponse,
            ),
        }


from ...common import v1 as __common_v1__
from ...provider import v1 as __provider_v1__
