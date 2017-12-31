
public class Start {
	public static void main(String[] args) {
		Pessoa2 pessoa1 = new Pessoa2("Carlos Roberto", 18);
		Pessoa2 pessoa2 = new Pessoa2("Roberto Nascimento", 22);
		Pessoa2 pessoa3 = new Pessoa2("Paulo Miguel", 25);
		
		String[] pessoa = pessoa1.nome.split(" ");
		System.out.println(pessoa[0]);
		pessoa = pessoa2.nome.split(" ");
		System.out.println(pessoa[0]);
		pessoa = pessoa3.nome.split(" ");
		System.out.println(pessoa[0]);
	
	}
}
