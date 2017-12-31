package teste;

public class Start {
	public static void main(String[] args) {
		System.out.println("Ola\nola\nola");
		int numero = 4 /* entrada aqui */;
		
		int qtdDivisores = 0;
		for (int i = 1; i < numero; ++i) {
			if (numero % i == 0) ++qtdDivisores;
		}
		
		System.out.println(qtdDivisores == 2 ?
				"Numero primo" : "Numero nao primo");
	}
}
