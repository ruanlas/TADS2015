
public class LocutorNervoso extends Locutor{

	public LocutorNervoso(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		return texto.toUpperCase()+" !!!";
	}
	
	

}
