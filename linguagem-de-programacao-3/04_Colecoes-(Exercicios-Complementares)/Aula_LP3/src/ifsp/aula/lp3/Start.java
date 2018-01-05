package ifsp.aula.lp3;

public class Start {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Mateus");
		gerente.setSenha(1234);
		
		System.out.println(gerente.getBonus());
	}
}
