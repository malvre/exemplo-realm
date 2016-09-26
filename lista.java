// ListView //////////////////////////////////////////////////////////////////////////////////
public class ListaActivity extends AppCompatActivity {

	private Realm realm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);
		realm = Realm.getDefaultInstance();

		RealmResults<Pessoa> timeStamps = realm.where(Pessoa.class).findAll();
		final PessoaAdapter adapter = new PessoaAdapter(this, timeStamps);

		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		realm.close();
	}

}


// Adapter //////////////////////////////////////////////////////////////////////////////
public class PessoaAdapter extends RealmBaseAdapter<Pessoa> {

	private static class ViewHolder {
		TextView textNome;
		TextView textIdade;
	}

	public PessoaAdapter(Context context, OrderedRealmCollection<Pessoa> data) {
		super(context, data);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if (convertView == null) {
			convertView = inflater.inflate(android.R.layout.simple_list_item_2, parent, false);
			viewHolder = new ViewHolder();
			viewHolder.textNome = (TextView) convertView.findViewById(android.R.id.text1);
			viewHolder.textIdade = (TextView) convertView.findViewById(android.R.id.text2);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		Pessoa p = adapterData.get(position);
		viewHolder.textNome.setText(p.getNome());
		viewHolder.textIdade.setText(String.valueOf(p.getIdade()));
		return convertView;
	}
}
