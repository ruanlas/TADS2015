package tarefa4.teste;

import tarefa4.sistemafinanceiro.Banco;

public class TesteDeBancos {
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		Banco banco2 = new Banco();
		Banco banco3 = new Banco();
		Banco banco4 = new Banco();
		Banco banco5 = new Banco();
		banco1.depositar(120);
		banco2.depositar(70);
		banco3.depositar(29);
		banco4.depositar(170);
		banco5.depositar(90);
		if(banco1.valorTotalDepositado()<200){
			banco1.depositar(100);
		}
		if(banco2.valorTotalDepositado()<200){
			banco2.depositar(100);
		}
		if(banco3.valorTotalDepositado()<200){
			banco3.depositar(100);
		}
		if(banco4.valorTotalDepositado()<200){
			banco4.depositar(100);
		}
		if(banco5.valorTotalDepositado()<200){
			banco5.depositar(100);
		}
		
		System.out.println("Saldo Banco1: "+banco1.valorTotalDepositado());
		System.out.println("Saldo Banco2: "+banco2.valorTotalDepositado());
		System.out.println("Saldo Banco3: "+banco3.valorTotalDepositado());
		System.out.println("Saldo Banco4: "+banco4.valorTotalDepositado());
		System.out.println("Saldo Banco5: "+banco5.valorTotalDepositado());
		
		tarefa4.sistemadearmazenamento.Banco bancoArmazenamento = new tarefa4.sistemadearmazenamento.Banco();
		System.out.println();
		System.out.println(bancoArmazenamento.armazenar("fdsafs"));
		System.out.println(bancoArmazenamento.armazenar(323));
		System.out.println(bancoArmazenamento.armazenar(324522));
		System.out.println(bancoArmazenamento.armazenar("STRINGCONEXAO"));
		System.out.println(bancoArmazenamento.armazenar(43242));
		System.out.println(bancoArmazenamento.armazenar(323));
		
		System.out.println("Tamanho do objeto: "+ bancoArmazenamento.tamanho());
		System.out.println("Terceiro objeto de índice 2: "+ bancoArmazenamento.buscarPorId(2));
	}
}
