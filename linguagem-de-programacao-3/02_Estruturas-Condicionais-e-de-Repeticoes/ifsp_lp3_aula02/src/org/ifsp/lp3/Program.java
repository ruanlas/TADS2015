package org.ifsp.lp3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		System.out.println("Digite um número");
		i = in.nextInt();
		
		System.out.println(VerificadorPrimosUsandoFor.ehPrimo(i)? "É primo" : "Não é primo");
		System.out.println(VerificadorPrimoUsandoWhile.ehPrimo(i)? "É primo" : "Não é primo");
		System.out.println(VerificadorPrimoUsandoDoWhile.ehPrimo(i)? "É primo" : "Não é primo");
	}
}
