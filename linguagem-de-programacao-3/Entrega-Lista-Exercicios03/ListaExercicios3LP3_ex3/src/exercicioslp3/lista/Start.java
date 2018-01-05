package exercicioslp3.lista;

public class Start {
	public static void main(String[] args) {
		Administrativo assAdm = new Administrativo("Paulo Teixeira", 2000.00, 312, "43256", "Dia", 0);
		Tecnico assTec = new Tecnico("João Pedro", 3200.00, 754, "879342", 340.90);
		System.out.println("Assistente Administrativo");
		System.out.println("Nome: "+ assAdm.getNome());
		System.out.println("Matricula: "+assAdm.getMatricula());
		System.out.println();
		System.out.println("Assistente Técnico");
		System.out.println("Nome: "+assTec.getNome());
		System.out.println("Matricula: "+assTec.getMatricula());
	}
}
