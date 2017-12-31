import java.util.ArrayList;
import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private long cpf;
	private String rg;
	private Endereco endereco;
	private ArrayList<String> telefones;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Date dataNascimento, long cpf, String rg, Endereco endereco, ArrayList<String> telefones,
			String email) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.telefones = telefones;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
