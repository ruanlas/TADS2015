package jogo.pokemongol.models;

public class Pokemon {
	private long id;
	private String nome;
	private int xp;
	private long treinador_id;
	
	public Pokemon() {
		
	}
	
	
	public Pokemon(long id, String nome, int xp, long treinador_id) {
		this.id = id;
		this.nome = nome;
		this.xp = xp;
		this.treinador_id = treinador_id;
	}


	public Pokemon(String nome, int xp, long treinador_id) {
		this.id = -1;
		this.nome = nome;
		this.xp = xp;
		this.treinador_id = treinador_id;
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

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public long getTreinador_id() {
		return treinador_id;
	}

	public void setTreinador_id(long treinador_id) {
		this.treinador_id = treinador_id;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", xp=" + xp + ", treinador=" + treinador_id + "]";
	}
	
	
}
