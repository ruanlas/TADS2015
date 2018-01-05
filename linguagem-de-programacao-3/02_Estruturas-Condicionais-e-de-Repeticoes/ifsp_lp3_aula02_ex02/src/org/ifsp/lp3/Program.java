package org.ifsp.lp3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ExecutorComandosString executor = new ExecutorComandosString();
		
		System.out.println(executor.executar("CONTAR_VOGAIS", "ola Mundo"));
		System.out.println(executor.executar("TAMANHO", "Ola mundo"));
	}
}
