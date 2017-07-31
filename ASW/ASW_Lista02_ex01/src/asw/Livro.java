package asw;

public class Livro extends Artigo{
	public String titulo;
	public String stringImpressao;
	public Livro(double preco, Desconto desconto, String titulo) {
		super(preco, desconto);
		this.titulo = titulo;
		this.stringImpressao = "Título do Livro: "+titulo;
		
	}
	public void setStringImpressao(String string) {
		this.stringImpressao = string + titulo; 
	}
	@Override
	public void imprime() {
		System.out.println(stringImpressao);
		super.imprime();
	}

}
