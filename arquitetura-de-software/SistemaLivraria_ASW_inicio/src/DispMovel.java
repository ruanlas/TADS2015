import java.util.Date;

public abstract class DispMovel extends Eletronicos{
	private boolean touchScreen;
	private double tamanhoTela;
	private String tipoChip;
	private int quantidadeChip;
	private String tecnologiaSuportada;
	private String resolucao;
	
	public DispMovel() {
	}

	public DispMovel(boolean touchScreen, double tamanhoTela, String tipoChip, int quantidadeChip,
			String tecnologiaSuportada, String resolucao, String cor, double altura, double largura, double profundidade,
			double potencia, int alimentacao,double consumo, boolean bateria, Date garantia, String modelo, String marca,
			String fabricante, double armazenamento, double peso, double preco, long codBarras) {
		super(cor, altura, largura, profundidade, potencia, alimentacao, consumo, bateria, garantia, modelo, marca, fabricante, armazenamento, peso, preco, codBarras);
		this.touchScreen = touchScreen;
		this.tamanhoTela = tamanhoTela;
		this.tipoChip = tipoChip;
		this.quantidadeChip = quantidadeChip;
		this.tecnologiaSuportada = tecnologiaSuportada;
		this.resolucao = resolucao;
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	public double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getTipoChip() {
		return tipoChip;
	}

	public void setTipoChip(String tipoChip) {
		this.tipoChip = tipoChip;
	}

	public int getQuantidadeChip() {
		return quantidadeChip;
	}

	public void setQuantidadeChip(int quantidadeChip) {
		this.quantidadeChip = quantidadeChip;
	}

	public String getTecnologiaSuportada() {
		return tecnologiaSuportada;
	}

	public void setTecnologiaSuportada(String tecnologiaSuportada) {
		this.tecnologiaSuportada = tecnologiaSuportada;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	
}
