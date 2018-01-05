package org.ifsp.lp3;

public class VerificadorPrimoUsandoWhile {

	public static boolean ehPrimo(int numero) {
		int contador = 0;
		int i = 1;
		while (i <= numero) {
			if(numero%i==0){
				contador += 1;
			}
			++i;
		}
		return (contador == 2)? true : false;
	}
}
