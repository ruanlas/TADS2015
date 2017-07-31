
public class LocutorComSono extends Locutor{

	public LocutorComSono(String nome) {
		super(nome);
	}

	@Override
	public String gerarFala(String texto) {
		StringBuilder sb = new StringBuilder();
		for (String parte : texto.split(" ")) {
			sb.append(parte).append(".....ZzZzz......");
		}
		return sb.toString();
	}
	
	
	
}
