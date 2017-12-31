package be.edu.ifsp.regesc.models;

import java.util.ArrayList;

public class Curso {
	private String sigla;
	private String nome;
	private String descricao;
	private ArrayList<Student> alunos;
	
	public Curso() {
		alunos = new ArrayList<>();
	}
	public Curso(String sigla, String nome, String descricao) {
		this.sigla = sigla;
		this.nome = nome;
		this.descricao = descricao;
		alunos = new ArrayList<>();
	}
	
	public void addAluno(Student aluno) {
		if(!alunos.contains(aluno)){
			alunos.add(aluno);
			System.out.println("Aluno inserido");
		}else{
			System.out.println("Este aluno= "+aluno+" já está matriculado");
		}
		
	}
	
}
