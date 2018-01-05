package tarefa3.c;

public class Aluno {
	private String nome;
	private double nota;
	public void adicionar(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public String obterNome(){
		return nome;
	}
	public double obterNota(){
		return nota;
	}
}
