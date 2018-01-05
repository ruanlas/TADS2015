package ifsplp3.aula11;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String documento;
	
	public Empregado() {
		
	}
	public Empregado(String nome, String sobrenome, String documento) {
		this.documento = documento;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public abstract double salario();
	
	public String toString() {
		return String.format("Nome: %s\nSobrenome: %s\nDocumento: %s", this.nome, this.sobrenome, this.documento);
	}
	
}
