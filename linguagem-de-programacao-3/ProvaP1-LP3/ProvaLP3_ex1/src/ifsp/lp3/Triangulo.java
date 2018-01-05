package ifsp.lp3;

public class Triangulo extends FormaGeometrica{
	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.altura = altura;
		this.base = base;
		this.setNomeDaForma("Triangulo");
	}
	@Override
	public double calculaArea() {
		double area = (base * altura)/2;
		this.setAreaDaForma(area);
		return this.getAreaDaForma();
	}
	public void desenharForma() {
		this.calculaArea();
		System.out.println("Desenhei um "+ this.getNomeDaForma());
	}
}
