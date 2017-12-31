
public interface MapaJogo {
	char obterElemento(int linha, int coluna) throws PosicaoInvalidaException;
	void definirElemento(int linha, int coluna, char elemento);
}
