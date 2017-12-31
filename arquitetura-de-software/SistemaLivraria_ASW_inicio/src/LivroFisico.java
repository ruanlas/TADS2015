
public class LivroFisico extends Livro{
	private double altura;
	private double largura;
	private double profundidade;
	private String tipo;
	private double peso;
	
	public LivroFisico() {
		super();
	}

	public LivroFisico(double preco, long codBarras, String titulo, String idioma, int ano, int isbn, int numeroPaginas,
			String editora, String autor, String resumo, String categoria, double altura, double largura,
			double profundidade, String tipo, double peso) {
		super(preco, codBarras, titulo, idioma, ano, isbn, numeroPaginas, editora, autor, resumo, categoria);
		
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.tipo = tipo;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
