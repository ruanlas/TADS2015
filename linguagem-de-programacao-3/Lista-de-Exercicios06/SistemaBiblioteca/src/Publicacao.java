
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public abstract class Publicacao {
	private Date data;
	private String titulo;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	private ArrayList<Publicacao> referencias = new ArrayList<Publicacao>();
	
	public Publicacao() {
		
	}

	public Publicacao(Date data, String titulo, ArrayList<Autor> autores, ArrayList<Publicacao> referencias) {
		this.data = data;
		this.autores = autores;
		this.titulo = titulo;
		this.referencias = referencias;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void addAutores(Autor autor) {
		this.autores.add(autor);
	}

	public ArrayList<Publicacao> getReferencias() {
		return referencias;
	}

	public void addReferencias(Publicacao referencia) {
		this.referencias.add(referencia);
	}
	//public abstract String getPublicacao();
	
}
