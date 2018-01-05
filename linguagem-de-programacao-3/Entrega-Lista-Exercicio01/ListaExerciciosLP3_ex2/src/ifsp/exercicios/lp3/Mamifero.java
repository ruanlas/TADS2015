package ifsp.exercicios.lp3;

public class Mamifero extends Animal{
	protected String alimento;
	
	Mamifero(String nome, String cor, String ambiente, int comprimento, double velocidade, int patas, String alimento){
		super(nome, cor, ambiente, comprimento, velocidade, patas);
		this.alimento = alimento;
	}
	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}
	public String alimento() {
		return alimento;
	}
	@Override
	public void dados() {
		System.out.println("Animal: "+nome);
		System.out.println("Comprimento: "+comprimento+" cm");
		System.out.println("Patas: "+patas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade: "+velocidade+" m/s");
		System.out.println("Alimento: "+alimento);
		System.out.println("-------------------------------");
	}
}
