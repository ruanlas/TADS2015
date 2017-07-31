
public class Start {
	public static void main(String[] args) {
		Pessoa3 pessoa1 = new Pessoa3("Carlos Roberto", 18);
		Pessoa3 pessoa2 = new Pessoa3("Roberto Nascimento", 22);
		Pessoa3 pessoa3 = new Pessoa3("Paulo Miguel", 25);
		
		System.out.println(pessoa1.obterPreNome());
		System.out.println(pessoa2.obterPreNome());
		System.out.println(pessoa3.obterPreNome());
	
	}
}
