package ifsplp3.aula11;

public class Assalariado extends Empregado{
	private double salarioFixo;
	
	public Assalariado() {
		super();
	}
	public Assalariado(String nome, String sobrenome, String documento, double salarioFixo) {
		super(nome, sobrenome, documento);
		this.salarioFixo = salarioFixo;
	}
	
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
		
	@Override
	public double salario() {
		return this.salarioFixo;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nSalário Total: R$ %.2f", super.toString(), this.salario() );
	}
}
