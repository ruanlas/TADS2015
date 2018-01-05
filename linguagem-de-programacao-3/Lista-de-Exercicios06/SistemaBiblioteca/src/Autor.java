
public class Autor {
	private String nome;
	private String titulacao;
	
	public Autor() {
	}
	public Autor(String nome, String titulacao) {
		this.nome = nome;
		this.titulacao = titulacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return getNome();
	}
	
}
