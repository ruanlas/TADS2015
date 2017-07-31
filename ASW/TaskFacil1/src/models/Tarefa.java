package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tarefa {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(length=70)
	private String titulo;
	@Column(length=200)
	private String descricao;
	@Column(length=100)
	private String local;
	
	private LocalDate dataRealizacao;
	
	@ManyToOne
	private Usuario dono;
	
	@ManyToMany
	private List<Usuario> colaboradores;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public LocalDate getDataRealizacao() {
		return dataRealizacao;
	}
	public void setDataRealizacao(LocalDate dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	public Usuario getDono() {
		return dono;
	}
	public void setDono(Usuario dono) {
		this.dono = dono;
	}
	public List<Usuario> getColaboradores() {
		return colaboradores;
	}
	public void addColaborador(Usuario colaborador) {
		if (! this.colaboradores.contains(colaborador)) {
			this.colaboradores.add(colaborador);
		}
	}
	
	
}
