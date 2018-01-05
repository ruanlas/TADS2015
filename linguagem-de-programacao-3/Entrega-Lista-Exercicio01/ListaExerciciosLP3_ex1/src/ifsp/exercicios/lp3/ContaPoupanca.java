package ifsp.exercicios.lp3;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;
	
	public void calculaNovoSaldo() {
		this.saldo = this.saldo + (this.saldo * 0.005);
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
}
