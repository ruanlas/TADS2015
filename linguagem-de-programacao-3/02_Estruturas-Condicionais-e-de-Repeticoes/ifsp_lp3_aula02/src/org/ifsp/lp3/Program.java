package org.ifsp.lp3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		System.out.println("Digite um n�mero");
		i = in.nextInt();
		
		System.out.println(VerificadorPrimosUsandoFor.ehPrimo(i)? "� primo" : "N�o � primo");
		System.out.println(VerificadorPrimoUsandoWhile.ehPrimo(i)? "� primo" : "N�o � primo");
		System.out.println(VerificadorPrimoUsandoDoWhile.ehPrimo(i)? "� primo" : "N�o � primo");
	}
}
