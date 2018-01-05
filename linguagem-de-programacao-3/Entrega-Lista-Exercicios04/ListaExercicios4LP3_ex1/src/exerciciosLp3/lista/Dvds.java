package exerciciosLp3.lista;

public class Dvds extends Produto{
	private int duracaoSeg;
	
	public Dvds() {
		super();
	}

	public Dvds(String nome, double preco, String codBarras, int duracaoSeg) {
		super(nome, preco, codBarras);
		this.duracaoSeg = duracaoSeg;
	}
	
	public int getDuracaoSeg() {
		return duracaoSeg;
	}

	public void setDuracaoSeg(int duracaoSeg) {
		this.duracaoSeg = duracaoSeg;
	}
	@Override
	public String toString() {
		return "DVD: " + getNome() + " \n"
				+ "Preço: R$ "+ getPreco() + "\n"
				+ "Duração (em segundos): " + this.duracaoSeg;
	}
}
