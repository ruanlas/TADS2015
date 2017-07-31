
public class TerrenoIrregular implements Terreno{
	private double area;
	public TerrenoIrregular(double area) {
		this.area = area;
	}
	@Override
	public double calcularArea() {
		return this.area;
	}
}
