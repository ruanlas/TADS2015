package modelos;

import java.sql.Date;

public class Aluno extends Pessoa{
	private String ra;
	private long matricula;
	public Aluno(String nome, String cpf, Date dataNascimento, String rg, String ra) {
		super(nome, cpf, dataNascimento, rg);
		this.ra = ra;
		this.matricula = -1;
	}

	public String getRa() {
		return ra;
	}

	public long getId() {
		return matricula;
	}

	public void setId(long matricula) {
		this.matricula = matricula;
	}
	
	
}
