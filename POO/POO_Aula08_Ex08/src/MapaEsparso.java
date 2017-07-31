import java.util.HashMap;

public class MapaEsparso implements MapaJogo{
	private HashMap<Integer, HashMap<Integer, Character>> mapa = new HashMap<>();

	@Override
	public char obterElemento(int linha, int coluna) throws PosicaoInvalidaException {
		if (!mapa.containsKey(linha)) {
			throw new PosicaoInvalidaException();
		}else if (!mapa.get(linha).containsKey(coluna)) {
			throw new PosicaoInvalidaException();
		}else{
			return mapa.get(linha).get(coluna);
		}

	}

	@Override
	public void definirElemento(int linha, int coluna, char elemento) {
		HashMap<Integer, Character> temp;
		if(mapa.containsKey(linha)){
			temp = mapa.get(linha);
			temp.put(coluna, elemento);
			mapa.put(linha, temp);
		}else {
			temp = new HashMap<>();
			temp.put(coluna, elemento);
			mapa.put(linha, temp);
		}
	}
	
}
