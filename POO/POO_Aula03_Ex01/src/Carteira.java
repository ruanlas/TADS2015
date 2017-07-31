
public class Carteira {
	double saldo;
	public Carteira(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean podePagar(double valor) {
		if(valor <=saldo){
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso");
	}
	
	public void pagar(double valor) {
		if(podePagar(valor)){
			this.saldo -= valor;
			System.out.println("Pagamento efetuado com sucesso");
		}else {
			System.out.println("Não foi possível pagar este valor");
		}
	}
}
