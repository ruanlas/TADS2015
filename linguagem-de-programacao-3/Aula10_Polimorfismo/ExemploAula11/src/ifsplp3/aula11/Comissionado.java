package ifsplp3.aula11;

public class Comissionado extends Empregado{
	private int qtdVendas;
	private double comissao;
	
	public Comissionado() {
		super();
	}
	public Comissionado(String nome, String sobrenome, String documento, int qtdVendas, double comissao) {
		super(nome, sobrenome, documento);
		this.comissao = comissao;
		this.qtdVendas = qtdVendas;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public int getQtdVendas() {
		return qtdVendas;
	}
	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	public double totalComissao() {
		return this.comissao*(double)this.qtdVendas;
	}

	@Override
	public double salario() {
		return this.totalComissao();
	}
	
	@Override
	public String toString() {
		return String.format("%s\nQuantidade de Vendas: %d\nComissão por vendas: R$ %.2f\nSalário Comissões: R$ %.2f",super.toString(), this.qtdVendas, this.comissao, this.totalComissao() );
	}
}
