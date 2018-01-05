package ifsp.exercicios.lp3;

public class Animal {
	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int comprimento;
	protected double velocidade;
	protected int patas;
	
	Animal(String nome, String cor, String ambiente, int comprimento, double velocidade, int patas){
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public void alteraPatas(int patas) {
		this.patas = patas;
	}
	public void alteraCor(String cor) {
		this.cor = cor;
	}
	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public void alteraVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String nome() {
		return nome;
	}
	public int comprimento() {
		return comprimento;
	}
	public int patas() {
		return patas;
	}
	public String cor() {
		return cor;
	}
	public String ambiente() {
		return ambiente;
	}
	public double velocidade() {
		return velocidade;
	}
	public void dados() {
		System.out.println("Animal: "+nome);
		System.out.println("Comprimento: "+comprimento+" cm");
		System.out.println("Patas: "+patas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade: "+velocidade+" m/s");
		System.out.println("-------------------------------");
	}
}
