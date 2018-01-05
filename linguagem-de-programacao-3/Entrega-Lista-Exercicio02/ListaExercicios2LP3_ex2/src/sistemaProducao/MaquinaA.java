package sistemaProducao;

public class MaquinaA extends Maquina{
	private double custo1Prod2;
	private double custo2Prod2;
	private double tempoProd2;
	public MaquinaA(double custo1Prod1, double custo2Prod1, double tempoProd1, double custo1Prod2, double custo2Prod2, double tempoProd2) {
		super(custo1Prod1, custo2Prod1, tempoProd1);
		this.custo1Prod2 = custo1Prod2;
		this.custo2Prod2 = custo2Prod2;
		this.tempoProd2 = tempoProd2;
	}
	public void produzirP2(int p2) {
		double custo = custo1Prod2 + custo2Prod2 * p2;
		double tempo = tempoProd2 * p2;
		System.out.println("O custo da Produção do Prod. 2 é: "+custo);
		System.out.println("O tempo gasto com a produção do Prod.2 é: "+tempo);
	}
	public void produzirT(int p1, int p2) {
		this.produzirP1(p1);
		System.out.println();
		this.produzirP2(p2);
	}
}
