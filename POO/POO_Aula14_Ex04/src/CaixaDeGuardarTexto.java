
public class CaixaDeGuardarTexto {
	private int capacidade;
	private String textoArmazenado;
	
	public CaixaDeGuardarTexto(int capacidade) {
		this.capacidade = capacidade;
		this.textoArmazenado = null;
	}
	
	public int capacidade() {
		return this.capacidade;
	}
	public boolean comporta(String textoPretendido) {
		return(textoPretendido.length() <= capacidade);
	}
	public void guardarTexto(String textoPretendido) {
		if(this.comporta(textoPretendido)){
			this.textoArmazenado = textoPretendido;
		}else{
			this.textoArmazenado = textoPretendido.substring(0,capacidade);
		}
		
	}
	public String obterTexto() {
		return textoArmazenado;
	}
	
}
