package licao.ifsp.lp3;

import java.util.Date;

public class Conta {
	private String nomeCliente;
	private Date dataNascimento;
	private String cpf;
	private String numeroConta;
	private double saldo;
	
	public Conta(String nomeCliente, Date dataNascimento, String cpf, String numeroConta) {
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
