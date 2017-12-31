package br.edu.ifsp.regesc.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso {
	
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(length=64)
	private String nome;
	
//	@OneToMany //Relacionamento 1...* ou 1...n (cria uma tabela intermedi�ria)
	@OneToMany (mappedBy="curso") //Diz que esta entidade � uma entidade fraca e que o objeto "curso" j� est� mapeado em alunos (campo da classe aluno) -> N�o cria uma tabela intermedi�ria
	private List<Student> alunos; //e cria uma chave estrangeira em Student
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Student> getLista() {
		return this.alunos;
	}
	
}
