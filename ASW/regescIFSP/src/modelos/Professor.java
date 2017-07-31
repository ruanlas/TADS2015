package modelos;

import java.sql.Date;

public class Professor extends Pessoa{
	private String matricula;
	public Professor(String nome, String cpf, Date dataNascimento, String rg, String matricula) {
		super(nome, cpf, dataNascimento, rg);
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	

}
