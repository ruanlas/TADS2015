package exercicioslp3.lista;

public class Funcionario {
	private String nome;
	private double salario;
	private int numeroDependente;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	public Funcionario(String nome, double salario, int numeroDependente) {
		this.nome = nome;
		this.salario = salario;
		this.numeroDependente = numeroDependente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumeroDependente() {
		return numeroDependente;
	}
	public void setNumeroDependente(int numeroDependente) {
		this.numeroDependente = numeroDependente;
	}
	public void exibeDados() {
		System.out.println("Nome do Funcionário: "+nome);
		System.out.println("Salário: "+salario);
		System.out.println("Numero dependete: "+numeroDependente);
	}
}
