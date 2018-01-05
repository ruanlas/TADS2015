package exerciciosLp3.lista;

public class Livros extends Produto {
	private String autor;
	
	public Livros() {
		super();
	}
	public Livros(String nome, double preco, String codBarras, String autor){
		super(nome, preco, codBarras);
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro: " + getNome() + " \n"
				+ "Preço: R$ "+ getPreco() + "\n"
				+ "Autor: " + this.autor;
	}
	
	
}
