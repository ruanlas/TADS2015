package exercicioslp3.lista;

public class CamaroteSuperior extends Vip{
	private double adicional = 35.00;
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor do Ingresso: R$"+(this.valor()+adicional));
	}
}
