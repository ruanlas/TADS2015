package modelos;

import java.util.List;

public class Curso {
	private int id;
	private String nomeCurso;
	private String sigla;
	private List<Disciplina> disciplinas;
	
	public Curso(String nomeCurso, String sigla) {
		this.nomeCurso = nomeCurso;
		this.sigla = sigla;
		this.id = -1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void addDisciplina(Disciplina dp) {
		disciplinas.add(dp);
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
}
