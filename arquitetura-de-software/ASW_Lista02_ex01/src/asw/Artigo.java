package asw;

public abstract class Artigo {
	private double preco;
	private Desconto desconto;
	
	public Artigo(double preco, Desconto desconto) {
		this.preco = preco;
		this.desconto = desconto;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean podeDescontar(int percentual) {
		return (desconto.podeAplicarDesconto(percentual));
	}
	public void aplicarDesconto(int percentual) {
		double valorADescontar = this.preco * desconto.descontar(percentual);
		this.preco -= valorADescontar;
	}
	public void mudarTipoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	public void imprime() {
		System.out.println("Preço: R$ "+preco);
	}
}
