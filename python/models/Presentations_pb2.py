# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: models/Presentations.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from src.trinsic.models import Attributes_pb2 as models_dot_Attributes__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='models/Presentations.proto',
  package='trinsic.services',
  syntax='proto3',
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1amodels/Presentations.proto\x12\x10trinsic.services\x1a\x17models/Attributes.proto\"S\n\x1bGeneratePresentationRequest\x12\x14\n\x0c\x63redentialId\x18\x01 \x01(\t\x12\x1e\n\x16presentationTemplateId\x18\x02 \x01(\t\",\n\x1cGeneratePresentationResponse\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\t\")\n\x19SubmitPresentationRequest\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\t\"\x87\x01\n\x1aSubmitPresentationResponse\x12\x1e\n\x16presentationTemplateId\x18\x01 \x01(\t\x12\x10\n\x08holderId\x18\x02 \x01(\t\x12\x37\n\x12verifiedAttributes\x18\x03 \x03(\x0b\x32\x1b.trinsic.services.Attributeb\x06proto3'
  ,
  dependencies=[models_dot_Attributes__pb2.DESCRIPTOR,])




_GENERATEPRESENTATIONREQUEST = _descriptor.Descriptor(
  name='GeneratePresentationRequest',
  full_name='trinsic.services.GeneratePresentationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='credentialId', full_name='trinsic.services.GeneratePresentationRequest.credentialId', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='presentationTemplateId', full_name='trinsic.services.GeneratePresentationRequest.presentationTemplateId', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=73,
  serialized_end=156,
)


_GENERATEPRESENTATIONRESPONSE = _descriptor.Descriptor(
  name='GeneratePresentationResponse',
  full_name='trinsic.services.GeneratePresentationResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='trinsic.services.GeneratePresentationResponse.data', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=158,
  serialized_end=202,
)


_SUBMITPRESENTATIONREQUEST = _descriptor.Descriptor(
  name='SubmitPresentationRequest',
  full_name='trinsic.services.SubmitPresentationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='trinsic.services.SubmitPresentationRequest.data', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=204,
  serialized_end=245,
)


_SUBMITPRESENTATIONRESPONSE = _descriptor.Descriptor(
  name='SubmitPresentationResponse',
  full_name='trinsic.services.SubmitPresentationResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='presentationTemplateId', full_name='trinsic.services.SubmitPresentationResponse.presentationTemplateId', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='holderId', full_name='trinsic.services.SubmitPresentationResponse.holderId', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='verifiedAttributes', full_name='trinsic.services.SubmitPresentationResponse.verifiedAttributes', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=248,
  serialized_end=383,
)

_SUBMITPRESENTATIONRESPONSE.fields_by_name['verifiedAttributes'].message_type = models_dot_Attributes__pb2._ATTRIBUTE
DESCRIPTOR.message_types_by_name['GeneratePresentationRequest'] = _GENERATEPRESENTATIONREQUEST
DESCRIPTOR.message_types_by_name['GeneratePresentationResponse'] = _GENERATEPRESENTATIONRESPONSE
DESCRIPTOR.message_types_by_name['SubmitPresentationRequest'] = _SUBMITPRESENTATIONREQUEST
DESCRIPTOR.message_types_by_name['SubmitPresentationResponse'] = _SUBMITPRESENTATIONRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GeneratePresentationRequest = _reflection.GeneratedProtocolMessageType('GeneratePresentationRequest', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEPRESENTATIONREQUEST,
  '__module__' : 'models.Presentations_pb2'
  # @@protoc_insertion_point(class_scope:trinsic.services.GeneratePresentationRequest)
  })
_sym_db.RegisterMessage(GeneratePresentationRequest)

GeneratePresentationResponse = _reflection.GeneratedProtocolMessageType('GeneratePresentationResponse', (_message.Message,), {
  'DESCRIPTOR' : _GENERATEPRESENTATIONRESPONSE,
  '__module__' : 'models.Presentations_pb2'
  # @@protoc_insertion_point(class_scope:trinsic.services.GeneratePresentationResponse)
  })
_sym_db.RegisterMessage(GeneratePresentationResponse)

SubmitPresentationRequest = _reflection.GeneratedProtocolMessageType('SubmitPresentationRequest', (_message.Message,), {
  'DESCRIPTOR' : _SUBMITPRESENTATIONREQUEST,
  '__module__' : 'models.Presentations_pb2'
  # @@protoc_insertion_point(class_scope:trinsic.services.SubmitPresentationRequest)
  })
_sym_db.RegisterMessage(SubmitPresentationRequest)

SubmitPresentationResponse = _reflection.GeneratedProtocolMessageType('SubmitPresentationResponse', (_message.Message,), {
  'DESCRIPTOR' : _SUBMITPRESENTATIONRESPONSE,
  '__module__' : 'models.Presentations_pb2'
  # @@protoc_insertion_point(class_scope:trinsic.services.SubmitPresentationResponse)
  })
_sym_db.RegisterMessage(SubmitPresentationResponse)


# @@protoc_insertion_point(module_scope)
