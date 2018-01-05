package ifsp.exercicios.lp3;

import java.util.ArrayList;
import java.util.Scanner;

public class ContasJava {

	public static void main(String[] args) {
		
		ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<ContaBancaria>();
		ArrayList<ContaPoupanca> listaContaPoupanca = new ArrayList<ContaPoupanca>();
		ArrayList<ContaEspecial> listaContaEspecial = new ArrayList<ContaEspecial>();
		
		Scanner in = new Scanner(System.in);
		String controleMenu = "9";
		while (!controleMenu.equals("0")) {
			System.out.println("Digite as op��es abaixo:");
			System.out.println("1 - Criar uma Conta Banc�ria");
			System.out.println("2 - Criar uma Conta Poupan�a");
			System.out.println("3 - Criar uma Conta Especial");
			System.out.println("0 - Sair");
			controleMenu = in.nextLine();
			
			switch (controleMenu) {
			case "1":
			{
				//in.nextLine();//esvaziando buffer
				ContaBancaria objConta = new ContaBancaria();
				System.out.println("Digite o nome do Cliente:");
				objConta.setCliente(in.nextLine());
				System.out.println("Digite o numero da Conta: ");
				objConta.setNumConta(in.nextInt());
				System.out.println("Digite um valor para dep�sito: ");
				objConta.depositar(in.nextDouble());
				System.out.println("Digite um valor para saque: ");
				double valor = in.nextDouble();
				while (!objConta.sacar(valor)) {
					System.out.println("Digite um valor v�lido");
					valor = in.nextDouble();
				}
				in.nextLine();//esvaziando buffer
				listaContaBancaria.add(objConta);
			}
				break;
			case "2":
			{
				//in.nextLine();//esvaziando buffer
				ContaPoupanca objConta = new ContaPoupanca();
				System.out.println("Digite o nome do Cliente:");
				objConta.setCliente(in.nextLine());
				System.out.println("Digite o numero da Conta: ");
				objConta.setNumConta(in.nextInt());
				System.out.println("Digite um valor para dep�sito: ");
				objConta.depositar(in.nextDouble());
				System.out.println("Digite um valor para saque: ");
				double valor = in.nextDouble();
				while (!objConta.sacar(valor)) {
					System.out.println("Digite um valor v�lido");
					valor = in.nextDouble();
				}
				in.nextLine();//esvaziando buffer
				listaContaPoupanca.add(objConta);
			}
				break;
			case "3":
			{
				//in.nextLine();//esvaziando buffer
				ContaEspecial objConta = new ContaEspecial();
				System.out.println("Digite o nome do Cliente:");
				objConta.setCliente(in.nextLine());
				System.out.println("Digite o numero da Conta: ");
				objConta.setNumConta(in.nextInt());
				System.out.println("Digite o limite da conta: ");
				objConta.setLimite(in.nextDouble());
				System.out.println("Digite um valor para dep�sito: ");
				objConta.depositar(in.nextDouble());
				System.out.println("Digite um valor para saque: ");
				double valor = in.nextDouble();
				while (!objConta.sacar(valor)) {
					System.out.println("Digite um valor v�lido");
					valor = in.nextDouble();
				}
				in.nextLine();//esvaziando buffer
				listaContaEspecial.add(objConta);
			}
				break;
			case "0":
				break;

			default:
				System.out.println("Op��o inv�lida");
				break;
			}
			
		}
		
		System.out.println("Conta Banc�ria");
		for (ContaBancaria contaBancaria : listaContaBancaria) {
			System.out.println("Cliente: "+contaBancaria.getCliente());
			System.out.println("Numero Conta: "+ contaBancaria.getNumConta());
			System.out.println("Saldo: "+contaBancaria.getSaldo());
			System.out.println();
		}
		System.out.println("----------------------");
		System.out.println("Conta Poupan�a");
		for (ContaPoupanca contaPoupanca : listaContaPoupanca) {
			System.out.println("Cliente: "+contaPoupanca.getCliente());
			System.out.println("Numero Conta: "+contaPoupanca.getNumConta());
			contaPoupanca.calculaNovoSaldo();
			System.out.println("Saldo: "+contaPoupanca.getSaldo());
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("Conta Especial");
		for (ContaEspecial contaEspecial : listaContaEspecial) {
			System.out.println("Cliente: "+contaEspecial.getCliente());
			System.out.println("Numero Conta: "+contaEspecial.getNumConta());
			System.out.println("Saldo: "+contaEspecial.getSaldo());
			System.out.println();
		}
		
	}
}
