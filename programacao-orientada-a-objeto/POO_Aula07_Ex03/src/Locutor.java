
public abstract class Locutor {
	
	protected String nome;
	
	public Locutor(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract String gerarFala(String texto);
	
}
