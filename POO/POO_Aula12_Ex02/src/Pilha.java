import java.util.ArrayList;

public class Pilha {

	private String[] elementos;
	private int tamanho;

	public Pilha(int capacidade) {
		elementos = new String[capacidade];
		tamanho = 0;
	}

	public void inserir(String elemento)
			throws CapacidadeExcedidaException {
		if (tamanho >= capacidade()) {
			throw new CapacidadeExcedidaException();
		}

		elementos[tamanho++] = elemento;
	}

	public String retirar() throws PilhaVaziaException {
		if (tamanho <= 0) {
			throw new PilhaVaziaException();
		}

		--tamanho;
		String elementoNoTopo = elementos[tamanho];
		elementos[tamanho] = null;
		return elementoNoTopo;
	}

	public int capacidade() {
		return elementos.length;
	}

	public int tamanho() {
		return tamanho;
	}

	public static void main(String[] args) throws
			PilhaVaziaException, CapacidadeExcedidaException {
		Pilha p = new Pilha(3);
		p.inserir("a");
		p.inserir("b");
		p.inserir("c");
		String r = p.retirar();
		System.out.println(r);
		r = p.retirar();
		System.out.println(r);
		r = p.retirar();
		System.out.println(r);
		
	}
}