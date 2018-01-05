package org.ifsp.lp3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ExecutorComandosVetorInt {
	
	public int executar(String comando, int[] numeros) {
		String com = comando.toUpperCase();
		int retorno = 0;
		if(com.equals("SOMAR")){
			int soma = 0;
			for (int i = 0; i < numeros.length; i++) {
				soma += numeros[i];
			}
			retorno = soma;
		}else if (com.equals("MULTIPLICAR")) {
			int multiplicacao = 1;
			for (int i = 0; i < numeros.length; i++) {
				multiplicacao *= numeros[i];
			}
			retorno = multiplicacao;
		}else if (com.equals("ENCONTRAR_MENOR")) {
			
			int menor = Integer.MAX_VALUE;
			for (int i = 0; i < numeros.length; i++) {
				if (menor <= numeros[i]) {
					menor = menor;
				}else {
					menor = numeros[i];
				}
			}
			retorno = menor;
		}else if (com.equals("ENCONTRAR_MAIOR")) {
			
			int maior = Integer.MIN_VALUE;
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] <= maior) {
					maior = maior;
				}else {
					maior = numeros[i];
				}
			}
			retorno = maior;
		}
		return retorno;
	}
}
