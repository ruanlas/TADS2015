
public class LocutorCordial extends Locutor{

	public LocutorCordial(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		return "Bom dia,\n"
				+texto
				+"\n"
				+"Obrigado pela aten��o\n"
				+ "Tenham uma �tima semana";
	}
	
	
}
