require "./test/test_helper"
require 'json'
require 'okapi'
require 'uri'
require 'trinsic'

class TrinsicServiceTest < Minitest::Test

  def get_library_path
    return File.expand_path(File.join(File.dirname(__FILE__), 'libs'))
  end

  def before_setup
    Okapi::set_library_path(get_library_path)
    Okapi::load_native_library
  end

  def test_servicebase_setprofile
    server_address = ENV["TRINSIC_SERVER_ADDRESS"]
    wallet_service = Trinsic::WalletService.new(server_address)
    assert_raises Exception do
      wallet_service.metadata
    end
    walletProfile = wallet_service.await.create_wallet("").value
    wallet_service.set_profile(walletProfile)
    metadata = wallet_service.metadata
    assert(metadata != nil, "Valid metadata once profile is set")
  end

  def test_providerservice_inviteparticipant
    server_address = ENV["TRINSIC_SERVER_ADDRESS"]
    wallet_service = Trinsic::WalletService.new(server_address)
    provider_service = Trinsic::ProviderService.new(server_address)

    invite_request = Services::Provider::V1::InviteRequest.new(:description=>"I dunno",
                                                          :email=>"scott.phillips@trinsic.id")
    invite_response = provider_service.await.invite_participant(invite_request)
    assert(invite_response != nil)
    # TODO - Verify invitation status response
  end

  def test_url_parse
    valid_http_address = "http://localhost:5000"
    valid_https_address = "https://localhost:5000" # Throws because not supported
    missing_port_address = "http://localhost"
    missing_protocol_address = "localhost:5000"
    blank_address = ""
    addresses = [valid_http_address, valid_https_address, missing_port_address, missing_protocol_address, blank_address]
    throws_exception = [false, true, true, true, true]

    (0..addresses.length).each { |ij|
      if throws_exception[ij]
        if addresses[ij] == valid_https_address
          assert_raises UncaughtThrowError do
            wallet_service = Trinsic::WalletService.new(addresses[ij])
          end
        else
          assert_raises Exception do
            wallet_service = Trinsic::WalletService.new(addresses[ij])
          end
        end
      else
        wallet_service = Trinsic::WalletService.new(addresses[ij])
      end
    }
  end

  def test_that_it_has_a_version_number
    refute_nil ::Trinsic::VERSION
  end

  def data_base_path
    return File.expand_path(File.join(File.dirname(__FILE__), "..", "..", "devops", "testdata"))
  end

  def vaccine_cert_unsigned_path
    return File.expand_path(File.join(data_base_path, "vaccination-certificate-unsigned.jsonld"))
  end

  def vaccine_cert_frame_path
    return File.expand_path(File.join(data_base_path, "vaccination-certificate-frame.jsonld"))
  end

  def test_trinsic_services_demo
    server_address = ENV["TRINSIC_SERVER_ADDRESS"]
    wallet_service = Trinsic::WalletService.new(server_address)

    # SETUP ACTORS
    # Create 3 different profiles for each participant in the scenario
    allison = wallet_service.await.create_wallet("").value
    clinic = wallet_service.await.create_wallet("").value
    airline = wallet_service.await.create_wallet("").value

    # Store profile for later use
    # File.WriteAllBytes("allison.bin", allison.ToByteString().ToByteArray());

    # Create profile from existing data
    # var allison = WalletProfile.Parser.ParseFrom(File.ReadAllBytes("allison.bin"));

    # ISSUE CREDENTIAL
    # Sign a credential as the clinic and send it to Allison
    wallet_service.set_profile(clinic)
    text = File.open(self.vaccine_cert_unsigned_path).read
    credential_json = JSON.parse(text)

    credential = wallet_service.await.issue_credential(credential_json).value

    puts "Credential: #{credential}"

    # STORE CREDENTIAL
    # Alice stores the credential in her cloud wallet.
    wallet_service.set_profile(allison)
    item_id = wallet_service.await.insert_item(credential).value
    puts "item id = #{item_id}"

    # SHARE CREDENTIAL
    # Allison shares the credential with the venue.
    # The venue has communicated with Allison the details of the credential
    # that they require expressed as a JSON-LD frame.
    wallet_service.set_profile(allison)

    text2 = File.open(self.vaccine_cert_frame_path).read
    proof_request_json = JSON.parse(text2)

    credential_proof = wallet_service.await.create_proof(document_id = item_id, reveal_document = proof_request_json).value

    puts "Proof: #{credential_proof}"

    # VERIFY CREDENTIAL
    # The airline verifies the credential
    wallet_service.set_profile(airline)
    valid = wallet_service.verify_proof(credential_proof)

    puts "Verification result: #{valid}"

    assert(valid, "Credential is valid!")
  end
end
