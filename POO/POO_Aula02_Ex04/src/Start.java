
public class Start {
	public static void main(String[] args) {
		Pessoa1 pessoa1 = new Pessoa1();
		Pessoa1 pessoa2 = new Pessoa1();
		Pessoa1 pessoa3 = new Pessoa1();
		
		pessoa1.nome = "Carlos Roberto";
		pessoa1.idade = 18;
		pessoa2.nome = "Roberto Nascimento";
		pessoa2.idade = 22;
		pessoa3.nome = "Paulo Miguel";
		pessoa3.idade = 25;
		String[] pessoa = pessoa1.nome.split(" ");
		System.out.println(pessoa[0]);
		pessoa = pessoa2.nome.split(" ");
		System.out.println(pessoa[0]);
		pessoa = pessoa3.nome.split(" ");
		System.out.println(pessoa[0]);
	
	}
}
