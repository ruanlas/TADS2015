
public class LocutorAusente extends Locutor{

	public LocutorAusente() {
		super(null);
	}

	@Override
	public String gerarFala(String texto){
		throw new SemLocutorParaGerarFalaException();
	}

}
