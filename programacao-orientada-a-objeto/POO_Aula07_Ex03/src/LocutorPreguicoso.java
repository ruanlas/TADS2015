
public class LocutorPreguicoso extends Locutor{

	public LocutorPreguicoso(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		return texto.substring(0, 10);
	}
	
	
}
