package tarefa4.sistemafinanceiro;

public class Banco {
	private int saldo;
	
	public Banco(){
		this.saldo = 0;
	}
	
	public void depositar(int n) {
		this.saldo += n;
	}
	public int valorTotalDepositado() {
		return this.saldo;
	}
}
