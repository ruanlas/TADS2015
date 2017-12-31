package sistema;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Universidade {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String nome;
	
	private String cidade;
	private int tamanhoFisico;
	private Date dataFundacao;
	private int notaDeEcxelencia;
	
	public Universidade() {
		this.id = -1;
	}
	
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getTamanhoFisico() {
		return tamanhoFisico;
	}
	public void setTamanhoFisico(int tamanhoFisico) {
		this.tamanhoFisico = tamanhoFisico;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public int getNotaDeEcxelencia() {
		return notaDeEcxelencia;
	}
	public void setNotaDeEcxelencia(int notaDeEcxelencia) {
		this.notaDeEcxelencia = notaDeEcxelencia;
	}
}
