class Caneta {

	String cor;
	Carga carga;

	Caneta(String cor, Carga carga) {
		this.cor = cor;
		this.carga = carga;
	}
	//m�todo exerc�cio b)
	void trocar(Carga carga){
		this.carga = carga;
	}
	//m�todo exerc�cio c)
	void trocar(Caneta caneta){
		this.carga = caneta.carga;
	}
	void escrever(String texto) {
		if (carga.aindaTem()) {
			carga.gastarUma();
		} else {
			texto = "(sem carga)";
		}
		System.out.printf("%9s: %s\n", cor, texto);
	}

	public static void main(String[] args) {
		Caneta azul = new Caneta("Azul", new Carga(3));
		Caneta verde = new Caneta("Verde", new Carga(1));
		
		azul.escrever("Joaquim");
		verde.escrever("Jose");

		azul.escrever("da Silva");
		verde.escrever("Xavier");
		
		//Exerc�cio a)
		Carga cargaVerm = new Carga(3);
		Caneta vermelha1 = new Caneta("Vermelha1", cargaVerm);
		Caneta vermelha2 = new Caneta("Vermelha2", cargaVerm);
		vermelha1.escrever("Oi, ");
		vermelha2.escrever("meu ");
		vermelha1.escrever("nome ");
		vermelha2.escrever("� ");
		//Exerc�cio b)
		Carga novaCarga = new Carga(5);
		vermelha2.trocar(novaCarga);
		vermelha2.escrever("� ");
		vermelha1.escrever("Ruan ");
		vermelha2.escrever("Luiz ");
		//Exerc�cio c)
		vermelha1.trocar(vermelha2);
		vermelha1.escrever("Ol�, ");
		vermelha2.escrever("meu ");
		vermelha1.escrever("Oi ");
		vermelha2.escrever("Oi ");
	}

}

class Carga {

	int contador;

	Carga(int contador) {
		this.contador = contador;
	}

	boolean aindaTem() {
		return contador > 0;
	}

	void gastarUma() {
		--contador;
	}

}