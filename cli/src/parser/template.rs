use std::collections::HashMap;

use clap::{App, AppSettings, Arg, ArgMatches, SubCommand};
use serde::*;

#[derive(Debug, PartialEq)]
pub enum TemplateCommand {
    Create(CreateTemplateArgs),
    Get(GetTemplateArgs),
    List(ListTemplatesArgs),
    Search(SearchTemplatesArgs),
    Delete(DeleteTemplateArgs),
}

#[derive(Debug, PartialEq)]
pub struct CreateTemplateArgs {
    pub name: String,
    pub fields_file: Option<String>,
    pub fields_data: Option<String>,
    pub allow_additional: bool,
}

#[derive(Debug, PartialEq)]
pub struct GetTemplateArgs {
    pub id: String,
}

#[derive(Debug, PartialEq)]
pub struct ListTemplatesArgs {
    pub query: String,
    pub continuation_token: String,
}

#[derive(Debug, PartialEq)]
pub struct SearchTemplatesArgs {
    pub query: String,
    pub continuation_token: String,
}

#[derive(Debug, PartialEq)]
pub struct DeleteTemplateArgs {
    pub id: String,
}

#[derive(Serialize, Deserialize, Debug)]
pub struct Field {
    #[serde(default)]
    description: String,
    #[serde(default)]
    r#type: FieldType,
    #[serde(default)]
    optional: bool,
}

#[derive(Serialize, Deserialize, Debug)]
#[serde(rename_all = "lowercase")]
pub enum FieldType {
    String,
    Number,
    DateTime,
    Bool,
}

use crate::proto::services::verifiablecredentials::templates::v1::FieldType as ProtoFieldType;
use crate::proto::services::verifiablecredentials::templates::v1::TemplateField as ProtoField;

impl Default for FieldType {
    fn default() -> Self {
        FieldType::String
    }
}

impl Into<ProtoFieldType> for FieldType {
    fn into(self) -> ProtoFieldType {
        match self {
            FieldType::String => ProtoFieldType::String,
            FieldType::Number => ProtoFieldType::Number,
            FieldType::DateTime => ProtoFieldType::Datetime,
            FieldType::Bool => ProtoFieldType::Bool,
        }
    }
}

impl Into<ProtoField> for Field {
    fn into(self) -> ProtoField {
        let t: ProtoFieldType = self.r#type.into();
        return ProtoField {
            description: self.description,
            optional: self.optional,
            r#type: t as i32,
        };
    }
}

pub fn to_map(map: HashMap<String, Field>) -> HashMap<String, ProtoField> {
    let mut result: HashMap<String, ProtoField> = HashMap::new();

    for (k, v) in map {
        result.insert(k, v.into());
    }
    result
}

pub fn parse(args: &ArgMatches) -> TemplateCommand {
    if args.is_present("create") {
        return create(
            &args
                .subcommand_matches("create")
                .expect("Error parsing request"),
        );
    } else if args.is_present("get") {
        return get(&args
            .subcommand_matches("get")
            .expect("Error parsing request"));
    } else if args.is_present("list") {
        return list(
            &args
                .subcommand_matches("list")
                .expect("Error parsing request"),
        );
    } else if args.is_present("search") {
        return search(
            &args
                .subcommand_matches("search")
                .expect("Error parsing request"),
        );
    } else {
        panic!("Unrecognized command")
    }
}

fn create(args: &ArgMatches) -> TemplateCommand {
    TemplateCommand::Create(CreateTemplateArgs {
        name: args
            .value_of("name")
            .map_or(String::default(), |x| x.to_string()),
        fields_file: args.value_of("input-file").map(|x| x.to_string()),
        fields_data: args.value_of("input").map(|x| x.to_string()),
        allow_additional: args.is_present("allow-additional"),
    })
}

fn get(args: &ArgMatches) -> TemplateCommand {
    TemplateCommand::Get(GetTemplateArgs {
        id: args
            .value_of("id")
            .map_or(String::default(), |x| x.to_string()),
    })
}

