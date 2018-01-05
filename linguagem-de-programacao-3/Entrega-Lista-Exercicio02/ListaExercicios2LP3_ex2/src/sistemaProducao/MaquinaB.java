package sistemaProducao;

public class MaquinaB extends Maquina{
	private double custo1Prod3;
	private double custo2Prod3;
	private double tempoProd3;
	public MaquinaB(double custo1Prod1, double custo2Prod1, double tempoProd1, double custo1Prod3, double custo2Prod3, double tempoProd3) {
		super(custo1Prod1, custo2Prod1, tempoProd1);
		this.custo1Prod3 = custo1Prod3;
		this.custo2Prod3 = custo2Prod3;
		this.tempoProd3 = tempoProd3;
	}
	public void produzirP2(int p3) {
		double custo = custo1Prod3 + custo2Prod3 * p3;
		double tempo = tempoProd3 * p3;
		System.out.println("O custo da Produção do Prod. 3 é: "+custo);
		System.out.println("O tempo gasto com a produção do Prod.3 é: "+tempo);
	}
	public void produzirT(int p1, int p3) {
		this.produzirP1(p1);
		System.out.println();
		this.produzirP2(p3);
	}
}
