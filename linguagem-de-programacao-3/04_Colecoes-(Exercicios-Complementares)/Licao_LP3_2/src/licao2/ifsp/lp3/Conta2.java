package licao2.ifsp.lp3;

import java.util.ArrayList;
import java.util.Date;

public class Conta2 {
	private String nomeCliente;
	private Date dataNascimento;
	private String cpf;
	private String numeroConta;
	private double saldo;
	
	public Conta2(String nomeCliente, Date dataNascimento, String cpf, String numeroConta) {
		// TODO Auto-generated constructor stub
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}
	public void transferir(Conta2 conta, double valor) {
		saldo-= valor;
		conta.depositar(valor);
	}
	public void transferir(ArrayList<Conta2> listaConta, String destinatario, double valor) {
		for (Conta2 conta : listaConta) {
			if(conta.nomeCliente().equals(destinatario)){
				saldo-= valor;
				conta.depositar(valor);
			}
		}
	}
	public void transferir(ArrayList<Conta2> listaConta, Conta2 destinatario, double valor) {
		for (Conta2 conta : listaConta) {
			if(conta.equals(destinatario)){
				saldo-= valor;
				conta.depositar(valor);
			}
		}
	}
	public String numeroConta() {
		return numeroConta;
	}
	public double saldo() {
		return saldo;
	}
	public String nomeCliente() {
		return nomeCliente;
	}
	public Date dataNascimento() {
		return dataNascimento;
	}
	public String cpf() {
		return cpf;
	}
}
