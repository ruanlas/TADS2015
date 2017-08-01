import java.util.Date;

public abstract class Eletronicos extends Produto{
	private String cor;
	private double altura;
	private double largura;
	private double profundidade;
	private double potencia;
	private int alimentacao;
	private double consumo;
	private boolean bateria;
	private Date garantia;
	private String modelo;
	private String marca;
	private String fabricante;
	private double armazenamento;
	private double peso;
	
	public Eletronicos() {
		super();
	}

	public Eletronicos(String cor, double altura, double largura, double profundidade, double potencia, int alimentacao,
			double consumo, boolean bateria, Date garantia, String modelo, String marca, String fabricante,
			double armazenamento, double peso, double preco, long codBarras) {
		super(preco, codBarras);
		this.cor = cor;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.potencia = potencia;
		this.alimentacao = alimentacao;
		this.consumo = consumo;
		this.bateria = bateria;
		this.garantia = garantia;
		this.modelo = modelo;
		this.marca = marca;
		this.fabricante = fabricante;
		this.armazenamento = armazenamento;
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(int alimentacao) {
		this.alimentacao = alimentacao;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public boolean isBateria() {
		return bateria;
	}

	public void setBateria(boolean bateria) {
		this.bateria = bateria;
	}

	public Date getGarantia() {
		return garantia;
	}

	public void setGarantia(Date garantia) {
		this.garantia = garantia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
