package ifsp.lp3;


public class Retangulo extends FormaGeometrica{
	private double base;
	private double altura;
	public Retangulo(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.altura = altura;
		this.base = base;
		this.setNomeDaForma("Retângulo");
	}
	@Override
	public double calculaArea() {
		double area = base * altura;
		this.setAreaDaForma(area);
		return this.getAreaDaForma();
	}
	public void desenharForma() {
		this.calculaArea();
		System.out.println("Desenhei um "+ this.getNomeDaForma());
	}
}
