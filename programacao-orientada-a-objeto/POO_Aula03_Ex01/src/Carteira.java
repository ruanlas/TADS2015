
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
		System.out.println("Dep�sito realizado com sucesso");
	}
	
	public void pagar(double valor) {
		if(podePagar(valor)){
			this.saldo -= valor;
			System.out.println("Pagamento efetuado com sucesso");
		}else {
			System.out.println("N�o foi poss�vel pagar este valor");
		}
	}
}
