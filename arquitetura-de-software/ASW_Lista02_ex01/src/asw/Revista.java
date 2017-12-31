package asw;

public class Revista extends Artigo{
	public String nomeRevista;
	public String string;
	public Revista(double preco, Desconto desconto, String nomeRevista) {
		super(preco, desconto);
		this.nomeRevista = nomeRevista;
		this.string = "Nome da Revista: "+nomeRevista;
	}
	public void setString(String string) {
		this.string = string+nomeRevista;
	}
	@Override
	public void imprime() {
		System.out.println(string);
		super.imprime();
	}

}
