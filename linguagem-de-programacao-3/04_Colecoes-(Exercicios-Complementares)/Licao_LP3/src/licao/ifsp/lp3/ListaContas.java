package licao.ifsp.lp3;

import java.util.ArrayList;

public class ListaContas {

	private ArrayList<Conta> listaConta = new ArrayList<Conta>();
	public void adicionarConta(Conta obj) {
		listaConta.add(obj);
	}
	public void deposita(Conta obj, double valor) {
		obj.depositar(valor);
	}
	public void saca(Conta obj, double valor) {
		obj.sacar(valor);
	}
	public double saldo(Conta obj) {
		return obj.saldo();
	}
	public ArrayList<Conta> listaConta() {
		return listaConta;
	}
}
