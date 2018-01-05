package ifsp.exercicios.lp3;

public class Peixe extends Animal{
	protected String caracteristica;
	
	Peixe(String nome, String cor, String ambiente, int comprimento, double velocidade, String caracteristica ) {
		//o comando super acessa o método contrutor da classe 'mãe'
		super(nome, cor, ambiente, comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public String caracteristica() {
		return caracteristica;
	}
	@Override
	public void dados() {
		System.out.println("Animal: "+nome);
		System.out.println("Comprimento: "+comprimento+" cm");
		System.out.println("Patas: "+patas);
		System.out.println("Cor: "+cor);
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Velocidade: "+velocidade+" m/s");
		System.out.println("Característica: "+caracteristica);
		System.out.println("-------------------------------");
	}
}
