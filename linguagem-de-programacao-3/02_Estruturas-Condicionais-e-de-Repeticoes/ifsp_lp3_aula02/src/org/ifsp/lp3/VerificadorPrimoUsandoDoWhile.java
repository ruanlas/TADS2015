package org.ifsp.lp3;

public class VerificadorPrimoUsandoDoWhile {

	public static boolean ehPrimo(int numero) {
		int contador = 0;
		int i = 1;
		do {
			if(numero%i==0){
				contador += 1;
			}
			++i;
		} while (i <= numero);
		return (contador == 2)? true : false;
	}
}
