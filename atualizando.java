Realm realm = Realm.getDefaultInstance();

final Pessoa tony = realm.where(Pessoa.class).equalTo("id", 1).findFirst();

realm.executeTransaction(new Realm.Transaction() {
	@Override
	public void execute(Realm realm) {
		tony.setIdade(50);
	}
});
