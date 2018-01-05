package sistemaProducao;

public class Maquina {
	private double custo1Prod1;
	private double custo2Prod1;
	private double tempoProd1;
	
	public Maquina(double custo1Prod1, double custo2Prod1, double tempoProd1){
		this.custo1Prod1 = custo1Prod1;
		this.custo2Prod1 = custo2Prod1;
		this.tempoProd1 = tempoProd1;
	}
	public void produzirP1(int p1) {
		double custo = custo1Prod1 + custo2Prod1 * p1;
		double tempo = tempoProd1 * p1;
		System.out.println("O custo da Produção do Prod. 1 é: "+custo);
		System.out.println("O tempo gasto com a produção do Prod.1 é: "+tempo);
	}
}
