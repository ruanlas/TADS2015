package ifsplp3.aula11;

public class ComissionadoAssalariado extends Comissionado{
	private double salarioFixo;
	
	public ComissionadoAssalariado() {
		super();
	}
	public ComissionadoAssalariado(String nome, String sobrenome, String documento, int qtdVendas, double comissao, double salarioFixo) {
		super(nome, sobrenome, documento, qtdVendas, comissao);
		this.salarioFixo = salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	
	@Override
	public double salario() {
		return super.salario()+this.salarioFixo;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nSalário Base: R$ %.2f\nSalário Total: R$ %.2f",super.toString(), this.salarioFixo, this.salario());
	}

}
