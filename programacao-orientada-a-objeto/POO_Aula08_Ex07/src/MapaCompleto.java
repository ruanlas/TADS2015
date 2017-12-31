
public class MapaCompleto implements MapaJogo{
	private char[][] mapa; 
	
	public MapaCompleto(int linha, int coluna) {
		this.mapa = new char[linha][coluna];
	}

	@Override
	public char obterElemento(int linha, int coluna) {
		if(linha >= mapa.length && coluna >= mapa[linha].length){
			throw new PosicaoInvalidaException();
		}else {
			return mapa[linha][coluna];
		}
		
		//mapa.length;//linha
		//mapa[0].length;//coluna
	}

	@Override
	public void definirElemento(int linha, int coluna, char elemento) {
		this.mapa[linha][coluna] = elemento;
	}
	
}
