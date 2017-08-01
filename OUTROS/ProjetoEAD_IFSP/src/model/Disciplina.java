package model;

public class Disciplina {
	private String nomeDisciplina;
	private int cargaHoraria;
	private String cursoPertencente;
	private int numeroVagas;
	private String periodo;
	
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getCursoPertencente() {
		return cursoPertencente;
	}
	public void setCursoPertencente(String cursoPertencente) {
		this.cursoPertencente = cursoPertencente;
	}
	public int getNumeroVagas() {
		return numeroVagas;
	}
	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
