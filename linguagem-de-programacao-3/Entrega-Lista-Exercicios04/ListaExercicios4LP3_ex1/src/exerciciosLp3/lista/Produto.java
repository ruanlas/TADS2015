package exerciciosLp3.lista;

public class Produto {
	private String nome;
	private double preco;
	private String codBarras;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, String codBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	@Override
	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		if (this.codBarras.equals(p.getCodBarras())) {
			return true;
		}else {
			return false;
		}
	}
	
}
