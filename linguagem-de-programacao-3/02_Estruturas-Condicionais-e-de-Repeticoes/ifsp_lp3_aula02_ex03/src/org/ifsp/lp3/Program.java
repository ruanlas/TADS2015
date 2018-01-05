package org.ifsp.lp3;

public class Program {

	public static void main(String[] args) {
		ExecutorComandosVetorInt executor = new ExecutorComandosVetorInt();
		int[] vetor = {2,5,8,1,6};
		System.out.println(executor.executar("SOMAR", vetor));
		System.out.println(executor.executar("MULTIPLICAR", vetor));
		System.out.println(executor.executar("ENCONTRAR_MENOR", vetor));
		System.out.println(executor.executar("ENCONTRAR_MAIOR", vetor));
	}
}
