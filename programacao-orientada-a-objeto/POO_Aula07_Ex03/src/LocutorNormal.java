
public class LocutorNormal extends Locutor{

	public LocutorNormal(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		return texto;
	}

}
