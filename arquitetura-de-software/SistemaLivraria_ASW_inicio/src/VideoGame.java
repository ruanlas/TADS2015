import java.util.Date;

public class VideoGame extends Eletronicos{
	private String midia;
	private String plataformaSuportada;
	
	public VideoGame() {
		super();
	}

	public VideoGame(String cor, double altura, double largura, double profundidade, double potencia, int alimentacao,
			double consumo, boolean bateria, Date garantia, String modelo, String marca, String fabricante,
			double armazenamento, double peso, double preco, long codBarras, String midia, String plataformaSuportada) {
		super(cor, altura, largura, profundidade, potencia, alimentacao, consumo, bateria, garantia, modelo, marca, fabricante, armazenamento, peso, preco, codBarras);
		this.midia = midia;
		this.plataformaSuportada = plataformaSuportada;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public String getPlataformaSuportada() {
		return plataformaSuportada;
	}

	public void setPlataformaSuportada(String plataformaSuportada) {
		this.plataformaSuportada = plataformaSuportada;
	}
	
	
	
}
