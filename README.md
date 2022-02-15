# Technical analysis

## Goal

We should be able to create a PLUG that handles the creation of a default search index for
people in DNA instances. When users do not specify a search index, we should provide a default one
for them due to a necesity of Treadmiller engine to have one.

## Index Specifications

- name should be "Default DNA Index"
- it should be active
- It should only apply for DNA users
- the fields for searching should be full name and position title
- Admins should be able to modify it or delete it

## Create Index Specifications

The class `M_crmsearch_MODEL_PersonIndexSpecification` stores the specifications of our index.

### usefull methods:
to load the index specifications we could use a secuence of methods:
- `setIndexName(string $name)`
- `setIsActive(bool $isActive)`
- `setHasDnaUsersOnly(bool $has)`
- `setEntityExtensionId(int $entityExtensionId)`
- `setFields(array $fields)`
- `setSchemaFields(array $schemaFields)`

or, as all values are going to be constant, we could use the method `loadFromRichJson` sending as
parameter a json encoded array.

## Save Specifications

To save those specifications we could use `M_crmsearch_service_IndexSpecificationService` and its method
`save`, sending to it the specification created earlier.

## PLUG creation

We could wrap all this in a PLUG that handles the creation of the index when DNA is on, and later
set it as default.

The structure of the PLUG could be:

```php
class M_social_PLUG_treadmiller_DefaultIndexCreator {
	private const SPEC_JSON = [
		//json array with the key-pair values
	]
	
	static function createDefaultIndex() {
		//code mention above
	}
}
```
