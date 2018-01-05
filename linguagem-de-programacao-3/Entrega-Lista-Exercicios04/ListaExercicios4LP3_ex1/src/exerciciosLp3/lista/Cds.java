package exerciciosLp3.lista;

public class Cds extends Produto {
	private int numFaixas;
	
	public Cds() {
		super();
	}
	
	public Cds(String nome, double preco, String codBarras, int numFaixas) {
		super(nome, preco, codBarras);
		this.numFaixas = numFaixas;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	@Override
	public String toString() {
		return "CD: " + getNome() + " \n"
				+ "Preço: R$ "+ getPreco() + "\n"
				+ "Numero de Faixas: " + this.numFaixas;
	}
}
