
public class MapaCompleto implements MapaJogo{
	private char[][] mapa; 
	
	public MapaCompleto(int linha, int coluna) {
		this.mapa = new char[linha][coluna];
	}

	@Override
	public char obterElemento(int linha, int coluna) {
		return mapa[linha][coluna];
	}

	@Override
	public void definirElemento(int linha, int coluna, char elemento) {
		this.mapa[linha][coluna] = elemento;
	}
	
}
