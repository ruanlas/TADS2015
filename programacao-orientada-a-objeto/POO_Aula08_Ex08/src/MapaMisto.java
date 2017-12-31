
public class MapaMisto implements MapaJogo{
	private MapaCompleto mapaCompleto = new MapaCompleto(32, 18);
	private MapaEsparso mapaEsparso = new MapaEsparso();
	private String referencia;
	
	public MapaMisto(String referencia) {
		this.referencia = referencia;
	}

	@Override
	public char obterElemento(int linha, int coluna) throws PosicaoInvalidaException {
		if(referencia.toUpperCase().equals("casa".toUpperCase())){
			return mapaCompleto.obterElemento(linha, coluna);
		}else {
			return mapaEsparso.obterElemento(linha, coluna);
		}
		
	}

	@Override
	public void definirElemento(int linha, int coluna, char elemento) {
		if(referencia.toUpperCase().equals("casa".toUpperCase())){
			mapaCompleto.definirElemento(linha, coluna, elemento);
		}else {
			mapaEsparso.definirElemento(linha, coluna, elemento);
		}
		
	}
	
	
}
