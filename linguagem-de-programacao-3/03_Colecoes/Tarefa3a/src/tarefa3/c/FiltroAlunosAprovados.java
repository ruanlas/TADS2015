package tarefa3.c;

import java.util.ArrayList;

public class FiltroAlunosAprovados {
	
	ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	//adiciona alunos na lista
	public void adicionar(String nome, double nota){
		Aluno aluno = new Aluno();
		aluno.adicionar(nome, nota);
		listaAlunos.add(aluno);
	}
	//obtem uma nova lista contendo alunos aprovados
	public ArrayList<Aluno> obterListaDeAprovados() {
		ArrayList<Aluno> listaAlunosAprovados = new ArrayList<Aluno>();
		for (Aluno aluno : listaAlunos) {
			if(aluno.obterNota()>=6){
				listaAlunosAprovados.add(aluno);
			}
		}
		return listaAlunosAprovados;
	}
}
