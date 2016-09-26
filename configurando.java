public class CustomApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).build();
		Realm.setDefaultConfiguration(realmConfiguration);
	}
}
