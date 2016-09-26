Realm realm = Realm.getDefaultInstance();

final Pessoa tony = realm.where(Pessoa.class).equalTo("nome", "Tony Stark").findFirst();

realm.executeTransaction(new Realm.Transaction() {
	@Override
	public void execute(Realm realm) {
		tony.setIdade(50);
	}
});
