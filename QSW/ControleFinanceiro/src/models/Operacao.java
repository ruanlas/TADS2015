package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operacao {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private double valorOperacao;
	private LocalDate dataOperacao;
	private String descricao;
	private char tipoOperacao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValorOperacao() {
		return valorOperacao;
	}
	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	public LocalDate getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(LocalDate dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public char getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(char tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
}
