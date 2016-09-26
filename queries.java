Realm realm = Realm.getDefaultInstance();


// exemplo 1
RealmResults<Pessoa> jovens = realm.where(Pessoa.class).between("idade", 13, 20).findAll();
Pessoa john = jovens.where().equalTo("nome", "John").findFirst();

// exemplo 2
RealmResults<Pessoa> pessoas = realm.where(Pessoa.class).findAll();
for (Pessoa pessoa : pessoas) {
	showStatus(String.format(Locale.getDefault(), "%s (%d)", pessoa.getNome(), pessoa.getIdade()));
	showStatus(String.format("*** %s", pessoa.getCachorro().nome));
	for (Gato gato : pessoa.getGatos()) {
		showStatus(String.format("*** *** %s", gato.nome));
	}
}
