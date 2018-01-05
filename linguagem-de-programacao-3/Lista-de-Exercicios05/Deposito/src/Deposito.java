
public class Deposito {
	private int items=0;
	private final int capacidade=10;
	
	public int retirar() {
		if (items>0) {
			items--;
			System.out.println("Caixa retirada: existem "+items+"caixas");
			return 1;
		}
		return 0; 
	}
	
	public int colocar () {
		if (items<capacidade) {
			items++;
			System.out.println("Caixa armazenada: existem "+items+"caixas");
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Deposito dep = new Deposito();
		//Produtor p = new Produtor(dep, 2);
		new Produtor(dep, 2).start();
		Consumidor consumidor = new Consumidor(dep, 1);
		Thread threadConsumidor = new Thread(consumidor);
		threadConsumidor.start();
		//Consumidor c = new Consumidor(dep, 1);
		// iniciar thread produtora
		//...
		// iniciar thread consumidora
		//...
		System.out.println("Fim da execucao de Deposito::main()");
	}
} 