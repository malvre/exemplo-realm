public class Pessoa extends RealmObject {

	private String nome;
	private int idade;
	private Cachorro cachorro;
	private RealmList<Gato> gatos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cachorro getCachorro() {
		return cachorro;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

	public RealmList<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(RealmList<Gato> gatos) {
		this.gatos = gatos;
	}
}

public class Gato extends RealmObject {
	public String nome;
}

public class Cachorro extends RealmObject {
	public String nome;
}