fn list(args: &ArgMatches) -> TemplateCommand {
    TemplateCommand::List(ListTemplatesArgs {
        query: args
            .value_of("query")
            .map_or("SELECT * FROM c".to_string(), |x| x.to_string()),
        continuation_token: args
            .value_of("continuation-token")
            .map_or(String::default(), |x| x.to_string()),
    })
}

fn search(args: &ArgMatches) -> TemplateCommand {
    TemplateCommand::Search(SearchTemplatesArgs {
        query: args
            .value_of("query")
            .map_or("SELECT * FROM c".to_string(), |x| x.to_string()),
        continuation_token: args
            .value_of("continuation-token")
            .map_or(String::default(), |x| x.to_string()),
    })
}

pub(crate) fn subcommand<'a, 'b>() -> App<'a, 'b> {
    SubCommand::with_name("template")
        .about("Manage templates and schemas for Verifiable Credentials")
        .setting(AppSettings::SubcommandRequiredElseHelp)
        .subcommand(
            SubCommand::with_name("create")
            .setting(AppSettings::ArgRequiredElseHelp)
            .about("Create new template")
            .after_help("EXAMPLES:\r\n\ttrinsic template create --name 'My Credential' --fields-data '{\\\"firstName\\\":{}}'")
            .arg(Arg::from_usage("-n --name <TEMPLATE_NAME> 'Sets the name of the template'").required(true))
            .arg(Arg::from_usage("--fields-data <JSON> 'Sets the fields of the template formatted as JSON'").required(false))
            .arg(Arg::from_usage("--fields-file <FILE> 'Sets the file containing fields JSON data'").required(false))
            .arg(Arg::from_usage("--allow-additional 'Sets if additional fields are allowed when issuing credentials from this template'").required(false)),
        )
        .subcommand(
            SubCommand::with_name("get")
            .setting(AppSettings::ArgRequiredElseHelp)
            .about("Get template data")
            .after_help("EXAMPLES:\r\n\ttrinsic template get --id <TEMPLATE_ID>")
            .arg(Arg::from_usage("-i --id <TEMPLATE_ID> 'Sets the id of the template'").required(true)),
        )
        .subcommand(
            SubCommand::with_name("list")
            .about("List all templates")
            .arg(Arg::from_usage("--query <SQL> 'Sets custom query to use'").required(false))
            .arg(Arg::from_usage("--continuation-token <TOKEN> 'Sets the continuation token of a previous result set'").required(false))
        )
        .subcommand(
            SubCommand::with_name("search")
            .about("Search credential templates")
            .arg(Arg::from_usage("--query <SQL> 'Sets custom query to use'").required(false))
            .arg(Arg::from_usage("--continuation-token <TOKEN> 'Sets the continuation token of a previous result set'").required(false))
        )
        .subcommand(
            SubCommand::with_name("delete")
                .setting(AppSettings::ArgRequiredElseHelp)
                .about("Delete a template"),
        )
}

#[cfg(test)]
pub mod test {
    use std::collections::{BTreeMap, HashMap};

    use serde::__private::de::StrDeserializer;

    use super::{Field, FieldType};

    #[test]
    fn serialize_fields() {
        let f = super::Field {
            optional: false,
            r#type: FieldType::Number,
            description: "desc".to_string(),
        };

        let json = serde_json::to_string_pretty(&f);

        println!("{}", json.unwrap())
    }

    #[test]
    fn deserialize_field_map() {
        let json = r#"{
            "firstName": {},
            "lastName": {
                "optional": true
            },
            "age": {
                "description": "age of subject",
                "type": "number"
            }
        }"#;

        let obj: BTreeMap<String, Field> = serde_json::from_str(json).unwrap();

        println!("{:#?}", obj);
    }

    #[test]
    fn serialize_map() {
        let mut f: BTreeMap<String, Field> = BTreeMap::new();
        f.insert(
            "firstName".to_string(),
            Field {
                description: "my field".to_string(),
                r#type: FieldType::Number,
                optional: true,
            },
        );

        let json = serde_json::to_string_pretty(&f);

        println!("{}", json.unwrap());
    }
}
