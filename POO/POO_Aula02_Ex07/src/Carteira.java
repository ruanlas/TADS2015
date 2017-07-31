
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
}
