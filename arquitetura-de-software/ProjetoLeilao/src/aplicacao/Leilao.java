package aplicacao;
import java.util.ArrayList;

public class Leilao {
	private String descricao;
	private ArrayList<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Lance> getLances() {
		return lances;
	}
	public void addLance(Lance lance) {
		int total = this.qtdLances(lance.getUsuario());
		
		if(this.lances.isEmpty() || 
				!ultimoLance().getUsuario().equals(lance.getUsuario()) && total < 5 ){
			this.lances.add(lance);
		}
		
	}
	private int qtdLances(Usuario usuario) {
		int total = 0;
		for (Lance l : this.lances) {
			if(l.getUsuario().equals(usuario)){
				total++;
			}
		}
		return total;
	}
	
	public Lance ultimoLance() {
		return this.lances.get(lances.size() - 1);
	}
	
	
}
