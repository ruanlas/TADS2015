
public class TerrenoRetangular extends Terreno{
	private double largura;
	private double altura;
	
	public TerrenoRetangular(double largura, double altura) {
		this.altura = altura;
		this.largura = largura;
	}
	@Override
	public double calcularArea() {
		return altura * largura;
	}

}
