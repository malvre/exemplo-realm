Realm realm = Realm.getDefaultInstance();

final Pessoa tony = realm.where(Pessoa.class).equalTo("nome", "Tony Stark").findFirst();
tony.deleteFromRealm();
