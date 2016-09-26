Realm realm = Realm.getDefaultInstance();

Pessoa pessoa1 = realm.createObject(Pessoa.class);
pessoa1.setNome("Tony Stark");
pessoa1.setIdade(45);

Cachorro cachorro1 = realm.createObject(Cachorro.class);
cachorro1.nome = "Max";

Gato gato1 = realm.createObject(Gato.class);
gato1.nome = "Tobby";

Gato gato2 = realm.createObject(Gato.class);
gato2.nome = "Frajola";
        
pessoa1.setCachorro(cachorro1);

pessoa1.getGatos().add(gato1);
pessoa1.getGatos().add(gato2);
