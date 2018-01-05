package exercicioslp3.lista;

public class Novo extends Imovel{
	private double valorAdicional;
	public Novo(String endereco){
		super(endereco);
		this.valorAdicional = 50000.00;
	}
	public void imprimeValor() {
		double valorTotal = this.preco()+valorAdicional;
		System.out.println("Valor adicional do Imóvel: R$"+valorAdicional);
		System.out.println("Valor total do Imóvel: R$"+valorTotal);
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
}
