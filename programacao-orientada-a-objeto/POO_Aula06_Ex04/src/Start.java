
public class Start {
	public static void main(String[] args) {
		Terreno terrenoretangular = new TerrenoRetangular(300, 200);
		
		System.out.println("Area: " + terrenoretangular.calcularArea() + " m²");
	}
}
