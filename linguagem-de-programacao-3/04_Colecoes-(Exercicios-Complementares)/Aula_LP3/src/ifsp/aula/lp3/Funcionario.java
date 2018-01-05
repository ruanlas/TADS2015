package ifsp.aula.lp3;

public class Funcionario {
	
	private String nome;
	private int matricula;
	//modificador 'protected'
	//Deixa vísivel o campo para a classe que herdará
	//desta classe mãe, mas permanece privado para as
	//demais classes
	protected double salario;
	
	public double getBonus() {
		return this.salario * 0.10;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
