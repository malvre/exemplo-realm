RealmConfiguration config = new RealmConfiguration.Builder(context)
    .schemaVersion(2)
    .migration(new MyMigration())
    .build()
	
	
RealmMigration migration = new RealmMigration() {
	@Override
	public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
	
	// DynamicRealm exposes an editable schema
	RealmSchema schema = realm.getSchema();
	
	if (oldVersion == 0) {
		schema.create("Person")
			.addField("name", String.class)
			.addField("age", int.class);
		oldVersion++;
     }

	if (oldVersion == 1) {
		schema.get("Person")
			.addField("id", long.class, FieldAttribute.PRIMARY_KEY)
            .addRealmObjectField("favoriteDog", schema.get("Dog"))
            .addRealmListField("dogs", schema.get("Dog"));
        oldVersion++;
     }
  }
}
