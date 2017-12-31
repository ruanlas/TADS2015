
public class TabuleiroCompleto {
	private final char[][] elementos;


	public TabuleiroCompleto(int qtdLinhas, int qtdColunas) {
		elementos = new char[qtdLinhas][qtdColunas];
	}


	public char[][] getElementos() { //Este m�todo que est� violando o encapsulamento. N�o faz sentido esta classe
		return elementos;			//Possuir um m�todo que retorne sua refer�ncia, pois existem m�todos que retornam
	}								//os elementos nas posi��es desejadas, validando as posi��es. Este m�todo permite
									//"violar" a privacidade da vari�vel "elementos", permitindo alterar a estrutura ou
	public char obterElemento(int linha, int coluna) {	//os elementos do tabuleiro
		validarPosicao(linha, coluna);
		return elementos[linha][coluna];
	}


	public void definirElemento(int linha, int coluna, char elemento) {
		validarPosicao(linha, coluna);
		elementos[linha][coluna] = elemento;
	}


	private void validarPosicao(int linha, int coluna) {
		if (linha < 0 || coluna < 0 || linha >= elementos.length
				|| coluna >= elementos[linha].length) {
			throw new RuntimeException("Posicao invalida: " + linha + "," + coluna);
		}
	}
}
