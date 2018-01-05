import java.util.ArrayList;
import java.util.Date;
import java.util.Set;


public class Artigo extends Publicacao{
	private String resumo;
	
	public Artigo() {
		super();
	}
	public Artigo(Date data, String titulo, ArrayList<Autor> autores, ArrayList<Publicacao> referencias, String resumo) {
		super(data, titulo, autores, referencias);
		this.resumo = resumo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
}
