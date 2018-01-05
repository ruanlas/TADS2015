package org.ifsp.lp3;

public class VerificadorPrimosUsandoFor {

	public static boolean ehPrimo(int numero) {
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if(numero%i==0){
				contador += 1;
			}
		}
		return (contador == 2)? true : false;
	}
}
