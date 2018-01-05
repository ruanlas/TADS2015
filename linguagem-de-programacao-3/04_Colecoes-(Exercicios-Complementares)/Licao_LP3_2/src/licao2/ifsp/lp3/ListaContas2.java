package licao2.ifsp.lp3;

import java.util.ArrayList;

public class ListaContas2 {

	public ArrayList<Conta2> listaConta2 = new ArrayList<Conta2>();
	public void adicionarConta(Conta2 obj) {
		listaConta2.add(obj);
	}
	public void deposita(Conta2 obj, double valor) {
		obj.depositar(valor);
	}
	public void saca(Conta2 obj, double valor) {
		obj.sacar(valor);
	}
	public double saldo(Conta2 obj) {
		return obj.saldo();
	}
	public ArrayList<Conta2> listaConta() {
		return listaConta2;
	}
}
