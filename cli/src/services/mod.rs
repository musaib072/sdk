mod account;
pub(crate) mod config;
mod issuer;
mod provider;
mod template;
mod trustregistry;
mod wallet;

use self::config::{DefaultConfig, Error};

pub(crate) fn execute(args: &Service, config: DefaultConfig) -> Result<(), Error> {
    match args {
        Service::Wallet(args) => wallet::execute(&args, config),
        Service::Account(args) => account::execute(&args, config),
        Service::VerifiableCredential(args) => Ok(issuer::execute(&args, config)),
        Service::Provider(args) => provider::execute(&args, config),
        Service::Config(args) => Ok(config::execute(&args)),
        Service::TrustRegistry(args) => trustregistry::execute(&args, &config),
        Service::Template(args) => template::execute(&args, &config),
        _ => Err(Error::UnknownCommand),
    }
}

#[derive(Debug, PartialEq)]
pub(crate) enum Service<'a> {
    DIDComm(crate::parser::didcomm::Command<'a>),
    DIDKey(crate::parser::didkey::Command<'a>),
    Wallet(crate::parser::wallet::Command<'a>),
    VerifiableCredential(crate::parser::issuer::Command<'a>),
    Provider(crate::parser::provider::Command<'a>),
    Config(crate::parser::config::Command<'a>),
    Account(crate::parser::account::Command<'a>),
    TrustRegistry(crate::parser::trustregistry::Command),
    Template(crate::parser::template::TemplateCommand),
    Unknown,
}
