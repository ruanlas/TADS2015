package asw;

public abstract class Jogos extends Artigo{
	public String nomeJogo;
	public String string;
	public Jogos(double preco, Desconto desconto, String nomeJogo) {
		super(preco, desconto);
		this.nomeJogo = nomeJogo;
	}
	public void setStrig(String string) {
		this.string = string + nomeJogo;
	}
	@Override
	public void imprime() {
		System.out.println(string);
		super.imprime();
	}
}
