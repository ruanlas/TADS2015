
public class EBook extends Livro{
	private double tamanhoArquivo;
	private String formato;
	
	public EBook() {
	}

	public EBook(double preco, long codBarras, String titulo, String idioma, int ano, int isbn, int numeroPaginas,
			String editora, String autor, String resumo, String categoria, double tamanhoArquivo, String formato) {
		super(preco, codBarras, titulo, idioma, ano, isbn, numeroPaginas, editora, autor, resumo, categoria);
		this.formato = formato;
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
}
