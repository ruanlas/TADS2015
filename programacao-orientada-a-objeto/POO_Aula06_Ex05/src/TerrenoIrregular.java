
public class TerrenoIrregular extends Terreno{
	private double area;
	public TerrenoIrregular(double area) {
		this.area = area;
	}
	@Override
	public double calcularArea() {
		return this.area;
	}
}
