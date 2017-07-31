package asw;

public class Ebook extends Livro{

	public Ebook(double preco, Desconto desconto, String titulo) {
		super(preco, desconto, titulo);
		setStringImpressao("Título do Ebook: ");
	}

}
