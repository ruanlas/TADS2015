package sistema.models;

public class Pessoa {
	private String nome;
	private int id;
	private long cpf;
	private long rg;
	
	public Pessoa(){
		this.cpf = -1;
		this.id = -1;
		this.rg = -1;
		this.nome = null;
	}
	
	public Pessoa(String nome, long cpf, long rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.id = -1;
	}
	
	public Pessoa(int id, String nome, long cpf, long rg) {
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", id=" + id + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
	
	
	
	
	
}
