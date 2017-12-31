package teste;

import java.util.Random;

public class Start2 {
	public static void main(String[] args) {
		int numero = 2/* entrada aqui */;
		
		int qtdDivisores = 1;
		for (int i = 2; i <= numero; ++i) {
			if (numero % i == 0) ++qtdDivisores;
		}
		
		System.out.println(qtdDivisores == 1 ?
				"Numero primo" : "Numero nao primo");
		System.out.println("123456789101112".substring(0, 6));
		Random random = new Random();
		System.out.println(random.nextBoolean());
	}
}
