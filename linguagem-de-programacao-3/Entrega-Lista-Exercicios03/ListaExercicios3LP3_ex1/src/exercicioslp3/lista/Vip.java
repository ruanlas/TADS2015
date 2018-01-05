package exercicioslp3.lista;

public class Vip extends Ingresso{
	private double adicional = 15.00;
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor do Ingresso: R$"+(this.valor()+adicional));
	}
}
