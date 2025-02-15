# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/trust-registry/v1/trust-registry.proto for package 'services.trustregistry.v1'

require 'grpc'
require 'services/trust-registry/v1/trust-registry_pb'

module Services
  module Trustregistry
    module V1
      module TrustRegistry
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.trustregistry.v1.TrustRegistry'

          # Adds a trust registry defintion to the ecosystem
          rpc :AddFramework, ::Services::Trustregistry::V1::AddFrameworkRequest, ::Services::Trustregistry::V1::AddFrameworkResponse
          rpc :RemoveFramework, ::Services::Trustregistry::V1::RemoveFrameworkRequest, ::Services::Trustregistry::V1::RemoveFrameworkResponse
          rpc :SearchRegistry, ::Services::Trustregistry::V1::SearchRegistryRequest, ::Services::Trustregistry::V1::SearchRegistryResponse
          # Registers an authoritative issuer with a credential template
          rpc :RegisterIssuer, ::Services::Trustregistry::V1::RegisterIssuerRequest, ::Services::Trustregistry::V1::RegisterIssuerResponse
          # Registers an authoritative verifier with a credential template
          rpc :RegisterVerifier, ::Services::Trustregistry::V1::RegisterVerifierRequest, ::Services::Trustregistry::V1::RegisterVerifierResponse
          # Removes an authoritative issuer with a credential template from the trust registry
          rpc :UnregisterIssuer, ::Services::Trustregistry::V1::UnregisterIssuerRequest, ::Services::Trustregistry::V1::UnregisterIssuerResponse
          # Removes an authoritative verifier with a presentation template from the trust registry
          rpc :UnregisterVerifier, ::Services::Trustregistry::V1::UnregisterVerifierRequest, ::Services::Trustregistry::V1::UnregisterVerifierResponse
          rpc :CheckIssuerStatus, ::Services::Trustregistry::V1::CheckIssuerStatusRequest, ::Services::Trustregistry::V1::CheckIssuerStatusResponse
          rpc :CheckVerifierStatus, ::Services::Trustregistry::V1::CheckVerifierStatusRequest, ::Services::Trustregistry::V1::CheckVerifierStatusResponse
          rpc :FetchData, ::Services::Trustregistry::V1::FetchDataRequest, stream(::Services::Trustregistry::V1::FetchDataResponse)
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
