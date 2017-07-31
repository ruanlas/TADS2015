package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import exceptions.InvalidEmail;
import others.Criptografar;
import others.Email;

@Entity
public class Usuario {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String senha;
	
	@OneToMany(mappedBy="dono")
	private List<Tarefa> tarefas;
	
	public Usuario() {
		
	}
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", senha=" + senha + ", tarefas=" + tarefas + "]";
	}
	
	
	
}
