package aplicacao;

public class Usuario {
	private long id;
	private String nome;
	
	public Usuario(long id, String nome) {
		this.id = id;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + "]";
	}
	
	public boolean equals(Usuario usuario) {
		if(this.id == usuario.getId()){
			return true;
		}else {
			return false;
		}
	}
}
