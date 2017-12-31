
public class Pessoa3 {
	String nome;
	int idade;
	public Pessoa3(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	public String obterPreNome() {
		String[] preNome = nome.split(" ");
		return preNome[0];
	}
}
