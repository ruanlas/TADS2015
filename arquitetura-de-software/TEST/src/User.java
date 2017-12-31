
public class User {
	private String nome;
	private int idade;
	
	public User(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return nome + " " + idade;
	}
}
