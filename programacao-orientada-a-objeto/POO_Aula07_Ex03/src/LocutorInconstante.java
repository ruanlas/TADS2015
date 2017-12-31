import java.util.Random;

public class LocutorInconstante extends Locutor{

	public LocutorInconstante(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		Random r = new Random();
		if (!r.nextBoolean()) {
			texto = null;
		}
		return texto;
	}
	
	
}
