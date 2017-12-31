
public class Main {
	public static void main(String[] args) {


		// Deposito inicial
		//cc1.setSaldo(300);
		ContaCorrente cc1 = new ContaCorrente(300);

		System.out.printf("A conta possui %d\n", cc1.getSaldo());


		// Saque subsequente
		cc1.sacar(100);


		System.out.printf("A conta possui %d\n", cc1.getSaldo());


		// Deposito subsequente
		cc1.depositar(50);


		System.out.printf("A conta possui %d\n", cc1.getSaldo());
	}
}
