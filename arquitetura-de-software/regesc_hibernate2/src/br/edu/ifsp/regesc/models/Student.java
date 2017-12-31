
package br.edu.ifsp.regesc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)///diz que o 'id' será um campo do banco, sendo chave primária, auto incremento
    private long id;
	@Column(length=64) //atribui a coluna com tamanho 64 (caso nao especifique o tamanho, ele deixa defaut com 255)
    private String name;
	
    private int age;
    
    @ManyToOne //tipo de relacionamento n..1 / ou *...1 com a tabela curso
    private Curso curso; //Relacionamento com a outra entidade
    
    public Student() {
    	this.id = -1;
    	this.age = -1;
    }

    public Student(String name, int age) {
        this.id = -1;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Curso getCurso() {
		return this.curso;
	}
    
    
    
}
