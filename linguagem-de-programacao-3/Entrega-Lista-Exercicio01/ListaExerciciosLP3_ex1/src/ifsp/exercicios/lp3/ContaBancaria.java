package ifsp.exercicios.lp3;

public class ContaBancaria {
	private String cliente;
	private int numConta;
	protected double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
}
