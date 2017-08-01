
public abstract class Produto {
	private double preco;
	private long codBarras;
	
	public Produto() {
		this.codBarras = 0;
		this.preco = 0;
	}

	public Produto(double preco, long codBarras) {
		this.preco = preco;
		this.codBarras = codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(long codBarras) {
		this.codBarras = codBarras;
	}
	
	
}
