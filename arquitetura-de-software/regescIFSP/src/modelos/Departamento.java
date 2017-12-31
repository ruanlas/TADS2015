package modelos;

public class Departamento {
	private int id;
	private String nomeDepartamento;
	private String sigla;
	
	public Departamento(String nomeDepartamento, String sigla) {
		this.nomeDepartamento = nomeDepartamento;
		this.sigla = sigla;
		this.id = -1; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}
