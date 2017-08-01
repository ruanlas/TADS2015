
public abstract class Livro extends Produto{
	private String titulo;
	private String idioma;
	private int ano;
	private int isbn;
	private int numeroPaginas;
	private String editora;
	private String autor;
	private String resumo;
	private String categoria;
	
	public Livro() {
		super();
	}

	public Livro(double preco, long codBarras, String titulo, String idioma, int ano, int isbn, int numeroPaginas,
			String editora, String autor, String resumo, String categoria) {
		super(preco, codBarras);
		this.titulo = titulo;
		this.idioma = idioma;
		this.ano = ano;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.autor = autor;
		this.resumo = resumo;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
