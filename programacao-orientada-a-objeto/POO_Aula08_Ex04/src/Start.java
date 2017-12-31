
public class Start {
	public static void main(String[] args) {
		PilhaString pilha1 = new PilhaString(2);
		//Adicionando elementos da pilha
		System.out.println("Adicionando elementos da Pilha");
		try {
			pilha1.addString("oi1");
			System.out.println("Elemento adicionado");
		} catch (CapacidadeExcedidaException e) {
			System.out.println("Elemento n�o adicionado devido � capacidade excedida");
		}
		
		try {
			pilha1.addString("oi2");
			System.out.println("Elemento adicionado");
		} catch (CapacidadeExcedidaException e) {
			System.out.println("Elemento n�o adicionado devido � capacidade excedida");
		}
		
		try {
			pilha1.addString("oi3");
			System.out.println("Elemento adicionado");
		} catch (CapacidadeExcedidaException e) {
			System.out.println("Elemento n�o adicionado devido � capacidade excedida");
		}
		
//		//Acessando os �ndices da pilha
//		System.out.println("\nAcessando os �ndices da pilha");
//		try {
//			System.out.println("Elemento da posi��o 0: " + pilha1.getIndex(0));
//		} catch (PosicaoNaoPreenchidaException e) {
//			System.out.println("O Elemento da posi��o 0 nao foi poss�vel acessar pois n�o foi adicionado na pilha");
//		} catch (PosicaoInexistenteException e) {
//			System.out.println("O Elemento da posi��o 0 nao foi poss�vel acessar pois a posi��o n�o existe");
//		}
//		
//		try {
//			System.out.println("Elemento da posi��o 1: " + pilha1.getIndex(1));
//		} catch (PosicaoNaoPreenchidaException e) {
//			System.out.println("O Elemento da posi��o 1 nao foi poss�vel acessar pois n�o foi adicionado na pilha");
//		} catch (PosicaoInexistenteException e) {
//			System.out.println("O Elemento da posi��o 1 nao foi poss�vel acessar pois a posi��o n�o existe");
//		}
//		
//		try {
//			System.out.println("Elemento da posi��o 2: " + pilha1.getIndex(2));
//		} catch (PosicaoNaoPreenchidaException e) {
//			System.out.println("O Elemento da posi��o 2 nao foi poss�vel acessar pois n�o foi adicionado na pilha");
//		} catch (PosicaoInexistenteException e) {
//			System.out.println("O Elemento da posi��o 2 nao foi poss�vel acessar pois a posi��o n�o existe");
//		}
		
		//removendo os itens da pilha
		System.out.println("\nRemovendo itens da pilha");
		try {
			pilha1.retirarString();
			System.out.println("Elemento retirado");
		} catch (PilhaVaziaException e) {
			System.out.println("N�o � poss�vel retirar elemento de pilha vazia");
		}
		
//		//acessando a posicao retirada
//		System.out.println("\nAcessando a ultima posicao retirada");
//		try {
//			System.out.println("Elemento da posi��o 1: " + pilha1.getIndex(1));
//		} catch (PosicaoNaoPreenchidaException e) {
//			System.out.println("O Elemento da posi��o 1 nao foi poss�vel acessar pois n�o foi adicionado na pilha");
//		} catch (PosicaoInexistenteException e) {
//			System.out.println("O Elemento da posi��o 1 nao foi poss�vel acessar pois a posi��o n�o existe");
//		}
		
		//retirando mais elementos
		//System.out.println("\nRetirando mais elementos");
		try {
			pilha1.retirarString();
			System.out.println("Elemento retirado");
		} catch (PilhaVaziaException e) {
			System.out.println("N�o � poss�vel retirar elemento de pilha vazia");
		}
		
		try {
			pilha1.retirarString();
			System.out.println("Elemento retirado");
		} catch (PilhaVaziaException e) {
			System.out.println("N�o � poss�vel retirar elemento de pilha vazia");
		}
		
		try {
			pilha1.retirarString();
			System.out.println("Elemento retirado");
		} catch (PilhaVaziaException e) {
			System.out.println("N�o � poss�vel retirar elemento de pilha vazia");
		}
		
		try {
			pilha1.retirarString();
			System.out.println("Elemento retirado");
		} catch (PilhaVaziaException e) {
			System.out.println("N�o � poss�vel retirar elemento de pilha vazia");
		}

		
	}
}
