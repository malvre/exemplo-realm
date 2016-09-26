Realm realm = Realm.getDefaultInstance();

RealmResults<Person> teenagers = realm.where(Person.class).between("age", 13, 20).findAll();

Person firstJohn = teenagers.where().equalTo("name", "John").findFirst();
