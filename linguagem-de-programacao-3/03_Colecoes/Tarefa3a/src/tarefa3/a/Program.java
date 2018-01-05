package tarefa3.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

import tarefa3.b.CalculadorDeSucessor;
import tarefa3.c.Aluno;
import tarefa3.c.FiltroAlunosAprovados;
import tarefa3.c.FiltroPares;
import tarefa3.d.ContadorPalavras;

public class Program {

	public static void main(String[] args) {
		Identidade id = new Identidade();
		//criação dos objetos o1 e o2
		//neste momento os objetos o1 e o2 possuem instancias diferentes
//		Object o1 = 3232;
//		Object o2 = 3232;
		Object o1 = new Integer(10);
		Object o2 = new Integer(10);
		
		System.out.println(id.saoAMesmaInstancia(o1, o2));
		System.out.println(id.saoLogicamenteIguais(o1, o2));
		System.out.println();
		//neste momento o objeto o1 está recebendo a instancia de o2, ou seja, neste
		//momento as instancias passam a serem iguais
		o1 = o2;
		System.out.println(id.saoAMesmaInstancia(o1, o2));
		System.out.println(id.saoLogicamenteIguais(o1, o2));
		System.out.println();
		
		CalculadorDeSucessor calculador = new CalculadorDeSucessor();
		
		System.out.println(calculador.sucessorDe(1));
		System.out.println(calculador.sucessorDe(new Integer(1)));
		
		System.out.println();
		FiltroPares filtro = new FiltroPares();
		//adição dos números na classe
		filtro.adicionar(3);
		filtro.adicionar(2);
		filtro.adicionar(1);
		filtro.adicionar(8);
		filtro.adicionar(9);
		filtro.adicionar(6);
		//obtenção dos números pares e imprimindo-os
		for (int numerosPares : filtro.obterListaPares()) {
			System.out.println(numerosPares);
		}
		
		System.out.println();
		FiltroAlunosAprovados filtroAlunos = new FiltroAlunosAprovados();
		//adicionando os alunos na lista
		filtroAlunos.adicionar("Carlos", 10);
		filtroAlunos.adicionar("Pedro", 4);
		filtroAlunos.adicionar("Adão", 7);
		filtroAlunos.adicionar("Roberto", 5);
		//imprimindo os alunos aprovados
		for (Aluno alunoAprovado : filtroAlunos.obterListaDeAprovados()) {
			System.out.println(alunoAprovado.obterNome()+" - "+alunoAprovado.obterNota());
		}
		
		System.out.println();
		
		ContadorPalavras contadorPalavras = new ContadorPalavras();
		ArrayList<String> palavras = new ArrayList<>();
		palavras.add("Roberto");
		palavras.add("Roberto");
		palavras.add("Carlos");
		palavras.add("Augusto");
		System.out.println(contadorPalavras.contarPalavrasConsiderandoRepeticoes(palavras));
																					//Abaixo está convertendo de ArrayList para Set
		System.out.println(contadorPalavras.contarPalavrasDesconsiderandoRepeticoes(new HashSet<String>(palavras))); //Conversão de lista para coleção
		
	}
}
