import java.util.ArrayList;
import java.util.Date;
import java.util.Set;


public class Livro extends Publicacao {
	private int numeroEdicao;
	private int isbn;
	
	public Livro() {
		super();
	}
	public Livro(Date data, String titulo, ArrayList<Autor> autores, ArrayList<Publicacao> referencias, int numeroEdicao, int isbn) {
		super(data, titulo, autores, referencias);
		this.numeroEdicao = numeroEdicao;
		this.isbn = isbn;
	}
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
}
