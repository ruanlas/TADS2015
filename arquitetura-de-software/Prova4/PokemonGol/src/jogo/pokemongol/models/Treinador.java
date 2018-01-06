package jogo.pokemongol.models;

public class Treinador {
	private long id;
	private String nome;
	private String cidade;
	private int idade;
	
	public Treinador() {
	}
	
	
	public Treinador(long id, String nome, String cidade, int idade) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}


	public Treinador(String nome, String cidade, int idade) {
		this.id = -1;
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}

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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Treinador [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", idade=" + idade + "]";
	}
	
}
