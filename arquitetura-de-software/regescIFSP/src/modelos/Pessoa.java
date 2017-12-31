package modelos;

import java.sql.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String rg;
	
	public Pessoa(String nome, String cpf, Date dataNascimento, String rg) {
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}
	
	
}
