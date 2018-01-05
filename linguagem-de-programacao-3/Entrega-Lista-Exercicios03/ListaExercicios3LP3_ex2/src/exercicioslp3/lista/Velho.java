package exercicioslp3.lista;

public class Velho extends Imovel{
	private double valorDesconto;
	public Velho(String endereco) {
		super(endereco);
		this.valorDesconto = 30000.00;
	}
	
	public void imprimeValor() {
		double valorTotal = this.preco()-valorDesconto;
		System.out.println("Valor adicional do Im�vel: R$"+valorDesconto);
		System.out.println("Valor total do Im�vel: R$"+valorTotal);
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
}
