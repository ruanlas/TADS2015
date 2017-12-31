
public class CaixaDeGuardarTexto {
	private int capacidade;
	private String textoArmazenado;
	
	public CaixaDeGuardarTexto(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int capacidade() {
		return this.capacidade;
	}
	public boolean comporta(String textoPretendido) {
		return(textoPretendido.length() <= capacidade);
	}
	public void guardarTexto(String textoPretendido) {
		this.textoArmazenado = textoPretendido;
	}
	public String obterTexto() {
		if(this.comporta(this.textoArmazenado)){
			return this.textoArmazenado;
		}else{
			return this.textoArmazenado.substring(0, capacidade);
		}
	}
	
}
