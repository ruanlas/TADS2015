package ifsp.lp3;

public class Circulo extends FormaGeometrica{
	private double raio;
	public Circulo(double raio) {
		// TODO Auto-generated constructor stub
		this.raio = raio;
		this.setNomeDaForma("Círculo");
	}
	@Override
	public double calculaArea() {
		double area = Math.pow(raio, 2) * Math.PI;
		this.setAreaDaForma(area);
		return this.getAreaDaForma();
	}
	public void desenharForma() {
		this.calculaArea();
		System.out.println("Desenhei um "+ this.getNomeDaForma());
	}
}
