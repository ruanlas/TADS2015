package asw;

public class Ebook extends Livro{

	public Ebook(double preco, Desconto desconto, String titulo) {
		super(preco, desconto, titulo);
		setStringImpressao("T�tulo do Ebook: ");
	}

}
