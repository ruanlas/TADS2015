package modelos;

import java.util.List;

public class Disciplina {
	private int id;
	private String nomeDisciplina;
	private String sigla;
	private Professor prof;
	private List<Aluno> alunos;
	
	public Disciplina(String nomeDisciplina, String sigla, Professor prof) {
		this.nomeDisciplina = nomeDisciplina;
		this.sigla = sigla;
		this.prof = prof;
		this.id = -1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public String getSigla() {
		return sigla;
	}

	public Professor getProf() {
		return prof;
	}
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
}
