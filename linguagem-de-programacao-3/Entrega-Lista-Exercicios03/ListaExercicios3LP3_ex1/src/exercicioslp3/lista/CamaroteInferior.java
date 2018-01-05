package exercicioslp3.lista;

public class CamaroteInferior extends Vip{
	public String localizacao = "Térreo";

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public void imprimeLocalizacao() {
		System.out.println("Localização: "+localizacao);
	}
}
