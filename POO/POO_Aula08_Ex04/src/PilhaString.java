
public class PilhaString {
	private String pilha[];
	private int tamanho;
	
	public PilhaString(int capacidade) {
		pilha = new String[capacidade];
		this.tamanho = 0;
	}
	public int capacidade() {
		return this.pilha.length;
	}
	public int tamanho() {
		return this.tamanho;
	}
	public void addString(String elemento) throws CapacidadeExcedidaException {
		if(this.tamanho >= this.capacidade()){
			throw new CapacidadeExcedidaException();
		}else {
			pilha[tamanho++] = elemento;
		}
	}
	public void retirarString() throws PilhaVaziaException {
		if(tamanho <= 0){
			throw new PilhaVaziaException();
		}else {
			pilha[--tamanho] = null;
		}
	}
	
//	public String getIndex(int index) throws PosicaoNaoPreenchidaException, PosicaoInexistenteException {
//		if (index >= tamanho && index < this.capacidade()) {
//			throw new PosicaoNaoPreenchidaException();
//		}else if(index >= this.capacidade()){
//			throw new PosicaoInexistenteException();
//		}else{
//			return this.pilha[index];
//		}
//	}
}
