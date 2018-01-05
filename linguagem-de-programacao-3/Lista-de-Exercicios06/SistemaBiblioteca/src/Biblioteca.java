
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class Biblioteca {
	private String nome;
	private String endereco;
	private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	private boolean autorCriado = false;
	
	public Biblioteca() {
	}
	public Biblioteca(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean addPublicacao(Publicacao publicacao) {
		if(autorCriado == true){
			this.publicacoes.add(publicacao);
			System.out.println("publicacao criada do autor " + publicacao.getAutores());
			autorCriado = !autorCriado;
		}
		return autorCriado;
	}
	
	public boolean addAutor(Autor autor) {
		if (autorCriado==false) {
			this.autores.add(autor);
			autorCriado = !autorCriado;
			System.out.println("Criando o autor " + autor.getNome());
		}
		return autorCriado;
	}
	public Publicacao buscarPublicacaoPorTitulo(String titulo) {
		Publicacao objPublicacao = null;
		for (Publicacao publicacao : publicacoes) {
			if (publicacao.getTitulo().equals(titulo)) {
				objPublicacao = publicacao;
			}
		}
		
		return objPublicacao;
	}
	public Set<Publicacao> buscarPublicacaoPorTitulo(Autor autor) {
		Set<Publicacao> arrayTemp = new HashSet<>();
		for (Publicacao publicacao : publicacoes) {
			if (publicacao.getAutores().contains(autor)) {
				arrayTemp.add(publicacao);
			}
		}
		return arrayTemp;
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
}
