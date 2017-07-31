
public class ContaCorrente {
	private int saldo;

	public ContaCorrente(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	
	public void sacar(int valor){
		this.saldo -= valor;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
}
