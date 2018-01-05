package ifsp.exercicios.lp3;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(this.saldo+this.limite >= valor){
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
}
